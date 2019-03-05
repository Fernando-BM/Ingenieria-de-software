/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import unam.fciencias.modelo.Marcador;
import unam.fciencias.modelo.MarcadorDAO;

/**
 *
 * @author fermat
 */
@ManagedBean
public class ActualizaMarcador {
    private int idmarcador;
    private String descripcion;
    private String longitud;
    private String latitud;
    private int idusuario;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
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

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public void actualizaMarcador(){
        MarcadorDAO mdao = new MarcadorDAO();
        Marcador m = mdao.find(idmarcador);
        if(getDescripcion() != null)
            m.setDescrpcion(descripcion);
        if(getLongitud() !=  null)
            m.setLongitud(longitud);
        if(getLatitud() !=  null)
            m.setLatitud(latitud);
        if(getIdusuario() != 0.00)
            m.setIdusuario(idusuario);
        mdao.update(m);
    }
}