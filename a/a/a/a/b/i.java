/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.cy;
import a.a.a.a.b.dh;
import a.a.a.a.b.ei;
import a.a.a.a.b.g;
import a.a.a.a.b.h;
import a.a.a.a.b.j;
import a.a.a.a.b.w;
import java.util.Comparator;
import java.util.Iterator;

public class i
extends w {
    final /* synthetic */ h a;

    protected i(h h2) {
        this.a = h2;
    }

    @Override
    public boolean a(long l2) {
        return this.a.b(l2);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public cy b() {
        return this.a.n();
    }

    @Override
    public long c() {
        return this.a.l();
    }

    @Override
    public long d() {
        return this.a.m();
    }

    @Override
    public ei b(long l2) {
        return this.a.g(l2).g();
    }

    @Override
    public ei c(long l2) {
        return this.a.f(l2).g();
    }

    @Override
    public ei a(long l2, long l3) {
        return this.a.a(l2, l3).g();
    }

    @Override
    public cr d(long l2) {
        return new j(this.a.h().c(new g(l2, (Object)null)));
    }

    @Override
    public cr bH_() {
        return new j(this.a.h().c());
    }

    @Override
    public /* synthetic */ dh a() {
        return this.bH_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bH_();
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }
}

