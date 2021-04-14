package servlet;

public class Empleado{

	public int idEmpleado;
    private int cc ;
	public String nombreEmpleado;
    private String formacionAca;
	public String habilidades;

	public Empleado(int idEmpleado, int cc, String nombreEmpleado, String formacionAca,String habilidades){
		this.idEmpleado = idEmpleado;
        this.cc = cc;
		this.nombreEmpleado = nombreEmpleado;
        this.formacionAca = formacionAca;
		this.habilidades = habilidades;
	}

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getFormacioAca() {
        return formacionAca;
    }

    public void setFormacionAca(String formacionAca) {
        this.formacionAca = formacionAca;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
        
        

	


}
