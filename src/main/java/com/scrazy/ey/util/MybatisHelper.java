package com.scrazy.ey.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisHelper {
	private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //创建SqlSessionFactory
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
System.out.println(reader);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
          /*  //创建数据库
            SqlSession session = sqlSessionFactory.openSession();
            Connection conn = session.getConnection();
            reader = Resources.getResourceAsReader("CreateDB.sql");
            ScriptRunner runner = new ScriptRunner(conn);
            runner.setLogWriter(null);
            runner.runScript(reader);
            reader.close();
            session.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Session
     * @return
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
