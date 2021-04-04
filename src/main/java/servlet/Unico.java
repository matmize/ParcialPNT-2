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


    public void crearEmpleado (int idEmpleado, String nombreEmpleado, String habilidades){
        Empleado empleado = new Empleado (id, nombre, habilidades);
        empleados.add(empleado);
    }
    public Empleado buscarEmpleado (int idEmpleado){
        if (empleados.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < empleados.size();i++){
                if (id == empleados.get(i).idEmpleado){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return empleados.get(locate);
            }else{
                Empleado empleado = new Empleado (-100,"-","-");
                return empleado;
            }
        }else{
            Empleado empleado = new Empleado (-100,"-","-");
            return empleado;
        }
    }

    public void eliminarEmpleado(int idEmpleado){
        for (int i =0; i< empleados.size();i++){
            if (empleados.get(i).idEmpleado == id){
                empleados.remove(i);
                if (asignaciones.size()>0){
                    int j = 0;
                    while (j<asignaciones.size()){
                        String [] emp = asignaciones.get(j).idemp.split(",");
                        if (emp.length>1){
                            String nemp ="";
                            for (int k = 0; k<emp.length;k++){
                                if (Integer.parseInt(emp[k])!= id){
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
                        	if (Integer.parseInt(emp[0])== id){
                            	asignaciones.remove(j);
                            	j=0;
                            }
                        }
                    }
                }
            }
        }
    }

    public void editarEmpleado(int idEmpleado, String nombreEmpleado, String habilidades){
        for (int i =0; i<empleados.size();i++){
            if (id == empleados.get(i).idEmpleado){
                empleados.get(i).nombreEmpleado = nombre;
                empleados.get(i).habilidades = habilidades;
            }
        }

    }

    public void crearProyecto (int id, String empresa,int presupuesto,String tiempo){
        Proyecto proyecto = new Proyecto (id,empresa,presupuesto,tiempo);
        proyectos.add(proyecto);
    }
    public Proyecto buscarProyecto (int id ){
        if (proyectos.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < proyectos.size();i++){
                if (id == proyectos.get(i).idProyecto){
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

    public void eliminarProyecto (int id){
        for (int i =0; i< proyectos.size();i++){
            if (proyectos.get(i).idProyecto == id){
                proyectos.remove(i);
            } else{
                Proyecto proyecto = new Proyecto (-100,"-",0,"-");
            }
        }


    }
    public void editarProyecto (int idProyecto, String empresa,int presupuesto,String tiempo){
         for (int i =0; i<proyectos.size();i++){
            if (idProyecto== proyectos.get(i).idProyecto){
                proyectos.get(i).empresa = empresa;
                proyectos.get(i).presupuesto = presupuesto;
                proyectos.get(i).tiempo = tiempo;
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
            if (idProyecto == asignaciones.get(i).idProy){
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