/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.nj;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class ct
extends AbstractCollection {
    final Collection a;
    final bl b;

    ct(Collection collection, bl bl2) {
        this.a = (Collection)cl.a(collection);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return nj.a(this.a.iterator(), this.b);
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

