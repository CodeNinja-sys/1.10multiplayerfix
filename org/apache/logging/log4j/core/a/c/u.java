/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import org.apache.logging.log4j.core.a.c.f;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.d.n;
import org.apache.logging.log4j.core.h;

public final class u
implements v {
    private long a;
    private final int b;
    private final boolean c;
    private f d;

    private u(int n2, boolean bl2) {
        this.b = n2;
        this.c = bl2;
    }

    @Override
    public void a(f f2) {
        this.d = f2;
        this.a = f2.p().a(f2.n(), this.b, this.c);
    }

    @Override
    public boolean a(h h2) {
        if (this.d.m() == 0L) {
            return false;
        }
        long l2 = System.currentTimeMillis();
        if (l2 > this.a) {
            this.a = this.d.p().a(l2, this.b, this.c);
            return true;
        }
        return false;
    }

    public String toString() {
        return "TimeBasedTriggeringPolicy";
    }

    public static u a(String string, String string2) {
        int n2 = n.a(string, 1);
        boolean bl2 = Boolean.parseBoolean(string2);
        return new u(n2, bl2);
    }
}

