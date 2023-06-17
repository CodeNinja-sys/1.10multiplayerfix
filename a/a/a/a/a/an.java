/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ai;
import a.a.a.a.a.aj;
import a.a.a.a.a.am;
import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.du;
import a.a.a.a.a.eh;
import a.a.a.a.a.w;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class an
extends w {
    final /* synthetic */ ai a;

    private an(ai ai2) {
        this.a = ai2;
    }

    public du h(int n2) {
        return new am(this.a, n2);
    }

    public du k() {
        return new am(this.a);
    }

    @Override
    public int size() {
        return this.a.s;
    }

    @Override
    public boolean a(int n2) {
        return this.a.b(n2);
    }

    @Override
    public boolean g(int n2) {
        int n3 = this.a.s;
        this.a.a(n2);
        return this.a.s != n3;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public int c() {
        if (this.a.s == 0) {
            throw new NoSuchElementException();
        }
        return this.a.j[this.a.n];
    }

    @Override
    public int d() {
        if (this.a.s == 0) {
            throw new NoSuchElementException();
        }
        return this.a.j[this.a.o];
    }

    @Override
    public cy b() {
        return null;
    }

    @Override
    public final eh c(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final eh b(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final eh a(int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ cr bF_() {
        return this.k();
    }

    @Override
    public /* synthetic */ cr d(int n2) {
        return this.h(n2);
    }

    @Override
    public /* synthetic */ dh a() {
        return this.k();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k();
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }

    /* synthetic */ an(ai ai2, aj aj2) {
        this(ai2);
    }
}

