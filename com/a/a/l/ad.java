/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import java.io.Serializable;

final class ad
extends ak
implements Serializable {
    static final ad a = new ad();
    private static final long b = 1L;

    private ad() {
    }

    protected Short a(String string) {
        return Short.decode(string);
    }

    protected String a(Short s2) {
        return s2.toString();
    }

    public String toString() {
        return "Shorts.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Short)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

