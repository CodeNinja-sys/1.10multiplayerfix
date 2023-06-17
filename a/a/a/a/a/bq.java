/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bl;
import a.a.a.a.a.bm;
import a.a.a.a.a.bp;
import a.a.a.a.a.dh;
import a.a.a.a.a.v;
import java.util.Iterator;

final class bq
extends v {
    final /* synthetic */ bl a;

    private bq(bl bl2) {
        this.a = bl2;
    }

    @Override
    public dh a() {
        return new bp(this.a);
    }

    @Override
    public int size() {
        return this.a.p;
    }

    @Override
    public boolean a(int n2) {
        return this.a.b(n2);
    }

    @Override
    public boolean g(int n2) {
        int n3 = this.a.p;
        this.a.a(n2);
        return this.a.p != n3;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    /* synthetic */ bq(bl bl2, bm bm2) {
        this(bl2);
    }
}

