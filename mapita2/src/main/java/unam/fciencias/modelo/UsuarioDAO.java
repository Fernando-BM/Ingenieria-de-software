/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fciencias.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author fermat
 */
public class UsuarioDAO extends AbstractDAO<Usuario>{
    public SessionFactory sessionfactory;
    public UsuarioDAO(){
        super();
    }
    @Override
    public void save(Usuario usuario){
      super.save(usuario);
    }
    
    @Override
    public void update(Usuario usuario){
      super.update(usuario);
    }
    
    @Override
    public void delete(Usuario usuario){
      super.delete(usuario);
    }
    
    public Usuario find(int Id){
      return super.find(Usuario.class, Id);
    }
    
    public List<Usuario> finAll(){
      return super.findAll(Usuario.class);
    }
    public List<Usuario> buscaPorNombre(String nombre){
//        if(nombre.equals(""))
//            return null;
        List<Usuario> usuarios =null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From Usuario  u where u.nomre like concat('%',:nombre,'%')";
            Query query = session.createQuery(hql);
            query.setParameter("nombre", nombre);
            usuarios = (List<Usuario>)query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return usuarios;
    }
    
     public Usuario buscaPorCorreo(String correo, String contra){
//        if(nombre.equals(""))
//            return null;
        Usuario usuario =null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From Usuario  u where u.correo = :correo and u.contrasenia = :contrasenia";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            query.setParameter("contrasenia", contra);
            usuario = (Usuario) query.uniqueResult();
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return usuario;
    }
    
}
