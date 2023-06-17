/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.p;
import java.util.concurrent.TimeUnit;

class x
extends p {
    x() {
    }

    @Override
    protected void a(l l2, long l3, TimeUnit timeUnit) {
        cl.a(l2.m == null, (Object)"refreshAfterWrite already set");
        l2.l = l3;
        l2.m = timeUnit;
    }
}

