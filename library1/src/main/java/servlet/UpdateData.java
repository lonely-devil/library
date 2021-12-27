package servlet;

import org.apache.ibatis.session.SqlSession;
import pro.MapPro;
import util.SqlTool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateData extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("Id");
        String method=req.getParameter("Method");
        SqlSession sqlSessionFactory = SqlTool.getSqlSessionFactory();
        MapPro mapper = sqlSessionFactory.getMapper(MapPro.class);
        System.out.println(id);
        System.out.println(method);
        if (id!=null &&method!=null) {
            if (method.equals("bor")) {
                mapper.delBook(Integer.parseInt(id));
                sqlSessionFactory.commit();
            }else if (method.equals("ret")) {
                mapper.addBook(Integer.parseInt(id));
                sqlSessionFactory.commit();
            }
        }
        sqlSessionFactory.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("data_id");
        String method = req.getParameter("data_method");
        System.out.println(id);
        System.out.println(method);
    }
}
