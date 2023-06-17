/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.jb;
import com.a.a.d.yc;
import java.util.Collection;

abstract class ja
extends jb {
    Object[] a;
    int b;

    ja(int n2) {
        cl.a(n2, "initialCapacity");
        this.a = new Object[n2];
        this.b = 0;
    }

    private void a(int n2) {
        if (this.a.length < n2) {
            this.a = yc.b(this.a, ja.a(this.a.length, n2));
        }
    }

    public ja a(Object object) {
        com.a.a.b.cl.a(object);
        this.a(this.b + 1);
        this.a[this.b++] = object;
        return this;
    }

    @Override
    public jb a(Object ... arrobject) {
        yc.a(arrobject);
        this.a(this.b + arrobject.length);
        System.arraycopy(arrobject, 0, this.a, this.b, arrobject.length);
        this.b += arrobject.length;
        return this;
    }

    @Override
    public jb a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            this.a(this.b + collection.size());
        }
        super.a(iterable);
        return this;
    }

    @Override
    public /* synthetic */ jb b(Object object) {
        return this.a(object);
    }
}

