/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import a.a.a.a.b.cr;
import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.n;
import a.a.a.a.c.o;
import java.util.Collection;
import java.util.Iterator;

public abstract class cu
extends n {
    protected cu() {
    }

    @Override
    public boolean e(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(long l2) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return o.a;
    }

    @Override
    public long[] b(long[] arrl) {
        return arrl;
    }

    @Override
    public long[] f() {
        return ch.a;
    }

    @Override
    public boolean f(long l2) {
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

    public cr bH_() {
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
        return this.bH_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bH_();
    }
}

