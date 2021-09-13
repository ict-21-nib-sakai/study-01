package com.ecsite.service;

import com.ecsite.dao.UserDAO;
import com.ecsite.data.User;

import javax.servlet.http.HttpServletRequest;

public class LoginService {
    public User execute(HttpServletRequest request) {
        String userid = request.getParameter("userid");
        String pass = request.getParameter("pass");

        UserDAO dao = new UserDAO();
        User user = dao.selectByUserId(userid);

        // ユーザーIDに合致するユーザーの有無を検査
        if (null == user) {
            return null;
        }

        // パスワードを検査
        if (user.getPassword().equals(pass)) {
            return null;
        }

        return user;
    }
}
