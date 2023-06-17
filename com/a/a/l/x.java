/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import java.io.Serializable;

final class x
extends ak
implements Serializable {
    static final x a = new x();
    private static final long b = 1L;

    private x() {
    }

    protected Long a(String string) {
        return Long.decode(string);
    }

    protected String a(Long l2) {
        return l2.toString();
    }

    public String toString() {
        return "Longs.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Long)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

