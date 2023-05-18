/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.AdmissionForm;
import entity.SignUp;
import java.util.List;
import org.hibernate.*;


/**
 *
 * @author Elysee
 */
public class SaveDao {
    
    public void SaveStudent(SignUp s){
     Session ss=HibernateUtil.getSessionFactory().openSession();
     ss.beginTransaction();
     ss.save(s);
     ss.getTransaction().commit();
     ss.close();
    }
    
    
    public void SaveAdmission(AdmissionForm s){
     Session ss=HibernateUtil.getSessionFactory().openSession();
     ss.beginTransaction();
     ss.save(s);
     ss.getTransaction().commit();
     ss.close();
    }
     
    public SignUp Login(String user){
        
       Session ss=HibernateUtil.getSessionFactory().openSession();
       ss.beginTransaction();
       SignUp log= (SignUp) ss.get(SignUp.class, user);
       ss.getTransaction().commit();
       ss.close();
       return log;
    }
    
     public void UpdateStudent(AdmissionForm u){
     Session ss=HibernateUtil.getSessionFactory().openSession();
     ss.beginTransaction();
     ss.update(u);
     ss.getTransaction().commit();
     ss.close();
    }
     
     public void DeleteStudent(AdmissionForm d){
     Session ss=HibernateUtil.getSessionFactory().openSession();
     ss.beginTransaction();
     ss.delete(d);
     ss.getTransaction().commit();
     ss.close();
    }
  
     
      public List<AdmissionForm> readAdmission(){
        Session ses = HibernateUtil.getSessionFactory().openSession();
        Query qry = ses.createQuery("select l from AdmissionForm l");
        List<AdmissionForm> log = qry.list();
        ses.close();
        return log;
    }
      public AdmissionForm FindAdmission(int f){
          
          Session ss= HibernateUtil.getSessionFactory().openSession();
          ss.beginTransaction();
          AdmissionForm a= (AdmissionForm) ss.get(AdmissionForm.class, f );
          ss.getTransaction().commit();
          ss.close();
          return a;
          
      }
}
