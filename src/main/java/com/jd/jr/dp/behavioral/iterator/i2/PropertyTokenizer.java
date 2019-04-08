/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i2;

import java.util.Iterator;

/**
 * 属性分解器，属性分解为标记，迭代子模式 如person[0].birthday.year，将依次取
 * 得person[0], birthday, year
 *
 * @author benjamin
 * @version $Id: PropertyTokenizer.java, v 0.1 2019年04月08日 4:30 PM benjamin Exp $
 */
public class PropertyTokenizer implements Iterator<PropertyTokenizer> {

    /**
     * 名字：person
     */
    private String name;
    /**
     * 名字和下标：person[0]
     */
    private String indexedName;
    /**
     * 下标：0
     */
    private String index;
    /**
     * 子节点：birthday.year
     */
    private String children;

    /**
     * 初始化属性分解器
     * @param fullname 全名
     */
    public PropertyTokenizer(String fullname) {
        // person[0].birthdate.year
        // 对参数进行第一次处理，通过“.”分隔符将propertyName分作两部分
        int delim = fullname.indexOf('.');
        if (delim > -1) {
            name = fullname.substring(0, delim);
            children = fullname.substring(delim + 1);
        } else {
            // 找不到.的话，取全部部分
            name = fullname;
            children = null;
        }
        indexedName = name;
        // 把中括号里的数字给解析出来
        // 对name进行二次处理,去除“[...]”，并将方括号内的内容赋给index属性，如果name属性中包含“[]”的话
        delim = name.indexOf('[');
        if (delim > -1) {
            // 先取index内容再截取name更为方便些，要不然还需要一个临时变量，需要三步才能实现
            // 这里包含了一个前提：传入的参数如果有有[,则必然存在],并且是属性的最后一个字符
            index = name.substring(delim + 1, name.length() - 1);
            name = name.substring(0, delim);
        }
    }

    public String getName() {
        return name;
    }

    public String getIndexedName() {
        return indexedName;
    }

    public String getIndex() {
        return index;
    }

    public String getChildren() {
        return children;
    }

    @Override
    public boolean hasNext() {
        return children != null;
    }

    @Override
    public PropertyTokenizer next() {
        return new PropertyTokenizer(children);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove is not supported, as it has no meaning in the context of properties.");
    }
}