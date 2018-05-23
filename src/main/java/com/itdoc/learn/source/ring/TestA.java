/**
 * @filename: TestA.java
 * @desc 环依赖测试A
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-23 14:47
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180523   Wang Chinda   create
 * 20180523   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.ring;

/**
 * @desc 环依赖测试A
 * @author Wang Chinda
 * @create 2018-05-23 14:47
 */
public class TestA {

    private TestB testB;

    public TestA() {
    }

    public TestA(TestB testB) {
        this.testB = testB;
    }

    public void a() {
        testB.b();
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}
