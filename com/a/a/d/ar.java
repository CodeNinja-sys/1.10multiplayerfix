/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.an;
import java.util.AbstractCollection;
import java.util.Iterator;

class ar
extends AbstractCollection {
    final /* synthetic */ an a;

    ar(an an2) {
        this.a = an2;
    }

    @Override
    public Iterator iterator() {
        return this.a.k();
    }

    @Override
    public int size() {
        return this.a.g();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public void clear() {
        this.a.h();
    }
}

