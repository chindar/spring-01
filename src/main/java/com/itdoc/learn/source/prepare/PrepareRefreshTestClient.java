/**
 * @filename: PrepareRefreshTestClient.java
 * @desc 准备环境功能扩展测试
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-24 15:08
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180524   Wang Chinda   create
 * 20180524   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.prepare;

/**
 * @desc 准备环境功能扩展测试
 * @author Wang Chinda
 * @create 2018-05-24 15:08
 */
public class PrepareRefreshTestClient {

    public static void main(String[] args) {
        new MyClassPathXmlApplicationContext("test/prepare-refresh-test.xml.xml");
    }
}
