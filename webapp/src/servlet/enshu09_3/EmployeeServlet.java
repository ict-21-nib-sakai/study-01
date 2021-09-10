package servlet.enshu09_3;

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
 * 演習 9.3 EL式とJSTLの利用 (サーブレット)
 */
@WebServlet(name = "enshu09_3/employee", urlPatterns = {"/enshu09_3/employee"})
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = new ArrayList<>();

        employees.add(
            new Employee(123, "John Doe", "総務部")
        );

        employees.add(
            new Employee(223, "Jane Doe", "システム課")
        );

        employees.add(
            new Employee(333, "Taro 山田", "企画課")
        );

        employees.add(
            new Employee(555, "田中 角栄", "広報課")
        );

        request.setAttribute("employees", employees);

        // ビューを表示
        final RequestDispatcher dispatcher = request.getRequestDispatcher(
            "/WEB-INF/enshu09_3/enshu09_3.jsp"
        );

        dispatcher.forward(request, response);
    }
}
