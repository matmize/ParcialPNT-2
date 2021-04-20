package servlet;

import java.util.*;



public class Unico{

    private static Unico unico= null;
    private static Unico INSTANCE = null;
    private ArrayList<Requerimiento>requerimientos= new ArrayList<Requerimiento>();
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    public ArrayList<Asignacion>asignaciones = new ArrayList();
	
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
                for (int j =0 ; j<asignaciones.size();j++){
                    if (asignaciones.get(j).getIdProyecto() == idProyecto){
                        asignaciones.remove(j);
                        proyectos.remove(i);
                    }else {
                        proyectos.remove(i);
                    }
                }
            }else{
                Proyecto proyecto = new Proyecto (-100,"-",0,"-");
            }
        }

    }

  
    public void editarProyecto (int idProyecto, String nombreC1,int presupuesto1,String tiempo1){
         for (int i = 0; i<proyectos.size();i++){
            if (idProyecto == proyectos.get(i).getIdProyecto()){
                Proyecto copia = proyectos.get(i);
                copia.setNombreC(nombreC1);
                copia.setPresupuesto(presupuesto1);
                copia.setTiempo(tiempo1);
  
            }
        }

    }

    public void crearAsignacion ( int idProy, String idemp,int requerimientos){
        Asignacion asignacion = new Asignacion (idProy,idemp,requerimientos);
        asignaciones.add(asignacion);
    }

    public Asignacion buscarAsignacion (int idProyecto ){
         if (asignaciones.size()>0){
            int count = 0;
            int locate = 0;

            for (int i = 0; i < asignaciones.size();i++){
                if (idProyecto == asignaciones.get(i).getIdProy()){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return asignaciones.get(locate);
            }else{


                Asignacion asignacion = new Asignacion (-100,"-",0);
                return asignacion;
            }
        }else{
           Asignacion asignacion = new Asignacion (-100,"-",0);
            return asignacion;
        }

    }

    public void eliminarAsignacion ( int idProyecto){
         for (int i =0; i< asignaciones.size();i++){
            if (asignaciones.get(i).getIdProy() == idProyecto){
                asignaciones.remove(i);
            } else{
                Asignacion asignacion = new Asignacion (-100,"-",0);
            }
        }
    }

    public void editarAsignacion (int idProy,String idemp1,int requerimientos1){
        for (int i = 0; i<asignaciones.size();i++){
            if (idProy == asignaciones.get(i).getIdProy()){
                Asignacion copia = asignaciones.get(i);
                copia.setIdemp(idemp1);
                copia.setRequerimientos(requerimientos1);
  
            }
        }

    }

     public void crearRequerimiento (int codigoR, int codigoP, String descripcion, String actividades, String tiempoR){
        Requerimiento requerimiento = new Requerimiento(codigoR,codigoP,descripcion,actividades, tiempoR);
        requerimientos.add(requerimiento);
    }

    public Requerimiento buscarRequerimiento (int codigoR ){
         if (requerimientos.size()>0){
            int count = 0;
            int locate = 0;

            for (int i = 0; i < requerimientos.size();i++){
                if (codigoR == requerimientos.get(i).getCodigoR()){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return requerimientos.get(locate);
            }else{


                Requerimiento requerimiento = new Requerimiento (-100,0,"-","-","-");
                return requerimiento;
            }
        }else{
           Requerimiento requerimiento= new Requerimiento (-100,0,"-","-","-");
            return requerimiento;
        }

    }
    public void eliminarRequerimiento (int codigoR){
         for (int i =0; i< requerimientos.size();i++){
            if (requerimientos.get(i).getCodigoR() == codigoR){
                requerimientos.remove(i);
            } else{
                Requerimiento requerimiento= new Requerimiento (-100,0,"-","-","-");
            }
        }
    }

    public void editarRequerimiento (int codigoR, int codigoP1, String descripcion1, String actividades1, String tiempoR1){
         for (int i = 0; i<requerimientos.size();i++){
            if (codigoR == requerimientos.get(i).getCodigoR()){
                Requerimiento copia = requerimientos.get(i);

                copia.setCodigoP(codigoP1);
                copia.setDescripcion(descripcion1);
                copia.setActividades(actividades1);
                copia.setTiempoR(tiempoR1);
               
  
            }
        }

    }
    
}