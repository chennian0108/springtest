package com.cn.base_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCRun {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao ud = (UserDao) applicationContext.getBean("userDao");
        User u = new User();
        u.setAccount("jd_dwhehd");
        u.setName("小明");
        u.setPwd("123");
        ud.insert(u);

    }
}
