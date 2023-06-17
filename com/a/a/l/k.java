/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import java.io.Serializable;

final class k
extends ak
implements Serializable {
    static final k a = new k();
    private static final long b = 1L;

    private k() {
    }

    protected Double a(String string) {
        return Double.valueOf(string);
    }

    protected String a(Double d2) {
        return d2.toString();
    }

    public String toString() {
        return "Doubles.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Double)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

