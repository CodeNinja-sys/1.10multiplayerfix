/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ak;
import org.lwjgl.opencl.al;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

final class br
extends bk
implements al {
    private br() {
    }

    public void a(ak ak2, int n2, byte by2) {
        CL10.a(ak2, n2, 1L, d.a(1).put(0, by2));
    }

    public void a(ak ak2, int n2, short s2) {
        CL10.a(ak2, n2, 2L, d.a().put(0, s2));
    }

    public void a(ak ak2, int n2, int n3) {
        CL10.a(ak2, n2, 4L, (Buffer)d.b().put(0, n3));
    }

    public void a(ak ak2, int n2, long l2) {
        CL10.a(ak2, n2, 8L, d.d().put(0, l2));
    }

    public void a(ak ak2, int n2, float f2) {
        CL10.a(ak2, n2, 4L, d.e().put(0, f2));
    }

    public void a(ak ak2, int n2, double d2) {
        CL10.a(ak2, n2, 8L, d.f().put(0, d2));
    }

    public void a(ak ak2, int n2, aq aq2) {
        CL10.a(ak2, n2, aq2);
    }

    public void b(ak ak2, int n2, long l2) {
        CL10.a(ak2, n2, l2);
    }

    protected int a(ak ak2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(ak2, n2, byteBuffer, x2);
    }

    public long a(ak ak2, ae ae2, int n2) {
        ae2.c();
        x x2 = d.g();
        CL10.a(ak2, ae2, n2, x2.a(), null);
        return x2.d(0);
    }

    public long[] b(ak ak2, ae ae2, int n2) {
        int n3;
        ae2.c();
        switch (n2) {
            case 4529: {
                n3 = 3;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported parameter: " + org.lwjgl.d.a(n2));
            }
        }
        x x2 = d.b(n3);
        CL10.a(ak2, ae2, n2, x2.a(), null);
        long[] arrl = new long[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrl[i2] = x2.d(i2);
        }
        return arrl;
    }

    public long c(ak ak2, ae ae2, int n2) {
        ae2.c();
        ByteBuffer byteBuffer = d.a(8);
        CL10.a(ak2, ae2, n2, byteBuffer, null);
        return byteBuffer.getLong(0);
    }

    /* synthetic */ br(bm bm2) {
        this();
    }
}

