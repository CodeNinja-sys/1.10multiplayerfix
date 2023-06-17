/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.ov;
import com.a.a.d.yd;
import java.io.Serializable;
import java.util.List;

final class bj
extends yd
implements Serializable {
    static final bj a = new bj();
    private static final long b = 0L;

    bj() {
    }

    @Override
    public int compare(Object object, Object object2) {
        return 0;
    }

    @Override
    public List a(Iterable iterable) {
        return ov.a(iterable);
    }

    @Override
    public jl b(Iterable iterable) {
        return jl.a(iterable);
    }

    @Override
    public yd a() {
        return this;
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}

