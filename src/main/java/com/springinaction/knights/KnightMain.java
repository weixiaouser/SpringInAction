package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weixiao on 2019/2/20 9:53
 */
public class KnightMain {

    public static void main(String[] args) {
        //加载Spring 上下文
        // -- ClassPathXmlApplicationContext --从类路径下的XML配置文件中加载上下文定义，把应用上下文定义文件当做类资源
        // -- FileSystemXmlApplicationContext --读取文件系统下的XML配置文件并加载上下文定义
        // -- XmlWebApplicationContext -- 读取Web应用下的XML配置文件并装载上下文定义
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        //获取knight Bean
        Knight knight = (Knight) context.getBean("knight");
        //使用knight
        knight.embarkOnQuest();
    }
}
