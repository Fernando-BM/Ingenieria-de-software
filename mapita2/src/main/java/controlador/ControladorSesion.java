/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import unam.fciencias.modelo.Usuario;
import unam.fciencias.modelo.UsuarioDAO;

/**
 *
 * @author fermat
 */
@ManagedBean
@SessionScoped
public class ControladorSesion {
    private String correo;
    private String contrasenia;
    private String nombre_usuario;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasesnia) {
        this.contrasenia = contrasesnia;
    }
    
    public String login(){
        UsuarioDAO usr= new UsuarioDAO();
        Usuario user = usr.buscaPorCorreo(correo, contrasenia);
        FacesContext context = FacesContext.getCurrentInstance();
        if(user !=null){
            nombre_usuario=user.getNomre();
            context.getExternalContext().getSessionMap().put("user", user);
            return "/user/perfil?faces-redirect=true";
        }else{
            return "";  
        }
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index?faces-redirect=true";
    }
}

