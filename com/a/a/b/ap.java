/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.cl;
import java.io.Serializable;

final class ap
extends ak
implements Serializable {
    static final ap a = new ap();
    private static final long b = 0L;

    private ap() {
    }

    @Override
    protected Object c(Object object) {
        return object;
    }

    @Override
    protected Object b(Object object) {
        return object;
    }

    public ap c() {
        return this;
    }

    @Override
    public ak a(ak ak2) {
        return (ak)cl.a(ak2, (Object)"otherConverter");
    }

    public String toString() {
        return "Converter.identity()";
    }

    private Object d() {
        return a;
    }

    @Override
    public /* synthetic */ ak a() {
        return this.c();
    }
}

