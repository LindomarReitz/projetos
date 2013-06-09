package trabalho.desktop;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main2 {
	private JFrame janela;
	private JTextField textNome, textIdade, textEndereco, textTelefone, textSexo;
	//private JCheckBox java, c, delphi, ruby;
	//private JRadioButton m, f;
	//private ButtonGroup grupo;
	private JPanel panelCampos;
	private JButton gravar, limpar, apagar, salvar, sair;
	private JPanel panelButtons;
	private List<Pessoa> pessoas;
	private PessoaTableModel ptm;
	private JTable tabela;
	private String filename, saida;
	private String estados[] = {"Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)"};
	private JComboBox caixa;
	private Pessoa p;

	public Main2(String filename) {
		this.filename = filename;
		janela = new JFrame("Teste de Tabela e Arquivo " + filename);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());
		
		textNome = new JTextField(20);
		textIdade = new JTextField(20);
		textSexo = new JTextField(20);
		textEndereco =  new JTextField(20);
		textTelefone = new JTextField(20);
		
		caixa = new JComboBox(estados);
		caixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				saida = (String)box.getSelectedItem();
			}
		});

		panelCampos = new JPanel(new GridLayout(6, 2));
		panelCampos.add(new JLabel("Nome"));
		panelCampos.add(textNome);
		panelCampos.add(new JLabel("Idade"));
		panelCampos.add(textIdade);
		panelCampos.add(new JLabel("Sexo"));
		panelCampos.add(textSexo);
		panelCampos.add(new JLabel("Estado Civil"));
		panelCampos.add(caixa);
		panelCampos.add(new JLabel("Endereço"));
		panelCampos.add(textEndereco);
		panelCampos.add(new JLabel("Telefone"));
		panelCampos.add(textTelefone);

		gravar = new JButton("Gravar");
		gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNome.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "Campo nome vazio",
							"Alerta", 0);
				} else {
					String nome = textNome.getText();
					
					int idade = 0;
					try {
						idade = Integer.valueOf(textIdade.getText());
						String sexo = textSexo.getText();
						String endereco = textEndereco.getText();
						int telefone = Integer.valueOf(textTelefone.getText());
						
						int linha = tabela.getSelectedRow();
						if (linha < 0) {
							pessoas.add(new Pessoa(nome, idade, sexo, saida, endereco, telefone));
							ptm.setPessoas(pessoas);
						} else {
							p = pessoas.get(linha);
							p.setNome(nome);
							p.setIdade(idade);
							p.setSexo(sexo);
							p.setEstado(saida);
							p.setEndereco(endereco);
							p.setTelefone(telefone);
							ptm.setPessoas(pessoas);
						}
						limparDados();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "O campo idade precisa ser um inteiro", "Erro", 0);		
					}
				}
			}
		});
		limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparDados();
			}
		});
		apagar = new JButton("Apagar");
		apagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linha = tabela.getSelectedRow();
				if (linha < 0) {
					JOptionPane.showMessageDialog(null, "Favor selecionar a linha a excluir", "Alerta", 0);		
				} else {
					pessoas.remove(linha);
					ptm.setPessoas(pessoas);
					limparDados();
				}
			}
		});
		salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write();
			}
		});
		sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelButtons = new JPanel();
		panelButtons.add(gravar);
		panelButtons.add(limpar);
		panelButtons.add(apagar);
		panelButtons.add(salvar);
		panelButtons.add(sair);

		pessoas = new ArrayList<Pessoa>();
		load();
		ptm = new PessoaTableModel();
		ptm.setPessoas(pessoas);

		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() >= 0) {
					int linha = tabela.getSelectedRow();
					if (linha >= 0) {
						p = pessoas.get(linha);
						textNome.setText(p.getNome());
						textIdade.setText(Integer.toString(p.getIdade()));
						//textSexo.setText(p.getSexo());
						textEndereco.setText(p.getEndereco());
						textTelefone.setText(Integer.toString(p.getTelefone()));
					}
				}
			}
		});
		tabela.setModel(ptm);
		janela.add(panelCampos, BorderLayout.NORTH);
		janela.add(panelButtons);
		janela.add(new JScrollPane(tabela), BorderLayout.SOUTH);
		janela.pack();
		janela.setVisible(true);
	}
	
	public void limparDados() {
		textNome.setText("");
		textIdade.setText("");
		textEndereco.setText("");
		textTelefone.setText("");
		tabela.getSelectionModel().clearSelection();
		textNome.requestFocus();
	}

	public void load() {
		try {
			StringTokenizer lineToken;
			FileReader file = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buffer.readLine();
				if (line == null)
					eof = true;
				else {
					try {
						lineToken = new StringTokenizer(line, ";");
						String nome = lineToken.nextToken();
						int idade = Integer.valueOf(lineToken.nextToken());
						String sexo = lineToken.nextToken();
						String endereco = lineToken.nextToken();
						int telefone = Integer.valueOf(lineToken.nextToken());
						
						pessoas.add(new Pessoa(nome, idade, sexo, saida, endereco, telefone));
					} catch (Exception e1) {
						 // Nao grava
					}
				}
			}
			buffer.close();
			file.close();
		} catch (IOException e) {
			// Nao faz nada
		}
	}

	public void write() {
		try {
			FileWriter file = new FileWriter(filename);
			BufferedWriter buffer = new BufferedWriter(file);
			for (int i = 0; i < pessoas.size(); i++) {
				Pessoa p = pessoas.get(i);
				String linha = p.getNome() + ";" + p.getIdade() + ";" + p.getSexo() + ";" + p.getEstado() + ";" + p.getEndereco() +
					";" + p.getTelefone() + "\n";
				buffer.write(linha);
			}			
			buffer.close();
			file.close();
			JOptionPane.showMessageDialog(null, "Arquivo " + filename + " salvo.", "Atencao", 1);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
		}
	}

	public static void main(String[] args) {
		new Main2("exemplo.txt");
	}
}
