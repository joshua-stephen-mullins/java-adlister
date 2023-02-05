import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IncorrectGuessServlet", urlPatterns = "/incorrect")
public class IncorrectGuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String result = "You lose!";
        req.setAttribute("result", result);
        req.getRequestDispatcher("guess-result.jsp").forward(req, resp);
    }
}
