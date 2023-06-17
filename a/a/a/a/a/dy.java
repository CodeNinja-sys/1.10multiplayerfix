/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cs;
import a.a.a.a.a.dh;
import a.a.a.a.a.di;
import a.a.a.a.a.dt;
import a.a.a.a.a.du;
import a.a.a.a.a.dv;
import a.a.a.a.a.dw;
import a.a.a.a.a.q;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class dy
extends q
implements Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;
    private final int b;

    private dy(int n2) {
        this.b = n2;
    }

    @Override
    public int q(int n2) {
        if (n2 == 0) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int d(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(int n2) {
        return n2 == this.b;
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
    public int[] f() {
        int[] arrn = new int[]{this.b};
        return arrn;
    }

    @Override
    public du e() {
        return di.a(this.b);
    }

    @Override
    public du d() {
        return this.e();
    }

    @Override
    public du h(int n2) {
        if (n2 > 1 || n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        du du2 = this.e();
        if (n2 == 1) {
            du2.next();
        }
        return du2;
    }

    @Override
    public dt c(int n2, int n3) {
        this.b(n2);
        this.b(n3);
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        if (n2 != 0 || n3 != 1) {
            return dv.a;
        }
        return this;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public void k(int n2) {
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
    public boolean f(int n2) {
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
        return this.c(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.h(n2);
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

    /* synthetic */ dy(int n2, dw dw2) {
        this(n2);
    }
}

