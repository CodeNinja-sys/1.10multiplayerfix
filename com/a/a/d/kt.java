/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.iz;
import com.a.a.d.kk;
import java.util.Iterator;

final class kt
extends iz {
    private final transient kk a;
    private static final long b = 0L;

    kt(kk kk2) {
        this.a = kk2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public agi aO_() {
        return this.a.G();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        for (iz iz2 : this.a.b.aU_()) {
            n2 = iz2.a(arrobject, n2);
        }
        return n2;
    }

    @Override
    public int size() {
        return this.a.g();
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

