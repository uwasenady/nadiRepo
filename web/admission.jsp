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
<%@page import="java.sql.* "%>
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
    <body>
      
        <%
   
           
            
            DateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
            
            String fName= request.getParameter("firstname");
            String lName=request.getParameter("lastname");
            String maiL=request.getParameter("Email");
            String seX=request.getParameter("gender");
            String number=request.getParameter("phonenumber");
            int phone=0;
            if(number!=null){
                
                try {
                       phone= Integer.parseInt(number); 
                    } catch (Exception ex) {
                        
                        ex.getMessage();
                    }
            }
          
            
            String father=request.getParameter("Fname");
            String mother=request.getParameter("Mname");
            
            String loc=request.getParameter("location");
            
            String dob=request.getParameter("age");
            Date daTe = formatter.parse(dob);
            
       
               String imageFileName = null;
               String pdfFileName = null;          
               byte[] imageBytes;
               byte[] pdfBytes;
               Part imagePart = request.getPart("myImage");
               Part pdfPart = request.getPart("mypdf");
      
       InputStream imageContent = imagePart.getInputStream();
          ByteArrayOutputStream out1 = new ByteArrayOutputStream();
          byte[] buffer1 = new byte[5000];
          int j = 0;
          while( (j = imageContent.read(buffer1)) != -1 ){
              out1.write(buffer1,0,j);
          }
          imageBytes = out1.toByteArray();
      
         InputStream pdfContent = pdfPart.getInputStream();
          ByteArrayOutputStream ouT = new ByteArrayOutputStream();
          byte[] buffer = new byte[5000];
          int k = 0;
          while( (k = pdfContent.read(buffer)) != -1 ){
              ouT.write(buffer,0,k);
          }
          pdfBytes = ouT.toByteArray();
       

           try {
            
              SaveDao dao= new SaveDao();
             
              AdmissionForm form= new AdmissionForm();
//              AdmissionForm form= new AdmissionForm(maiL, fName, lName, seX, phone, father, mother, loc, daTe, pdfBytes, imageBytes);
                dao.SaveAdmission(form);
              form.setMail(maiL);
              form.setFname(fName);
              form.setLname(lName);
              form.setSex(seX);
              form.setNumber(phone);
//              form.setFatherName(father);
//              form.setMotherName(mother);
              form.setLocation(loc);
              form.setDate(daTe);
              form.setImage(imageBytes);
//              form.setFile(imageBytes);
                 
                  
              
                     %>
                <center><h1> Thank you for submitting your Application<center><h1></center>
                        <% 
         
                    
            } catch (NullPointerException e) {
              
              %>
              <%  e.toString(); %>
              <%
                   
            }catch(Exception ex){
                    ex.toString();
             }
            
            

        
      %> 
        
    </body>
</html>
