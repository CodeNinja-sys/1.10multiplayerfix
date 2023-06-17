/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.as;
import com.a.a.d.cl;
import com.a.a.d.sz;
import com.a.a.d.vi;
import com.a.a.d.wo;
import com.a.a.d.wq;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class wn
extends as {
    final vi b;

    wn(vi vi2) {
        this.b = vi2;
    }

    @Override
    Iterator b() {
        return new wo(this, this.b.c().entrySet().iterator());
    }

    @Override
    int c() {
        return this.b.c().size();
    }

    @Override
    Set f() {
        return new wq(this);
    }

    @Override
    public boolean contains(Object object) {
        return this.b.f(object);
    }

    @Override
    public Iterator iterator() {
        return sz.a(this.b.l().iterator());
    }

    @Override
    public int a(Object object) {
        Collection collection = (Collection)sz.a(this.b.c(), object);
        return collection == null ? 0 : collection.size();
    }

    @Override
    public int b(Object object, int n2) {
        cl.a(n2, "occurrences");
        if (n2 == 0) {
            return this.a(object);
        }
        Collection collection = (Collection)sz.a(this.b.c(), object);
        if (collection == null) {
            return 0;
        }
        int n3 = collection.size();
        if (n2 >= n3) {
            collection.clear();
        } else {
            Iterator iterator = collection.iterator();
            for (int i2 = 0; i2 < n2; ++i2) {
                iterator.next();
                iterator.remove();
            }
        }
        return n3;
    }

    @Override
    public void clear() {
        this.b.h();
    }

    @Override
    public Set d() {
        return this.b.q();
    }
}

