/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.bj;

public final class bb
extends ar {
    private static final bj b = au.a(bb.class, "CL_SAMPLER_UTIL");

    bb(long l2, ab ab2) {
        super(l2, ab2);
        if (this.b()) {
            ab2.h().a(this);
        }
    }

    public int a(int n2) {
        return b.a(this, n2);
    }

    public long b(int n2) {
        return b.d(this, n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int f() {
        try {
            int n2 = super.f();
            return n2;
        }
        finally {
            if (!this.b()) {
                ((ab)this.m()).h().b(this);
            }
        }
    }
}

