/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.cy;
import a.a.a.a.a.dh;
import a.a.a.a.a.eh;
import a.a.a.a.a.g;
import a.a.a.a.a.h;
import a.a.a.a.a.j;
import a.a.a.a.a.w;
import java.util.Comparator;
import java.util.Iterator;

public class i
extends w {
    final /* synthetic */ h a;

    protected i(h h2) {
        this.a = h2;
    }

    @Override
    public boolean a(int n2) {
        return this.a.b(n2);
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
    public int c() {
        return this.a.l();
    }

    @Override
    public int d() {
        return this.a.m();
    }

    @Override
    public eh b(int n2) {
        return this.a.j(n2).g();
    }

    @Override
    public eh c(int n2) {
        return this.a.i(n2).g();
    }

    @Override
    public eh a(int n2, int n3) {
        return this.a.b(n2, n3).g();
    }

    @Override
    public cr d(int n2) {
        return new j(this.a.h().c(new g(n2, (Object)null)));
    }

    @Override
    public cr bF_() {
        return new j(this.a.h().c());
    }

    @Override
    public /* synthetic */ dh a() {
        return this.bF_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.bF_();
    }

    public /* synthetic */ Comparator comparator() {
        return this.b();
    }
}

