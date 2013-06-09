package exemplo.trabalhoII;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Main {
	private JFrame janela;
	private JTextField textNome;
	private JTextField textIdade, textEndereco, textTelefone, textId, textSalario, textCargo, textEmpresa;
	private JPanel panelCampos, panelCampos2, painel1, painel2;
	private JButton gravar, limpar, apagar, salvar, sair;
	private JPanel panelButtons;
	private List<Pessoa> pessoas;
	private PessoaTableModel ptm;
	private JTable tabela;
	private String filename, saida, saida2, sexo;
	private String estado[] = {"Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)"};
	private String banco[] = {"MySQL", "PostgreSQL", "FireBird", "Oracle", "outro"};
	private JComboBox caixa, caixa2;
	private JRadioButton m, f;
	private ButtonGroup grupo;
	private JTabbedPane aba;
	private JCheckBox java, c, delphi, ruby;
	private TitledBorder titulo;

	public Main(String filename) {
		aba = new JTabbedPane();
		this.filename = filename;
		janela = new JFrame("Teste de Tabela e Arquivo " + filename);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());
		
		textNome = new JTextField(20);
		textIdade = new JTextField(20);
		textEndereco = new JTextField(20);
		textTelefone = new JTextField(20);
		
		painel1 = new JPanel(new GridLayout());
		m = new JRadioButton("Masculino");
		f = new JRadioButton("Feminino");
		grupo = new ButtonGroup();
		grupo.add(m);
		grupo.add(f);
		painel1.add(m);
		painel1.add(f);
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sexo = "M";
			}
		}); 			
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sexo = "F";	
			}
		});

		caixa = new JComboBox(estado);
		caixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				saida = (String)box.getSelectedItem();
			}
		});
		
		panelCampos = new JPanel(new GridLayout(6, 2));
		aba.add(panelCampos);
		panelCampos.add(new JLabel("Nome"));
		panelCampos.add(textNome);
		panelCampos.add(new JLabel("Idade"));
		panelCampos.add(textIdade);
		panelCampos.add(new JLabel("Sexo"));
		panelCampos.add(painel1);
		panelCampos.add(new JLabel("Estado civil"));
		panelCampos.add(caixa);
		panelCampos.add(new JLabel("Endereço"));
		panelCampos.add(textEndereco);
		panelCampos.add(new JLabel("Telefone"));
		panelCampos.add(textTelefone);
		titulo = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Cadastro");
		panelCampos.setBorder(titulo);
		aba.addTab("Inf. Pessoais", panelCampos);

		textId = new JTextField(20);
		textSalario = new JTextField(20);
		textCargo = new JTextField(20);
		textEmpresa = new JTextField(20);
		
		painel2 = new JPanel(new GridLayout());
		java = new JCheckBox("Java");
		c = new JCheckBox("C/C++");
		delphi = new JCheckBox("Delphi");
		ruby = new JCheckBox("Ruby");
		painel2.add(java);
		painel2.add(c);
		painel2.add(delphi);
		painel2.add(ruby);
		
		caixa2 = new JComboBox(banco);
		caixa2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				saida2 = (String)box.getSelectedItem();
			}
		});
		
		panelCampos2 = new JPanel(new GridLayout(6,2));
		aba.add(panelCampos2);
		panelCampos2.add(new JLabel("ID"));
		panelCampos2.add(textId);
		panelCampos2.add(new JLabel("Salário"));
		panelCampos2.add(textSalario);
		panelCampos2.add(new JLabel("Cargo"));
		panelCampos2.add(textCargo);
		panelCampos2.add(new JLabel("Linguagem que utiliza"));
		panelCampos2.add(painel2);
		panelCampos2.add(new JLabel("Banco de dados"));
		panelCampos2.add(caixa2);
		panelCampos2.add(new JLabel("Empresa"));
		panelCampos2.add(textEmpresa);
		TitledBorder titulo1 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Cadastro");
		panelCampos2.setBorder(titulo1);
		aba.addTab("Inf. Funcionário", panelCampos2);

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
						String endereco = textEndereco.getText();
						int telefone = Integer.valueOf(textTelefone.getText());
						int id = Integer.valueOf(textId.getText());
						float salario = Float.valueOf(textSalario.getText());
						String cargo = textCargo.getText();
						boolean java1 = Boolean.valueOf(java.isSelected());
						boolean c1 = Boolean.valueOf(c.isSelected());
						boolean delphi1 = Boolean.valueOf(delphi.isSelected());
						boolean ruby1 = Boolean.valueOf(ruby.isSelected());
						String empresa = textEmpresa.getText();
						
						int linha = tabela.getSelectedRow();
						if (linha < 0) {
							pessoas.add(new Pessoa(nome, idade, sexo, saida, endereco, telefone, id, salario, cargo, java1, c1, delphi1, ruby1,
									saida2, empresa));
							ptm.setPessoas(pessoas);
						} else {
							Pessoa p = pessoas.get(linha);
							p.setNome(nome);
							p.setIdade(idade);
							p.setSexo(sexo);
							p.setEstado(saida);
							p.setEndereco(endereco);
							p.setTelefone(telefone);
							p.setId(id);
							p.setSalario(salario);
							p.setCargo(cargo);
							p.setJava(java1);
							p.setC(c1);
							p.setDelphi(delphi1);
							p.setRuby(ruby1);
							p.setBanco(saida2);
							p.setEmpresa(empresa);
							
							ptm.setPessoas(pessoas);
						}
						limparDados();
					} catch (Exception e1) {
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
					JOptionPane.showMessageDialog(null,
							"Favor selecionar a linha a excluir", "Alerta", 0);
				} else {
					pessoas.remove(linha);
					ptm.setPessoas(pessoas);
					limparDados();
				}
			}
		});
		salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write();
			}
		});
		sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
						Pessoa p = pessoas.get(linha);
						textNome.setText(p.getNome());
						textIdade.setText(Integer.toString(p.getIdade()));
						textEndereco.setText(p.getEndereco());
						textTelefone.setText(Integer.toString(p.getTelefone()));
						textId.setText(Integer.toString(p.getId()));
						textSalario.setText(Float.toString(p.getSalario()));
						textCargo.setText(p.getCargo());
						textEmpresa.setText(p.getEmpresa());
					}
				}
			}
		});
		tabela.setModel(ptm);
		janela.add(aba, BorderLayout.NORTH);
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
		textId.setText("");
		textSalario.setText("");
		textCargo.setText("");
		textEmpresa.setText("");
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
						String saida = lineToken.nextToken();
						String endereco = lineToken.nextToken();
						int telefone = Integer.valueOf(lineToken.nextToken());
						int id = Integer.valueOf(lineToken.nextToken());
						float salario = Float.valueOf(lineToken.nextToken());
						String cargo = lineToken.nextToken();
						boolean java = Boolean.valueOf(lineToken.nextToken());
						boolean c = Boolean.valueOf(lineToken.nextToken());
						boolean delphi = Boolean.valueOf(lineToken.nextToken());
						boolean ruby = Boolean.valueOf(lineToken.nextToken());
						String saida2 = lineToken.nextToken();
						String empresa = lineToken.nextToken();
						pessoas.add(new Pessoa(nome, idade, sexo, saida, endereco, telefone, id, salario, cargo, java, c, delphi, ruby, saida2, empresa));
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
				String linha = p.getNome() + ";" + p.getIdade() + ";" + p.getSexo() + ";" + p.getEstado() + ";" + p.getEndereco() + ";" 
					+ p.getTelefone() + ";" + p.getId() + ";" + p.getSalario() + ";" + p.getCargo() + ";" + p.isJava() + ";" + p.isC() + ";" +
					";" + p.isDelphi() + ";" + p.isRuby() + ";" + p.getBanco() + ";" + p.getEmpresa() + "\n";
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
		new Main("tablemodel.txt");
	}
}
