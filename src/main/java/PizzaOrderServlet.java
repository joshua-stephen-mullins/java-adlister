import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String crust = req.getParameter("crust");
            String sauce = req.getParameter("sauce");
            String size = req.getParameter("size");
            String topping = req.getParameter("topping");
            String address = req.getParameter("delivery-address");

            System.out.println("crust: " + crust);
            System.out.println("sauce: " + sauce);
            System.out.println("size: " + size);
            System.out.println("topping: " + topping);
            System.out.println("address: " + address);
        };
    }
}
