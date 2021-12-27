package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pro.MapPro;

import java.io.IOException;
import java.io.InputStream;

public class SqlTool {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            String resource= "mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSessionFactory() {
        return sqlSessionFactory.openSession();
    }
    public static MapPro getMapper(){
        return sqlSessionFactory.openSession().getMapper(MapPro.class);
    }
}
