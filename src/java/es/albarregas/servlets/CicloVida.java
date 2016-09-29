/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adrian
 */
@WebServlet(name = "CicloVida", urlPatterns = {"/ciclo"})
public class CicloVida extends HttpServlet {
    
    public void init(ServletConfig config){
        
        
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Saludo</title>");      
            out.println("<link rel='stylesheet' href='Estilo.css'>");
            out.println("</head>");
            out.println("<body id='saludo'>");
            out.println("<h1>Parametros iniciales</h1>");
            Enumeration <String> parametros = request.getParameterNames();
            while (parametros.hasMoreElements()){
                String param = parametros.nextElement();
                String par = request.getParameter(param);
                out.println(param+" "+par);
            }
            out.println("<a href='SaludoAnotacion'>Anotacion</a>");
            out.println("</body>");
            out.println("</html>");
    }
    public void destroy(){
    }
}