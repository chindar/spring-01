/**
 * @filename: CarClient.java
 * @author: Wang Chinda
 * @date: 2018-05-22
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180522   Wang Chinda   create
 * 20180522   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc FactoryBean使用测试客户端入口
 * @author Wang Chinda
 * @create 2018-05-22 16:27
 */
public class CarClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/car-factory-bean.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}
