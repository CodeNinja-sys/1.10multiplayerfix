/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.bc;
import com.a.a.n.a.dc;
import java.util.concurrent.TimeUnit;

class dd
extends dc
implements bc {
    private final Object a;

    dd(Object object) {
        super(null);
        this.a = object;
    }

    @Override
    public Object get() {
        return this.a;
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public Object a(long l2, TimeUnit timeUnit) {
        cl.a((Object)timeUnit);
        return this.a;
    }
}

