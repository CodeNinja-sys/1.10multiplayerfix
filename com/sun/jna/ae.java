/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.n;
import com.sun.jna.s;
import java.lang.reflect.Method;

public class ae
extends s {
    private Method a;

    ae(n n2, Object[] arrobject, int n3, Method method) {
        super(n2, arrobject, n3);
        this.a = method;
    }

    public Method d() {
        return this.a;
    }
}

