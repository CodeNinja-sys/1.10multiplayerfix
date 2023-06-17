/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.n;
import com.sun.jna.t;
import java.lang.reflect.Method;

public class af
extends t {
    private final Method a;

    af(Class class_, n n2, Object[] arrobject, Method method) {
        super(class_, n2, arrobject);
        this.a = method;
    }

    public Method c() {
        return this.a;
    }
}

