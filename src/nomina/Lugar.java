package nomina;

import java.io.Serializable;

public class Lugar implements Serializable {
    
    private String ciudad;
    private String departamento;
    private String pais;

    public Lugar(String ciudad, String departamento, String pais) {
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
