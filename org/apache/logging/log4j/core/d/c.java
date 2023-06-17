/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import org.apache.logging.log4j.core.d.d;
import org.apache.logging.log4j.core.d.f;

public final class c
implements f {
    private static final int a = 1023;
    private static c b = new c();
    private volatile long c = System.currentTimeMillis();
    private volatile short d = 0;
    private final Thread e = new d(this, "Clock Updater Thread");

    private c() {
        this.e.setDaemon(true);
        this.e.start();
    }

    public static c a() {
        return b;
    }

    @Override
    public long b() {
        this.d = (short)(this.d + 1);
        if ((this.d & 0x3FF) == 1023) {
            this.c = System.currentTimeMillis();
        }
        return this.c;
    }

    static /* synthetic */ long a(c c2, long l2) {
        c2.c = l2;
        return c2.c;
    }
}

