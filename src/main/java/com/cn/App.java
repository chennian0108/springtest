package com.cn;

import com.cn.beans.Student;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Student student = new Student();
//        student.setName("小明");
//        System.out.println(student.getName());

        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getBean中的参数值要和配置文件中的id值一致
        Student stu1 = (Student) application.getBean("myStudent");
        Student stu2 = (Student) application.getBean("myStudent");
        System.out.println(stu1==stu2) ;



    }
}
