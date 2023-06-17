/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.iq;
import com.a.a.d.iz;
import com.a.a.d.jl;
import com.a.a.d.lo;
import com.a.a.d.nj;
import com.a.a.d.yw;
import java.util.Iterator;

final class zk
extends lo {
    private final Object[] c;
    final transient Object[] a;
    private final transient int d;
    private final transient int e;

    zk(Object[] arrobject, int n2, Object[] arrobject2, int n3) {
        this.c = arrobject;
        this.a = arrobject2;
        this.d = n3;
        this.e = n2;
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        int n2 = iq.a(object.hashCode());
        Object object2;
        while ((object2 = this.a[n2 & this.d]) != null) {
            if (object2.equals(object)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    @Override
    public int size() {
        return this.c.length;
    }

    @Override
    public agi aO_() {
        return nj.b(this.c);
    }

    @Override
    int a(Object[] arrobject, int n2) {
        System.arraycopy(this.c, 0, arrobject, n2, this.c.length);
        return n2 + this.c.length;
    }

    @Override
    jl m() {
        return new yw((iz)this, this.c);
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.e;
    }

    @Override
    boolean aQ_() {
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

