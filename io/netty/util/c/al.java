/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ag;
import io.netty.util.c.e;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class al {
    static ThreadLocal k;
    static final AtomicInteger l;
    Object[] m;
    int n;
    int o;
    Map p;
    e q;
    ag r;
    Map s;
    Map t;
    StringBuilder u;
    Map v;
    Map w;

    al(Object[] arrobject) {
        this.m = arrobject;
    }

    static {
        l = new AtomicInteger();
    }
}

