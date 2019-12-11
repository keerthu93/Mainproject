/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import myconnectionpack.*;
/**
 *
 * @author khsci5mca17031
 */
public class existservlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           out.println("<title>Servlet registrationservlet</title> <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet registrationservlet at " + request.getContextPath() + "</h1>");
            String username = request.getParameter("un");
		String password = request.getParameter("pwd");
                out.println(password);
                try
                {
		 connection a=new connection();
            Connection con=a.jdbcconnect();
            ResultSet rs1=null;
            PreparedStatement ps=con.prepareStatement("select * from login where uname=?");
            ps.setString(1,username);
            rs1=ps.executeQuery();
	if(username.isEmpty() || password.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("exist.jsp");
			req.include(request, response);
                        out.println("<div class=\"container-fluid\">" + "<div class=\"alert alert-danger\">\n" +
"    <strong>Info!</strong> EMPTY FIELD !!!\n" +
"  </div>");
		}
                else if(rs1==null)
		{
                    RequestDispatcher req = request.getRequestDispatcher("exist.jsp");
			req.include(request, response);
                        out.println("<div class=\"container-fluid\">" + "<div class=\"alert alert-danger\">\n" +
"    <strong>Info!</strong> Unregistered User !!!\n" +
"  </div>");
                       
		}
                else
                {
                    while(rs1.next())
                    {
                        String r=rs1.getString(2);
                        if(r.equals(password))
                        {
                            if((rs1.getString(3)).equals("A"))
                            {
                            RequestDispatcher req = request.getRequestDispatcher("admin.jsp");
                                req.forward(request, response);
                             }
                            else if((rs1.getString(3)).equals("S"))
                            {
                                RequestDispatcher req = request.getRequestDispatcher("interface.jsp");
                                req.forward(request, response);
                            }
                        }
                        else
                        {
                             out.println("<div class=\"container-fluid\">" + "<div class=\"alert alert-danger\">\n" +
"    <strong>Info!</strong> Incorrect Password !!!\n" +
"  </div>");
                        }
                        
                    }
                    
                }
                }
                catch(Exception e)
                {
                out.println("eXCEPTION----"+e);
                }
            
            //out.println("<h1>Servlet existservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
