/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ai;
import a.a.a.a.a.aq;
import a.a.a.a.c.ap;

final class ar
extends aq
implements ap {
    final /* synthetic */ ai a;

    @Override
    public Object previous() {
        return this.a.k[this.f()];
    }

    public void set(Object object) {
        throw new UnsupportedOperationException();
    }

    public void add(Object object) {
        throw new UnsupportedOperationException();
    }

    public ar(ai ai2) {
        this.a = ai2;
        super(ai2, null);
    }

    @Override
    public Object next() {
        return this.a.k[this.e()];
    }
}

