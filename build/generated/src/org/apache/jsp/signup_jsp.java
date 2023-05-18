package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.MailService;
import dao.SaveDao;
import entity.SignUp;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SignUP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
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
                    
                    
      out.write("\n");
      out.write("        <center>   <h1>");
      out.print(e.getMessage() );
      out.write("</h1></center>\n");
      out.write("                    ");

                }
        
             
          }else{
              
                  
      out.write("\n");
      out.write("        <center>    <h1> Password does not match</h1></center>\n");
      out.write("                  ");

              
          }
         
        
      out.write("\n");
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
