/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bb;
import a.a.a.a.b.bc;
import a.a.a.a.b.bf;
import a.a.a.a.b.dh;
import a.a.a.a.b.v;
import java.util.Iterator;

final class bg
extends v {
    final /* synthetic */ bb a;

    private bg(bb bb2) {
        this.a = bb2;
    }

    @Override
    public dh a() {
        return new bf(this.a);
    }

    @Override
    public int size() {
        return this.a.q;
    }

    @Override
    public boolean a(long l2) {
        return this.a.b(l2);
    }

    @Override
    public boolean g(long l2) {
        int n2 = this.a.q;
        this.a.a(l2);
        return this.a.q != n2;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    /* synthetic */ bg(bb bb2, bc bc2) {
        this(bb2);
    }
}

