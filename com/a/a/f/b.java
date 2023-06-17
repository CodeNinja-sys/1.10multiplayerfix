/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.eg;
import com.a.a.c.an;
import com.a.a.c.f;
import com.a.a.d.io;
import com.a.a.d.jl;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.f.a;
import com.a.a.f.c;
import com.a.a.f.d;
import com.a.a.f.n;
import com.a.a.f.o;
import com.a.a.f.r;
import com.a.a.f.s;
import com.a.a.m.ae;
import com.a.a.n.a.gk;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;

class b
implements r {
    private static final an a = f.a().i().a(new c());

    b() {
    }

    @Override
    public vi a(Object object) {
        io io2 = io.v();
        Class<?> class_ = object.getClass();
        for (Method method : b.b(class_)) {
            Class<?>[] arrclass = method.getParameterTypes();
            Class<?> class_2 = arrclass[0];
            n n2 = b.a(object, method);
            io2.a(class_2, n2);
        }
        return io2;
    }

    private static jl b(Class class_) {
        try {
            return (jl)a.c(class_);
        }
        catch (gk gk2) {
            throw eg.b(gk2.getCause());
        }
    }

    private static jl c(Class class_) {
        Set set = ae.a(class_).f().d();
        HashMap hashMap = sz.c();
        for (Class class_2 : set) {
            for (Method method : class_2.getMethods()) {
                if (!method.isAnnotationPresent(o.class)) continue;
                Class<?>[] arrclass = method.getParameterTypes();
                if (arrclass.length != 1) {
                    throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation, but requires " + arrclass.length + " arguments.  Event subscriber methods must require a single argument.");
                }
                d d2 = new d(method);
                if (hashMap.containsKey(d2)) continue;
                hashMap.put(d2, method);
            }
        }
        return jl.a(hashMap.values());
    }

    private static n a(Object object, Method method) {
        n n2 = b.a(method) ? new n(object, method) : new s(object, method);
        return n2;
    }

    private static boolean a(Method method) {
        return method.getAnnotation(a.class) != null;
    }

    static /* synthetic */ jl a(Class class_) {
        return b.c(class_);
    }
}

