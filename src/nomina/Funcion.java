package nomina;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;

public class Funcion {
    
    private static ArrayList hijos = new ArrayList();
    private static boolean editado = false;
    private static JFrame ventanaHijos;
    private static JFrame ventanaEditarE;
    private static JFrame ventanaEditarID;
    private static JFrame ventanaPOPID;
    
    public static Object cargarArchivo(File file) {
        Object obj = new Object();
        if(!file.exists()) {
            try {
                file.createNewFile();
                Funcion.guardarArchivo(file, obj);
                return obj;
            } catch (IOException ex) {
                Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (Object) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
    public static void guardarArchivo(File file, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Funcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean estaVacio(File file) {
        if(!file.exists())
            return true;
        else if(file.length() < 1)
            return true;
        else 
            return false;
        
    }
    
    public static boolean startsWith(String cadena, String prefijo) {
        String c = cleanString(cadena).toLowerCase();
        String p = cleanString(prefijo).toLowerCase();
        if(c.startsWith(p))
            return true;
        else
            return false;
    }
    
    public static String cleanString(String cadena) {
        String normalized = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\P{ASCII}+");
        return pattern.matcher(normalized).replaceAll("");
    }
    
    public static int periodo(Date date) {
        Date nacimiento = date;
        Date actual = new Date();
        int edad = (int) ((actual.getTime() - nacimiento.getTime()) / 86400000) / 365;
        return edad ;
    }

    public static ArrayList getHijos() {
        return hijos;
    }

    public static void setHijos(ArrayList aHijos) {
        hijos = aHijos;
    }

    public static boolean isEditado() {
        return editado;
    }

    public static void setEditado(boolean aEditado) {
        editado = aEditado;
    }

    public static JFrame getVentanaHijos() {
        return ventanaHijos;
    }

    public static void setVentanaHijos(JFrame aVentanaHijos) {
        ventanaHijos = aVentanaHijos;
    }

    public static JFrame getVentanaEditarE() {
        return ventanaEditarE;
    }

    public static void setVentanaEditarE(JFrame aVentanaEditarE) {
        ventanaEditarE = aVentanaEditarE;
    }

    public static JFrame getVentanaEditarID() {
        return ventanaEditarID;
    }

    public static void setVentanaEditarID(JFrame aVentanaEditarID) {
        ventanaEditarID = aVentanaEditarID;
    }

    public static JFrame getVentanaPOPID() {
        return ventanaPOPID;
    }

    public static void setVentanaPOPID(JFrame aVentanaPOPID) {
        ventanaPOPID = aVentanaPOPID;
    }
    
}
