package servlet.enshu10_1.controller;

import servlet.enshu10_1.data.Employee;
import servlet.enshu10_1.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
    }

    /**
     * 従業員一覧を表示
     *
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final EmployeeService service = new EmployeeService();

        List<Employee> employees = new ArrayList<>();
        try {
            employees = service.findAll();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // ビューに値を渡す
        request.setAttribute("employees", employees);

        // ビューを表示する
        final RequestDispatcher dispatcher =
            request.getRequestDispatcher(
                "/WEB-INF/enshu10_2/employee.jsp"
            );

        dispatcher.forward(request, response);
    }
}
