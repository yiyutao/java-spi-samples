package net.yiyutao.spi.service.impl;

import net.yiyutao.spi.service.DemoService;

/**
 * @author masterYI
 * @date 2019/4/25 21:28
 */
public class GoodNightServiceImpl implements DemoService {
    @Override
    public void sayHello(String name) {
        System.out.println("Good night!" + name);
    }
}
