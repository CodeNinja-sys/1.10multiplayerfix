/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.b;
import a.a.a.a.a.d;
import a.a.a.a.a.dh;
import a.a.a.a.a.v;
import java.util.Iterator;

class c
extends v {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
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
    public dh a() {
        return new d(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

