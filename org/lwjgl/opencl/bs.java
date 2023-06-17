/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.o;
import org.lwjgl.opencl.CL;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.CL10GL;
import org.lwjgl.opencl.CL11;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.a.a;
import org.lwjgl.opencl.a.b;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.an;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.ce;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.y;
import org.lwjgl.x;

final class bs
extends bk
implements an {
    private bs() {
    }

    protected int a(CLMem cLMem, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.b(cLMem, n2, byteBuffer, x2);
    }

    public CLMem a(ab ab2, long l2, b b2, long l3, long l4, long l5, Buffer buffer, IntBuffer intBuffer) {
        ByteBuffer byteBuffer = d.a(8);
        byteBuffer.putInt(0, b2.a());
        byteBuffer.putInt(4, b2.b());
        long l6 = org.lwjgl.opencl.x.B;
        org.lwjgl.a.a(l6);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        } else if (org.lwjgl.d.i) {
            intBuffer = d.b();
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage2D(ab2.a(), l2, o.a(byteBuffer, 0), l3, l4, l5, o.b(buffer) + (long)(buffer != null ? org.lwjgl.a.b(buffer, y.a(byteBuffer, l3, l4, l5)) : 0), o.b(intBuffer), l6), ab2);
        if (org.lwjgl.d.i) {
            ce.a(intBuffer.get(0));
        }
        return cLMem;
    }

    public CLMem a(ab ab2, long l2, b b2, long l3, long l4, long l5, long l6, long l7, Buffer buffer, IntBuffer intBuffer) {
        ByteBuffer byteBuffer = d.a(8);
        byteBuffer.putInt(0, b2.a());
        byteBuffer.putInt(4, b2.b());
        long l8 = org.lwjgl.opencl.x.C;
        org.lwjgl.a.a(l8);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        } else if (org.lwjgl.d.i) {
            intBuffer = d.b();
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage3D(ab2.a(), l2, o.a(byteBuffer, 0), l3, l4, l5, l6, l7, o.b(buffer) + (long)(buffer != null ? org.lwjgl.a.b(buffer, y.a(byteBuffer, l3, l4, l5, l6, l7)) : 0), o.b(intBuffer), l8), ab2);
        if (org.lwjgl.d.i) {
            ce.a(intBuffer.get(0));
        }
        return cLMem;
    }

    public CLMem a(CLMem cLMem, long l2, int n2, a a2, IntBuffer intBuffer) {
        x x2 = d.b(2);
        x2.a((long)a2.a());
        x2.a((long)a2.b());
        return CL11.a(cLMem, l2, n2, x2.a(), intBuffer);
    }

    public ByteBuffer a(CLMem cLMem) {
        long l2;
        cLMem.c();
        if (org.lwjgl.d.i && ((l2 = this.d(cLMem, 4353)) & 8L) != 8L) {
            throw new IllegalArgumentException("The specified CLMem object does not use host memory.");
        }
        l2 = this.b((aq)cLMem, 4354);
        if (l2 == 0L) {
            return null;
        }
        long l3 = this.b((aq)cLMem, 4355);
        return CL.getHostBuffer(l3, (int)l2);
    }

    public long a(CLMem cLMem, int n2) {
        cLMem.c();
        x x2 = d.g();
        CL10.a(cLMem, n2, x2.a(), null);
        return x2.d(0);
    }

    public b b(CLMem cLMem) {
        cLMem.c();
        ByteBuffer byteBuffer = d.a(8);
        CL10.a(cLMem, 4368, byteBuffer, null);
        return new b(byteBuffer.getInt(0), byteBuffer.getInt(4));
    }

    public int b(CLMem cLMem, int n2) {
        cLMem.c();
        ByteBuffer byteBuffer = d.a(8);
        CL10.a(cLMem, 4368, byteBuffer, null);
        return byteBuffer.getInt(n2 << 2);
    }

    public int c(CLMem cLMem) {
        cLMem.c();
        IntBuffer intBuffer = d.b();
        CL10GL.a(cLMem, intBuffer, null);
        return intBuffer.get(0);
    }

    public int d(CLMem cLMem) {
        cLMem.c();
        IntBuffer intBuffer = d.b();
        CL10GL.a(cLMem, null, intBuffer);
        return intBuffer.get(0);
    }

    public int c(CLMem cLMem, int n2) {
        cLMem.c();
        ByteBuffer byteBuffer = d.a(4);
        CL10GL.a(cLMem, n2, byteBuffer, null);
        return byteBuffer.getInt(0);
    }

    /* synthetic */ bs(bm bm2) {
        this();
    }
}

