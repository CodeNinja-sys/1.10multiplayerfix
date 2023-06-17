/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.Closeable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.a.i.f.c;
import org.apache.a.i.f.k;
import org.apache.a.n;
import org.apache.a.x;

class l
implements InvocationHandler {
    private static final Method a;
    private final x b;
    private final c c;

    l(x x2, c c2) {
        this.b = x2;
        this.c = c2;
        n n2 = x2.b();
        if (n2 != null && n2.g() && c2 != null) {
            this.b.a(new k(n2, c2));
        }
    }

    public void a() {
        if (this.c != null) {
            this.c.cN_();
        }
    }

    public Object invoke(Object object, Method method, Object[] arrobject) {
        if (method.equals(a)) {
            this.a();
            return null;
        }
        try {
            return method.invoke(this.b, arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw invocationTargetException;
        }
    }

    static {
        try {
            a = Closeable.class.getMethod("close", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new Error(noSuchMethodException);
        }
    }
}

