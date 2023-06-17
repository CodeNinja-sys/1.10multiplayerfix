/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.p;
import java.util.concurrent.TimeUnit;

class n
extends p {
    n() {
    }

    @Override
    protected void a(l l2, long l3, TimeUnit timeUnit) {
        cl.a(l2.k == null, (Object)"expireAfterAccess already set");
        l2.j = l3;
        l2.k = timeUnit;
    }
}

