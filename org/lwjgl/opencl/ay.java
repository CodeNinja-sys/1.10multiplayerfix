/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ak;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.az;
import org.lwjgl.x;

public final class ay
extends ar {
    private static final az b = (az)au.a(ay.class, "CL_PROGRAM_UTIL");
    private final as c;

    ay(long l2, ab ab2) {
        super(l2, ab2);
        if (this.b()) {
            ab2.i().a(this);
            this.c = new as();
        } else {
            this.c = null;
        }
    }

    public ak a(long l2) {
        return (ak)this.c.a(l2);
    }

    public ak[] d() {
        return b.a(this);
    }

    public String a(int n2) {
        return b.e(this, n2);
    }

    public int b(int n2) {
        return b.a((aq)this, n2);
    }

    public long[] c(int n2) {
        return b.c(this, n2);
    }

    public ae[] e() {
        return b.b(this);
    }

    public ByteBuffer a(ByteBuffer byteBuffer) {
        return b.a(this, byteBuffer);
    }

    public ByteBuffer[] a(ByteBuffer[] arrbyteBuffer) {
        return b.a(this, arrbyteBuffer);
    }

    public String a(ae ae2, int n2) {
        return b.a(this, ae2, n2);
    }

    public int b(ae ae2, int n2) {
        return b.b(this, ae2, n2);
    }

    as h() {
        return this.c;
    }

    void a(x x2) {
        for (int i2 = x2.e(); i2 < x2.g(); ++i2) {
            long l2 = x2.d(i2);
            if (l2 == 0L) continue;
            new ak(l2, this);
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
                ((ab)this.m()).i().b(this);
            }
        }
    }
}

