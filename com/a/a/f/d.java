/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cc;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

final class d {
    private final String a;
    private final List b;

    d(Method method) {
        this.a = method.getName();
        this.b = Arrays.asList(method.getParameterTypes());
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public boolean equals(Object object) {
        if (object instanceof d) {
            d d2 = (d)object;
            return this.a.equals(d2.a) && this.b.equals(d2.b);
        }
        return false;
    }
}

