package servlet;

public class Asignacion {
	private int idProy;
    private int idemp;
	private String responsabilidades;

	public Asignacion( int idProy,int idemp, String responsabilidades){
		this.idProy= idProyecto;
        this.idemp = idEmpleado;
		this.responsabilidades = responsabilidades;
	}


    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    public int getIdProy() {
        return idProy;
    }

    public void setIdProy(int idProy) {
        this.idProy = idProy;
    }


    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
	
}
