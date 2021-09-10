package servlet.enshu09_1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TopServlet
 */
@WebServlet(name = "enshu09_1", urlPatterns = {"/enshu09_1/top"})
public class TopServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /** 転送用オブジェクオブジェクト */
        RequestDispatcher dispatcher = request.getRequestDispatcher(
            "/WEB-INF/enshu09_1/top.jsp"
        );

        Boolean has_session = request.getSession(false) != null;

        // ビューに渡す値を代入
        request.setAttribute("has_session", has_session);

        // ビューを表示
        dispatcher.forward(request, response);
    }
}
