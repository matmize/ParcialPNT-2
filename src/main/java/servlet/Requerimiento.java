package servlet;

public class Requerimiento {
    
    private int codigoR;
    private int codigoP;
    private String descripcion;
    private String actividades;
    private String tiempoR;

   

    public Requerimiento(int codigoR, int codigoP, String descripcion, String actividades, String tiempoR) {
        this.codigoR = codigoR;
        this.codigoP = codigoP;
        this.descripcion = descripcion;
        this.actividades = actividades;
        this.tiempoR = tiempoR;
    }

    public int getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(int codigoR) {
        this.codigoR = codigoR;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getTiempoR() {
        return tiempoR;
    }

    public void setTiempoR(String tiempoR) {
        this.tiempoR = tiempoR;
    }
    
    
    
}
