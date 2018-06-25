package com.xinho.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author lhf
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/1913:58
 */
public class Bootstrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext clx=new ClassPathXmlApplicationContext("dubbo-server.xml");

        clx.start();

        System.in.read();
    }
}
