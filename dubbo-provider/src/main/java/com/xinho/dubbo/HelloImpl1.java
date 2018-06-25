package com.xinho.dubbo;

import com.xinho.dubbo.IHello;

/**
 * @author lhf
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/1911:40
 */
public class HelloImpl1 implements IHello {
    

    @Override
    public String sayHello(String msg) {

        return "Hello version 1.0.1"+msg;
    }
}
