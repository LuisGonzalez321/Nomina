package nomina;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class Tabla extends javax.swing.JFrame {

    private ArrayList<Empleado> nomina;
    private File file;
    private JMenuItem menu;
    private static final String[] CABECERA = {"No. INSS","Nombre","Cargo","Salario Mensual","Horas Extras",
        "Ingresos Horas Extras","Antigüedad","Bonos","Otros Ingresos","Total de Ingresos","INSS Laboral","IR Laboral","Otras Deducciones",
        "Total Deducciones","Neto a Recibir","INSS Patronal","INATEC","Vacaciones","Treceavo Mes","Indemnización Laboral"};
    private Object[][] ultima = { {"","","",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} }; 
    
    public Tabla(File file, JMenuItem menu) {
        this.file = file;
        this.nomina = (ArrayList<Empleado>) Funcion.cargarArchivo(file);
        this.menu = menu;
        initComponents();
        setLocationRelativeTo(null);
        System.out.println(""+ultima[0].length);
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nómina - Generar Nómina");
        setLocationByPlatform(true);
        setResizable(false);

        fondo.setLayout(null);

        jScrollPane1.setBackground(Color.WHITE);
        jScrollPane1.setBorder(null);

        Modelo modelo = new Modelo(ultima, CABECERA);
        if(!nomina.isEmpty()) {
            for(int i=0;i<nomina.size();i++)
            modelo.insertRow(modelo.getRowCount() - 1, nomina.get(i).toVector());
        }
        jTable1.setModel(modelo);
        jTable1.setRowHeight(25);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setDefaultRenderer(Object.class, new Renderizador());
        JTableHeader tabla_cabecera = jTable1.getTableHeader();
        tabla_cabecera.setBackground(new Color(230,230,230));
        tabla_cabecera.setFont(new Font("Tahoma",Font.BOLD,11));
        for(int i=0;i<ultima.length;i++){
            for(int j=0;j<ultima[i].length;j++){
                modelo.isCellEditable(i,j);
            }
        }
        int anchura = 0;
        TableColumnModel modelo_columna = jTable1.getColumnModel();
        for(int i=0;i<ultima[0].length;i++){
            switch (i) {
                case 1:
                modelo_columna.getColumn(i).setPreferredWidth(250);
                anchura = anchura+250;
                break;
                case 2:
                modelo_columna.getColumn(i).setPreferredWidth(250);
                anchura = anchura+250;
                break;
                default:
                modelo_columna.getColumn(i).setPreferredWidth(160);
                anchura = anchura+160;
                break;
            }
        }
        int row = jTable1.getRowCount();
        int colm = jTable1.getColumnCount();
        double sumaD = 0;
        int sumaI = 0;
        for(int i=3;i<colm;i++) {
            for(int j=0;j<row - 1;j++){
                if(i != 4)
                sumaD = sumaD + Double.parseDouble(String.valueOf(jTable1.getValueAt(j, i)));
                else
                sumaI = sumaI + Integer.parseInt(String.valueOf(jTable1.getValueAt(j, i)));
            }
            if(i != 4) {
                jTable1.setValueAt(sumaD, row - 1, i);
                sumaD = 0;
            }else {
                jTable1.setValueAt(sumaI, row - 1, i);
                sumaI = 0;
            }
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tabla_cabecera.setPreferredSize(new Dimension(anchura,25));

        fondo.add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 880, 466);

        jButton2.setText("Volver");
        jButton2.setFont(new Font("Verdana",Font.BOLD,15));
        jButton2.setIcon(new ImageIcon(getClass().getResource("/images/salir ventana.png")));
        jButton2.setHorizontalAlignment(SwingConstants.CENTER);
        jButton2.setVerticalAlignment(SwingConstants.CENTER);
        jButton2.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButton2.setVerticalTextPosition(SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fondo.add(jButton2);
        jButton2.setBounds(765, 488, 125, 47);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/temario_excel_1.png"))); // NOI18N
        jButton3.setText("Exportar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fondo.add(jButton3);
        jButton3.setBounds(10, 490, 139, 47);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slide4.jpg"))); // NOI18N
        fondo.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Funcion.guardarArchivo(file, nomina);
        dispose();
        menu.setEnabled(true);
        if(Funcion.getVentanaPOPID() != null)
            Funcion.getVentanaPOPID().dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        JTable tabla = (JTable) evt.getSource();
        Modelo modelo = (Modelo) tabla.getModel();
        int total = tabla.getRowCount();
        int colm = tabla.getSelectedColumn();
        int row = tabla.getSelectedRow();
        MouseListener[] listeners = tabla.getMouseListeners();
        MouseListener listener = listeners[2];
        if(evt.getClickCount() == 2 && (colm == 4 && row != (total - 1))) {
            EventQueue.invokeLater(new Runnable() { public void run() {
                tabla.removeMouseListener(listener);
                new EditarHE(tabla, row, colm, nomina, modelo, listener).setVisible(true);
            }});
        }else if (evt.getClickCount() == 2 && (colm == 7 && row != (total - 1))) {
            EventQueue.invokeLater(new Runnable() { public void run() {
                tabla.removeMouseListener(listener);
                new EditarB(tabla, row, colm, nomina, modelo, listener).setVisible(true);
            }});
        }else if(evt.getClickCount() == 2 && (colm == 8 && row != (total - 1))) {
            EventQueue.invokeLater(new Runnable() { public void run() {
                tabla.removeMouseListener(listener);
                new EditarOI(tabla, row, colm, nomina, modelo, listener).setVisible(true);
            }});
        }else if (evt.getClickCount() == 2 &&  (colm == 12 && row != (total - 1))) {
            EventQueue.invokeLater(new Runnable() { public void run() {
                tabla.removeMouseListener(listener);
                new EditarOD(tabla, row, colm, nomina, modelo, listener).setVisible(true);
            }});
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter =  new FileNameExtensionFilter("Archivos de Excel",".xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar Archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<JTable>();
                List<String> nom = new ArrayList<String>();
                tb.add(jTable1);
                nom.add("Nómina");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exportar e = new Exportar(new File(file), tb, nom);
                    if(e.exportar()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados en el directorio seleccionado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
