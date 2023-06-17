/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.b;
import a.a.a.a.b.d;
import a.a.a.a.b.dh;
import a.a.a.a.b.v;
import java.util.Iterator;

class c
extends v {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
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
    public dh a() {
        return new d(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

