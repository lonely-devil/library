package servlet;

import pro.User;
import pro.MapPro;
import util.SqlTool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        MapPro mapper = SqlTool.getMapper();
        User user = mapper.selectUser(username);
        HttpSession session = req.getSession();
        System.out.println(username);
        System.out.println(password);
        if (user != null && user.getPwd().equals(password)) {
            resp.sendRedirect("/html/body.html");
        } else {
            req.setAttribute("error","密码或账户错误");
            resp.sendRedirect("/");
        }

    }
}
