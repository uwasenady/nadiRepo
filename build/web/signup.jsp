<%-- 
    Document   : signup
    Created on : 01-Mar-2023, 14:06:48
    Author     : Elysee
--%>

<%@page import="entity.MailService"%>
<%@page import="dao.SaveDao"%>
<%@page import="entity.SignUp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUP</title>
    </head>
    <body>
        <%
            
          String userName=request.getParameter("username");
          String Email=request.getParameter("email");
          String pass=request.getParameter("pin");
          String cpass=request.getParameter("cpin");
            
              if(pass.equals(cpass)){////                       //                         Create an instance of EmailService with your Gmail username and password
         
                  
            try {
                
                SaveDao dao= new SaveDao();
                SignUp sign=new SignUp();
                
                sign.setMail(Email);
                sign.setPassWord(pass);
                sign.setUserName(userName);
                
                dao.SaveStudent(sign);
                
                 
             MailService emailService = new MailService("ntakirutimanaelyse98@gmail.com", "prfuktkmlsqyyyna");
//
//////             Send the confirmation email to the user
            String recipientEmail = (Email); // The email address of the user who signed up
            String subject = "Confirmation Email";
            String text = "Thank you for filling the admission form! Goodluck"; // The message you want to send in the email
//     
            System.out.println("Message Sent"+emailService);
                        response.sendRedirect("login.html");


                   
            
               
             
                
                } catch (Exception e) {
                    
                    %>
        <center>   <h1><%=e.getMessage() %></h1></center>
                    <%
                }
        
             
          }else{
              
                  %>
        <center>    <h1> Password does not match</h1></center>
                  <%
              
          }
         
        %>
    </body>
</html>
