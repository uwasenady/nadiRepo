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
        <title>Login</title>
    </head>
    <body>
        <%
          String Email=request.getParameter("email");
          String pass=request.getParameter("pin");
            
            try {
                
                SaveDao dao= new SaveDao();
                SignUp sign=dao.Login(Email);
                
                if(sign == null){
                    %>
                    <center><h1>Wrong Email or password!!</h1></center> 
                    <%
                }else{
                    if(pass.equals(sign.getPassWord())){
                
                      
                        response.sendRedirect("admission.html"); 
                    }else{

//                       response.sendRedirect("signup.html"); 
                        %>
                         
                    <center><h1>Wrong Email or password!!</h1></center> 
                    <%
                    }
                }
                
                
                
                } catch (Exception e) {
                    
                    %>
                    <center>  <h1><%=e.getMessage() %></h1> </center>
                    <%
                }
        
             
         
         
        %>
    </body>
</html>
