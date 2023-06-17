/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.b;
import a.a.a.a.b.f;
import a.a.a.a.c.ad;
import java.util.Iterator;

class e
extends a.a.a.a.c.b {
    final /* synthetic */ b a;

    e(b b2) {
        this.a = b2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.containsValue(object);
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
    public ad a() {
        return new f(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

