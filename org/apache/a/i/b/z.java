/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.c.s;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;

public class z
implements s {
    private final int a;
    private final long b;

    public z(int n2, int n3) {
        org.apache.a.o.a.a(n2, "Max retries");
        org.apache.a.o.a.a(n3, "Retry interval");
        this.a = n2;
        this.b = n3;
    }

    public z() {
        this(1, 1000);
    }

    public boolean a(x x2, int n2, g g2) {
        return n2 <= this.a && x2.a().b() == 503;
    }

    public long a() {
        return this.b;
    }
}

