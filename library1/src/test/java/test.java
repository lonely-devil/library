import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pro.Book;
import pro.MapPro;
import pro.User;
import util.SqlTool;

import java.util.List;

public class test {
    @Test
    public void test(){
        SqlSession sqlSessionFactory = SqlTool.getSqlSessionFactory();
        MapPro mapper = sqlSessionFactory.getMapper(MapPro.class);
        User user=new User();
        user.setUsername("admin");
        user.setPwd("123456");
        mapper.upUser(user);
        sqlSessionFactory.commit();
    }

}
