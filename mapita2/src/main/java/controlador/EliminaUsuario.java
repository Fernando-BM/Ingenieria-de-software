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
public class EliminaUsuario {
     private int idUsuario;
     private String nomre;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
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
    
    public void eliminaUsuario(){
        UsuarioDAO udb= new UsuarioDAO();
        Usuario us=udb.find(idUsuario);
        if(us!=null)
            udb.delete(us);
        
    }
     
    

}
