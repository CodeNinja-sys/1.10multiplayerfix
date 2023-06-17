/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.g;

import io.netty.c.a.d.av;
import io.netty.c.a.d.bd;

public abstract class e
extends bd {
    protected e() {
        this(4096, 8192, 8192);
    }

    protected e(int n2, int n3, int n4) {
        super(n2, n3, n4 * 2, false);
    }

    protected e(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4 * 2, false, bl2);
    }

    @Override
    protected boolean a(av av2) {
        boolean bl2 = super.a(av2);
        if (bl2) {
            return true;
        }
        if (!av2.q().d("Content-Length")) {
            return true;
        }
        return bl2;
    }
}

