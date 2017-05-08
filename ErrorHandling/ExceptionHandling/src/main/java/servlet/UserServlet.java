package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.User;
import exception.UserException;
import java.util.ArrayList;
import mapper.UserMapper;

@WebServlet(name = "Users", urlPatterns =
{
    "/Users"
})
public class UserServlet extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        UserMapper um = new UserMapper();
        List<User> users = new ArrayList<>();
        String errmsg = "";
        
        try
        {
            users = um.getUsers();
        }
        catch (UserException ex)
        {
            errmsg = ex.getMessage();
        }
        
        try
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Users</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Users</h1>");
            
            if (errmsg.length() > 0)
            {
                out.println("<div class=\"error\">" + errmsg + "</div>");
            }
            
            for(User u : users)
            {
                out.println("<p>" + u.getUsername() + "</p>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }
}
