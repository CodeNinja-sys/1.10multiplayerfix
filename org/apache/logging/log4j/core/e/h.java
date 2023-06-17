/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.d;

public final class h {
    private static final d b = org.apache.logging.log4j.d.d.k();
    private static final boolean c;
    private static final Method d;
    static final int a;

    private h() {
    }

    public static boolean a() {
        return c;
    }

    public static Class a(int n2) {
        if (!c) {
            return null;
        }
        try {
            return (Class)d.invoke(null, n2 + 1 + a);
        }
        catch (IllegalAccessException illegalAccessException) {
            b.f("Should not have failed to call getCallerClass.");
        }
        catch (InvocationTargetException invocationTargetException) {
            b.f("Should not have failed to call getCallerClass.");
        }
        return null;
    }

    static {
        Method method = null;
        int n2 = 0;
        try {
            Method[] arrmethod;
            ClassLoader classLoader = p.a();
            Class<?> class_ = classLoader.loadClass("sun.reflect.Reflection");
            for (Method method2 : arrmethod = class_.getMethods()) {
                int n3 = method2.getModifiers();
                Class<?>[] arrclass = method2.getParameterTypes();
                if (!method2.getName().equals("getCallerClass") || !Modifier.isStatic(n3) || arrclass.length != 1 || arrclass[0] != Integer.TYPE) continue;
                method = method2;
                break;
            }
            if (method == null) {
                b.d("sun.reflect.Reflection#getCallerClass does not exist.");
            } else {
                Object object = method.invoke(null, 0);
                if (object == null || object != class_) {
                    method = null;
                    b.f("sun.reflect.Reflection#getCallerClass returned unexpected value of [{}] and is unusable. Will fall back to another option.", object);
                } else {
                    Object object2 = method.invoke(null, 1);
                    if (object2 == class_) {
                        n2 = 1;
                        b.f("sun.reflect.Reflection#getCallerClass is broken in Java 7u25. You should upgrade to 7u40. Using alternate stack offset to compensate.");
                    }
                }
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            b.d("sun.reflect.Reflection is not installed.");
        }
        catch (IllegalAccessException illegalAccessException) {
            b.d("sun.reflect.Reflection#getCallerClass is not accessible.");
        }
        catch (InvocationTargetException invocationTargetException) {
            b.d("sun.reflect.Reflection#getCallerClass is not supported.");
        }
        if (method == null) {
            c = false;
            d = null;
            a = -1;
        } else {
            c = true;
            d = method;
            a = n2;
        }
    }
}

