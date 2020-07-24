import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProcessInfo")
public class ProcessInfo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        String url = "/DisInfo.jsp";
        String usersName = request.getParameter("name");
        request.setAttribute("usersName", usersName);
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }


}
