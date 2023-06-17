/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.b;
import io.netty.util.c;
import io.netty.util.c.u;
import io.netty.util.d;
import io.netty.util.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class f
implements d {
    private static final AtomicReferenceFieldUpdater a;
    private static final int b = 4;
    private static final int c = 3;
    private volatile AtomicReferenceArray d;

    @Override
    public b a(c c2) {
        int n2;
        g g2;
        if (c2 == null) {
            throw new NullPointerException("key");
        }
        AtomicReferenceArray atomicReferenceArray = this.d;
        if (atomicReferenceArray == null && !a.compareAndSet(this, null, atomicReferenceArray = new AtomicReferenceArray(4))) {
            atomicReferenceArray = this.d;
        }
        if ((g2 = (g)atomicReferenceArray.get(n2 = f.b(c2))) == null) {
            g2 = new g(c2);
            if (atomicReferenceArray.compareAndSet(n2, null, g2)) {
                return g2;
            }
            g2 = (g)atomicReferenceArray.get(n2);
        }
        g g3 = g2;
        synchronized (g3) {
            g g4 = g2;
            while (true) {
                if (!g.a(g4) && g.b(g4) == c2) {
                    return g4;
                }
                g g5 = g.c(g4);
                if (g5 == null) {
                    g g6 = new g(g2, c2);
                    g.a(g4, g6);
                    g.b(g6, g4);
                    return g6;
                }
                g4 = g5;
            }
        }
    }

    private static int b(c c2) {
        return c2.b() & 3;
    }

    static {
        AtomicReferenceFieldUpdater<f, AtomicReferenceArray> atomicReferenceFieldUpdater = u.a(f.class, "attributes");
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(f.class, AtomicReferenceArray.class, "d");
        }
        a = atomicReferenceFieldUpdater;
    }
}

