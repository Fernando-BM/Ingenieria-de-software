package unam.fciencias.modelo;
// Generated 5/02/2019 05:05:21 PM by Hibernate Tools 4.3.1



/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {


     private int idmarcador;
     private String descrpcion;
     private String longitud;
     private String latitud;
     private int idusuario;

    public Marcador() {
    }

    public Marcador(int idmarcador, String descrpcion, String longitud, String latitud, int idusuario) {
       this.idmarcador = idmarcador;
       this.descrpcion = descrpcion;
       this.longitud = longitud;
       this.latitud = latitud;
       this.idusuario = idusuario;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public String getDescrpcion() {
        return this.descrpcion;
    }
    
    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }
    public String getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    public String getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }




}

