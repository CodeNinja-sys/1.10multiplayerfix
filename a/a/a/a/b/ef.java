/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.dv;
import a.a.a.a.b.v;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class ef
extends v
implements Serializable,
Cloneable {
    private static final long b = -7046029254386353129L;
    protected final long a;

    protected ef(long l2) {
        this.a = l2;
    }

    @Override
    public boolean e(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(long l2) {
        return l2 == this.a;
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long[] f() {
        long[] arrl = new long[]{this.a};
        return arrl;
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

    public dv h() {
        return di.a(this.a);
    }

    @Override
    public int size() {
        return 1;
    }

    public Object clone() {
        return this;
    }

    @Override
    public /* synthetic */ dh a() {
        return this.h();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.h();
    }
}

