/**
 * @filename: AopDemoClient.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 12:00
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-05-25 12:00
 */
public class AopDemoClient {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("test/aopDemo.xml");
        AopBean aopBean = (AopBean) app.getBean("test");
        aopBean.testMethod();
    }
}
