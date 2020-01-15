package nomina;

import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Registro extends javax.swing.JFrame {

    private ArrayList<Empleado> nomina;
    private File file;
    private JMenuItem menu;
    
    public Registro(File file, JMenuItem menu) {
        this.file = file;
        this.nomina = (ArrayList<Empleado>) Funcion.cargarArchivo(file);
        this.menu = menu;
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nómina - Generar Registro");
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1202, 565));
        jPanel1.setMinimumSize(new java.awt.Dimension(1202, 565));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gastos de Operación", " ", " ", " "},
                {"Sueldos y Salarios", " ", " ", " "},
                {"Horas Extras", " ", " ", " "},
                {"Antigüedad", " ", " ", " "},
                {"INSS Patronal", " ", " ", " "},
                {"INATEC", " ", " ", " "},
                {"Vacaciones", " ", " ", " "},
                {"Treceavo Mes", " ", " ", " "},
                {"Indemnización Laboral", " ", " ", " "},
                {"Bonos", " ", " ", " "},
                {"Otros Ingresos", " ", " ", " "},
                {"Retenciones por Pagar", " ", " ", " "},
                {"INSS Laboral", " ", " ", " "},
                {"Impuesto sobre la Renta", " ", " ", " "},
                {"Otras Deducciones", " ", " ", " "},
                {"Nómina por pagar", " ", " ", " "},
                {"Gastos Acumulados por Pagar", " ", " ", " "},
                {"INSS Patronal", " ", " ", " "},
                {"INATEC", " ", " ", " "},
                {"Vacaciones", " ", " ", " "},
                {"Treceavo Mes", " ", " ", " "},
                {"Indemnización Laboral", " ", " ", " "},
                {" ", "TOTAL", " ", " "}
            },
            new String [] {
                "Cuenta", "Parcial", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
        jTable1.setFont(new Font("Tahoma",Font.PLAIN,11));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        //AGREGANDO VALORES A LAS TABLA
        if(!nomina.isEmpty()) {
            //COSTOS DE LOS DEPARTAMENTOS
            jTable1.setValueAt(Calculador.calcularSueldosSalarios(nomina), 1, 1);
            jTable1.setValueAt(Calculador.calcularHorasExtras(nomina), 2, 1);
            jTable1.setValueAt(Calculador.calcularAntiguedad(nomina), 3, 1);
            jTable1.setValueAt(Calculador.calcularInssPatronal(nomina), 4, 1);
            jTable1.setValueAt(Calculador.calcularInatec(nomina), 5, 1);
            jTable1.setValueAt(Calculador.calcularVacaciones(nomina), 6, 1);
            jTable1.setValueAt(Calculador.calcularTreceavoMes(nomina), 7, 1);
            jTable1.setValueAt(Calculador.calcularIndemnizacionLaboral(nomina), 8, 1);
            jTable1.setValueAt(Calculador.calcularBonos(nomina), 9, 1);
            jTable1.setValueAt(Calculador.calcularOtrosIngresos(nomina), 10, 1);
            double xxx = Double.parseDouble(Calculador.calcularSueldosSalarios(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularHorasExtras(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularAntiguedad(nomina).replaceAll(",", ".")) +
            Double.parseDouble(Calculador.calcularInssPatronal(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularInatec(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularVacaciones(nomina).replaceAll(",", ".")) +
            Double.parseDouble(Calculador.calcularTreceavoMes(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularIndemnizacionLaboral(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularBonos(nomina).replaceAll(",", ".")) +
            Double.parseDouble(Calculador.calcularOtrosIngresos(nomina).replaceAll(",", "."));
            jTable1.setValueAt(String.format("%.2f", xxx), 0, 2);
            //RETENCIONES POR PAGAR
            jTable1.setValueAt(Calculador.calcularInssLaboral(nomina), 12, 1);
            jTable1.setValueAt(Calculador.calcularIrLaboral(nomina), 13, 1);
            jTable1.setValueAt(Calculador.calcularOtrasDeducciones(nomina), 14, 1);
            double retenciones = Double.parseDouble(Calculador.calcularInssLaboral(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularIrLaboral(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularOtrasDeducciones(nomina).replaceAll(",", "."));
            jTable1.setValueAt(String.format("%.2f", retenciones), 11, 3);
            //NOMINA POR PAGAR
            jTable1.setValueAt(Calculador.calcularNominaPorPagar(nomina), 15, 3);
            //GASTOS ACUMULADOS POR PAGAR
            jTable1.setValueAt(Calculador.calcularInssPatronal(nomina), 17, 1);
            jTable1.setValueAt(Calculador.calcularInatec(nomina), 18, 1);
            jTable1.setValueAt(Calculador.calcularVacaciones(nomina), 19, 1);
            jTable1.setValueAt(Calculador.calcularTreceavoMes(nomina), 20, 1);
            jTable1.setValueAt(Calculador.calcularIndemnizacionLaboral(nomina), 21, 1);
            double gastos = Double.parseDouble(Calculador.calcularInssPatronal(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularInatec(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularVacaciones(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularTreceavoMes(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularIndemnizacionLaboral(nomina).replaceAll(",", "."));
            jTable1.setValueAt(String.format("%.2f", gastos), 16, 3);
            //TOTAL
            double totalHaber = retenciones + gastos + Double.parseDouble(Calculador.calcularNominaPorPagar(nomina).replaceAll(",", "."));
            jTable1.setValueAt(String.format("%.2f", xxx), 22, 2);
            jTable1.setValueAt(String.format("%.2f", totalHaber), 22, 3);
        }

        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                String text = String.valueOf(value);
                this.setText(text);

                if(isSelected) {
                    this.setBackground(table.getSelectionBackground());
                    this.setForeground(table.getSelectionForeground());
                }else {
                    this.setBackground(table.getBackground());
                    this.setForeground(table.getForeground());
                }

                this.setEnabled(table.isEnabled());
                this.setFont(table.getFont());
                this.setOpaque(true);

                if(col > 0)
                this.setHorizontalAlignment(CENTER);
                else
                this.setHorizontalAlignment(LEFT);

                return this;
            }});
            jScrollPane1.setViewportView(jTable1);
            if (jTable1.getColumnModel().getColumnCount() > 0) {
                jTable1.getColumnModel().getColumn(0).setResizable(false);
                jTable1.getColumnModel().getColumn(1).setResizable(false);
                jTable1.getColumnModel().getColumn(2).setResizable(false);
                jTable1.getColumnModel().getColumn(3).setResizable(false);
            }

            jPanel1.add(jScrollPane1);
            jScrollPane1.setBounds(18, 28, 490, 320);

            jButton1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir ventana.png"))); // NOI18N
            jButton1.setText("Volver");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton1);
            jButton1.setBounds(780, 510, 121, 48);

            jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"Gastos Acumulados por Pagar", " ", " ", " "},
                    {"INATEC", " ", " ", " "},
                    {"Banco", " ", " ", " "},
                    {" ", "TOTAL", " ", " "}
                },
                new String [] {
                    "Cuenta", "Parcial", "Debe", "Haber"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable4.setRowHeight(25);
            jTable4.getTableHeader().setReorderingAllowed(false);
            jTable4.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
            jTable4.setFont(new Font("Tahoma",Font.PLAIN,11));
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);

            //AGREGANDO VALORES A LAS TABLA **PAGO DE INATEC**
            if(!nomina.isEmpty()) {
                jTable4.setValueAt(Calculador.calcularInatec(nomina), 0, 2);
                jTable4.setValueAt(Calculador.calcularInatec(nomina), 1, 1);
                jTable4.setValueAt(Calculador.calcularInatec(nomina), 2, 3);
                jTable4.setValueAt(Calculador.calcularInatec(nomina), 3, 2);
                jTable4.setValueAt(Calculador.calcularInatec(nomina), 3, 3);
            }

            jTable4.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                    String text = String.valueOf(value);
                    this.setText(text);

                    if(isSelected) {
                        this.setBackground(table.getSelectionBackground());
                        this.setForeground(table.getSelectionForeground());
                    }else {
                        this.setBackground(table.getBackground());
                        this.setForeground(table.getForeground());
                    }

                    this.setEnabled(table.isEnabled());
                    this.setFont(table.getFont());
                    this.setOpaque(true);

                    if(col > 0)
                    this.setHorizontalAlignment(CENTER);
                    else
                    this.setHorizontalAlignment(LEFT);

                    return this;
                }});
                jScrollPane6.setViewportView(jTable4);
                if (jTable4.getColumnModel().getColumnCount() > 0) {
                    jTable4.getColumnModel().getColumn(0).setResizable(false);
                    jTable4.getColumnModel().getColumn(1).setResizable(false);
                    jTable4.getColumnModel().getColumn(2).setResizable(false);
                    jTable4.getColumnModel().getColumn(3).setResizable(false);
                }

                jPanel1.add(jScrollPane6);
                jScrollPane6.setBounds(18, 368, 490, 127);

                jTable5.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {"Retenciones por Pagar", " ", " ", " "},
                        {"IR Laboral", " ", " ", " "},
                        {"Banco", " ", " ", " "},
                        {" ", "TOTAL", " ", " "}
                    },
                    new String [] {
                        "Cuenta", "Parcial", "Debe", "Haber"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                jTable5.setRowHeight(25);
                jTable5.getTableHeader().setReorderingAllowed(false);
                jTable5.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
                jTable5.setFont(new Font("Tahoma",Font.PLAIN,11));
                jTable5.getColumnModel().getColumn(0).setPreferredWidth(100);

                //AGREGANDO VALORES A LAS TABLA **PAGO DEL IR**
                if(!nomina.isEmpty()) {
                    jTable5.setValueAt(Calculador.calcularIrLaboral(nomina), 0, 2);
                    jTable5.setValueAt(Calculador.calcularIrLaboral(nomina), 1, 1);
                    jTable5.setValueAt(Calculador.calcularIrLaboral(nomina), 2, 3);
                    jTable5.setValueAt(Calculador.calcularIrLaboral(nomina), 3, 2);
                    jTable5.setValueAt(Calculador.calcularIrLaboral(nomina), 3, 3);
                }

                jTable5.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                        String text = String.valueOf(value);
                        this.setText(text);

                        if(isSelected) {
                            this.setBackground(table.getSelectionBackground());
                            this.setForeground(table.getSelectionForeground());
                        }else {
                            this.setBackground(table.getBackground());
                            this.setForeground(table.getForeground());
                        }

                        this.setEnabled(table.isEnabled());
                        this.setFont(table.getFont());
                        this.setOpaque(true);

                        if(col > 0)
                        this.setHorizontalAlignment(CENTER);
                        else
                        this.setHorizontalAlignment(LEFT);

                        return this;
                    }});
                    jScrollPane2.setViewportView(jTable5);
                    if (jTable5.getColumnModel().getColumnCount() > 0) {
                        jTable5.getColumnModel().getColumn(0).setResizable(false);
                        jTable5.getColumnModel().getColumn(1).setResizable(false);
                        jTable5.getColumnModel().getColumn(2).setResizable(false);
                        jTable5.getColumnModel().getColumn(3).setResizable(false);
                    }

                    jPanel1.add(jScrollPane2);
                    jScrollPane2.setBounds(520, 370, 500, 127);

                    jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                            {"Nomina por Pagar", " ", " ", " "},
                            {"Banco", " ", " ", " "},
                            {" ", "TOTAL", " ", " "},
                            {" ", " ", " ", " "}
                        },
                        new String [] {
                            "Cuenta", "Parcial", "Debe", "Haber"
                        }
                    ) {
                        boolean[] canEdit = new boolean [] {
                            false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit [columnIndex];
                        }
                    });
                    jTable2.setRowHeight(25);
                    jTable2.getTableHeader().setReorderingAllowed(false);
                    jTable2.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
                    jTable2.setFont(new Font("Tahoma",Font.PLAIN,11));
                    jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);

                    //AGREGANDO VALORES A LAS TABLA **PAGO DE LA NOMINA**
                    if(!nomina.isEmpty()) {
                        jTable2.setValueAt(Calculador.calcularNominaPorPagar(nomina), 0, 2);
                        jTable2.setValueAt(Calculador.calcularNominaPorPagar(nomina), 1, 3);
                        jTable2.setValueAt(Calculador.calcularNominaPorPagar(nomina), 2, 2);
                        jTable2.setValueAt(Calculador.calcularNominaPorPagar(nomina), 2, 3);
                    }

                    jTable2.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                            String text = String.valueOf(value);
                            this.setText(text);

                            if(isSelected) {
                                this.setBackground(table.getSelectionBackground());
                                this.setForeground(table.getSelectionForeground());
                            }else {
                                this.setBackground(table.getBackground());
                                this.setForeground(table.getForeground());
                            }

                            this.setEnabled(table.isEnabled());
                            this.setFont(table.getFont());
                            this.setOpaque(true);

                            if(col > 0)
                            this.setHorizontalAlignment(CENTER);
                            else
                            this.setHorizontalAlignment(LEFT);

                            return this;
                        }});
                        jScrollPane7.setViewportView(jTable2);
                        if (jTable2.getColumnModel().getColumnCount() > 0) {
                            jTable2.getColumnModel().getColumn(0).setResizable(false);
                            jTable2.getColumnModel().getColumn(1).setResizable(false);
                            jTable2.getColumnModel().getColumn(2).setResizable(false);
                            jTable2.getColumnModel().getColumn(3).setResizable(false);
                        }

                        jPanel1.add(jScrollPane7);
                        jScrollPane7.setBounds(520, 30, 500, 127);

                        jTable3.setModel(new javax.swing.table.DefaultTableModel(
                            new Object [][] {
                                {"Gastos Acumulados por Pagar", " ", " ", " "},
                                {"INSS Patronal", " ", " ", " "},
                                {"Retenciones por Pagar", " ", " ", " "},
                                {"Inss Laboral", " ", " ", " "},
                                {"Banco", " ", " ", " "},
                                {" ", "TOTAL", " ", " "}
                            },
                            new String [] {
                                "Cuenta", "Parcial", "Debe", "Haber"
                            }
                        ) {
                            boolean[] canEdit = new boolean [] {
                                false, false, false, false
                            };

                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                            }
                        });
                        jTable3.setRowHeight(25);
                        jTable3.getTableHeader().setReorderingAllowed(false);
                        jTable3.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 11));
                        jTable3.setFont(new Font("Tahoma",Font.PLAIN,11));
                        jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);

                        //AGREGANDO VALORES A LAS TABLA **PAGO DE INATEC**
                        if(!nomina.isEmpty()) {
                            jTable3.setValueAt(Calculador.calcularInssPatronal(nomina), 0, 2);
                            jTable3.setValueAt(Calculador.calcularInssPatronal(nomina), 1, 1);
                            jTable3.setValueAt(Calculador.calcularInssLaboral(nomina), 2, 2);
                            jTable3.setValueAt(Calculador.calcularInssLaboral(nomina), 3, 1);
                            double banco = Double.parseDouble(Calculador.calcularInssPatronal(nomina).replaceAll(",", ".")) + Double.parseDouble(Calculador.calcularInssLaboral(nomina).replaceAll(",", "."));
                            jTable3.setValueAt(String.format("%.2f", banco), 4, 3);
                            jTable3.setValueAt(String.format("%.2f", banco), 5, 2);
                            jTable3.setValueAt(String.format("%.2f", banco), 5, 3);
                        }

                        jTable3.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                                String text = String.valueOf(value);
                                this.setText(text);

                                if(isSelected) {
                                    this.setBackground(table.getSelectionBackground());
                                    this.setForeground(table.getSelectionForeground());
                                }else {
                                    this.setBackground(table.getBackground());
                                    this.setForeground(table.getForeground());
                                }

                                this.setEnabled(table.isEnabled());
                                this.setFont(table.getFont());
                                this.setOpaque(true);

                                if(col > 0)
                                this.setHorizontalAlignment(CENTER);
                                else
                                this.setHorizontalAlignment(LEFT);

                                return this;
                            }});
                            jScrollPane8.setViewportView(jTable3);
                            if (jTable3.getColumnModel().getColumnCount() > 0) {
                                jTable3.getColumnModel().getColumn(0).setResizable(false);
                                jTable3.getColumnModel().getColumn(1).setResizable(false);
                                jTable3.getColumnModel().getColumn(2).setResizable(false);
                                jTable3.getColumnModel().getColumn(3).setResizable(false);
                            }

                            jPanel1.add(jScrollPane8);
                            jScrollPane8.setBounds(520, 170, 500, 177);

                            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_reputacion_25601.jpg"))); // NOI18N
                            jPanel1.add(jLabel1);
                            jLabel1.setBounds(0, 0, 1060, 570);

                            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                            getContentPane().setLayout(layout);
                            layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                            );
                            layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            );

                            pack();
                        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        menu.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro(new JMenuItem()).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
