/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libertadorweb.servlet;

import com.libertador.webservices.LibertadorWS_Service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import com.libertador.webservices.LibertadorWS;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author StOn
 */
@WebServlet(name = "RegistroAlumno", urlPatterns = {"/RegistroAlumno"})
public class RegistroAlumno extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Libertador/LibertadorWS.wsdl")
    private LibertadorWS_Service service;

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          String dni = request.getParameter("dni");
          String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          
          LibertadorWS port = service.getLibertadorWSPort();      
          
          port.registrarAlumno(Integer.parseInt(dni), nombre, apellido);
          RequestDispatcher rd = request.getRequestDispatcher("/registrarAlumno.jsp");
          rd.forward(request, response);
          
    }

    

}
