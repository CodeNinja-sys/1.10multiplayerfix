/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.al;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ay;

public final class ak
extends ar {
    private static final al b = (al)au.a(ak.class, "CL_KERNEL_UTIL");

    ak(long l2, ay ay2) {
        super(l2, ay2);
        if (this.b()) {
            ay2.h().a(this);
        }
    }

    public ak a(int n2, byte by2) {
        b.a(this, n2, by2);
        return this;
    }

    public ak a(int n2, short s2) {
        b.a(this, n2, s2);
        return this;
    }

    public ak a(int n2, int n3) {
        b.a(this, n2, n3);
        return this;
    }

    public ak a(int n2, long l2) {
        b.a(this, n2, l2);
        return this;
    }

    public ak a(int n2, float f2) {
        b.a(this, n2, f2);
        return this;
    }

    public ak a(int n2, double d2) {
        b.a(this, n2, d2);
        return this;
    }

    public ak a(int n2, aq aq2) {
        b.a(this, n2, aq2);
        return this;
    }

    public ak b(int n2, long l2) {
        b.b(this, n2, l2);
        return this;
    }

    public String a(int n2) {
        return b.e(this, n2);
    }

    public int b(int n2) {
        return b.a(this, n2);
    }

    public long a(ae ae2, int n2) {
        return b.a(this, ae2, n2);
    }

    public long[] b(ae ae2, int n2) {
        return b.b(this, ae2, n2);
    }

    public long c(ae ae2, int n2) {
        return b.c(this, ae2, n2);
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
                ((ay)this.m()).h().b(this);
            }
        }
    }
}

