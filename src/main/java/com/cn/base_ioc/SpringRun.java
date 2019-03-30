package com.cn.base_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRun  {
    public static void main(String [] args){
        //加载Spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        //直接输出对象时,会默认调用对象toString()方法
        System.out.println(teacher);
        //上面的那一段代码相等于下面的这一段代码
        System.out.println(teacher.toString());


        System.out.println("----------");

        //ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Dog dog = (Dog)applicationContext.getBean("myDog");
        System.out.println(dog);*/

    }
}
