/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bl;
import a.a.a.a.b.bm;
import a.a.a.a.b.bp;
import a.a.a.a.b.dh;
import a.a.a.a.b.v;
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
    public boolean a(long l2) {
        return this.a.b(l2);
    }

    @Override
    public boolean g(long l2) {
        int n2 = this.a.p;
        this.a.a(l2);
        return this.a.p != n2;
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

