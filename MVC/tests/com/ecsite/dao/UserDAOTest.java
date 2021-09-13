package com.ecsite.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ecsite.data.User;

class UserDAOTest {

    @Test
    void testSelectByUserId() {
        UserDAO dao = new UserDAO();
        final User user = dao.selectByUserId("user");

        if (null == user) {
            fail("nullはだめ");
        } else {
            assertEquals("user", user.getUserid());
            assertEquals("userpass", user.getPassword());
            assertEquals("general user", user.getName());
        }
    }
}
