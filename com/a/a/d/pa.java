/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class pa
extends AbstractList
implements Serializable,
RandomAccess {
    final Object a;
    final Object[] b;
    private static final long c = 0L;

    pa(Object object, Object[] arrobject) {
        this.a = object;
        this.b = (Object[])cl.a(arrobject);
    }

    @Override
    public int size() {
        return this.b.length + 1;
    }

    @Override
    public Object get(int n2) {
        cl.a(n2, this.size());
        return n2 == 0 ? this.a : this.b[n2 - 1];
    }
}

