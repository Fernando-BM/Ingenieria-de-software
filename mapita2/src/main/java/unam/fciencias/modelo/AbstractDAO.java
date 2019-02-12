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
public abstract class AbstractDAO<T> {
    
    protected SessionFactory sessionfactory;
    protected AbstractDAO(){
        this.sessionfactory = HibernateUtil.getSessionFactory();
    }
    
    protected void save(T obj){
       Session session= this.sessionfactory.openSession();
       Transaction tx = null;
       try{
           tx= session.beginTransaction();
           session.save(obj);
           tx.commit();
       
       }catch(HibernateException e){
           if(tx!=null){
               tx.rollback();
           }
           e.printStackTrace();
       }finally{
           session.close();
       }
    }
    
    protected void update(T obj){
    Session session= this.sessionfactory.openSession();
       Transaction tx = null;
       try{
           tx= session.beginTransaction();
           session.update(obj);
           tx.commit();
       
       }catch(HibernateException e){
           if(tx!=null){
               tx.rollback();
           }
           e.printStackTrace();
       }finally{
           session.close();
       }
    }
    
    protected void delete(T obj){
    Session session= this.sessionfactory.openSession();
       Transaction tx = null;
       try{
           tx= session.beginTransaction();
           session.delete(obj);
           tx.commit();
       
       }catch(HibernateException e){
           if(tx!=null){
               tx.rollback();
           }
           e.printStackTrace();
       }finally{
           session.close();
       }
    }
    
    protected T find(Class clazz, int id){
        T obj=null;
        Session session= this.sessionfactory.getCurrentSession();
       Transaction tx = null;
       try{
           tx= session.beginTransaction();
           String hql = "From" + clazz;
           Query query= session.createQuery(hql);
           obj= (T)session.get(clazz, id);
           tx.commit();
       
       }catch(HibernateException e){
           if(tx!=null){
               tx.rollback();
           }
           e.printStackTrace();
       }finally{
           session.close();
       }
       return obj;
    }

    protected List<T> finAll(Class clazz){
    List<T> obj=null;
        Session session= this.sessionfactory.getCurrentSession();
       Transaction tx = null;
       try{
           tx= session.beginTransaction();
           String hql = "From" + clazz;
           Query query= session.createQuery(hql);
           obj= (List<T>)query.list();
           tx.commit();
       
       }catch(HibernateException e){
           if(tx!=null){
               tx.rollback();
           }
       }finally{
           session.close();
       }
       return obj;
    }   
}