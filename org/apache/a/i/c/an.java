/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.e.a;
import org.apache.a.e.h;
import org.apache.a.r;

class an {
    private final Map a = new ConcurrentHashMap();
    private final Map b = new ConcurrentHashMap();
    private volatile h c;
    private volatile a d;

    an() {
    }

    public h a() {
        return this.c;
    }

    public void a(h h2) {
        this.c = h2;
    }

    public a b() {
        return this.d;
    }

    public void a(a a2) {
        this.d = a2;
    }

    public h a(r r2) {
        return (h)this.a.get(r2);
    }

    public void a(r r2, h h2) {
        this.a.put(r2, h2);
    }

    public a b(r r2) {
        return (a)this.b.get(r2);
    }

    public void a(r r2, a a2) {
        this.b.put(r2, a2);
    }
}

