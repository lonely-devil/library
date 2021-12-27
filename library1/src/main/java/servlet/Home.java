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
import java.util.List;

public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MapPro mapper = SqlTool.getMapper();
        List<Book> books = mapper.bookList();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        Gson gson = new Gson();
        String res=gson.toJson(books);
        resp.getWriter().write(res);
    }
}
