package collabo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CollaboServlet
 */
@WebServlet("/CollaboServlet")
public class CollaboServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollaboServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /** 転送先のJSPのパス */
        String path = "/collabo.jsp";

        /** 転送用オブジェクト */
        RequestDispatcher dip = request.getRequestDispatcher(path);

        // ここでは仮定として、データベースから Employee のインスタンスを取得してきたものとして書いています。
        Employee employee = new Employee();
        employee
            .setEmp_id("A01")
            .setEmp_name("Jane Doe")
        ;

        // JSP に引き渡す値をセット
        request.setAttribute("emp_key", employee);

        // 指定したPathに転送
        dip.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
