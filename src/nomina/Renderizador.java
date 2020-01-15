package nomina;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;

public class Renderizador extends DefaultTableCellRenderer {
        
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        //super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        JLabel l = new JLabel();
        
        l.setOpaque(true);
        /*if(row % 2 != 0)
            l.setBackground(new Color(196,250,192));
        else 
            l.setBackground(new Color(150,250,150));
        */          
        l.setEnabled(table.isEnabled());
        l.setFont(table.getFont());
        l.setOpaque(true);
                
        if(isSelected) {
            l.setBackground(table.getSelectionBackground());
            l.setForeground(table.getSelectionForeground());
        }else {
            l.setBackground(table.getBackground());
            l.setForeground(table.getForeground());
        }
        
        String valor = String.valueOf(value);
        
        if (valor.contains(".")) {
            /*int punto = valor.indexOf(".");
            int ultimo = valor.length() - 1;
            StringBuffer buffer = new StringBuffer(valor);
            buffer.delete(punto + 1, ultimo);
            String nuevo = buffer.toString();*/
            l.setText(String.format("%.2f", value));
        } else
            l.setText(valor);
        
        //if(col != 1)
            l.setHorizontalAlignment(CENTER);
        /*else
            l.setHorizontalAlignment(LEFT);*/
        
        return l;
    }
}
