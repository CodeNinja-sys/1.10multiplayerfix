/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bl;
import a.a.a.a.a.bu;
import a.a.a.a.c.ad;
import a.a.a.a.c.b;
import java.util.Iterator;

class bm
extends b {
    final /* synthetic */ bl a;

    bm(bl bl2) {
        this.a = bl2;
    }

    @Override
    public ad a() {
        return new bu(this.a);
    }

    @Override
    public int size() {
        return this.a.p;
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

