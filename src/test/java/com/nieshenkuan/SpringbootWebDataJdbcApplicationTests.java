package com.nieshenkuan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebDataJdbcApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() throws SQLException {
        //class com.zaxxer.hikari.HikariDataSource  2.1.16版本
        //class org.apache.tomcat.jdbc.pool.DataSource 1.5.10 版本
        System.out.println(dataSource.getClass());


        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
        System.out.println(jdbcTemplate);
    }

}
