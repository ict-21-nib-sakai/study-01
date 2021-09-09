package servlet.enshu07_2;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(name = "HelloServlet2", urlPatterns = {"/HelloServlet2"})
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /** 転送先のJSPのPath */
        String jsp_path = "/WEB-INF/enshu07_2/hello.jsp";

        /** 転送用オブジェクト */
        RequestDispatcher dispatcher = request.getRequestDispatcher(jsp_path);

        /** JSP に渡す値 */
        final String message = "Hello!";

        // JSPに渡す値をセット
        request.setAttribute("message", message);

        // 指定したPathに転送
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
