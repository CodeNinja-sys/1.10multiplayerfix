/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class t {
    public static String a(Class class_) {
        return t.a(class_.getName());
    }

    public static String a(String string) {
        int n2 = string.lastIndexOf(46);
        return n2 < 0 ? "" : string.substring(0, n2);
    }

    public static void a(Class ... arrclass) {
        for (Class class_ : arrclass) {
            try {
                Class.forName(class_.getName(), true, class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new AssertionError((Object)classNotFoundException);
            }
        }
    }

    public static Object a(Class class_, InvocationHandler invocationHandler) {
        cl.a(invocationHandler);
        cl.a(class_.isInterface(), "%s is not an interface", new Object[]{class_});
        Object object = Proxy.newProxyInstance(class_.getClassLoader(), new Class[]{class_}, invocationHandler);
        return class_.cast(object);
    }

    private t() {
    }
}

