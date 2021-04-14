package servlet;

import java.util.*;



public class Unico{

    private static Unico unico= null;
    private static Unico INSTANCE = null;
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    private ArrayList<Asignacion>asignaciones = new ArrayList();
	
	public Unico(){
		
	}
		

    public static Unico getInstance(){
		if (INSTANCE == null){
				INSTANCE = new Unico();
			
		}
    	return INSTANCE;
    }


    public void crearEmpleado (int idEmpleado,int cc, String nombre,String formacionAca, String habilidades){
        Empleado empleado = new Empleado (idEmpleado,cc,nombre,formacionAca, habilidades);
        empleados.add(empleado);
    }
    public Empleado buscarEmpleado (int idEmpleado){
        if (empleados.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < empleados.size();i++){
                if (idEmpleado == empleados.get(i).getIdEmpleado()){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return empleados.get(locate);
            }else{
                Empleado empleado = new Empleado (-100,0,"-","-","-");
                return empleado;
            }
        }else{
            Empleado empleado = new Empleado (-100,0,"-","-","-");
            return empleado;
        }
    }

    public void eliminarEmpleado(int idEmpleado){
        for (int i =0; i< empleados.size();i++){
            if (empleados.get(i).getIdEmpleado() == idEmpleado){
                empleados.remove(i);
                if (asignaciones.size()>0){
                    int j = 0;
                    while (j<asignaciones.size()){
                        String [] emp = asignaciones.get(j).idemp.split(",");
                        if (emp.length>1){
                            String nemp ="";
                            for (int k = 0; k<emp.length;k++){
                                if (Integer.parseInt(emp[k])!= idEmpleado){
                                    if (k== emp.length-1){
                                        nemp = nemp+emp[k];
                                    }else{
                                        nemp = nemp + emp[k]+",";
                                    }
                                }
                            }
                            asignaciones.get(j).idemp = nemp;
                            j++;
                     }else {
                        	if (Integer.parseInt(emp[0])== idEmpleado){
                            	asignaciones.remove(j);
                            	j=0;
                            }
                        }
                    }
                }
            }
        }
    }

    public void editarEmpleado(int idEmpleado,int cc1, String nombre1,String formacionAca1, String habilidades1){
        for (int i = 0; i<empleados.size();i++){
            if (idEmpleado == empleados.get(i).getIdEmpleado()){
                Empleado copia = empleados.get(i);
                copia.setCc(cc1);
                copia.setNombreEmpleado(nombre1);
                copia.setFormacionAca(formacionAca1);
                copia.setHabilidades(habilidades1);
            }
        }

    }

    public void crearProyecto (int idProyecto, String nombreC,int presupuesto,String tiempo){
        Proyecto proyecto = new Proyecto (idProyecto,nombreC,presupuesto,tiempo);
        proyectos.add(proyecto);
    }
    public Proyecto buscarProyecto (int idProyecto ){
        if (proyectos.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < proyectos.size();i++){
                if (idProyecto == proyectos.get(i).getIdProyecto()){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return proyectos.get(locate);
            }else{
                Proyecto proyecto= new Proyecto (-100,"-",0,"-");
                return proyecto;
            }
        }else{
            Proyecto proyecto= new Proyecto (-100,"-",0,"-");
            return proyecto;
        }
    }

    public void eliminarProyecto (int idProyecto){
        for (int i =0; i< proyectos.size();i++){
            if (proyectos.get(i).getIdProyecto() == idProyecto){
                proyectos.remove(i);
            } else{
                Proyecto proyecto = new Proyecto (-100,"-",0,"-");
            }
        }


    }
    public void editarProyecto (int idProyecto, String nombreC1,int presupuesto1,String tiempo1){
         for (int i = 0; i<empleados.size();i++){
            if (idProyecto == proyectos.get(i).getIdProyecto()){
                Proyecto copia = proyectos.get(i);
                copia.setNombreC(nombreC1);
                copia.setPresupuesto(presupuesto1);
                copia.setTiempo(tiempo1);
  
            }
        }

    }

    public void crearAsignacion ( String idEmpleado, int idProyecto,int horas,String responsabilidades){
        Asignacion asignacion = new Asignacion (idEmpleado,idProyecto,horas,responsabilidades);
        asignaciones.add(asignacion);
    }

    public Asignacion buscarAsignacion (int idProyecto ){
         if (asignaciones.size()>0){
            int count = 0;
            int locate = 0;

            for (int i = 0; i < asignaciones.size();i++){
                if (idProyecto == asignaciones.get(i).idProy){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return asignaciones.get(locate);
            }else{


                Asignacion asignacion = new Asignacion ("",-100,0,"-");
                return asignacion;
            }
        }else{
           Asignacion asignacion = new Asignacion ("",-100,0,"-");
            return asignacion;
        }

    }

    public void eliminarAsignacion (String idEmpleado, int idProyecto,int horas,String responsabilidades){
         for (int i =0; i< asignaciones.size();i++){
            if (asignaciones.get(i).idProy == idProyecto){
                asignaciones.remove(i);
            } else{
                Asignacion asignacion = new Asignacion ("",-100,0,"-");
            }
        }
    }

    public void editarAsignacion (String idEmpleado, int idProyecto,int horas,String responsabilidades){
        for (int i =0; i<asignaciones.size();i++){
            if (idProyecto == asignaciones.get(i).idProy){
                asignaciones.get(i).idemp = idEmpleado;
                asignaciones.get(i).horas = horas;
                asignaciones.get(i).responsabilidades = responsabilidades;
            }
        }

    }
    
}