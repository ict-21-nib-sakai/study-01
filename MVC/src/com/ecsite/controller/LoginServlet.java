package com.ecsite.controller;

import com.ecsite.data.Item;
import com.ecsite.data.User;
import com.ecsite.service.ItemService;
import com.ecsite.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
        super.init();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/WEB-INF/login.jsp";
        request.getRequestDispatcher(path).forward(request, response);
    }

    /**
     * ログイン処理
     *
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginService loginService = new LoginService();
        User user = loginService.execute(request);

        if (null == user) {
            // 認証失敗
            doGet(request, response);
            return;
        }

        // 商品一覧を取得し、itemList.jsp に遷移
        ItemService itemService = new ItemService();
        List<Item> itemList = itemService.findAll();

        // ビューに値を渡す
        request.setAttribute("itemList", itemList);

        // ビューを表示
        request
            .getRequestDispatcher("/WEB-INF/itemList.jsp")
            .forward(request, response)
        ;
    }
}
