/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ah;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.z;

public final class ag
extends ar {
    private static final ah b = (ah)au.a(ag.class, "CL_EVENT_UTIL");
    private final z c;

    ag(long l2, ab ab2) {
        this(l2, ab2, null);
    }

    ag(long l2, z z2) {
        this(l2, (ab)z2.m(), z2);
    }

    ag(long l2, ab ab2, z z2) {
        super(l2, ab2);
        if (this.b()) {
            this.c = z2;
            if (z2 == null) {
                ab2.j().a(this);
            } else {
                z2.e().a(this);
            }
        } else {
            this.c = null;
        }
    }

    public z d() {
        return this.c;
    }

    public int a(int n2) {
        return b.a((aq)this, n2);
    }

    public long b(int n2) {
        return b.a(this, n2);
    }

    as e() {
        if (this.c == null) {
            return ((ab)this.m()).j();
        }
        return this.c.e();
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
                if (this.c == null) {
                    ((ab)this.m()).j().b(this);
                } else {
                    this.c.e().b(this);
                }
            }
        }
    }
}

