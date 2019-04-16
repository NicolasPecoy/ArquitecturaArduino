package com.mycompany.arduino;

import java.util.ArrayList;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;

public class Usuario {

    String nombre;
    ArrayList <Registro> actividad;
    //9 horas=540 min 
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.actividad = new ArrayList <>();
        
    }
    
    public void addRegistro(Registro unr){
        this.actividad.add(unr);
    }

    public ArrayList<Registro> getActividad() {
        return actividad;
    }

    public void setActividad(ArrayList<Registro> actividad) {
        this.actividad = actividad;
    }

    public Usuario() {
        this.nombre = "";
       
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    
    
}
