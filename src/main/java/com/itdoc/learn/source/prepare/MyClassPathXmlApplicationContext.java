/**
 * @filename: MyClassPathXmlApplicationContext.java
 * @desc 准备环境功能扩展测试
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-24 15:01
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180524   Wang Chinda   create
 * 20180524   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.prepare;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc 准备环境功能扩展测试
 * @author Wang Chinda
 * @create 2018-05-24 15:01
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String ... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        // 添加验证要求
        getEnvironment().setRequiredProperties("VAR");
    }
}
