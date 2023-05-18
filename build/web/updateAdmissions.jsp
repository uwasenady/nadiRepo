<%-- 
    Document   : updateAdmissions
    Created on : 19-Mar-2023, 22:30:02
    Author     : Elysee
--%>

<%@page import="entity.AdmissionForm"%>
<%@page import="dao.SaveDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Admission Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel='stylesheet' href="stylesheetPage.css"/>
        <style>
     input[type='number']{
     width: 234px;
     }
     input[type='file']{
     width: 200px;
     }
     input[type='checkbox']{
     margin-right:  20px;
     }
    
        </style>
        
    </head>
    
    <body>
        <%  String id=request.getParameter("id");
        
        int id_type = Integer.parseInt(id);
         
      SaveDao dao= new SaveDao();
      AdmissionForm c= dao.FindAdmission(id_type);
      if(c!=null){
          
          
     String fname= c.getFname();
      

      
        
        out.print(fname);
        
        
        %>
        
        
        
        
        
        
        
        
        
         <center><h1></h1></center>
     <center>
    
       <form action="update.jsp?" method="GET" style="top: 15px ">
        
           <input type="hidden" name="id" value="<% out.print(c.getId());%>">
           <a href="updateAdmissions.jsp"></a>
       <label for="firstname" style="text-align: left">First name: </label>
       <input type="text" size="30" name="firstname" id="firstname" value="<% out.print(c.getFname());%>"  placeholder="Firstname" required><br><br>
       
       <label for="lastname" style="text-align: left">Last name: </label>
       <input type="text" size="30" name="lastname" id="lastname" value="<% out.print(c.getLname());%>"  placeholder="Lastname"required><br><br>
       
        <label for="Email" style="text-align: left">Email : </label>
        <input type="email" size="30" name="Email" id="Email" value="<% out.print(c.getMail());%>"  placeholder="E-mail"required><br>
       
        
 
        <div style="text-align: left">
            
        <label for="gender" style="text-align: right">Gender:</label>
       <input type="radio"  name="gender" id="gender" value="male"  required> Male
       <input type="radio"  name="gender" id="gender" value="female" required > Female<br>
        </div>
      
      
      
        
       <label for="phonenumber" style="text-align: left"> Phone number: </label>
       <input type="number" name="phonenumber" id="phonenumber" value="<% out.print(c.getNumber());%>"  placeholder="Phone " required><br><br>
       
        <label for="Fname" style="text-align: left">Father's name: </label>
        <input type="text" size="30" name="Fname" id="Fname" value="<% out.print(c.getFatherName());%>" placeholder="Father's name"required><br><br>
       
       <label for="Mname" style="text-align: left">Mother's name: </label>
       <input type="text" size="30" name="Mname" id="Mname" value="<% out.print(c.getMotherName());%>" placeholder="Mother's name "required><br><br>
     
       <label for="location" style="text-align: left"> Country: </label>
       <select id="location" name="location" >
            
           <option value="0"> Select... </option>
           <option value="Rwanda"> Rwanda </option>
           <option value="Burundi"> Burundi </option>
           <option value="Tanzania"> Tanzania </option>
           <option value="DRC"> DRC </option>
           <option value="Kenya"> Kenya </option>
           <option value="South Sudan"> South Sudan </option>
           <option value="Nigeria"> Nigeria </option>
           <option value="Chad"> Chad </option>
       </select>
       
        <label for="age" style="text-align: left"> Age: </label>
       <input type="date" name="age" id="age"  required><br><br>
       
       <label for="mypdf" style="text-align: left">Choose file:</label>
       <input type="file"  name="mypdf" size="20" id="mypdf" accept="application/pdf"   style="width:200px" ><br>
       
        
        <label for="myImage" style="text-align: left">Image:</label>
        <input type="file" name="myImage" size="20" id="myImage" accept="image/png, image/jpg"  ><br><br>
           
        <div style="color: greenyellow">
           <input type="checkbox" name="yes" id="choice" style="text-align: left" required> Yes I agree to the terms and conditions<br><br>   
        </div>
      
           
        
      <input type="submit" value="Update"> <input type="Reset" value="Clear"> <a href="./signup.html"> Register</a><br><br>
              
   </form>        
     
            </center>
      
         <%  }%>
    </body>
</html>
