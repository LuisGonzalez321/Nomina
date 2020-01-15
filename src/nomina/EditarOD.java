package nomina;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class EditarOD extends javax.swing.JFrame {

    private MouseListener listener;
    private JTable tabla; 
    private int row; 
    private int colm; 
    private ArrayList<Empleado> nomina;
    private Modelo modelo;
    
    public EditarOD(JTable tabla, int row, int colm, ArrayList<Empleado> nomina, Modelo modelo, MouseListener listener) {
        Funcion.setVentanaPOPID(this);
        this.tabla = tabla; 
        this.row = row; 
        this.colm = colm; 
        this.nomina = nomina;
        this.modelo = modelo;
        this.listener = listener;
        initComponents();
        setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(331, 181));
        setMinimumSize(new java.awt.Dimension(331, 181));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(331, 181));
        jPanel1.setMinimumSize(new java.awt.Dimension(331, 181));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otras Deducciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jTextField1.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
            for(int i=0;i<arg1.length();i++){
                if(!Character.isDigit(arg1.charAt(i)) && arg1.charAt(i) != '.'){
                    return;
                }
            }
            super.insertString(arg0, arg1, arg2);
        }});
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 11, 311, 94);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(171, 116, 139, 49);

        jButton1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 116, 133, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/office-1049827_640.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 330, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jButton1.setEnabled(jTextField1.getText().length() != 0);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        tabla.addMouseListener(listener);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tabla.setValueAt(jTextField1.getText(), row, colm);
        nomina.get(row).setOtras_deducciones(Double.parseDouble(jTextField1.getText()));
        Vector empleado = nomina.get(row).toVector();
        modelo.removeRow(row);
        modelo.insertRow(row, empleado);
        int row = tabla.getRowCount();
        int colm = tabla.getColumnCount();
        double sumaD = 0;
        int sumaI = 0;
        for(int i=3;i<colm;i++) {
            for(int j=0;j<row - 1;j++){
                if(i != 4)
                    sumaD = sumaD + Double.parseDouble(String.valueOf(tabla.getValueAt(j, i)));
                else
                    sumaI = sumaI + Integer.parseInt(String.valueOf(tabla.getValueAt(j, i)));
            }
            if(i != 4) {
                tabla.setValueAt(sumaD, row - 1, i);
                sumaD = 0;
            }else {
                tabla.setValueAt(sumaI, row - 1, i);
                sumaI = 0;
            }
        }
        dispose();
        tabla.addMouseListener(listener);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
