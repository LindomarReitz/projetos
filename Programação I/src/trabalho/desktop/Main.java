package trabalho.desktop;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main {
	
	private JTextField textNome, textIdade, textSalario, textId, textEndereco, textEmpresa, textTelefone, textCargo;
	private JRadioButton masculino, feminino;
	private ButtonGroup grupo;
	private JButton gravar, limpar, apagar, salvar, sair;
	private JCheckBox java, c, delphi, ruby;
	private String estado[] = {"Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)"};
	private String banco[] = {"MySQL", "Postgre SQL", "FireBird", "Oracle", "outro"};
	private JComboBox caixa1, caixa2;
	private JFrame janela;
	private JPanel painel1, painel2, painel3, painel4, painelButtons;
	private JTabbedPane aba;
	private String saida1, saida2, sexo, fileName;
	private JTable tabela;
	private PessoaTableModel ptm;
	private List<Pessoa> pessoas;
	
	public Main(String fileName) {
		this.fileName = fileName;
		aba = new JTabbedPane();
		cadastroPessoal();
		cadastroFuncionario();
		janela = new JFrame("Teste de desktop");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add(aba, BorderLayout.NORTH);
		janela.add(montarBotao());
		janela.add(new JScrollPane(montarTabela()), BorderLayout.SOUTH);		
		janela.pack();
		janela.setVisible(true);
	}
	
	public void cadastroPessoal() {
		textNome = new JTextField(20);
		textIdade = new JTextField(20);
		textEndereco = new JTextField(20);
		textTelefone = new JTextField(20);
		
		masculino = new JRadioButton("Masculino");
		feminino = new JRadioButton("Feminino");
		grupo = new ButtonGroup();
		grupo.add(masculino);
		grupo.add(feminino);
		//Evento evento = new Evento();
		//masculino.addActionListener(evento);
		//feminino.addActionListener(evento);
		
		painel3 = new JPanel(new GridLayout());
		painel3.add(masculino);
		painel3.add(feminino);
		caixa1 = new JComboBox(estado);
		caixa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				saida1 = (String)box.getSelectedItem();
				//p.setEstado(saida1);
			}
		});

		painel1 = new JPanel(new GridLayout(6,1));
		aba.add(painel1);
		painel1.add(new JLabel("Nome"));
		painel1.add(textNome);
		painel1.add(new JLabel("Idade"));
		painel1.add(textIdade);	
		painel1.add(new JLabel("Sexo"));
		painel1.add(painel3);
		painel1.add(new JLabel("Estado Civil"));
		painel1.add(caixa1);
		painel1.add(new JLabel("Endereço"));
		painel1.add(textEndereco);
		painel1.add(new JLabel("Telefone"));
		painel1.add(textTelefone);
		aba.addTab("Inf. Pessoais", painel1);
	}
	
	public void cadastroFuncionario() {
		textId = new JTextField(20);
		textSalario = new JTextField(20);
		textCargo = new JTextField(20);
		textEmpresa = new JTextField(20);
		
		painel4 = new JPanel(new GridLayout());
		java = new JCheckBox("Java");
		c = new JCheckBox("C/C++");
		delphi = new JCheckBox("Delphi");
		ruby = new JCheckBox("Ruby");
		painel4.add(java);
		painel4.add(c);
		painel4.add(delphi);
		painel4.add(ruby);
		caixa2 = new JComboBox(banco);
		caixa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox box = (JComboBox)e.getSource();
				saida2 = (String)box.getSelectedItem();
				//p.setBanco(saida2);
			}
		});
		
		painel2 = new JPanel(new GridLayout(6,1));
		//aba.add(painel2);
		painel2.add(new JLabel("ID"));
		painel2.add(textId);
		painel2.add(new JLabel("Salário"));
		painel2.add(textSalario);
		painel2.add(new JLabel("Cargo"));
		painel2.add(textCargo);
		painel2.add(new JLabel("Linguagem que utiliza"));
		painel2.add(painel4);
		painel2.add(new JLabel("Banco de Dados"));
		painel2.add(caixa2);
		painel2.add(new JLabel("Empresa"));;
		painel2.add(textEmpresa);
		//aba.addTab("Inf. Funcionário", painel2);	
	}

	public JPanel montarBotao() {
		gravar = new JButton("Gravar");
		limpar = new JButton("Limpar");
		apagar = new JButton("Apagar");
		salvar = new JButton("Salvar");
		sair = new JButton("Sair");
		
		gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNome.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(null, "Campo nome vazio",
							"Alerta", 0);
				} else {
					String nome, endereco, cargo, empresa, sexo1;
					int telefone;
					int idade = 0, id;
					//float salario;
					//boolean java1, c1, delphi1, ruby1;
					try {
						nome = textNome.getText();
						endereco = textEndereco.getText();
						telefone = Integer.valueOf(textTelefone.getText());
						//cargo = textCargo.getText();
						//empresa = textEmpresa.getText();
						idade = Integer.valueOf(textIdade.getText());
						//id = Integer.valueOf(textIdade.getText());
						//salario = Float.valueOf(textSalario.getText());
						sexo1 = masculino.getText();
						//sexo1 = feminino.getText();
						//java1 = java.isSelected();
						//c1 = c.isSelected();
						//delphi1 = delphi.isSelected();
						//ruby1 = ruby.isSelected();
						
						int linha = tabela.getSelectedRow();
						if (linha < 0) {
							pessoas.add(new Pessoa(nome, idade, sexo1, saida1, endereco, telefone));
							ptm.setPessoas(pessoas);
						} else {
							Pessoa p = pessoas.get(linha);
							p.setNome(nome);
							p.setIdade(idade);
							p.setSexo(sexo1);
							p.setEstado(saida1);
							p.setEndereco(endereco);
							p.setTelefone(telefone);
							//p.setId(id);
							//p.setSalario(salario);
							//p.setCargo(cargo);
							//p.setJava(java1);
							//p.setC(c1);
							//p.setDelphi(delphi1);
							//p.setRuby(ruby1);
							//p.setBanco(saida2);
							//p.setEmpresa(empresa);
							
							ptm.setPessoas(pessoas);
						}
						limparDados();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "O campo precisa ser um inteiro", "Erro", 0);		
					}
				}
			}
		});
		
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparDados();
			}
		});
		
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
		
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				write();
			}
		});
	
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		painelButtons = new JPanel();
		painelButtons.add(gravar);
		painelButtons.add(limpar);
		painelButtons.add(apagar);
		painelButtons.add(salvar);
		painelButtons.add(sair);
		
		return painelButtons;
	}
	
	public JTable montarTabela() {	
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
						//textId.setText(Integer.toString(p.getId()));
						textIdade.setText(Integer.toString(p.getIdade()));
						textTelefone.setText(Integer.toString(p.getTelefone()));
						//textCargo.setText(p.getCargo());
						textEndereco.setText(p.getEndereco());
						//textEmpresa.setText(p.getEmpresa());
						//textSalario.setText(Float.toString(p.getSalario()));
						//java.setSelected(p.isJava());
						//c.setSelected(p.isC());
						//delphi.setSelected(p.isDelphi());
						//ruby.setSelected(p.isRuby());
					}
				}
			}
		});
		tabela.setModel(ptm);
		
		return tabela;
	}
	
	public void limparDados() {
		textNome.setText("");
		textIdade.setText("");
		//textSalario.setText("");
		//textId.setText("");
		textEndereco.setText("");
		textTelefone.setText("");
		//textCargo.setText("");
		//textEmpresa.setText("");
		//java.setSelected(false);
		//c.setSelected(false);
		//delphi.setSelected(false);
		//ruby.setSelected(false);
		tabela.getSelectionModel().clearSelection();
		textNome.requestFocus();
	}
	
	public void load() {
		try {
			StringTokenizer lineToken;
			FileReader file = new FileReader(fileName);
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
						String sexo = lineToken.nextToken();
						String endereco = lineToken.nextToken();
						//String cargo = lineToken.nextToken();
						//String empresa = lineToken.nextToken();
						//String saida1 = lineToken.nextToken();
						//String saida2 = lineToken.nextToken();
						//int id = Integer.valueOf(lineToken.nextToken());
						int idade = Integer.valueOf(lineToken.nextToken());
						int telefone = Integer.valueOf(lineToken.nextToken());
					
						//float salario = Float.valueOf(lineToken.nextToken());
						//float liquido = Float.valueOf(lineToken.nextToken());
						//boolean java1 = Boolean.valueOf(lineToken.nextToken());
						//boolean c1 = Boolean.valueOf(lineToken.nextToken());
						//boolean delphi1 = Boolean.valueOf(lineToken.nextToken());
						//boolean ruby1 = Boolean.valueOf(lineToken.nextToken());
						
						pessoas.add(new Pessoa(nome, idade, sexo, saida1, endereco, telefone));
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
			FileWriter file = new FileWriter(fileName);
			BufferedWriter buffer = new BufferedWriter(file);
			for (int i = 0; i < pessoas.size(); i++) {
				Pessoa p = pessoas.get(i);
				String linha = p.getNome() + ";" + p.getIdade() + ";" + p.getSexo() + ";" + p.getEstado() + ";" +";" + p.getEndereco() +
					";" + p.getTelefone() + "\n";
				buffer.write(linha);
			}			
			buffer.close();
			file.close();
			JOptionPane.showMessageDialog(null, "Arquivo " + fileName + " salvo.", "Atencao", 1);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", 0);
		}
	}
	
	public static void main(String[] args) {
		new Main("exemplo.txt");
	}
}
