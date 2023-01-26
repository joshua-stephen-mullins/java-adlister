import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "ServletTest", urlPatterns = "/big-serve")
public class ServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        String favColor = req.getParameter("color");

        writer.println("<h1 style='color: " +  favColor + "'>Hello Self!</h1>");

        String favFood = req.getParameter("food");

        writer.println("<h2>A good food is " + favFood + "!</h2>");

    }
}