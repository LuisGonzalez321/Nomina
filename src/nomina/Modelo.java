package nomina;
import javax.swing.table.DefaultTableModel;

public class Modelo extends DefaultTableModel{
    
    Class[] tipos = {
        String.class, String.class, String.class, Double.class, Integer.class, Double.class, Double.class, Double.class,
        Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class,
        Double.class, Double.class, Double.class,
    };
    
    public Modelo(Object[][] row,Object[] col){
        super(row,col);
    }
    
    @Override
    public boolean isCellEditable(int fila,int columna){
        return false;
    }
    
    /*public Class getColumnClass(int columna){
        return tipos[columna];
    }*/
}
