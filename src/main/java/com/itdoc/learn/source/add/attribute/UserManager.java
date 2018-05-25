/**
 * @filename: UserManager.java
 * @desc 增加属性编辑器功能测试实体类
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 9:32
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.add.attribute;

import java.util.Date;

/**
 * @desc 增加属性编辑器功能测试实体类
 * @author Wang Chinda
 * @create 2018-05-25 9:32
 */
public class UserManager {

    private Date dateValue;


    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    @Override
    public String toString() {
        return "UserManager{" +
                "dateValue=" + dateValue +
                '}';
    }
}
