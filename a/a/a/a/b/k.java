/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.h;
import a.a.a.a.b.l;
import a.a.a.a.c.ad;
import a.a.a.a.c.b;
import java.util.Iterator;

public class k
extends b {
    final /* synthetic */ h a;

    protected k(h h2) {
        this.a = h2;
    }

    @Override
    public ad a() {
        return new l(this.a.h().c());
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
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

