/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.ab;
import com.a.a.c.an;
import com.a.a.c.ao;
import com.a.a.c.bk;
import com.a.a.c.bo;
import com.a.a.c.f;
import com.a.a.d.jt;
import com.a.a.n.a.gk;
import java.util.concurrent.ExecutionException;

class bn
extends bo
implements an {
    private static final long b = 1L;

    bn(f f2, ab ab2) {
        super(new ao(f2, (ab)cl.a(ab2)), null);
    }

    @Override
    public Object f(Object object) {
        return this.a.c(object);
    }

    @Override
    public Object c(Object object) {
        try {
            return this.f(object);
        }
        catch (ExecutionException executionException) {
            throw new gk(executionException.getCause());
        }
    }

    @Override
    public jt c(Iterable iterable) {
        return this.a.b(iterable);
    }

    @Override
    public void d(Object object) {
        this.a.e(object);
    }

    @Override
    public final Object a(Object object) {
        return this.c(object);
    }

    @Override
    Object f() {
        return new bk(this.a);
    }
}

