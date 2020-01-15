package nomina;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Ingresos extends javax.swing.JFrame {

    private ListModel modelo;
    private ArrayList<Empleado> nomina;
    private File file;
    private JMenuItem menu;
    private boolean editado = Funcion.isEditado();
    
    public Ingresos(File file, JMenuItem menu) {
        this.file = file;
        this.nomina = (ArrayList<Empleado>) Funcion.cargarArchivo(file);
        this.menu = menu;
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ingreso_basico = new javax.swing.JLabel();
        antiguedad = new javax.swing.JLabel();
        total_ordinario = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ingreso_total = new javax.swing.JLabel();
        neto_pagado = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        deducciones = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        vacaciones = new javax.swing.JLabel();
        otros_ingresos = new javax.swing.JLabel();
        total_extraordinario = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        horas_extras = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        inns_patronal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre_completo = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        no_empleado = new javax.swing.JLabel();
        departamento = new javax.swing.JLabel();
        jornada_laboral = new javax.swing.JLabel();
        no_inss = new javax.swing.JLabel();
        fecha_ingreso = new javax.swing.JLabel();
        tipo_contratacion = new javax.swing.JLabel();
        textBox1 = new application.TextBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nómina - Informe de Ingresos y Egresos");
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(880, 608));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 608));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe de Ingresos y Egresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Cotización INSS", "-"},
                {"Cotización IR", "-"},
                {"Otras Deducciones", "-"},
                {"Total", "-"},
                {" ", " "}
            },
            new String [] {
                "Deducción", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setFont(new Font("TimesNewRoman",Font.BOLD,12));
        jTable1.setFont(new Font("TimesNewRoman",Font.PLAIN,12));
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
            }

            jLabel19.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel19.setText("Ingreso básico");

            jLabel20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel20.setText("Antigüedad");

            jLabel21.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel21.setText("Total Ordinario");

            ingreso_basico.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            ingreso_basico.setText("-");

            antiguedad.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            antiguedad.setText("-");

            total_ordinario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            total_ordinario.setText("-");

            jLabel25.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel25.setText("INGRESO TOTAL");

            jLabel26.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel26.setText("NETO PAGADO");

            ingreso_total.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            ingreso_total.setText("-");

            neto_pagado.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            neto_pagado.setText("-");

            jLabel29.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel29.setText("DEDUCCIONES");

            deducciones.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            deducciones.setText("-");

            jLabel31.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel31.setText("Vacaciones");

            jLabel32.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel32.setText("Otros ingresos");

            jLabel33.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel33.setText("Total Extraordinario");

            vacaciones.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            vacaciones.setText("-");

            otros_ingresos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            otros_ingresos.setText("-");

            total_extraordinario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            total_extraordinario.setText("-");

            jLabel37.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel37.setText("Horas extras");

            horas_extras.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            horas_extras.setText("-");

            jLabel39.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel39.setText("INSS Patronal");

            inns_patronal.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            inns_patronal.setText("-");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(neto_pagado, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(ingreso_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(232, 232, 232)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(10, 10, 10)
                            .addComponent(inns_patronal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ingreso_basico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(antiguedad, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(total_ordinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(otros_ingresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total_extraordinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(horas_extras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(98, 98, 98))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(ingreso_basico))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(antiguedad)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(total_ordinario)
                                .addComponent(jLabel21))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(horas_extras)
                                .addComponent(jLabel37))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(vacaciones))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(otros_ingresos))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(total_extraordinario)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(ingreso_total)
                        .addComponent(jLabel29)
                        .addComponent(deducciones))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(neto_pagado)
                        .addComponent(jLabel39)
                        .addComponent(inns_patronal))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel2);
            jPanel2.setBounds(20, 268, 840, 270);

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

            jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel1.setText("Nombre completo:");

            jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel2.setText("Cargo:");

            jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel3.setText("No. de empleado:");

            jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel4.setText("Departamento:");

            jLabel5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel5.setText("Jornada laboral:");

            jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel6.setText("Fecha de ingreso:");

            jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel7.setText("Tipo de contratación:");

            nombre_completo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            nombre_completo.setText("-");

            cargo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            cargo.setText("-");

            jLabel10.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel10.setText("Salario:");

            salario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            salario.setText("-");

            jLabel12.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
            jLabel12.setText("No. de INSS:");

            no_empleado.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            no_empleado.setText("-");

            departamento.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            departamento.setText("-");

            jornada_laboral.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            jornada_laboral.setText("-");

            no_inss.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            no_inss.setText("-");

            fecha_ingreso.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            fecha_ingreso.setText("-");

            tipo_contratacion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
            tipo_contratacion.setText("-");

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jornada_laboral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(departamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(no_empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(no_inss, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(fecha_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipo_contratacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombre_completo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nombre_completo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(no_inss)
                        .addComponent(no_empleado)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cargo)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(departamento)
                        .addComponent(fecha_ingreso))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jornada_laboral)
                        .addComponent(tipo_contratacion))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(salario))
                    .addContainerGap(14, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel4);
            jPanel4.setBounds(20, 35, 621, 207);

            textBox1.setPlaceHolder(" Buscar...");
            textBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    textBox1ActionPerformed(evt);
                }
            });
            textBox1.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    textBox1KeyReleased(evt);
                }
            });
            jPanel1.add(textBox1);
            textBox1.setBounds(660, 35, 200, 26);

            jList1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            if(!nomina.isEmpty()) {
                String[] datos = new String[nomina.size()];
                for(int i=0;i<nomina.size();i++) {
                    datos[i] = nomina.get(i).getNombre_apellido();
                }
                jList1.setListData(datos);
            }
            jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jList1.setCellRenderer(new IconRenderer());
            modelo = jList1.getModel();
            jList1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList1MouseClicked(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    jList1MousePressed(evt);
                }
            });
            jScrollPane2.setViewportView(jList1);

            jPanel1.add(jScrollPane2);
            jScrollPane2.setBounds(660, 70, 200, 170);

            jButton1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir ventana.png"))); // NOI18N
            jButton1.setText("Volver");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton1);
            jButton1.setBounds(721, 549, 121, 48);

            jButton2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
            jButton2.setText("Editar");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton2);
            jButton2.setBounds(38, 549, 117, 48);

            jButton3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
            jButton3.setText("Eliminar");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            jPanel1.add(jButton3);
            jButton3.setBounds(173, 549, 133, 48);

            jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_reputacion_25601.jpg"))); // NOI18N
            jPanel1.add(jLabel41);
            jLabel41.setBounds(-1090, 0, 1970, 610);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        menu.setEnabled(true);
        if(Funcion.getVentanaEditarE() != null)
            Funcion.getVentanaEditarE().dispose();
        if(Funcion.getVentanaEditarID() != null)
            Funcion.getVentanaEditarID().dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBox1KeyReleased
        if(textBox1.getText() != null) { 
            DefaultListModel nuevo = new DefaultListModel();
            for(int i=0;i<modelo.getSize();i++) {
                if(Funcion.startsWith(String.valueOf(modelo.getElementAt(i)), textBox1.getText()))
                    nuevo.addElement(modelo.getElementAt(i));
            }
            jList1.setModel(nuevo);
        }else 
            jList1.setModel(modelo);
    }//GEN-LAST:event_textBox1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jList1.getSelectedIndex() >= 0) {
            jButton2.setEnabled(false);
            EventQueue.invokeLater(new Runnable() { public void run() {
                new EditarEmpleado(file, jButton2, jList1.getSelectedIndex()).setVisible(true);
            }});
        }else 
            JOptionPane.showMessageDialog(null, "Debe escoger primero un empleado.");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int eliminado = jList1.getSelectedIndex();
        if(eliminado >= 0) {
            String[] opciones = {"Aceptar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(null, "Toda la información será eliminada. ¿Desea continuar?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
            if(opcion == 0) {
                nomina.remove(eliminado);
                DefaultListModel mod = new DefaultListModel();
                if(!nomina.isEmpty()) {
                    for(int i=0;i<nomina.size();i++) {
                      mod.addElement(nomina.get(i).getNombre_apellido());
                    }
                    jList1.setModel(mod);
                    modelo = jList1.getModel();
                }else {
                    jList1.setModel(mod);
                    modelo = jList1.getModel();
                }
                antiguedad.setText("-");
                cargo.setText("-");
                departamento.setText("-");
                fecha_ingreso.setText("-");
                horas_extras.setText("-");
                ingreso_basico.setText("-");
                inns_patronal.setText("-");
                jornada_laboral.setText("-");
                no_empleado.setText("-");
                no_inss.setText("-");
                nombre_completo.setText("-");
                otros_ingresos.setText("-");
                salario.setText("-");
                tipo_contratacion.setText("-");
                vacaciones.setText("-");
                total_ordinario.setText("-");
                ingreso_total.setText("-");
                deducciones.setText("-");
                neto_pagado.setText("-");
                Funcion.guardarArchivo(file, nomina);
            } 
        }else 
            JOptionPane.showMessageDialog(null, "Debe escoger primero un empleado.");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(jList1.getSelectedIndex() >= 0) {
            antiguedad.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getAntiguedad()));
            cargo.setText(nomina.get(jList1.getSelectedIndex()).getCargo());
            departamento.setText(nomina.get(jList1.getSelectedIndex()).getDepatamento_lab());
            fecha_ingreso.setText(new SimpleDateFormat("dd MMMM yyyy").format(nomina.get(jList1.getSelectedIndex()).getFecha_ingreso()));
            horas_extras.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getIngresos_horas_extras()));
            ingreso_basico.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getSalario_mensual()));
            inns_patronal.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getInss_patronal()));
            jornada_laboral.setText(nomina.get(jList1.getSelectedIndex()).getJornada_laboral());
            no_empleado.setText(nomina.get(jList1.getSelectedIndex()).getNo_empleado());
            no_inss.setText(nomina.get(jList1.getSelectedIndex()).getNo_inss());
            nombre_completo.setText(nomina.get(jList1.getSelectedIndex()).getNombre_apellido());
            otros_ingresos.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getOtros_ingresos()));
            salario.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getSalario_mensual()));
            tipo_contratacion.setText(nomina.get(jList1.getSelectedIndex()).getTipo_contratacion());
            vacaciones.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getVacaciones()));
            double inb = Double.parseDouble(ingreso_basico.getText().replaceAll(",", "."));
            double ant = Double.parseDouble(antiguedad.getText().replaceAll(",", "."));
            total_ordinario.setText(String.format("%.2f", inb + ant));
            double hre = Double.parseDouble(horas_extras.getText().replaceAll(",", "."));
            double vac = Double.parseDouble(vacaciones.getText().replaceAll(",", "."));
            double oti = Double.parseDouble(otros_ingresos.getText().replaceAll(",", "."));
            total_extraordinario.setText(String.format("%.2f", hre + vac + oti));
            double tor = Double.parseDouble(total_ordinario.getText().replaceAll(",", "."));
            double tex = Double.parseDouble(total_extraordinario.getText().replaceAll(",", "."));
            ingreso_total.setText(String.format("%.2f", tor + tex));
            jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getInss_laboral()), 0, 1);
            jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getIr_laboral()), 1, 1);
            jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getOtras_deducciones()), 2, 1);
            double tot =  Double.parseDouble(String.valueOf(jTable1.getValueAt(0, 1)).replaceAll(",", ".")) +  Double.parseDouble(String.valueOf(jTable1.getValueAt(1, 1)).replaceAll(",", ".")) + Double.parseDouble(String.valueOf(jTable1.getValueAt(2, 1)).replaceAll(",", "."));
            jTable1.setValueAt(String.format("%.2f", tot), 3, 1);
            deducciones.setText(String.valueOf(jTable1.getValueAt(3, 1)));
            double igt = Double.parseDouble(ingreso_total.getText().replaceAll(",", "."));
            double dec = Double.parseDouble(deducciones.getText().replaceAll(",", "."));
            neto_pagado.setText(String.format("%.2f", igt - dec));
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        editado = Funcion.isEditado();
        if(editado) {
            nomina = (ArrayList<Empleado>) Funcion.cargarArchivo(file);
            if(jList1.getSelectedIndex() >= 0) {
                antiguedad.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getAntiguedad()));
                cargo.setText(nomina.get(jList1.getSelectedIndex()).getCargo());
                departamento.setText(nomina.get(jList1.getSelectedIndex()).getDepatamento_lab());
                fecha_ingreso.setText(new SimpleDateFormat("dd MMMM yyyy").format(nomina.get(jList1.getSelectedIndex()).getFecha_ingreso()));
                horas_extras.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getIngresos_horas_extras()));
                ingreso_basico.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getSalario_mensual()));
                inns_patronal.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getInss_patronal()));
                jornada_laboral.setText(nomina.get(jList1.getSelectedIndex()).getJornada_laboral());
                no_empleado.setText(nomina.get(jList1.getSelectedIndex()).getNo_empleado());
                no_inss.setText(nomina.get(jList1.getSelectedIndex()).getNo_inss());
                nombre_completo.setText(nomina.get(jList1.getSelectedIndex()).getNombre_apellido());
                otros_ingresos.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getOtros_ingresos()));
                salario.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getSalario_mensual()));
                tipo_contratacion.setText(nomina.get(jList1.getSelectedIndex()).getTipo_contratacion());
                vacaciones.setText(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getVacaciones()));
                double inb = Double.parseDouble(ingreso_basico.getText().replaceAll(",", "."));
                double ant = Double.parseDouble(antiguedad.getText().replaceAll(",", "."));
                total_ordinario.setText(String.format("%.2f", inb + ant));
                double hre = Double.parseDouble(horas_extras.getText().replaceAll(",", "."));
                double vac = Double.parseDouble(vacaciones.getText().replaceAll(",", "."));
                double oti = Double.parseDouble(otros_ingresos.getText().replaceAll(",", "."));
                total_extraordinario.setText(String.format("%.2f", hre + vac + oti));
                double tor = Double.parseDouble(total_ordinario.getText().replaceAll(",", "."));
                double tex = Double.parseDouble(total_extraordinario.getText().replaceAll(",", "."));
                ingreso_total.setText(String.format("%.2f", tor + tex));
                jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getInss_laboral()), 0, 1);
                jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getIr_laboral()), 1, 1);
                jTable1.setValueAt(String.format("%.2f", nomina.get(jList1.getSelectedIndex()).getOtras_deducciones()), 2, 1);
                double tot =  Double.parseDouble(String.valueOf(jTable1.getValueAt(0, 1)).replaceAll(",", ".")) +  Double.parseDouble(String.valueOf(jTable1.getValueAt(1, 1)).replaceAll(",", ".")) + Double.parseDouble(String.valueOf(jTable1.getValueAt(2, 1)).replaceAll(",", "."));
                jTable1.setValueAt(String.format("%.2f", tot), 3, 1);
                deducciones.setText(String.valueOf(jTable1.getValueAt(3, 1)));
                double igt = Double.parseDouble(ingreso_total.getText().replaceAll(",", "."));
                double dec = Double.parseDouble(deducciones.getText().replaceAll(",", "."));
                neto_pagado.setText(String.format("%.2f", igt - dec));
            }
            Funcion.setEditado(false);
        }
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        JList lista = (JList) evt.getSource();
        MouseListener[] listeners = lista.getMouseListeners();
        MouseListener listener = listeners[2];
        if(evt.getClickCount() == 2 && lista.getSelectedIndex() >= 0) {
            lista.removeMouseListener(listener);
            EventQueue.invokeLater(new Runnable() { public void run() {
                new FormularioID(file, lista.getSelectedIndex(), lista, listener).setVisible(true);
            }});
        }
    }//GEN-LAST:event_jList1MousePressed

    private void textBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBox1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antiguedad;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel deducciones;
    private javax.swing.JLabel departamento;
    private javax.swing.JLabel fecha_ingreso;
    private javax.swing.JLabel horas_extras;
    private javax.swing.JLabel ingreso_basico;
    private javax.swing.JLabel ingreso_total;
    private javax.swing.JLabel inns_patronal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jornada_laboral;
    private javax.swing.JLabel neto_pagado;
    private javax.swing.JLabel no_empleado;
    private javax.swing.JLabel no_inss;
    private javax.swing.JLabel nombre_completo;
    private javax.swing.JLabel otros_ingresos;
    private javax.swing.JLabel salario;
    private application.TextBox textBox1;
    private javax.swing.JLabel tipo_contratacion;
    private javax.swing.JLabel total_extraordinario;
    private javax.swing.JLabel total_ordinario;
    private javax.swing.JLabel vacaciones;
    // End of variables declaration//GEN-END:variables
}
