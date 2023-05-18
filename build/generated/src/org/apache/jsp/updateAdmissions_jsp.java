package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.AdmissionForm;
import dao.SaveDao;

public final class updateAdmissions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <title>Admission Form</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<!--        <link rel='stylesheet' href=\"stylesheetPage.css\"/>-->\n");
      out.write("        <style>\n");
      out.write("/*     input[type='number']{\n");
      out.write("     width: 234px;\n");
      out.write("     }\n");
      out.write("     input[type='file']{\n");
      out.write("     width: 200px;\n");
      out.write("     }\n");
      out.write("     input[type='checkbox']{\n");
      out.write("     margin-right:  20px;\n");
      out.write("     }*/\n");
      out.write("    \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
  String id=request.getParameter("id");
        
        int id_type = Integer.parseInt(id);
         
      SaveDao dao= new SaveDao();
      AdmissionForm c= dao.FindAdmission(id_type);
      if(c!=null){
          
          
     String fname= c.getFname();
      

      
        
        out.print(fname);
        
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <center><h1>STUDENT UPDATE FORM</h1></center>\n");
      out.write("     <center>\n");
      out.write("    \n");
      out.write("       <form action=\"update.jsp?\" method=\"GET\" style=\"top: 15px \">\n");
      out.write("        \n");
      out.write("           <input type=\"hidden\" name=\"id\" value=\"");
 out.print(c.getId());
      out.write("\">\n");
      out.write("           <a href=\"updateAdmissions.jsp\"></a>\n");
      out.write("       <label for=\"firstname\" style=\"text-align: left\">First name: </label>\n");
      out.write("       <input type=\"text\" size=\"30\" name=\"firstname\" id=\"firstname\" value=\"");
 out.print(c.getFname());
      out.write("\"  placeholder=\"Firstname\" required><br><br>\n");
      out.write("       \n");
      out.write("       <label for=\"lastname\" style=\"text-align: left\">Last name: </label>\n");
      out.write("       <input type=\"text\" size=\"30\" name=\"lastname\" id=\"lastname\" value=\"");
 out.print(c.getLname());
      out.write("\"  placeholder=\"Lastname\"required><br><br>\n");
      out.write("       \n");
      out.write("        <label for=\"Email\" style=\"text-align: left\">Email : </label>\n");
      out.write("        <input type=\"email\" size=\"30\" name=\"Email\" id=\"Email\" value=\"");
 out.print(c.getMail());
      out.write("\"  placeholder=\"E-mail\"required><br>\n");
      out.write("       \n");
      out.write("        \n");
      out.write(" \n");
      out.write("        <div style=\"text-align: left\">\n");
      out.write("            \n");
      out.write("        <label for=\"gender\" style=\"text-align: right\">Gender:</label>\n");
      out.write("       <input type=\"radio\"  name=\"gender\" id=\"gender\" value=\"male\"  required> Male\n");
      out.write("       <input type=\"radio\"  name=\"gender\" id=\"gender\" value=\"female\" required > Female<br>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("        \n");
      out.write("       <label for=\"phonenumber\" style=\"text-align: left\"> Phone number: </label>\n");
      out.write("       <input type=\"number\" name=\"phonenumber\" id=\"phonenumber\" value=\"");
 out.print(c.getNumber());
      out.write("\"  placeholder=\"Phone \" required><br><br>\n");
      out.write("       \n");
      out.write("        <label for=\"Fname\" style=\"text-align: left\">Father's name: </label>\n");
      out.write("        <input type=\"text\" size=\"30\" name=\"Fname\" id=\"Fname\" value=\"");
 out.print(c.getFatherName());
      out.write("\" placeholder=\"Father's name\"required><br><br>\n");
      out.write("       \n");
      out.write("       <label for=\"Mname\" style=\"text-align: left\">Mother's name: </label>\n");
      out.write("       <input type=\"text\" size=\"30\" name=\"Mname\" id=\"Mname\" value=\"");
 out.print(c.getMotherName());
      out.write("\" placeholder=\"Mother's name \"required><br><br>\n");
      out.write("     \n");
      out.write("       <label for=\"location\" style=\"text-align: left\"> Country: </label>\n");
      out.write("       <select id=\"location\" name=\"location\" >\n");
      out.write("            \n");
      out.write("           <option value=\"0\"> Select... </option>\n");
      out.write("           <option value=\"Rwanda\"> Rwanda </option>\n");
      out.write("           <option value=\"Burundi\"> Burundi </option>\n");
      out.write("           <option value=\"Tanzania\"> Tanzania </option>\n");
      out.write("           <option value=\"DRC\"> DRC </option>\n");
      out.write("           <option value=\"Kenya\"> Kenya </option>\n");
      out.write("           <option value=\"South Sudan\"> South Sudan </option>\n");
      out.write("           <option value=\"Nigeria\"> Nigeria </option>\n");
      out.write("           <option value=\"Chad\"> Chad </option>\n");
      out.write("       </select>\n");
      out.write("       \n");
      out.write("        <label for=\"age\" style=\"text-align: left\"> Age: </label>\n");
      out.write("       <input type=\"date\" name=\"age\" id=\"age\"  required><br><br>\n");
      out.write("       \n");
      out.write("       <label for=\"mypdf\" style=\"text-align: left\">Choose file:</label>\n");
      out.write("       <input type=\"file\"  name=\"mypdf\" size=\"20\" id=\"mypdf\" accept=\"application/pdf\"   style=\"width:200px\" ><br>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <label for=\"myImage\" style=\"text-align: left\">Image:</label>\n");
      out.write("        <input type=\"file\" name=\"myImage\" size=\"20\" id=\"myImage\" accept=\"image/png, image/jpg\"  ><br><br>\n");
      out.write("           \n");
      out.write("        <div style=\"color: greenyellow\">\n");
      out.write("           <input type=\"checkbox\" name=\"yes\" id=\"choice\" style=\"text-align: left\" required> Yes I agree to the terms and conditions<br><br>   \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("           \n");
      out.write("        \n");
      out.write("      <input type=\"submit\" value=\"Update\"> <input type=\"Reset\" value=\"Clear\"> <a href=\"./signup.html\"> Register</a><br><br>\n");
      out.write("              \n");
      out.write("   </form>        \n");
      out.write("     \n");
      out.write("            </center>\n");
      out.write("      \n");
      out.write("         ");
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
