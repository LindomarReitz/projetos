package teste.desktop;
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
    	return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {	
        Pessoa p = pessoas.get(rowIndex);
        switch (columnIndex) {
            case  0: return p.getNome();
            case  1: return p.getIdade();
            case  2: return p.getId();
            case  3: return p.getSalario();
            case  4: return p.getSalarioLiquido(p.getSalario());
            case  5: return p.isBrasileiro();
            case  6: return p.getEstado(p.estado);
            default: return null;
        }
    }
	
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case  0: return "Nome";
            case  1: return "Idade";
            case  2: return "ID";
            case  3: return "Salário";
            case  4: return "Salário Liquido";
            case  5: return "Brasileiro";
            case  6: return "Estado civil";
            default: return null;
        }
    }
	
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1: return Integer.class;
            case 2: return Integer.class;
            case 3: return Float.class;
            case 4: return Float.class;
            case 5: return Boolean.class;
            case 6: return String.class;
            default: return null;
        }
    }
}
