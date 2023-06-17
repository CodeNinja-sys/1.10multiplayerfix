/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.a;
import com.a.a.c.an;
import com.a.a.d.jt;
import com.a.a.d.sz;
import com.a.a.n.a.gk;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

public abstract class d
extends a
implements an {
    protected d() {
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
        LinkedHashMap linkedHashMap = sz.d();
        for (Object t2 : iterable) {
            if (linkedHashMap.containsKey(t2)) continue;
            linkedHashMap.put(t2, this.f(t2));
        }
        return jt.b(linkedHashMap);
    }

    @Override
    public final Object a(Object object) {
        return this.c(object);
    }

    @Override
    public void d(Object object) {
        throw new UnsupportedOperationException();
    }
}

