/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bb;
import a.a.a.a.a.bc;
import a.a.a.a.a.bf;
import a.a.a.a.a.dh;
import a.a.a.a.a.v;
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
    public boolean a(int n2) {
        return this.a.b(n2);
    }

    @Override
    public boolean g(int n2) {
        int n3 = this.a.q;
        this.a.a(n2);
        return this.a.q != n3;
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

