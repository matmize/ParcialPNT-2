package servlet;

public class Proyecto{
	
    private int idProyecto;
    private String nombreC;
    private int presupuesto;
    private String tiempo;

	public Proyecto (int idProyecto, String nombreC, int presupuesto, String tiempo) {

		this.idProyecto = idProyecto;
		this.nombreC = nombreC;
		this.presupuesto = presupuesto;
		this.tiempo = tiempo;
	}

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
        
        
}