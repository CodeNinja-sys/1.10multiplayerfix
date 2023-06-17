/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bf;
import java.util.AbstractCollection;
import java.util.Iterator;

class bi
extends AbstractCollection {
    final /* synthetic */ bf a;

    bi(bf bf2) {
        this.a = bf2;
    }

    @Override
    public Iterator iterator() {
        return this.a.aX_();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.c(object);
    }

    @Override
    public void clear() {
        this.a.d();
    }

    @Override
    public int size() {
        return this.a.n();
    }
}

