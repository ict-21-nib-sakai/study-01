package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyParamServlet
 */
@WebServlet("/MyParamServlet")
public class MyParamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO GET及びPOST処理をまとめて記述

        // ログインIDとパスワードを取り出す
        final String loginId = request.getParameter("loginId");
        final String password = request.getParameter("password");

        // チェックボックスの値を取得する
        String[] colors = request.getParameterValues("color");

        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html>\n" +
            "<html lang=\"ja\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Insert title here</title>\n" +
            "</head>\n" +
            "<body>\n" +
            // 画面で入力した内容を表示
            "<h1>" + loginId + "</h1>" +
            "<h1>" + password + "</h1>"
        );

        // チェックボックスでチェックした色を表示
        for (String color : colors) {
            writer.println("<h1>" + color + "</h1>");
        }

        writer.println(
            "</body>\n" +
            "</html>"
        );
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
