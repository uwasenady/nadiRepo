package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.SaveDao;
import java.util.List;
import java.util.ArrayList;
import entity.AdmissionForm;

public final class retrieveAdmission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("           <style>\n");
      out.write("          table, th, td {\n");
      out.write("              border:1px ;\n");
      out.write("            }\n");
      out.write("            th{\n");
      out.write("                color: black;\n");
      out.write("            }  \n");
      out.write("       </style>\n");
      out.write("       <link rel='stylesheet' href=\"stylesheetPage.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
          List<AdmissionForm> all= new ArrayList<AdmissionForm> ();
          SaveDao dao= new  SaveDao();
          all= dao.readAdmission();
          
          
      out.write("\n");
      out.write("          \n");
      out.write("       \n");
      out.write("          <table >\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <thead>\n");
      out.write("                  <tr>\n");
      out.write("                      <th>\n");
      out.write("                          ID\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          Email\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          FIRSTNAME\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          LASTNAME\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          SEX\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          FATHER'NAME\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          MOTHER'NAME\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          LOCATION\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          DATE\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          PHONE\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          FILE\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                       <th>\n");
      out.write("                          IMAGE\n");
      out.write("                      </th>\n");
      out.write("                      \n");
      out.write("                      <th colspan=\"2\">\n");
      out.write("                          Action\n");
      out.write("                     </th>\n");
      out.write("                  </tr>\n");
      out.write("              </thead>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("            \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          ");

         for(AdmissionForm start: all){
             
         
      out.write("\n");
      out.write("           \n");
      out.write("         <tr>\n");
      out.write("             <td>\n");
      out.write("                 ");
      out.print(start.getId());
      out.write("   \n");
      out.write("             </td>    \n");
      out.write("             \n");
      out.write("             <td>\n");
      out.write("                 \n");
      out.write("               ");
      out.print( start.getMail());
      out.write("\n");
      out.write("             </td>   \n");
      out.write("         \n");
      out.write("              <td>\n");
      out.write("                 \n");
      out.write("                ");
      out.print(start.getFname());
      out.write("\n");
      out.write("                \n");
      out.write("             </td>  \n");
      out.write("          \n");
      out.write("              <td>\n");
      out.write("                 \n");
      out.write("                    ");
      out.print(start.getLname());
      out.write("\n");
      out.write("                \n");
      out.write("             </td>  \n");
      out.write("         \n");
      out.write("               <td>\n");
      out.write("                 \n");
      out.write("                   ");
      out.print(start.getSex());
      out.write("  \n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("          \n");
      out.write("            <td>\n");
      out.write("                 \n");
      out.write("                    ");
      out.print(start.getFatherName());
      out.write(" \n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write(" \n");
      out.write("           \n");
      out.write("              <td>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("               ");
      out.print(start.getMotherName());
      out.write("  \n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("      \n");
      out.write("                <td>\n");
      out.write("                ");
      out.print(start.getLocation());
      out.write("\n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("      \n");
      out.write("             <td>\n");
      out.write("                 \n");
      out.write("                  ");
      out.print(start.getDate());
      out.write("   \n");
      out.write("             </td> \n");
      out.write("        \n");
      out.write("            <td>\n");
      out.write("                 \n");
      out.write("                ");
      out.print(start.getNumber());
      out.write("\n");
      out.write("            \n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("           \n");
      out.write("              <td>\n");
      out.write("                 \n");
      out.write("        \n");
      out.write("                ");
      out.print(start.getFile());
      out.write("  \n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("             \n");
      out.write("              <td>\n");
      out.write("                 \n");
      out.write("        \n");
      out.write("                ");
      out.print(start.getImage());
      out.write("\n");
      out.write("                \n");
      out.write("             </td> \n");
      out.write("          \n");
      out.write("             <td>\n");
      out.write("                 <a href=\"updateAdmissions.jsp?id=");
      out.print(start.getId());
      out.write("\"> Edit</a>\n");
      out.write("             </td>\n");
      out.write("              <td>\n");
      out.write("                 <a href=\"delete.jsp?id=");
      out.print(start.getId());
      out.write("\"> Delete</a>\n");
      out.write("             </td>\n");
      out.write("     \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("           ");

             
             
         }
         
        
      out.write("\n");
      out.write("           </tbody>\n");
      out.write("         </table>\n");
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
