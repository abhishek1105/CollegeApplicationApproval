package CollegeApplicationApproval;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();
        String name="abc";
        String pwd="1234";
        String uname=request.getParameter("user");
        String upwd=request.getParameter("pwsd");
        if(name.equals(uname)&& pwd.equals(upwd)){
            //out.println("<h2>LOGIN SUCCESSFULL</h2>");
            HttpSession s= request.getSession();
            s.setAttribute("userName",uname);
//            RequestDispatcher rd= request.getRequestDispatcher("HOMEPAGE.html");
//            rd.forward(request,response);
          response.sendRedirect("HomePage.html");
            //USE response.sendRedirect(url of the page); to go to performed page            
// RequestDispatcher rd= request.getRequestDispatcher("success.html");
//rd.forward(request,response);
        }
        else{
            //out.println("<h2>LOGIN FAILED</h2>");
            //response.sendRedirect("index.html"); eg google.com
            
//          RequestDispatcher rd= request.getRequestDispatcher("LOGIN.html");
//          rd.forward(request,response);
           response.sendRedirect("Login.html");
            //
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
