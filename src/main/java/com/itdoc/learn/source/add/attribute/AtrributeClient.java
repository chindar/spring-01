/**
 * @filename: AtrributeClient.java
 * @desc 增加属性编辑器测试客户端
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 9:34
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.add.attribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc 增加属性编辑器测试客户端
 * @author Wang Chinda
 * @create 2018-05-25 9:34
 */
public class AtrributeClient {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("test/customEditor.xml");
        UserManager userManager = (UserManager) app.getBean("getUserManager");
        System.out.println(userManager);
    }

}
