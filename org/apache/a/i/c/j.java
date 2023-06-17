/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.a.f.u;
import org.apache.a.i.c.i;
import org.apache.a.i.c.k;
import org.apache.a.n.g;

class j
implements InvocationHandler {
    private static final Method a;
    private static final Method b;
    private static final Method c;
    private static final Method d;
    private volatile i e;

    j(i i2) {
        this.e = i2;
    }

    i a() {
        return this.e;
    }

    i b() {
        i i2 = this.e;
        this.e = null;
        return i2;
    }

    org.apache.a.j c() {
        i i2 = this.e;
        if (i2 == null) {
            return null;
        }
        return (org.apache.a.j)i2.i();
    }

    public void d() {
        i i2 = this.e;
        if (i2 != null) {
            i2.c();
        }
    }

    public void e() {
        i i2 = this.e;
        if (i2 != null) {
            i2.d();
        }
    }

    public boolean f() {
        i i2 = this.e;
        if (i2 != null) {
            return !i2.e();
        }
        return false;
    }

    public boolean g() {
        org.apache.a.j j2 = this.c();
        if (j2 != null) {
            return j2.d();
        }
        return true;
    }

    public Object invoke(Object object, Method method, Object[] arrobject) {
        if (method.equals(a)) {
            this.d();
            return null;
        }
        if (method.equals(b)) {
            this.e();
            return null;
        }
        if (method.equals(c)) {
            return this.f();
        }
        if (method.equals(d)) {
            return this.g();
        }
        org.apache.a.j j2 = this.c();
        if (j2 == null) {
            throw new k();
        }
        try {
            return method.invoke(j2, arrobject);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (throwable != null) {
                throw throwable;
            }
            throw invocationTargetException;
        }
    }

    public static org.apache.a.j a(i i2) {
        return (org.apache.a.j)Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{u.class, g.class}, (InvocationHandler)new j(i2));
    }

    private static j c(org.apache.a.j j2) {
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(j2);
        if (!j.class.isInstance(invocationHandler)) {
            throw new IllegalStateException("Unexpected proxy handler class: " + invocationHandler);
        }
        return (j)j.class.cast(invocationHandler);
    }

    public static i a(org.apache.a.j j2) {
        i i2 = j.c(j2).a();
        if (i2 == null) {
            throw new k();
        }
        return i2;
    }

    public static i b(org.apache.a.j j2) {
        return j.c(j2).b();
    }

    static {
        try {
            a = org.apache.a.k.class.getMethod("close", new Class[0]);
            b = org.apache.a.k.class.getMethod("f", new Class[0]);
            c = org.apache.a.k.class.getMethod("c", new Class[0]);
            d = org.apache.a.k.class.getMethod("d", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new Error(noSuchMethodException);
        }
    }
}

