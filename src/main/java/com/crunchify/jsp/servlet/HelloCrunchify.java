package com.crunchify.jsp.servlet;
 
import edu.co.sergio.mundo.dao.VisitasTecnicasDAO;
import edu.co.sergio.mundo.vo.visitasTecnicas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;
 
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");

        VisitasTecnicasDAO dao = new VisitasTecnicasDAO();
        
        visitasTecnicas visitas = new visitasTecnicas();

        List<visitasTecnicas> Visitas =  dao.findAll();
        request.setAttribute("Visitas", Visitas);
       
        
        RequestDispatcher redireccion = request.getRequestDispatcher("index.jsp");
        redireccion.forward(request, response);
        
        
        }
}
