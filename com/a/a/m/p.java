/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.d.gw;
import com.a.a.d.nj;
import com.a.a.m.o;
import com.a.a.m.q;
import com.a.a.m.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class p
extends gw {
    private final Map.Entry a;

    static Set a(Set set) {
        return new q(set);
    }

    private static Iterator b(Iterator iterator) {
        return nj.a(iterator, new r());
    }

    private p(Map.Entry entry) {
        this.a = (Map.Entry)cl.a(entry);
    }

    @Override
    protected Map.Entry a() {
        return this.a;
    }

    @Override
    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }

    static /* synthetic */ Iterator a(Iterator iterator) {
        return p.b(iterator);
    }

    /* synthetic */ p(Map.Entry entry, o o2) {
        this(entry);
    }
}

