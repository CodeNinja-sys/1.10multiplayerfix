/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.a.c.c.e;
import org.apache.a.o.g;
import org.apache.a.x;

class n
implements InvocationHandler {
    private final x a;

    n(x x2) {
        this.a = x2;
    }

    public void a() {
        org.apache.a.n n2 = this.a.b();
        g.b(n2);
    }

    public Object invoke(Object object, Method method, Object[] arrobject) {
        String string = method.getName();
        if (string.equals("close")) {
            this.a();
            return null;
        }
        try {
            return method.invoke(this.a, arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw invocationTargetException;
        }
    }

    public static e a(x x2) {
        return (e)Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{e.class}, (InvocationHandler)new n(x2));
    }
}

