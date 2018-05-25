/**
 * @filename: CustomDatePropertyEditor.java
 * @desc 实现Spring提供的自定义时间编辑器
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-05-25 10:18
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180525   Wang Chinda   create
 * 20180525   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.add.attribute;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @desc 实现Spring提供的属性编辑器注册器, 应用CustomDateEditor
 * @author Wang Chinda
 * @create 2018-05-25 10:18
 */
public class CustomDatePropertyEditor implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yy-MM-dd"), true));
    }
}
