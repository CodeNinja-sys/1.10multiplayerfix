/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.b;
import io.netty.util.c;
import java.util.concurrent.atomic.AtomicReference;

final class g
extends AtomicReference
implements b {
    private static final long a = -2661411462200283011L;
    private final g b;
    private final c c;
    private g d;
    private g e;
    private volatile boolean f;

    g(g g2, c c2) {
        this.b = g2;
        this.c = c2;
    }

    g(c c2) {
        this.b = this;
        this.c = c2;
    }

    @Override
    public c a() {
        return this.c;
    }

    @Override
    public Object a(Object object) {
        while (!this.compareAndSet(null, object)) {
            Object v2 = this.get();
            if (v2 == null) continue;
            return v2;
        }
        return null;
    }

    @Override
    public Object b() {
        this.f = true;
        Object var1_1 = this.getAndSet(null);
        this.d();
        return var1_1;
    }

    @Override
    public void c() {
        this.f = true;
        this.set(null);
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d() {
        g g2 = this.b;
        synchronized (g2) {
            if (this.d != null) {
                this.d.e = this.e;
                if (this.e != null) {
                    this.e.d = this.d;
                }
            }
        }
    }

    static /* synthetic */ boolean a(g g2) {
        return g2.f;
    }

    static /* synthetic */ c b(g g2) {
        return g2.c;
    }

    static /* synthetic */ g c(g g2) {
        return g2.e;
    }

    static /* synthetic */ g a(g g2, g g3) {
        g2.e = g3;
        return g2.e;
    }

    static /* synthetic */ g b(g g2, g g3) {
        g2.d = g3;
        return g2.d;
    }
}

