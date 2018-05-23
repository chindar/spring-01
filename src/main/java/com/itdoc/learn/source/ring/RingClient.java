/**
 * @filename: RingClient.java
 * @desc 测试客户端
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-23 14:58
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180523   Wang Chinda   create
 * 20180523   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.ring;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc 测试客户端
 * @author Wang Chinda
 * @create 2018-05-23 14:58
 */
public class RingClient {

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testConstructor() throws Throwable {
        try {
            new ClassPathXmlApplicationContext("test/ring-construcetor-test.xml");
        } catch (Exception e) {
            System.out.println(e.toString());
            Throwable cause = e.getCause().getCause().getCause();
            throw cause;
        }
    }

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testSetter() throws Throwable {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/ring-setter-test.xml");
            System.out.println(applicationContext.getBean("testA"));
        } catch (Exception e) {
            System.out.println(e.toString());
            Throwable cause = e.getCause().getCause().getCause();
            throw cause;
        }
    }
}
