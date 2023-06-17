/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cl;
import com.a.a.f.h;
import java.lang.reflect.Method;

public class p {
    private final h a;
    private final Object b;
    private final Object c;
    private final Method d;

    p(h h2, Object object, Object object2, Method method) {
        this.a = (h)cl.a(h2);
        this.b = cl.a(object);
        this.c = cl.a(object2);
        this.d = (Method)cl.a(method);
    }

    public h a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public Object c() {
        return this.c;
    }

    public Method d() {
        return this.d;
    }
}

