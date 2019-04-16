package com.mycompany.arduino;
import java.util.ArrayList;

public class Sistema {
    private Registro registro;
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    boolean [][] matriz = new boolean [2][listaUsuarios.size()];
      
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void agregarUsuario(Usuario unUsuario) {
        this.getListaUsuarios().add(unUsuario);
    }
}
