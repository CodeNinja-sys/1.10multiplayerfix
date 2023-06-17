/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import java.io.Serializable;

final class o
extends ak
implements Serializable {
    static final o a = new o();
    private static final long b = 1L;

    private o() {
    }

    protected Float a(String string) {
        return Float.valueOf(string);
    }

    protected String a(Float f2) {
        return f2.toString();
    }

    public String toString() {
        return "Floats.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Float)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

