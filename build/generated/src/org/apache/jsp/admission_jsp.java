package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.annotation.MultipartConfig;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import entity.AdmissionForm;
import entity.SignUp;
import java.sql.*;
import java.io.InputStream;
import dao.SaveDao;
import java.io.ByteArrayOutputStream;
import java.util.Date;

public final class admission_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        ");

   
           
            
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
             
//              AdmissionForm form= new AdmissionForm();
              AdmissionForm form= new AdmissionForm(maiL, fName, lName, seX, phone, father, mother, loc, daTe, pdfBytes, imageBytes);
                dao.SaveAdmission(form);
//              form.setMail(maiL);
//              form.setFname(fName);
//              form.setLname(lName);
//              form.setSex(seX);
//              form.setNumber(phone);
//              form.setFatherName(father);
//              form.setMotherName(mother);
//              form.setLocation(loc);
//              form.setDate(daTe);
//              form.setImage(imageBytes);
//              form.setFile(imageBytes);
                 
                  
              
                     
      out.write("\n");
      out.write("                <center><h1> Thank you for submitting your Application<center><h1></center>\n");
      out.write("                        ");
 
         
                    
            } catch (NullPointerException e) {
              
              
      out.write("\n");
      out.write("              ");
  e.toString(); 
      out.write("\n");
      out.write("              ");

                   
            }catch(Exception ex){
                    ex.toString();
             }
            
            

        
      
      out.write(" \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
