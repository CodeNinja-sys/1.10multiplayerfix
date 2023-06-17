/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.lang.management.ManagementFactory;
import org.apache.logging.log4j.core.a.c.f;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.h;

public class d
implements v {
    private static long a = ManagementFactory.getRuntimeMXBean().getStartTime();
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.d.d.k();
    private boolean c = false;
    private f d;

    @Override
    public void a(f f2) {
        this.d = f2;
        if (a == 0L) {
            this.c = true;
        }
    }

    @Override
    public boolean a(h h2) {
        if (this.c) {
            return false;
        }
        this.c = true;
        return this.d.n() < a;
    }

    public String toString() {
        return "OnStartupTriggeringPolicy";
    }

    public static d a() {
        return new d();
    }
}

