/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAAD
 */
@WebServlet(urlPatterns = {"/webcontroller"})
public class webcontroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            
            if(request.getQueryString().equals("features")){
             RequestDispatcher rd=request.getRequestDispatcher("/features.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("gallery")){
             RequestDispatcher rd=request.getRequestDispatcher("/gallery.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("medical-counseling")){
             RequestDispatcher rd=request.getRequestDispatcher("/medical-counseling.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("medical-research")){
             RequestDispatcher rd=request.getRequestDispatcher("/medical-research.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blood-bank")){
             RequestDispatcher rd=request.getRequestDispatcher("/blood-bank.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-archive")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-archive.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-archive-with-right-sidebar")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-archive-with-right-sidebar.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-archive-with-leftt-sidebar")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-archive-with-left-sidebar.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-single")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-single.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-single-with-right-sidebar")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-single-with-right-sidebar.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("blog-single-with-leftt-sidebar")){
             RequestDispatcher rd=request.getRequestDispatcher("/blog-single-with-left-sidebar.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("contact")){
             RequestDispatcher rd=request.getRequestDispatcher("/contact.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("404")){
             RequestDispatcher rd=request.getRequestDispatcher("/404.jsp");  
            rd.forward(request, response);
            }
            
            if(request.getQueryString().equals("news")){
             RequestDispatcher rd=request.getRequestDispatcher("/news.jsp");  
            rd.forward(request, response);
            }
            if(request.getQueryString().equals("Services")){
             RequestDispatcher rd=request.getRequestDispatcher("Services.jsp");  
            rd.forward(request, response);
            }
            //out.println(request.getQueryString());
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
