/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.bj;
import org.lwjgl.x;

public final class z
extends ar {
    private static final bj b = au.a(z.class, "CL_COMMAND_QUEUE_UTIL");
    private final ae c;
    private final as d;

    z(long l2, ab ab2, ae ae2) {
        super(l2, ab2);
        if (this.b()) {
            this.c = ae2;
            this.d = new as();
            ab2.e().a(this);
        } else {
            this.c = null;
            this.d = null;
        }
    }

    public ae d() {
        return this.c;
    }

    public ag a(long l2) {
        return (ag)this.d.a(l2);
    }

    public int a(int n2) {
        return b.a(this, n2);
    }

    as e() {
        return this.d;
    }

    void a(x x2) {
        if (x2 != null) {
            new ag(x2.d(x2.e()), this);
        }
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
                ((ab)this.m()).e().b(this);
            }
        }
    }
}

