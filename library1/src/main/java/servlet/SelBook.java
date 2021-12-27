package servlet;

import com.google.gson.Gson;
import pro.Book;
import pro.MapPro;
import util.SqlTool;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String name = req.getParameter("name").trim();
        MapPro mapper = SqlTool.getMapper();
        Book book = mapper.selBook(name);
        Gson gson=new Gson();
        System.out.println(gson.toJson(book));
        resp.getWriter().write(gson.toJson(book));
    }
}
