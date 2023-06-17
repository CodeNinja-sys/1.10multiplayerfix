/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bb;
import a.a.a.a.b.bk;
import a.a.a.a.c.ad;
import a.a.a.a.c.b;
import java.util.Iterator;

class bc
extends b {
    final /* synthetic */ bb a;

    bc(bb bb2) {
        this.a = bb2;
    }

    @Override
    public ad a() {
        return new bk(this.a);
    }

    @Override
    public int size() {
        return this.a.q;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

