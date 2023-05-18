/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.SaveDao;
import entity.AdmissionForm;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Part;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.MailService;



/**
 *
 * @author Elysee
 */
@MultipartConfig
@WebServlet( name = "AdmissionController", urlPatterns = {"/AdmissionController"})
public class AdmissionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
           DateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
           
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
            
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

////                      Create an instance of EmailService with your Gmail username and password
//            MailService emailService = new MailService("ntakirutimanaelyse98@gmail.com", "prfuktkmlsqyyyna");
//
////////             Send the confirmation email to the user
//            String recipientEmail = (maiL); // The email address of the user who signed up
//            String subject = "Confirmation Email";
//            String text = "Thank you for filling the admission form! Good lucky!"; // The message you want to send in the email
//////      
//            emailService.sendEmail(recipientEmail, subject, text);
//            System.out.println("Message Sent"+emailService);
            
               response.sendRedirect("retrieveAdmission.jsp");   
        
           
            } catch (Exception e) {
                
                e.toString();
            }
            
         
                   
        }catch(Exception ex){
            
            ex.toString();
        }
    }
  

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
