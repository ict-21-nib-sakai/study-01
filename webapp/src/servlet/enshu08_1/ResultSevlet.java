package servlet.enshu08_1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResultSevlet
 */
@WebServlet(name = "enshu08_1/result", urlPatterns = {"/enshu08_1/result"})
public class ResultSevlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultSevlet() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final int value1 = Integer.parseInt(
            request.getParameter("value1")
        );

        final int value2 = Integer.parseInt(
            request.getParameter("value2")
        );

        final String operator = request.getParameter("operator");

        double result = 0;

        switch (operator) {
            case "+":
                result = value1 + value2;
                break;

            case "-":
                result = value1 - value2;
                break;

            case "*":
                result = value1 * value2;
                break;

            case "/":
                result = (double)value1 / value2;
                break;
        }

        /** 転送用オブジェクト */
        RequestDispatcher dispatcher = request.getRequestDispatcher(
            "/WEB-INF/enshu08_1/result.jsp"
        );

        // JSPにわたす値をセット
        request.setAttribute("value1", value1);
        request.setAttribute("operator", operator);
        request.setAttribute("value2", value2);
        request.setAttribute("result", result);

        // ビューを表示
        dispatcher.forward(request, response);
    }
}
