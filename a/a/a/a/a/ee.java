/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.du;
import a.a.a.a.a.v;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class ee
extends v
implements Serializable,
Cloneable {
    private static final long b = -7046029254386353129L;
    protected final int a;

    protected ee(int n2) {
        this.a = n2;
    }

    @Override
    public boolean e(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2) {
        return n2 == this.a;
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
    public int[] f() {
        int[] arrn = new int[]{this.a};
        return arrn;
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

    public du h() {
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

