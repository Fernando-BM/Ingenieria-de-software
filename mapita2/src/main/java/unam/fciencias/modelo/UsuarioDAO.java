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
      return super.finAll(Usuario.class);
    }
    
}
