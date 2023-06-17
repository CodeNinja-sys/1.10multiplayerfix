/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ay;
import com.sun.jna.e;
import com.sun.jna.n;
import com.sun.jna.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

class h
implements InvocationHandler {
    private n a;
    private Map b;

    public h(ay ay2, int n2, Map map) {
        this.a = new n(ay2, n2);
        this.b = map;
    }

    public Object invoke(Object object, Method method, Object[] arrobject) {
        if (z.a.equals(method)) {
            String string = "Proxy interface to " + this.a;
            Method method2 = (Method)this.b.get("invoking-method");
            Class class_ = e.a(method2.getDeclaringClass());
            string = string + " (" + class_.getName() + ")";
            return string;
        }
        if (z.b.equals(method)) {
            return new Integer(this.hashCode());
        }
        if (z.c.equals(method)) {
            Object object2 = arrobject[0];
            if (object2 != null && Proxy.isProxyClass(object2.getClass())) {
                return n.a(Proxy.getInvocationHandler(object2) == this);
            }
            return Boolean.FALSE;
        }
        if (n.a(method)) {
            arrobject = n.i(arrobject);
        }
        return this.a.a(method.getReturnType(), arrobject, this.b);
    }

    public ay a() {
        return this.a;
    }
}

