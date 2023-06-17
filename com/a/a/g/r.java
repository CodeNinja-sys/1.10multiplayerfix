/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.g.aj;
import com.a.a.g.h;
import com.a.a.g.t;
import java.io.Serializable;
import java.util.zip.Checksum;

final class r
extends h
implements Serializable {
    private final dx a;
    private final int b;
    private final String c;
    private static final long d = 0L;

    r(dx dx2, int n2, String string) {
        this.a = (dx)cl.a(dx2);
        cl.a(n2 == 32 || n2 == 64, "bits (%s) must be either 32 or 64", new Object[]{n2});
        this.b = n2;
        this.c = (String)cl.a(string);
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public aj a() {
        return new t(this, (Checksum)this.a.a(), null);
    }

    public String toString() {
        return this.c;
    }

    static /* synthetic */ int a(r r2) {
        return r2.b;
    }
}

