/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.ab;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.a.v;
import org.lwjgl.util.a.a.w;

class aa
implements ab {
    static final /* synthetic */ boolean a;

    private aa() {
    }

    public void a(i i2, g g2, long l2) {
        if (!a && l2 != 1L) {
            throw new AssertionError();
        }
        i2.m = v.a(g2.f, i2.m);
    }

    /* synthetic */ aa(w w2) {
        this();
    }

    static {
        a = !v.class.desiredAssertionStatus();
    }
}

