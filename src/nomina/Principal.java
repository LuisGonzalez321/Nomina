package nomina;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private File file;
    
    public Principal(){};
    
    public Principal(File file) {
        this.file = file;
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarTheme1 = new com.toedter.plaf.JCalendarTheme();
        panelCentral = new javax.swing.JPanel();
        roundPanel1 = new roundpanel.RoundPanel();
        ano = new javax.swing.JLabel();
        mes = new javax.swing.JLabel();
        diaMes = new javax.swing.JLabel();
        diaSem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nómina");
        setLocationByPlatform(true);
        setResizable(false);

        panelCentral.setLayout(null);

        roundPanel1.setColor1(new java.awt.Color(240, 240, 240));
        roundPanel1.setColor2(new java.awt.Color(240, 240, 240));
        roundPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel1MouseExited(evt);
            }
        });

        ano.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        ano.setText("2017");

        mes.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mes.setText("Octubre");

        diaMes.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        diaMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diaMes.setText("26");

        diaSem.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        diaSem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diaSem.setText("Jueves");
        Calendario calendario = new Calendario(ano, mes, diaMes, diaSem);
        calendario.start();

        roundPanel1.setLayer(ano, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(mes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        roundPanel1.setLayer(diaSem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(diaMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(diaSem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(diaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaSem)
                .addGap(6, 6, 6))
        );

        panelCentral.add(roundPanel1);
        roundPanel1.setBounds(806, 347, 170, 171);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutterstock_20698438.jpg"))); // NOI18N
        panelCentral.add(jLabel3);
        jLabel3.setBounds(0, 0, 1010, 541);

        jLabel1.setText("Usuario:");
        jLabel1.setFont(new Font("Verdana",Font.BOLD,15));

        jLabel2.setText(System.getProperty("user.name"));
        jLabel2.setFont(new Font("Verdana",Font.BOLD,15));

        jLabel7.setText(null);
        jLabel7.setFont(new Font("Verdana",Font.BOLD,15));
        Reloj reloj = new Reloj(jLabel7);
        reloj.start();

        jMenu1.setText("Inicio");
        jMenu1.setFont(new Font("Verdana",Font.BOLD,15));
        jMenu1.setIcon(new ImageIcon(getClass().getResource("/images/iniciooo.png")));

        jMenuItem1.setText("Salir");
        jMenuItem1.setFont(new Font("Verdana",Font.BOLD,15));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");
        jMenu2.setFont(new Font("Verdana",Font.BOLD,15));
        jMenu2.setIcon(new ImageIcon(getClass().getResource("/images/reportes.png")));

        jMenuItem2.setText("Generar Nómina");
        jMenuItem2.setFont(new Font("Verdana",Font.BOLD,15));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Generar Registro");
        jMenuItem3.setFont(new Font("Verdana",Font.BOLD,15));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empleados");
        jMenu3.setFont(new Font("Verdana",Font.BOLD,15));
        jMenu3.setIcon(new ImageIcon(getClass().getResource("/images/gestiones-menu.png")));

        jMenuItem4.setText("Registrar Empleado");
        jMenuItem4.setFont(new Font("Verdana",Font.BOLD,15));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Informe de Ingresos y Egresos ");
        jMenuItem5.setFont(new Font("Verdana",Font.BOLD,15));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String[] opciones = {"Aceptar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que desea salir?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
        if (opcion == 0)
            System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jMenuItem2.setEnabled(false);
        EventQueue.invokeLater(new Runnable() { public void run() {
            new Tabla(file, jMenuItem2).setVisible(true);
        }});
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jMenuItem3.setEnabled(false);
        EventQueue.invokeLater(new Runnable() { public void run(){
            new Registro(file, jMenuItem3).setVisible(true);
        }});
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jMenuItem4.setEnabled(false);
        EventQueue.invokeLater(new Runnable() { public void run() {
            new Formulario(file, jMenuItem4).setVisible(true);
        }});
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jMenuItem5.setEnabled(false);
        EventQueue.invokeLater(new Runnable() { public void run() {
            new Ingresos(file, jMenuItem5).setVisible(true);
        }});
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void roundPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseEntered
        roundPanel1.setColor1(new Color(0,68,111));
        roundPanel1.setColor2(new Color(0,68,111));
        roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseEntered

    private void roundPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel1MouseExited
        roundPanel1.setColor1(new Color(240,240,240));
        roundPanel1.setColor2(new Color(240,240,240));
        roundPanel1.repaint();
    }//GEN-LAST:event_roundPanel1MouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JLabel diaMes;
    private javax.swing.JLabel diaSem;
    private com.toedter.plaf.JCalendarTheme jCalendarTheme1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel mes;
    private javax.swing.JPanel panelCentral;
    private roundpanel.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
//new ImageIcon(getClass().getResource("/images/contable.png")).getImage()