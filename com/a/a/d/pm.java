/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class pm
extends AbstractList
implements Serializable,
RandomAccess {
    final Object a;
    final Object b;
    final Object[] c;
    private static final long d = 0L;

    pm(Object object, Object object2, Object[] arrobject) {
        this.a = object;
        this.b = object2;
        this.c = (Object[])cl.a(arrobject);
    }

    @Override
    public int size() {
        return this.c.length + 2;
    }

    @Override
    public Object get(int n2) {
        switch (n2) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
        }
        cl.a(n2, this.size());
        return this.c[n2 - 2];
    }
}

