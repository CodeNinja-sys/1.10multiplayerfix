/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.ab;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.a.v;
import org.lwjgl.util.a.a.w;

class y
implements ab {
    static final /* synthetic */ boolean a;

    private y() {
    }

    public void a(i i2, g g2, long l2) {
        i2.b(6);
        i2.b(g2.e.d);
        i2.b(g2.b.e.d);
        while (!v.a(g2.f)) {
            g2.f.f = true;
            --l2;
            g2 = g2.c;
            i2.b(g2.b.e.d);
        }
        if (!a && l2 != 0L) {
            throw new AssertionError();
        }
        i2.h();
    }

    /* synthetic */ y(w w2) {
        this();
    }

    static {
        a = !v.class.desiredAssertionStatus();
    }
}

