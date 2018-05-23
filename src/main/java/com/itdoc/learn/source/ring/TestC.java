/**
 * @filename: TestC.java
 * @desc
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-23 14:50
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180523   Wang Chinda   create
 * 20180523   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.ring;

/**
 * @desc
 * @author Wang Chinda
 * @create 2018-05-23 14:50
 */
public class TestC {

    private TestA testA;

    public TestC() {
    }

    public TestC(TestA testA) {
        this.testA = testA;
    }

    public void c() {
        testA.a();
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
