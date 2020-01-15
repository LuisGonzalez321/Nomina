package nomina;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Exportar {
    
    private File file;
    private List<JTable> tabla;
    private List<String> nombres;

    public Exportar(File file, List<JTable> tabla, List<String> nombres) throws Exception {
        this.file = file;
        this.tabla = tabla;
        this.nombres = nombres;
        if(nombres.size() != tabla.size())
           throw new Exception("Error");
    }
    
    public boolean exportar() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(out);
            for(int i=0;i<tabla.size();i++) {
                JTable table = tabla.get(i);
                WritableSheet s = w.createSheet(nombres.get(i), 0);
                for(int j=0;j<table.getColumnCount();j++) {
                    String nmcol = table.getColumnName(j);
                    s.addCell(new Label(j, 0, nmcol));
                    for(int k=0;k<table.getRowCount();k++) {
                        Object object = table.getValueAt(k, j);
                        s.addCell(new Label(j, k+1, String.valueOf(object)));
                    }
                }
            }
            w.write();
            w.close();
            out.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exportar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Exportar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (WriteException ex) {
            Logger.getLogger(Exportar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
