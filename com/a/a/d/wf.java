/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.uj;
import com.a.a.d.vi;
import com.a.a.d.wg;
import java.util.Collection;
import java.util.Set;

final class wf
extends uj {
    private final vi a;

    wf(vi vi2) {
        this.a = (vi)cl.a(vi2);
    }

    @Override
    public int size() {
        return this.a.q().size();
    }

    @Override
    protected Set a() {
        return new wg(this);
    }

    void a(Object object) {
        this.a.q().remove(object);
    }

    public Collection b(Object object) {
        return this.containsKey(object) ? this.a.c(object) : null;
    }

    public Collection c(Object object) {
        return this.containsKey(object) ? this.a.d(object) : null;
    }

    @Override
    public Set keySet() {
        return this.a.q();
    }

    @Override
    public boolean isEmpty() {
        return this.a.o();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.f(object);
    }

    @Override
    public void clear() {
        this.a.h();
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.c(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.b(object);
    }

    static /* synthetic */ vi a(wf wf2) {
        return wf2.a;
    }
}

