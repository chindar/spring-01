/**
 * @filename: TestBeanFactoryAware.java
 * @desc 定义BeanFactoryAware类型的bean
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-24 11:54
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180524   Wang Chinda   create
 * 20180524   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @desc 定义BeanFactoryAware类型的bean
 * @author Wang Chinda
 * @create 2018-05-24 11:54
 */
public class TestBeanFactoryAware implements BeanFactoryAware {

    private BeanFactory beanFactory;

    /**
     * 声明bean的时候, Spring会自动注入BeanFactory
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware() {
        // 通过hello这个bean的id从beanFactory获取实例
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.say();
    }
}
