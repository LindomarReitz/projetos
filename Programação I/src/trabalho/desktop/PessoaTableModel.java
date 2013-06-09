package trabalho.desktop;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

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
    	return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {	
        Pessoa p = pessoas.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getNome();
            case 1: return p.getIdade();
            case 3: return p.getSexo();
            case 4: return p.getEstado();
            case 5: return p.getEndereco();
            case 6: return p.getTelefone();
            	
            default: return null;
        }
    }
	
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "Nome";
            case 1: return "Idade";
            case 2: return "Sexo";
            case 3: return "Estado Civil";
            case 4: return "Endereço"; 
            case 5: return "Telefone";
            	
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
            case 6: return Integer.class;
            
            default: return null;
        }
    }
	
}
