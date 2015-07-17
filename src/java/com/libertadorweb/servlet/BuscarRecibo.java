/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libertadorweb.servlet;

import com.libertador.webservices.LibertadorWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import com.libertador.webservices.LibertadorWS;
import com.libertadorweb.clase.Recibo;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author StOn
 */
@WebServlet(name = "BuscarRecibo", urlPatterns = {"/BuscarRecibo"})
public class BuscarRecibo extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Libertador/LibertadorWS.wsdl")
    private LibertadorWS_Service service;

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        HttpSession ses = request.getSession();  
        ses.removeAttribute("lrecibo");
        LibertadorWS port = service.getLibertadorWSPort();
        String prueba =port.buscarRegistroPago(Integer.parseInt(dni)).toString();
        
        if (prueba.equals("")){
            RequestDispatcher rd = request.getRequestDispatcher("/buscarRegistro.jsp");
            rd.forward(request, response);
        }else {
            String[] parts = prueba.split("-");
            
            int i = parts.length;
            List <Recibo> l = new <Recibo> ArrayList();
            if (i>0){        
                for(int j=0;j<i;j++){               
                    String[] parts2 = parts[j].toString().split("/");
                    Recibo r = new Recibo(Integer.parseInt(parts2[0]),Integer.parseInt(parts2[1]),Integer.parseInt(parts2[2]),parts2[3]);
                    l.add(r);
                }
            }
            ses.setAttribute("lrecibo", l);
            RequestDispatcher rd = request.getRequestDispatcher("/buscarRegistro.jsp");
            rd.forward(request, response);
        }
    }

   

    
}
