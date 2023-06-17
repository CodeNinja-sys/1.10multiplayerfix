/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.aj;
import a.a.a.a.b.am;
import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.dv;
import a.a.a.a.b.ei;
import a.a.a.a.b.w;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class an
extends w {
    final /* synthetic */ ai a;

    private an(ai ai2) {
        this.a = ai2;
    }

    public dv h(long l2) {
        return new am(this.a, l2);
    }

    public dv k() {
        return new am(this.a);
    }

    @Override
    public int size() {
        return this.a.s;
    }

    @Override
    public boolean a(long l2) {
        return this.a.b(l2);
    }

    @Override
    public boolean g(long l2) {
        int n2 = this.a.s;
        this.a.a(l2);
        return this.a.s != n2;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public long c() {
        if (this.a.s == 0) {
            throw new NoSuchElementException();
        }
        return this.a.j[this.a.n];
    }

    @Override
    public long d() {
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
    public final ei c(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ei b(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ei a(long l2, long l3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ cr bH_() {
        return this.k();
    }

    @Override
    public /* synthetic */ cr d(long l2) {
        return this.h(l2);
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

