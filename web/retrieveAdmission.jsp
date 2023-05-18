<%-- 
    Document   : retrieveAdmission
    Created on : 19-Mar-2023, 11:02:37
    Author     : Elysee
--%>


<%@page import="dao.SaveDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.AdmissionForm"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
           <style>
          table, th, td {
              border:1px ;
            }
            th{
                color: black;
            }  
       </style>
       <link rel='stylesheet' href="stylesheetPage.css"/>
    </head>
    <body>
        <% 
          List<AdmissionForm> all= new ArrayList<AdmissionForm> ();
          SaveDao dao= new  SaveDao();
          all= dao.readAdmission();
          
          %>
          
       
          <table >
              
              
              <thead>
                  <tr>
                      <th>
                          ID
                      </th>
                      
                       <th>
                          EMAIL
                      </th>
                      
                       <th>
                          FIRSTNAME
                      </th>
                      
                       <th>
                          LASTNAME
                      </th>
                      
                       <th>
                          SEX
                      </th>
                      
<!--                       <th>
                          FATHER'NAME
                      </th>
                      
                       <th>
                          MOTHER'NAME
                      </th>-->
                      
                       <th>
                          COURSE
                      </th>
                      
                       <th>
                          DATE
                      </th>
                      
                       <th>
                          ID NUMBER
                      </th>
                      
<!--                       <th>
                          FILE
                      </th>-->
                      
                       <th>
                          IMAGE
                      </th>
                      
                      <th colspan="2">
                          Action
                     </th>
                  </tr>
              </thead>
          
           
                  
            
          
          
          <%
         for(AdmissionForm start: all){
             
         %>
           
         <tr>
             <td>
                 <%=start.getId()%>   
             </td>    
             
             <td>
                 
               <%= start.getMail()%>
             </td>   
         
              <td>
                 
                <%=start.getFname()%>
                
             </td>  
          
              <td>
                 
                    <%=start.getLname()%>
                
             </td>  
         
               <td>
                 
                   <%=start.getSex()%>  
                
             </td> 
          
            <td>
                 
                    <%=start.getFatherName()%> 
                
             </td> 
 
           
              <td>
                 
                 
               <%=start.getMotherName()%>  
                
             </td> 
      
                <td>
                <%=start.getLocation()%>
                
             </td> 
      
             <td>
                 
                  <%=start.getDate()%>   
             </td> 
        
            <td>
                 
                <%=start.getNumber()%>
            
                
             </td> 
           
              <td>
                 
        
                <%=start.getFile()%>  
                
             </td> 
             
              <td>
                 
        
                <%=start.getImage()%>
                
             </td> 
          
             <td>
                 <a href="updateAdmissions.jsp?id=<%=start.getId()%>"> Edit</a>
             </td>
              <td>
                 <a href="delete.jsp?id=<%=start.getId()%>"> Delete</a>
             </td>
     
                </tr>
                
           
           <%
             
             
         }
         
        %>
           </tbody>
         </table>
    </body>
</html>
