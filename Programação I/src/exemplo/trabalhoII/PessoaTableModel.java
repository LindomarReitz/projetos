package exemplo.trabalhoII;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PessoaTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas.clear();
        this.pessoas.addAll(pessoas);
        fireTableDataChanged();
    }
	
    public int getRowCount() {
    	return pessoas.size();
    }

    public int getColumnCount() {
    	return 15;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {	
        Pessoa p = pessoas.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getNome();
            case 1: return p.getIdade();
            case 2: return p.getSexo();
            case 3: return p.getEstado();
            case 4: return p.getEndereco();
            case 5: return p.getTelefone();
            case 6: return p.getId();
            case 7: return p.getSalario();
            case 8: return p.getCargo();
            case 9: return p.isJava();
            case 10: return p.isC();
            case 11: return p.isDelphi();
            case 12: return p.isRuby();
            case 13: return p.getBanco();
            case 14: return p.getEmpresa();
            
            default: return null;
        }
    }
	
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "Nome";
            case 1: return "Idade";
            case 2: return "Sexo";
            case 3: return "Estado civil";
            case 4: return "Endereço";
            case 5: return "Telefone";
            case 6: return "ID";
            case 7: return "Salário";
            case 8: return "Cargo";
            case 9: return "Java";
            case 10: return "C/C++";
            case 11: return "Delphi";
            case 12: return "Ruby";
            case 13: return "Banco de dados";
            case 14: return "Empresa";
            default: return null;
        }
    }
	
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1: return Integer.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return String.class;
            case 5: return Integer.class;
            case 6: return Integer.class;
            case 7: return Float.class;
            case 8: return String.class;
            case 9: return Boolean.class; 
            case 10: return Boolean.class;
            case 11: return Boolean.class;
            case 12: return Boolean.class;
            case 13: return String.class;
            case 14: return String.class;
            default: return null;
        }
    }
}
