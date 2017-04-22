package pl.javaee.tutorial;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kuba on 2017-04-22.
 */
@WebServlet(urlPatterns = {"/Autor.do"},initParams ={
        @WebInitParam(name ="Imie",value = "Jan"),
        @WebInitParam(name="Nazwisko",value = "Kowalski") })
public class Autors extends HttpServlet {
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html:charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("Autorem servletu jest, " + this.getInitParameter("Imie") +" "+ this.getInitParameter("Nazwisko"));
        }finally {
            out.close();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request,response);
    }
}
