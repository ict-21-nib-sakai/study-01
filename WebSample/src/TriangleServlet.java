
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TriangleServlet
 */
@WebServlet("/TriangleServlet")
public class TriangleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TriangleServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        // 三角形クラスをインスタンス化
        Triangle triangle = new Triangle();
        triangle
            .setBase(10)
            .setHeight(30)
        ;

        // 三角形クラスを2つリストに代入
        List<Triangle> triangles = new ArrayList<>();

        // 1つ目
        Triangle triangle1 = new Triangle();
        triangle1
            .setBase(5)
            .setHeight(8)
        ;

        triangles.add(triangle1);

        // 2つ目
        Triangle triangle2 = new Triangle();
        triangle2
            .setBase(11)
            .setHeight(13)
        ;

        triangles.add(triangle2);

        int score = 90;

        /** 転送用オブジェクト */
        RequestDispatcher dispatcher = request.getRequestDispatcher(
            "/WEB-INF/triangle.jsp"
        );

        // ビューに値を渡す
        request.setAttribute("triangle", triangle);
        request.setAttribute("triangles", triangles);
        request.setAttribute("score", score);

        // 指定した Path に転送
        dispatcher.forward(request, response);
    }
}
