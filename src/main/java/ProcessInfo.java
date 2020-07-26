import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

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
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String imgurl = request.getParameter("imgurl");

        updateDB(usersName,height,weight,imgurl);

        request.setAttribute("usersName", usersName);
        request.setAttribute("height",height);
        request.setAttribute("weight",weight);
        request.setAttribute("imgurl",imgurl);

        Sportsman sportsman = new Sportsman(
                usersName,
                height,
                weight,
                imgurl);


        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }

    protected void updateDB(String name, String height, String weight, String imgurl) {
        Connection con;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/users1";
            String user = "athleteadmin";
            String pw = "pass";
            con = DriverManager.getConnection(url, user, pw);
            Statement s = con.createStatement();
            String query = "INSERT INTO athletes1" + "(name, height, weight, photo, athlete_id) "+
                    "VALUES ('"+ name + "', '"+ height + "','" + weight + "','" + imgurl + "',NULL)";
            s.executeUpdate(query);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }


}
