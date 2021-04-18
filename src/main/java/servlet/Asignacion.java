package servlet;

public class Asignacion {
	private int idProy;
    public String idemp;
	private int requerimientos;

	public Asignacion( int idProy,String idemp, int requerimientos){
		this.idProy= idProy;
        this.idemp = idemp;
		this.requerimientos = requerimientos;
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


    public int getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(int requerimientos) {
        this.requerimientos = requerimientos;
    }
	
}
