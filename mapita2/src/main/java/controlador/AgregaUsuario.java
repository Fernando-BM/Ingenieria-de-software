/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import unam.fciencias.modelo.Usuario;
import unam.fciencias.modelo.UsuarioDAO;

/**
 *
 * @author fermat
 */

@ManagedBean
public class AgregaUsuario{
     private String nomre;
     private String correo;
     private String contrasenia;
     private Date fechanacimiento;

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
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

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public void agregaUsuario(){
        Usuario u= new Usuario();
        u.setNomre(nomre);
        u.setContrasenia(contrasenia);
        u.setCorreo(correo);
        u.setFechanacimiento(fechanacimiento);
        UsuarioDAO udb= new UsuarioDAO();
        udb.save(u);
    }
}
    
