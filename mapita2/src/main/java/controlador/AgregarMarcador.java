/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import unam.fciencias.modelo.Marcador;
import unam.fciencias.modelo.MarcadorDAO;
import unam.fciencias.modelo.UsuarioDAO;

/**
 *
 * @author fermat
 */
@ManagedBean
public class AgregarMarcador {
    private int usuario;
    private String descripcion;
    private String longitud;
    private String latutu;
    
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatutu() {
        return latutu;
    }

    public void setLatutu(String latutu) {
        this.latutu = latutu;
    }
    
    public void agregarMarcador(){
        Marcador m = new Marcador();
        UsuarioDAO u = new UsuarioDAO();
        m.setLatitud(latutu);
        m.setIdusuario(u.find(usuario).getIdusuario());
        m.setDescrpcion(descripcion);
        m.setLongitud(longitud);
        MarcadorDAO udb = new MarcadorDAO();
        udb.save(m);
        
    
}
}
