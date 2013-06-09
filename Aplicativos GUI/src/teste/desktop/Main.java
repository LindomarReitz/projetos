package teste.desktop;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Main {
	private String estado1 [] = {"Solteiro", "Casado", "Divorciado", "Viúvo"};
	private JFrame janela;
	private JLabel labelNome;
	private JLabel labelIdade;
	private JLabel labelBrasileiro;
	private JLabel labelId;
	private JTextField textNome;
	private JTextField textIdade;
	private JTextField textSalario;
	private JCheckBox checkBrasileiro;
	private JComboBox caixa;
	private JTextField textId;
	private GridLayout grid;
	private JPanel panel;
	private JButton gravar;
	private JButton limpar;
	private JButton apagar;
	private JPanel panelButtons;
	private List<Pessoa> pessoas;
	private PessoaTableModel ptm;
	private JTable tabela;
	private Pessoa p;

	public Main() {

		janela = new JFrame("Teste Tabela");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());

		labelNome = new JLabel("Nome");
		labelIdade = new JLabel("Idade");
		labelId = new JLabel ("ID:");
		labelBrasileiro = new JLabel("Brasileiro");
		caixa = new JComboBox(estado1);
		caixa.setMaximumRowCount(3);
		

		textNome = new JTextField(20);
		textIdade = new JTextField(20);
		textId = new JTextField(20);
		textSalario = new JTextField(20);
		checkBrasileiro = new JCheckBox();
		
		grid = new GridLayout(6, 2);
		panel = new JPanel(grid);
		panel.add(labelNome);
		panel.add(textNome);
		panel.add(labelIdade);
		panel.add(textIdade);
		panel.add(labelId);
		panel.add(textId);
		panel.add(new JLabel("Salário:"));
		panel.add(textSalario);
		panel.add(labelBrasileiro);
		panel.add(checkBrasileiro);
		panel.add((caixa));
		
		caixa.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				String saida = null;
				
				p.setEstado(saida);
			}
		});

		gravar = new JButton("Gravar");
		gravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNome.getText().compareTo("") == 0) {
					JOptionPane.showMessageDialog(gravar, "Campo nome vazio",
							"Alerta", 0);
				} else {
					String nome = textNome.getText();
					int idade = 0;
					int id = 1;
					float salario = 0;
					try {
						idade = Integer.valueOf(textIdade.getText());
					} catch (Exception exc) {
						JOptionPane.showMessageDialog(gravar, "O campo idade precisa ser um inteiro", "Erro", 0);
					}
					try{
						id = Integer.valueOf(textId.getText());
					} catch(Exception y) {
						JOptionPane.showMessageDialog(gravar, "O campo ID precisa ser um inteiro", "Erro", 0);						
					}
					try { 
						salario = Float.valueOf(textSalario.getText());
					} catch (Exception i) {
						JOptionPane.showMessageDialog(gravar, "O campo Salário precisa ser um valor inteiro ou um real", "Erro", 0);
					}
					Boolean brasileiro = checkBrasileiro.isSelected();
					int linha = tabela.getSelectedRow();
					if (linha < 0) {
						pessoas.add(new Pessoa(nome, idade, id, salario, brasileiro));
						ptm.setPessoas(pessoas);
					} else {
						p = pessoas.get(linha);
						p.setNome(nome);
						p.setIdade(idade);
						p.setId(id);
						p.setSalario(salario);
						p.setBrasileiro(brasileiro);
						ptm.setPessoas(pessoas);
					}
				}
			}
		});
		limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textIdade.setText("");
				textId.setText("");
				textSalario.setText("");
				checkBrasileiro.setSelected(false);
				tabela.getSelectionModel().clearSelection();
			}
		});
		apagar = new JButton("Apagar");
		apagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linha = tabela.getSelectedRow();
				if (linha < 0) {
					JOptionPane.showMessageDialog(apagar,
							"Favor selecionar a linha a excluir", "Alerta", 0);
				} else {
					textNome.setText("");
					textIdade.setText("");
					textId.setText("");
					textId.setText("");
					textSalario.setText("");
					checkBrasileiro.setSelected(false);
					pessoas.remove(linha);
					ptm.setPessoas(pessoas);
				}
			}
		});
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}	
			}
		);
		panelButtons = new JPanel();
		panelButtons.add(gravar);
		panelButtons.add(limpar);
		panelButtons.add(apagar);
		panelButtons.add(sair);

		pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Carlos", 25, 555, 200f, true));
		pessoas.add(new Pessoa("Juliana", 18, 222, 200f, true));
		pessoas.add(new Pessoa("John", 40, 4788, 200f, false));

		ptm = new PessoaTableModel();
		ptm.setPessoas(pessoas);

		tabela = new JTable();
		tabela.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() >= 0) {
					if (e.getClickCount() >= 0) {
						int linha = tabela.getSelectedRow();
						if (linha >= 0) {
							Pessoa p = pessoas.get(linha);
							textNome.setText(p.getNome());
							textIdade.setText(Integer.toString(p.getIdade()));
							textId.setText(Integer.toString(p.getId()));
							textSalario.setText(Float.toString(p.getSalario()));
							checkBrasileiro.setSelected(p.isBrasileiro());				
						}
					}
				}
			}
		});
		tabela.setModel(ptm);
		janela.add(panel, BorderLayout.NORTH);
		janela.add(panelButtons);
		janela.add(new JScrollPane(tabela), BorderLayout.SOUTH);

		janela.pack();

		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}