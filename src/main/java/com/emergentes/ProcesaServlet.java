
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre =request.getParameter("nombre");
        String apellido =request.getParameter("apellido");
        String curso =request.getParameter("curso");
        
        Curso cur= new Curso();
        // Encapsulo los datos en el objeto
        cur.setNombre(nombre);
        cur.setApellido(apellido);
        cur.setCuro(curso);
        
        //colocar al objeto cur como atributo de request
        request.setAttribute("curso", cur);
        //
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
        
    }
}
