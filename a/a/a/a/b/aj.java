/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.ar;
import a.a.a.a.c.ad;
import a.a.a.a.c.b;
import java.util.Iterator;

class aj
extends b {
    final /* synthetic */ ai a;

    aj(ai ai2) {
        this.a = ai2;
    }

    @Override
    public ad a() {
        return new ar(this.a);
    }

    @Override
    public int size() {
        return this.a.s;
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

