package com.springhibernate.util;

/**
 * Created by Administrator on 2016/5/16.
 */
public class ValueCheckUtil {
    public static boolean isEmptyString(Object object) {
        return object == null || String.valueOf(object).equals("");
    }
}
