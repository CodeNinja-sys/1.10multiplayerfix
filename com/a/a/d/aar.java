/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aas;
import com.a.a.d.jt;
import java.util.AbstractSet;
import java.util.Iterator;

final class aar
extends AbstractSet {
    private final jt a;
    private final int b;

    aar(jt jt2, int n2) {
        this.a = jt2;
        this.b = n2;
    }

    @Override
    public Iterator iterator() {
        return new aas(this);
    }

    @Override
    public int size() {
        return Integer.bitCount(this.b);
    }

    @Override
    public boolean contains(Object object) {
        Integer n2 = (Integer)this.a.get(object);
        return n2 != null && (this.b & 1 << n2) != 0;
    }

    static /* synthetic */ jt a(aar aar2) {
        return aar2.a;
    }

    static /* synthetic */ int b(aar aar2) {
        return aar2.b;
    }
}

