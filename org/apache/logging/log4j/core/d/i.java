/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import org.apache.logging.log4j.core.d.f;
import org.apache.logging.log4j.core.d.j;

public final class i
implements f {
    private static i a = new i();
    private volatile long b = System.currentTimeMillis();
    private final Thread c = new j(this, "Clock Updater Thread");

    private i() {
        this.c.setDaemon(true);
        this.c.start();
    }

    public static i a() {
        return a;
    }

    @Override
    public long b() {
        return this.b;
    }

    static /* synthetic */ long a(i i2, long l2) {
        i2.b = l2;
        return i2.b;
    }
}

