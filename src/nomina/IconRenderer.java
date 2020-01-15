package nomina;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class IconRenderer extends JLabel implements ListCellRenderer {

    private final ImageIcon icon = new ImageIcon(getClass().getResource("/images/1412358032_add-group.png"));

    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String text = value.toString();
        this.setText(text);
        this.setIcon(icon);
        
        if(isSelected) {
            this.setBackground(list.getSelectionBackground());
            this.setForeground(list.getSelectionForeground());
        }else {
            this.setBackground(list.getBackground());
            this.setForeground(list.getForeground());
        }
        
        this.setEnabled(list.isEnabled());
        this.setFont(list.getFont());
        this.setOpaque(true);
        
        return this;
    }
}
