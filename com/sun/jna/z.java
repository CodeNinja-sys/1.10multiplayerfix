/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.aa;
import com.sun.jna.ab;
import com.sun.jna.aq;
import com.sun.jna.n;
import com.sun.jna.r;
import com.sun.jna.v;
import com.sun.jna.y;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class z
implements InvocationHandler {
    static final Method a;
    static final Method b;
    static final Method c;
    private final aq d;
    private final Class e;
    private final Map f;
    private r g;
    private final v h;
    private final Map i = new WeakHashMap();

    public z(String string, Class class_, Map hashMap) {
        int n2;
        if (string != null && "".equals(string.trim())) {
            throw new IllegalArgumentException("Invalid library name \"" + string + "\"");
        }
        this.e = class_;
        hashMap = new HashMap<String, Integer>(hashMap);
        int n3 = n2 = (y.b == null ? (y.b = y.a("com.sun.jna.a")) : y.b).isAssignableFrom(class_) ? 1 : 0;
        if (hashMap.get("calling-convention") == null) {
            hashMap.put("calling-convention", new Integer(n2));
        }
        this.f = hashMap;
        this.d = aq.a(string, hashMap);
        this.g = (r)hashMap.get("function-mapper");
        if (this.g == null) {
            this.g = new ab(hashMap);
        }
        this.h = (v)hashMap.get("invocation-mapper");
    }

    public aq a() {
        return this.d;
    }

    public String b() {
        return this.d.c();
    }

    public Class c() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object invoke(Object object, Method method, Object[] arrobject) {
        if (a.equals(method)) {
            return "Proxy interface to " + this.d;
        }
        if (b.equals(method)) {
            return new Integer(this.hashCode());
        }
        if (c.equals(method)) {
            Object object2 = arrobject[0];
            if (object2 != null && Proxy.isProxyClass(object2.getClass())) {
                return n.a(Proxy.getInvocationHandler(object2) == this);
            }
            return Boolean.FALSE;
        }
        aa aa2 = null;
        Map map = this.i;
        synchronized (map) {
            aa2 = (aa)this.i.get(method);
            if (aa2 == null) {
                aa2 = new aa(null);
                aa2.c = n.a(method);
                if (this.h != null) {
                    aa2.a = this.h.a(this.d, method);
                }
                if (aa2.a == null) {
                    String string = this.g.a(this.d, method);
                    if (string == null) {
                        string = method.getName();
                    }
                    aa2.b = this.d.a(string, method);
                    aa2.d = new HashMap(this.f);
                    aa2.d.put("invoking-method", method);
                }
                this.i.put(method, aa2);
            }
        }
        if (aa2.c) {
            arrobject = n.i(arrobject);
        }
        if (aa2.a != null) {
            return aa2.a.invoke(object, method, arrobject);
        }
        return aa2.b.a(method.getReturnType(), arrobject, aa2.d);
    }

    static {
        try {
            a = (y.a == null ? (y.a = y.a("java.lang.Object")) : y.a).getMethod("toString", new Class[0]);
            b = (y.a == null ? (y.a = y.a("java.lang.Object")) : y.a).getMethod("hashCode", new Class[0]);
            c = (y.a == null ? (y.a = y.a("java.lang.Object")) : y.a).getMethod("equals", y.a == null ? (y.a = y.a("java.lang.Object")) : y.a);
        }
        catch (Exception exception) {
            throw new Error("Error retrieving Object.toString() method");
        }
    }
}

