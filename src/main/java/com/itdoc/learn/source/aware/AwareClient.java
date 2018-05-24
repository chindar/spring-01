/**
 * @filename: AwareClient.java
 * @desc 激活Aware测试客户端
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-24 13:06
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180524   Wang Chinda   create
 * 20180524   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc 激活Aware测试客户端
 * @author Wang Chinda
 * @create 2018-05-24 13:06
 */
public class AwareClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/aware-test.xml");
        TestBeanFactoryAware aware = (TestBeanFactoryAware) applicationContext.getBean("testAware");
        aware.testAware();
    }
}
