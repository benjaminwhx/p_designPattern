/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.jd.jr.dp.behavioral.iterator.i2;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 *
 * @author benjamin
 * @version $Id: BeanWrapper.java, v 0.1 2019年04月08日 5:54 PM benjamin Exp $
 */
public class BeanWrapper {

    public Object get(PropertyTokenizer prop, Object obj) {
        Object object = getBeanProperty(prop, obj);
        if (prop.hasNext()) {
            if (prop.getIndex() != null) {
                object = getCollectionValue(prop, object);
            }
            return getBeanProperty(prop.next(), object);
        } else {
            return object;
        }
    }

    private Object getBeanProperty(PropertyTokenizer prop, Object obj) {
        try {
            Field field = obj.getClass().getDeclaredField(prop.getName());
            field.setAccessible(true);
            return field.get(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException("Could not get property '" + prop.getName() + "' from " + obj.getClass() + ".  Cause: " + t.toString(), t);
        }
    }

    protected Object getCollectionValue(PropertyTokenizer prop, Object collection) {
        int i = Integer.parseInt(prop.getIndex());
        if (collection instanceof Map) {
            return ((Map) collection).get(i);
        } else if (collection instanceof List) {
            return ((List) collection).get(i);
        } else if (collection instanceof Object[]) {
            return ((Object[]) collection)[i];
        } else if (collection instanceof char[]) {
            return ((char[]) collection)[i];
        } else if (collection instanceof boolean[]) {
            return ((boolean[]) collection)[i];
        } else if (collection instanceof byte[]) {
            return ((byte[]) collection)[i];
        } else if (collection instanceof double[]) {
            return ((double[]) collection)[i];
        } else if (collection instanceof float[]) {
            return ((float[]) collection)[i];
        } else if (collection instanceof int[]) {
            return ((int[]) collection)[i];
        } else if (collection instanceof long[]) {
            return ((long[]) collection)[i];
        } else if (collection instanceof short[]) {
            return ((short[]) collection)[i];
        } else {
            throw new RuntimeException("The '" + prop.getName() + "' property of " + collection + " is not a List or Array.");
        }
    }
}