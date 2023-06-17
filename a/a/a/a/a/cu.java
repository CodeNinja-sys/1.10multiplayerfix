/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import a.a.a.a.a.cr;
import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.n;
import a.a.a.a.c.o;
import java.util.Collection;
import java.util.Iterator;

public abstract class cu
extends n {
    protected cu() {
    }

    @Override
    public boolean e(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return o.a;
    }

    @Override
    public int[] b(int[] arrn) {
        return arrn;
    }

    @Override
    public int[] f() {
        return ch.a;
    }

    @Override
    public boolean f(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean d(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean b(cs cs2) {
        return cs2.isEmpty();
    }

    public cr bF_() {
        return di.a;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Collection)) {
            return false;
        }
        return ((Collection)object).isEmpty();
    }

    @Override
    public /* synthetic */ dh a() {
        return this.bF_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bF_();
    }
}

