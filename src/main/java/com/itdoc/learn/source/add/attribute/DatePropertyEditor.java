/**
 * @filename: DatePropertyEditor.java
 * @desc 自定义Date属性编辑器
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 9:53
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.add.attribute;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc 自定义Date属性编辑器
 * @author Wang Chinda
 * @create 2018-05-25 9:53
 */
public class DatePropertyEditor extends PropertyEditorSupport {

    private String format = "yy-MM-dd";

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("text: " + text);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            Date date = dateFormat.parse(text);
            this.setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
