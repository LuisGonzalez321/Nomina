package nomina;

import java.awt.EventQueue;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Formulario extends javax.swing.JFrame {

    private ArrayList<Empleado> nomina;
    private File file;
    private JMenuItem menu;
    private String estudios;
    
    public Formulario(File file, JMenuItem menu) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        caja_estado = new javax.swing.JComboBox<>();
        caja_nivel = new javax.swing.JComboBox<>();
        caja_hijos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        caja_nacimiento = new com.toedter.calendar.JDateChooser();
        ciudad_nacimiento = new application.TextBox();
        departamento_nacimiento = new application.TextBox();
        pais_nacimiento = new application.TextBox();
        campo_direccion = new application.TextBox();
        campo_cedula = new application.TextBox();
        campo_numero = new application.TextBox();
        campo_nombre = new application.AlphabeticTextBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campo_deplab = new javax.swing.JComboBox<>();
        caja_tipo = new javax.swing.JComboBox<>();
        caja_jornada = new javax.swing.JComboBox<>();
        caja_ingreso = new com.toedter.calendar.JDateChooser();
        campo_cargo = new application.AlphabeticTextBox();
        campo_profecion = new application.AlphabeticTextBox();
        jLabel18 = new javax.swing.JLabel();
        campo_salario = new application.NumberTextBox();
        campo_inss = new application.TextBox();
        ciudad_ubicaccion = new application.TextBox();
        departamento_ubicacion = new application.TextBox();
        pais_ubicacion = new application.TextBox();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        estudios_realizados = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nómina - Registrar Empleado");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Nombre completo:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel2.setText("Fecha de nacimiento:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setText("Lugar de nacimiento:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setText("Estado civil:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel5.setText("Dirección de domicilio:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel6.setText("Número de identificador:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel7.setText("Número de hijos:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel8.setText("Número de contacto:");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel12.setText("Nivel académico:");

        caja_estado.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        caja_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Divorciado" }));

        caja_nivel.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        caja_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Preescolar", "Primaria", "Tercer Año", "Técnico Medio", "Bachiller", "Técnico Superior", "Licenciado", "Master", "Doctor" }));
        caja_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_nivelActionPerformed(evt);
            }
        });

        String[] str = new String[11];
        for(int i=0;i<=10;i++)
        str[i] = String.valueOf(i);
        caja_hijos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        caja_hijos.setModel(new javax.swing.DefaultComboBoxModel<>(str));
        caja_hijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_hijosActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setText("introducir datos");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        caja_nacimiento.getDateEditor().setEnabled(false);
        caja_nacimiento.setDateFormatString("dd MMMM yyyy");
        Date max = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int ano = c.get(Calendar.YEAR);
        ano -= 16;
        c.set(Calendar.YEAR, ano);
        max = c.getTime();
        caja_nacimiento.setMaxSelectableDate(max);
        caja_nacimiento.setMinSelectableDate(new java.util.Date(-1262278800000L));
        caja_nacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                caja_nacimientoPropertyChange(evt);
            }
        });

        ciudad_nacimiento.setMaxLength(50);
        ciudad_nacimiento.setPlaceHolder(" Ciudad");

        departamento_nacimiento.setMaxLength(50);
        departamento_nacimiento.setPlaceHolder(" Departamento");

        pais_nacimiento.setPlaceHolder(" País");

        campo_direccion.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
            for(int i=0;i<arg1.length();i++){
                if(!Character.isLetter(arg1.charAt(i)) && arg1.charAt(i) != ' ' && !Character.isDigit(arg1.charAt(i)) && arg1.charAt(i) != '.' && arg1.charAt(i) != '/'){
                    return;
                }
            }
            super.insertString(arg0, arg1, arg2);
        }});

        campo_cedula.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
            for(int i=0;i<arg1.length();i++){
                if(!Character.isLetter(arg1.charAt(i)) && arg1.charAt(i) != '-' && !Character.isDigit(arg1.charAt(i))){
                    return;
                }
            }
            super.insertString(arg0, arg1, arg2);
        }});
        campo_cedula.setMaxLength(16);
        campo_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_cedulaActionPerformed(evt);
            }
        });
        campo_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campo_cedulaKeyReleased(evt);
            }
        });

        campo_numero.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
            for(int i=0;i<arg1.length();i++){
                if(!Character.isDigit(arg1.charAt(i)) && arg1.charAt(i) != '+' && arg1.charAt(i) != '-'){
                    return;
                }
            }
            super.insertString(arg0, arg1, arg2);
        }});
        campo_numero.setMaxLength(20);

        campo_nombre.setText("alphabeticTextBox1");
        campo_nombre.setMaxLength(50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caja_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caja_nivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ciudad_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(departamento_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pais_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(caja_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(caja_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(caja_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(ciudad_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(caja_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(caja_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(22, 17, 984, 243);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Laboral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel9.setText("Cargo:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel10.setText("Departamento laboral:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel11.setText("Tipo de contratación:");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setText("Fecha de ingreso:");

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel14.setText("Jornada laboral:");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel15.setText("Número de INSS:");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel16.setText("Ubicación:");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel17.setText("Profesión:");

        campo_deplab.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        campo_deplab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas", "Administración", "Producción", "Servicios" }));

        caja_tipo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        caja_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Determinado", "Indeterminado" }));

        caja_jornada.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        caja_jornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurna", "Nocturna", "Mixta" }));

        caja_ingreso.getDateEditor().setEnabled(false);
        caja_ingreso.setDateFormatString("dd MMMM yyyy");
        caja_ingreso.setMaxSelectableDate(new Date());
        caja_ingreso.setMinSelectableDate(new java.util.Date(-1262278800000L));

        campo_cargo.setText("alphabeticTextBox1");
        campo_cargo.setMaxLength(50);

        campo_profecion.setText("alphabeticTextBox1");
        campo_profecion.setMaxLength(50);

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel18.setText("Salario bruto:");

        campo_salario.setMaxLength(12);

        campo_inss.setDocument(new PlainDocument(){ public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
            for(int i=0;i<arg1.length();i++){
                if(!Character.isDigit(arg1.charAt(i))){
                    return;
                }
            }
            super.insertString(arg0, arg1, arg2);
        }});
        campo_inss.setMaxLength(9);

        ciudad_ubicaccion.setPlaceHolder(" Ciudad");

        departamento_ubicacion.setPlaceHolder(" Departamento");

        pais_ubicacion.setPlaceHolder(" País");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel19.setText("Estudios realizados:");

        estudios_realizados.setEditable(false);
        estudios_realizados.setColumns(20);
        estudios_realizados.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        estudios_realizados.setRows(1);
        jScrollPane1.setViewportView(estudios_realizados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caja_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caja_jornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_cargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ciudad_ubicaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(departamento_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pais_ubicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_deplab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caja_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(campo_profecion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_inss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(campo_deplab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(caja_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(caja_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(caja_jornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_inss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(campo_profecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_ubicaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pais_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(campo_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(22, 266, 984, 230);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir ventana.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(865, 519, 125, 49);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(697, 519, 135, 49);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PRINCIPAL2.jpg"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(0, 0, 1030, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        menu.setEnabled(true);
        if(Funcion.getVentanaHijos() != null)
            Funcion.getVentanaHijos().dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        caja_hijos.setEnabled(false);
        EventQueue.invokeLater(() -> {
            new FormularioH(Integer.parseInt(String.valueOf(caja_hijos.getSelectedItem())), jButton1, caja_hijos).setVisible(true);
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void caja_hijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_hijosActionPerformed
        JComboBox fuente = (JComboBox) evt.getSource();
        if (Integer.parseInt(String.valueOf(fuente.getSelectedItem())) != 0)
            jButton1.setEnabled(true);
        else 
            jButton1.setEnabled(false);
        
        if (!Funcion.getHijos().isEmpty()) {
            String[] opciones = {"Aceptar", "Cancelar"};
            int opcion = JOptionPane.showOptionDialog(null, "Se perderá la información introducida anteriormente. ¿Desea continuar?", "Confirmar", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]);
            if(opcion == 0) 
                Funcion.setHijos(new ArrayList());
            else
                fuente.setSelectedIndex(Funcion.getHijos().size());
        }
    }//GEN-LAST:event_caja_hijosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Lugar nacimiento = new Lugar(ciudad_nacimiento.getText(), departamento_nacimiento.getText(), pais_nacimiento.getText());
        Lugar ubicacion = new Lugar(ciudad_ubicaccion.getText(), departamento_ubicacion.getText(), pais_ubicacion.getText());
        ArrayList<Hijo> hijos = (ArrayList<Hijo>) Funcion.getHijos();
        Empleado nuevo = new Empleado( nacimiento, ubicacion, caja_nacimiento.getDate(), caja_ingreso.getDate(), String.valueOf(caja_tipo.getSelectedItem()), String.valueOf(caja_jornada.getSelectedItem()), 
            campo_direccion.getText(), campo_numero.getText(), String.valueOf(caja_nivel.getSelectedItem()), String.valueOf(caja_estado.getSelectedItem()), campo_profecion.getText(), 
            String.valueOf(campo_deplab.getSelectedItem()), campo_cedula.getText(), campo_inss.getText(), campo_nombre.getText(), campo_cargo.getText(), Double.parseDouble(campo_salario.getText()), hijos, estudios_realizados.getText());
        nomina.add(nuevo);
        Funcion.guardarArchivo(file, nomina);
        Funcion.setHijos(new ArrayList());
        dispose();
        menu.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        boolean estado = (campo_nombre.getText().length() != 0 && campo_inss.getText().length() != 0 && campo_salario.getText().length() != 0 
                && campo_direccion.getText().length() != 0 && caja_nacimiento.getDate() != null && campo_cedula.getText().length() != 0 
                && campo_numero.getText().length() != 0 && campo_cargo.getText().length() != 0 && caja_ingreso.getDate() != null 
                && campo_profecion.getText().length() != 0 && (caja_hijos.getSelectedItem().equals("0") || (!caja_hijos.getSelectedItem().equals("0") && !Funcion.getHijos().isEmpty()))
                && ciudad_nacimiento.getText().length() != 0 && departamento_nacimiento.getText().length() != 0 && pais_nacimiento.getText().length() != 0
                && ciudad_ubicaccion.getText().length() != 0 && departamento_ubicacion.getText().length() != 0 && pais_ubicacion.getText().length() != 0
                && ((estudios_realizados.getText().length() != 0 && caja_nivel.getSelectedIndex() > 7) || caja_nivel.getSelectedIndex() < 8)) ? true : false;
        jButton3.setEnabled(estado);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void caja_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_nivelActionPerformed
        if(caja_nivel.getSelectedIndex() > 7){
            estudios_realizados.setEditable(true);
            if(estudios != null)
                estudios_realizados.setText(estudios);
        }else {
            estudios_realizados.setEditable(false);
            if(estudios_realizados.getText() != null) {
                estudios = estudios_realizados.getText();
                estudios_realizados.setText("");
            }
        }
    }//GEN-LAST:event_caja_nivelActionPerformed

    private void campo_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_cedulaKeyReleased
        if(caja_nacimiento.getDate() != null && campo_cedula.getText().length() == 3) {
            String codigo = "-"+ new SimpleDateFormat("ddMMyy").format(caja_nacimiento.getDate()) +"-";
            campo_cedula.setText(campo_cedula.getText()+codigo);
        }
    }//GEN-LAST:event_campo_cedulaKeyReleased

    private void caja_nacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_caja_nacimientoPropertyChange
        if(caja_nacimiento.getDate() != null) {
            Date min = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(caja_nacimiento.getDate());
            int ano = c.get(Calendar.YEAR);
            ano += 16;
            c.set(Calendar.YEAR, ano);
            min = c.getTime();
            caja_ingreso.setMinSelectableDate(min);
        }
    }//GEN-LAST:event_caja_nacimientoPropertyChange

    private void campo_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_cedulaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> caja_estado;
    private javax.swing.JComboBox<String> caja_hijos;
    private com.toedter.calendar.JDateChooser caja_ingreso;
    private javax.swing.JComboBox<String> caja_jornada;
    private com.toedter.calendar.JDateChooser caja_nacimiento;
    private javax.swing.JComboBox<String> caja_nivel;
    private javax.swing.JComboBox<String> caja_tipo;
    private application.AlphabeticTextBox campo_cargo;
    private application.TextBox campo_cedula;
    private javax.swing.JComboBox<String> campo_deplab;
    private application.TextBox campo_direccion;
    private application.TextBox campo_inss;
    private application.AlphabeticTextBox campo_nombre;
    private application.TextBox campo_numero;
    private application.AlphabeticTextBox campo_profecion;
    private application.NumberTextBox campo_salario;
    private application.TextBox ciudad_nacimiento;
    private application.TextBox ciudad_ubicaccion;
    private application.TextBox departamento_nacimiento;
    private application.TextBox departamento_ubicacion;
    private javax.swing.JTextArea estudios_realizados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private application.TextBox pais_nacimiento;
    private application.TextBox pais_ubicacion;
    // End of variables declaration//GEN-END:variables
}
