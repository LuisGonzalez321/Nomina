package nomina;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

public class Empleado implements Serializable {
    
    private Lugar lugar_nacimiento;
    private Lugar ubicacion_fisica;
    private String no_empleado;
    private Date fecha_nacimiento;
    private Date fecha_ingreso;
    private String tipo_contratacion;
    private String jornada_laboral;
    private String direccion;
    private String numero_contacto;
    private String nivel_academico;
    private String estado_civil;
    private String Profecion;
    private String depatamento_lab;
    private String cedula;
    private String no_inss;
    private String nombre_apellido;
    private String cargo;
    private double salario_mensual;
    private int horas_extras = 0;
    private double ingresos_horas_extras;
    private double antiguedad;
    private double bonos = 0;
    private double otros_ingresos = 0;
    private double total_ingresos;
    private double inss_laboral;
    private double ir_laboral;
    private double otras_deducciones = 0;
    private double total_deducciones;
    private double remuneracion_neta;
    private double inss_patronal;
    private double inatec;
    private double vacaciones;
    private double treceavo_mes;
    private double indemnizacion_laboral;
    private ArrayList<Hijo> hijos;
    private String estudios_realizados;
    
    public Empleado(Lugar lugar_nacimiento, Lugar ubicacion_fisica, Date fecha_nacimiento, Date fecha_ingreso, String tipo_contratacion, String jornada_laboral, String direccion,
        String numero_contacto, String nivel_academico, String estado_civil, String profecion, String depatamento_lab, String cedula, 
        String no_inss, String nombre_apellido, String cargo, double salario_mensual, ArrayList<Hijo> hijos, String estudios_realizados) {
        this.lugar_nacimiento = lugar_nacimiento;
        this.ubicacion_fisica = ubicacion_fisica;
        this.no_empleado = generarNoEmpleado();
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.tipo_contratacion = tipo_contratacion;
        this.jornada_laboral = jornada_laboral;
        this.direccion = direccion;
        this.numero_contacto = numero_contacto;
        this.nivel_academico = nivel_academico;
        this.estado_civil = estado_civil;
        this.Profecion = profecion;
        this.depatamento_lab = depatamento_lab;
        this.cedula = cedula;
        this.no_inss = no_inss;
        this.nombre_apellido = nombre_apellido;
        this.cargo = cargo;
        this.salario_mensual = salario_mensual;
        this.ingresos_horas_extras = calcularIngresosHorasExtras();
        this.antiguedad = calcularAntiduedad();
        this.total_ingresos = calcularTotalIngresos();
        this.inss_laboral = calcularInssLaboral();
        this.ir_laboral = calcularIr();
        this.total_deducciones = calcularTotalDeducciones();
        this.remuneracion_neta = calcularRemuneracionNeta();
        this.inss_patronal = calcularInssPatronal();
        this.inatec = calcularInatec();
        this.vacaciones = calcularVacaciones();
        this.treceavo_mes = calcularTreceavoMes();
        this.indemnizacion_laboral = calcularIndemnizacionLaboral();
        this.hijos = hijos;
        this.estudios_realizados = estudios_realizados;
    }

    public String getNo_inss() {
        return no_inss;
    }

    public void setNo_inss(String no_inss) {
        this.no_inss = no_inss;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(double salario_mensual) {
        this.salario_mensual = salario_mensual;
        this.ingresos_horas_extras = calcularIngresosHorasExtras();
        this.antiguedad = calcularAntiduedad();
        this.total_ingresos = calcularTotalIngresos();
        this.inss_laboral = calcularInssLaboral();
        this.ir_laboral = calcularIr();
        this.total_deducciones = calcularTotalDeducciones();
        this.remuneracion_neta = calcularRemuneracionNeta();
        this.inss_patronal = calcularInssPatronal();
        this.inatec = calcularInatec();
        this.vacaciones = calcularVacaciones();
        this.treceavo_mes = calcularTreceavoMes();
        this.indemnizacion_laboral = calcularIndemnizacionLaboral();
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
        this.ingresos_horas_extras = calcularIngresosHorasExtras();
        }

    public double getIngresos_horas_extras() {
        return ingresos_horas_extras;
    }

    public void setIngresos_horas_extras(double ingresos_horas_extras) {
        this.ingresos_horas_extras = ingresos_horas_extras;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getBonos() {
        return bonos;
    }

    public void setBonos(double bonos) {
        this.bonos = bonos;
        this.total_ingresos = calcularTotalIngresos();
        this.inss_laboral = calcularInssLaboral();
        this.ir_laboral = calcularIr();
        this.total_deducciones = calcularTotalDeducciones();
        this.remuneracion_neta = calcularRemuneracionNeta();
        this.inss_patronal = calcularInssPatronal();
        this.inatec = calcularInatec();
        this.vacaciones = calcularVacaciones();
        this.treceavo_mes = calcularTreceavoMes();
        this.indemnizacion_laboral = calcularIndemnizacionLaboral();
    }

    public double getTotal_ingresos() {
        return total_ingresos;
    }

    public void setTotal_ingresos(double total_ingresos) {
        this.total_ingresos = total_ingresos;
    }

    public double getInss_laboral() {
        return inss_laboral;
    }

    public void setInss_laboral(double inss_laboral) {
        this.inss_laboral = inss_laboral;
    }

    public double getIr_laboral() {
        return ir_laboral;
    }

    public void setIr_laboral(double ir_laboral) {
        this.ir_laboral = ir_laboral;
    }

    public double getOtras_deducciones() {
        return otras_deducciones;
    }

    public void setOtras_deducciones(double otras_deducciones) {
        this.otras_deducciones = otras_deducciones;
        this.total_deducciones = calcularTotalDeducciones();
        this.remuneracion_neta = calcularRemuneracionNeta();
        this.inss_patronal = calcularInssPatronal();
        this.inatec = calcularInatec();
        this.vacaciones = calcularVacaciones();
        this.treceavo_mes = calcularTreceavoMes();
        this.indemnizacion_laboral = calcularIndemnizacionLaboral();
    }

    public double getTotal_deducciones() {
        return total_deducciones;
    }

    public void setTotal_deducciones(double total_deducciones) {
        this.total_deducciones = total_deducciones;
    }

    public double getRemuneracion_neta() {
        return remuneracion_neta;
    }

    public void setRemuneracion_neta(double remuneracion_neta) {
        this.remuneracion_neta = remuneracion_neta;
    }

    public double getInss_patronal() {
        return inss_patronal;
    }

    public void setInss_patronal(double inss_patronal) {
        this.inss_patronal = inss_patronal;
    }

    public double getInatec() {
        return inatec;
    }

    public void setInatec(double inatec) {
        this.inatec = inatec;
    }

    public double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(double vacaciones) {
        this.vacaciones = vacaciones;
    }

    public double getTreceavo_mes() {
        return treceavo_mes;
    }

    public void setTreceavo_mes(double treceavo_mes) {
        this.treceavo_mes = treceavo_mes;
    }

    public double getIndemnizacion_laboral() {
        return indemnizacion_laboral;
    }

    public void setIndemnizacion_laboral(double indemnizacion_laboral) {
        this.indemnizacion_laboral = indemnizacion_laboral;
    }
    
    private double calcularIngresosHorasExtras(){
        return ((getSalario_mensual() / 240) * 2) * getHoras_extras();
    }
    
    private double calcularAntiduedad(){
        int ano = Funcion.periodo(getFecha_ingreso());
        double[] tasas = {0.03,0.05,0.07,0.09,0.10,0.11,0.12,0.13,0.14,0.15
        ,0.155,0.16,0.165,0.17,0.175,0.18,0.185,0.19,0.195,0.20};
        if(ano > tasas.length) 
            return getSalario_mensual() * tasas[tasas.length - 1];
        else if(ano < 1) 
            /*posible cambio*/return 0;
        else
            return getSalario_mensual() * tasas[ano - 1];
    }
    
    private double calcularTotalIngresos(){
        return getSalario_mensual() + getIngresos_horas_extras() + getAntiguedad() + getBonos() + getOtros_ingresos();
    }
    
    private double calcularInssLaboral(){
        return getTotal_ingresos() * 0.0625;
    }
    
    private double calcularIr(){
        double salario_anual = ((getTotal_ingresos() - getInss_laboral()) * 12);
        double porcentaje;
        double base;
        double exceso;
        
        if(salario_anual >= 1 && salario_anual <= 100000){
            porcentaje = 0;
            base = 0;
            exceso = 0;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 100001 && salario_anual <= 200000){
            porcentaje = 0.15;
            base = 0;
            exceso = 100000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 200001 && salario_anual <= 350000){
            porcentaje = 0.20;
            base = 15000;
            exceso = 200000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else if(salario_anual >= 350001 && salario_anual <= 500000){
            porcentaje = 0.25;
            base = 45000;
            exceso = 350000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}else{
            porcentaje = 0.30;
            base = 82500;
            exceso = 500000;
            return (((salario_anual - exceso) * porcentaje) + base) / 12;
	}
    }
    
    private double calcularTotalDeducciones(){
        return getInss_laboral() + getIr_laboral() + getOtras_deducciones();
    }
    
    private double calcularRemuneracionNeta(){
        return getTotal_ingresos() - getTotal_deducciones();
    }
    
    private double calcularInssPatronal(){
        return getTotal_ingresos() * 0.19;
    }
    
    private double calcularInatec(){
        return getTotal_ingresos() * 0.02;
    }
    
    private double calcularVacaciones(){
        return (getTotal_ingresos() / 30) * 2.25;
    }
    
    private double calcularTreceavoMes(){ 
        return ((getTotal_ingresos() - getBonos()) / 30) * 2.25;
    }
    
    private double calcularIndemnizacionLaboral(){
        int ano = Funcion.periodo(getFecha_ingreso());  
        if(ano < 1) 
            return 0;
        else if(ano <= 3)
            return (getTotal_ingresos() / 30) * 2.25;
        else
            return (getTotal_ingresos() / 30) * 1.66;
    }
    
    private String generarNoEmpleado() {
        return String.valueOf((int) ((Math.random() * 1000) + 1));
    }
    
    public Vector toVector(){
        Vector vector = new Vector();
        vector.add(getNo_inss());
        vector.add(getNombre_apellido());
        vector.add(getCargo());
        vector.add(getSalario_mensual());
        vector.add(getHoras_extras());
        vector.add(getIngresos_horas_extras());
        vector.add(getAntiguedad());
        vector.add(getBonos());
        vector.add(getOtros_ingresos());
        vector.add(getTotal_ingresos());
        vector.add(getInss_laboral());
        vector.add(getIr_laboral());
        vector.add(getOtras_deducciones());
        vector.add(getTotal_deducciones());
        vector.add(getRemuneracion_neta());
        vector.add(getInss_patronal());
        vector.add(getInatec());
        vector.add(getVacaciones());
        vector.add(getTreceavo_mes());
        vector.add(getIndemnizacion_laboral());
        return vector;
    }
  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((no_inss == null) ? 0 : no_inss.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Empleado other = (Empleado) obj;
        if(no_inss == null){
            if(other.no_inss != null){
                return false;
            }
        }else if(!no_inss.equals(other.no_inss)){
            return false;
        }
        return true;
    }

    public String getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(String no_empleado) {
        this.no_empleado = no_empleado;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getTipo_contratacion() {
        return tipo_contratacion;
    }

    public void setTipo_contratacion(String tipo_contratacion) {
        this.tipo_contratacion = tipo_contratacion;
    }

    public String getJornada_laboral() {
        return jornada_laboral;
    }

    public void setJornada_laboral(String jornada_laboral) {
        this.jornada_laboral = jornada_laboral;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(String numero_contacto) {
        this.numero_contacto = numero_contacto;
    }

    public String getNivel_academico() {
        return nivel_academico;
    }

    public void setNivel_academico(String nivel_academico) {
        this.nivel_academico = nivel_academico;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getProfecion() {
        return Profecion;
    }

    public void setProfecion(String Profecion) {
        this.Profecion = Profecion;
    }

    public String getDepatamento_lab() {
        return depatamento_lab;
    }

    public void setDepatamento_lab(String depatamento_lab) {
        this.depatamento_lab = depatamento_lab;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Lugar getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(Lugar lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public Lugar getUbicacion_fisica() {
        return ubicacion_fisica;
    }

    public void setUbicacion_fisica(Lugar ubicacion_fisica) {
        this.ubicacion_fisica = ubicacion_fisica;
    }

    public ArrayList<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijo> hijos) {
        this.hijos = hijos;
    }

    public double getOtros_ingresos() {
        return otros_ingresos;
    }

    public String getEstudios_realizados() {
        return estudios_realizados;
    }

    public void setEstudios_realizados(String estudios_realizados) {
        this.estudios_realizados = estudios_realizados;
    }
    
    public void setOtros_ingresos(double otros_ingresos) {
        this.otros_ingresos = otros_ingresos;
        this.total_ingresos = calcularTotalIngresos();
        this.inss_laboral = calcularInssLaboral();
        this.ir_laboral = calcularIr();
        this.total_deducciones = calcularTotalDeducciones();
        this.remuneracion_neta = calcularRemuneracionNeta();
        this.inss_patronal = calcularInssPatronal();
        this.inatec = calcularInatec();
        this.vacaciones = calcularVacaciones();
        this.treceavo_mes = calcularTreceavoMes();
        this.indemnizacion_laboral = calcularIndemnizacionLaboral();
    }
    
}
