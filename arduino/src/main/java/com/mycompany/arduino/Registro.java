
package com.mycompany.arduino;

import java.util.Date;

public class Registro {
    
    boolean estado;
    Date fecha;
    
    public Registro(){
        estado = false;
        fecha = null;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Registro" + "nombre=" + estado + ", fecha=" + fecha;
    }
    
}
