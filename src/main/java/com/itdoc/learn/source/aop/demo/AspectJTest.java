/**
 * @filename: AspectJTest.java
 * @desc aop切面控制
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 11:33
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.aop.demo;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @desc aop切面控制, 创建Advisor
 * @author Wang Chinda
 * @create 2018-05-25 11:33
 */
@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.*(..))")
    public void test() {
    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println("afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint point) {
        Object obj = null;
        try {
            System.out.println("前置通知");
            obj = point.proceed();
            System.out.println("返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知");
        } finally {
            System.out.println("后置通知");
        }
        return obj;
    }

}
