package net.yiyutao.spi;

import net.yiyutao.spi.service.DemoService;

import java.util.ServiceLoader;

/**
 * @author masterYI
 * @date 2019/4/25 21:26
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<DemoService> demoServices = ServiceLoader.load(DemoService.class);
        for (DemoService demoService : demoServices) {
            demoService.sayHello("materYI");
        }
    }
}
