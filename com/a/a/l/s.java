/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import java.io.Serializable;

final class s
extends ak
implements Serializable {
    static final s a = new s();
    private static final long b = 1L;

    private s() {
    }

    protected Integer a(String string) {
        return Integer.decode(string);
    }

    protected String a(Integer n2) {
        return n2.toString();
    }

    public String toString() {
        return "Ints.stringConverter()";
    }

    private Object c() {
        return a;
    }

    @Override
    protected /* synthetic */ Object b(Object object) {
        return this.a((Integer)object);
    }

    @Override
    protected /* synthetic */ Object c(Object object) {
        return this.a((String)object);
    }
}

