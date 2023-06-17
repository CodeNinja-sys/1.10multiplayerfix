/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cs;
import a.a.a.a.b.dh;
import a.a.a.a.b.di;
import a.a.a.a.b.du;
import a.a.a.a.b.dv;
import a.a.a.a.b.dw;
import a.a.a.a.b.dx;
import a.a.a.a.b.q;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class dz
extends q
implements Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;
    private final long b;

    private dz(long l2) {
        this.b = l2;
    }

    @Override
    public long l(int n2) {
        if (n2 == 0) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public long d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(long l2) {
        return l2 == this.b;
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int n2, Collection collection) {
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
        long[] arrl = new long[]{this.b};
        return arrl;
    }

    @Override
    public dv e() {
        return di.a(this.b);
    }

    @Override
    public dv d() {
        return this.e();
    }

    @Override
    public dv f(int n2) {
        if (n2 > 1 || n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        dv dv2 = this.e();
        if (n2 == 1) {
            dv2.next();
        }
        return dv2;
    }

    @Override
    public du a(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        if (n2 != 0 || n3 != 1) {
            return dw.a;
        }
        return this;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public void g(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        return this;
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
    public boolean a(int n2, cs cs2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return this.e();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ dh a() {
        return this.d();
    }

    /* synthetic */ dz(long l2, dx dx2) {
        this(l2);
    }
}

