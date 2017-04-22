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
@WebServlet(name = "HelloServlet" , urlPatterns = {"/Hello.do"})
public class HelloServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");
        String login = request.getParameter("imie");
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Witaj, "+login+" , na tym swiecie </h1>");
            out.println("</body>");
            out.println("</html>");

        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
    public String getServletInfo(){
        return "Short description";
    }
}
