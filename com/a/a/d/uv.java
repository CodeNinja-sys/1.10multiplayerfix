/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.gs;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class uv
extends gs
implements bw,
Serializable {
    final Map a;
    final bw b;
    bw c;
    transient Set d;
    private static final long e = 0L;

    uv(bw bw2, bw bw3) {
        this.a = Collections.unmodifiableMap(bw2);
        this.b = bw2;
        this.c = bw3;
    }

    @Override
    protected Map a() {
        return this.a;
    }

    @Override
    public Object a(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bw aT_() {
        bw bw2 = this.c;
        return bw2 == null ? (this.c = new uv(this.b.aT_(), this)) : bw2;
    }

    @Override
    public Set c() {
        Set set = this.d;
        return set == null ? (this.d = Collections.unmodifiableSet(this.b.c())) : set;
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

