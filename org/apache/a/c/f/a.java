/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a {
    public static Object a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Cloneable) {
            Method method;
            Class<?> class_ = object.getClass();
            try {
                method = class_.getMethod("clone", null);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                throw new NoSuchMethodError(noSuchMethodException.getMessage());
            }
            try {
                Object object2 = method.invoke(object, null);
                return object2;
            }
            catch (InvocationTargetException invocationTargetException) {
                Throwable throwable = invocationTargetException.getCause();
                if (throwable instanceof CloneNotSupportedException) {
                    throw (CloneNotSupportedException)throwable;
                }
                throw new Error("Unexpected exception", throwable);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new IllegalAccessError(illegalAccessException.getMessage());
            }
        }
        throw new CloneNotSupportedException();
    }

    public static Object b(Object object) {
        return a.a(object);
    }

    private a() {
    }
}

