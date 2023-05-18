<%-- 
    Document   : admission
    Created on : 03-Mar-2023, 23:19:27
    Author     : Elysee
--%>





<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="entity.AdmissionForm"%>
<%@page import="entity.SignUp"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.InputStream"%>
<%@page import="dao.SaveDao"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.util.Date" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
      
        <%
   
           
            
            String id=request.getParameter("id");
        
        int id_type = Integer.parseInt(id);
       
           try {
            
              SaveDao dao= new SaveDao();
             
              AdmissionForm form= new AdmissionForm();
//              AdmissionForm form= new AdmissionForm(maiL, fName, lName, seX, phone, father, mother, loc, daTe, null, null);
               form.setId(id_type);
             
                 dao.DeleteStudent(form);
            
              response.sendRedirect("retrieveAdmission.jsp?");
                     %>
                     
            
                        <% 
         
                    
            } catch (NullPointerException e) {
              
              %>
              <%  e.toString(); %>
              <%
                   
            }catch(Exception ex){
                    ex.toString();
             }
            
            

        
      %> 
        
    
</html>
