/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import b.a.b;
import b.a.d;
import b.a.e;
import b.a.h;
import b.ag;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class g {
    private g() {
        throw new UnsupportedOperationException();
    }

    public static ag a(Class class_) {
        Class class_2 = b.a(class_);
        ag ag2 = g.b(class_2);
        if (ag2 != null) {
            return ag2;
        }
        ag ag3 = g.c(class_2);
        if (ag3 != null) {
            return ag3;
        }
        throw new IllegalArgumentException(class_ + " is not a value type");
    }

    private static ag b(Class class_) {
        try {
            Method method = class_.getDeclaredMethod("valueOf", String.class);
            if (g.a(method, class_)) {
                return new e(method, class_);
            }
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    private static ag c(Class class_) {
        try {
            return new d(class_.getConstructor(String.class));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    public static Object a(Constructor constructor, Object ... arrobject) {
        try {
            return constructor.newInstance(arrobject);
        }
        catch (Exception exception) {
            throw g.a(exception);
        }
    }

    public static Object a(Method method, Object ... arrobject) {
        try {
            return method.invoke(null, arrobject);
        }
        catch (Exception exception) {
            throw g.a(exception);
        }
    }

    public static Object a(ag ag2, String string) {
        return ag2 == null ? string : ag2.a(string);
    }

    private static boolean a(Method method, Class class_) {
        int n2 = method.getModifiers();
        return Modifier.isPublic(n2) && Modifier.isStatic(n2) && class_.equals(method.getReturnType());
    }

    private static RuntimeException a(Exception exception) {
        if (exception instanceof IllegalArgumentException) {
            return new h(exception);
        }
        if (exception instanceof InvocationTargetException) {
            return new h(exception.getCause());
        }
        if (exception instanceof RuntimeException) {
            return (RuntimeException)exception;
        }
        return new h(exception);
    }
}

