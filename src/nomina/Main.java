package nomina;

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {} catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     // String rutaCarpeta = "C:/Nomina/Data";
    // jLabel2.setText(System.getProperty("user.name"));
        String rutaCarpeta="C:/Users/"+System.getProperty("user.name")+"/Documents/NetBeansProjects/Nomina/Nomina/Data";  
        File carpeta = new File(rutaCarpeta);
        carpeta.mkdirs();
        File fichero = new File(rutaCarpeta.concat("/Data.txt"));
        if(Funcion.estaVacio(fichero))
            Funcion.guardarArchivo(fichero, new ArrayList());
            
        EventQueue.invokeLater(new Runnable() { public void run() {
            new Principal(fichero).setVisible(true);
        }});
    }
    
}
