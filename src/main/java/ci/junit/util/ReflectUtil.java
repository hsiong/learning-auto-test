/**
 * Copyright (C), 2006-2022,
 *
 * @FileName: ReflectUtil
 * @Author: JF
 * @Date: 2022/5/5 18:37
 * @Description: History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ci.junit.util;

import java.lang.reflect.Field;

/**
 * 〈〉
 *
 * @author Hsiong
 * @create 2022/5/5
 * @since 1.0.0
 */
public class ReflectUtil {

    /**
     * 通过反射获取值
     * @param field
     * @param o
     * @return
     */
    protected static Object getFieldValue(Field field, Object o) {
        field.setAccessible(true);
        String fieldName = field.getName();
        if ("serialVersionUID".equals(fieldName)) {
            return null;
        }
        Object filedValue = null;
        try {
            filedValue = field.get(o);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return filedValue;
    }

}
