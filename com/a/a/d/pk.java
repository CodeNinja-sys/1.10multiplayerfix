/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.pl;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

class pk
extends AbstractSequentialList
implements Serializable {
    final List a;
    final bl b;
    private static final long c = 0L;

    pk(List list, bl bl2) {
        this.a = (List)cl.a(list);
        this.b = (bl)cl.a(bl2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public ListIterator listIterator(int n2) {
        return new pl(this, this.a.listIterator(n2));
    }
}

