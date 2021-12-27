package servlet;

import org.apache.ibatis.session.SqlSession;
import pro.MapPro;
import pro.User;
import util.SqlTool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username").trim();
        String password = req.getParameter("password1").trim();
        System.out.println(name);
        System.out.println(password);
        User user=new User();
        user.setUsername(name);
        user.setPwd(password);
        SqlSession sqlSessionFactory = SqlTool.getSqlSessionFactory();
        MapPro mapper = sqlSessionFactory.getMapper(MapPro.class);
        mapper.upUser(user);
        sqlSessionFactory.commit();
        req.getRequestDispatcher("/").forward(req,resp);
    }
}
