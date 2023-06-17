/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.a;
import org.lwjgl.opencl.CL10;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ak;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ay;
import org.lwjgl.opencl.az;
import org.lwjgl.opencl.bk;
import org.lwjgl.opencl.bm;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

final class bu
extends bk
implements az {
    private bu() {
    }

    protected int a(ay ay2, int n2, ByteBuffer byteBuffer, x x2) {
        return CL10.a(ay2, n2, byteBuffer, x2);
    }

    protected int a(ay ay2, int n2) {
        switch (n2) {
            case 4453: {
                return this.a((aq)ay2, 4450);
            }
        }
        throw new IllegalArgumentException("Unsupported parameter: " + org.lwjgl.d.a(n2));
    }

    public ak[] a(ay ay2) {
        IntBuffer intBuffer = d.b();
        CL10.a(ay2, null, intBuffer);
        int n2 = intBuffer.get(0);
        if (n2 == 0) {
            return null;
        }
        x x2 = d.b(n2);
        CL10.a(ay2, x2, null);
        ak[] arrak = new ak[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrak[i2] = ay2.a(x2.d(i2));
        }
        return arrak;
    }

    public ae[] b(ay ay2) {
        ay2.c();
        int n2 = this.a((aq)ay2, 4450);
        x x2 = d.b(n2);
        CL10.a(ay2, 4451, x2.a(), null);
        au au2 = (au)((ab)ay2.m()).m();
        ae[] arrae = new ae[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrae[i2] = au2.b(x2.d(i2));
        }
        return arrae;
    }

    public ByteBuffer a(ay ay2, ByteBuffer byteBuffer) {
        ay2.c();
        x x2 = this.g(ay2, 4453);
        int n2 = 0;
        for (int i2 = 0; i2 < x2.g(); ++i2) {
            n2 = (int)((long)n2 + x2.d(i2));
        }
        if (byteBuffer == null) {
            byteBuffer = BufferUtils.a(n2);
        } else if (org.lwjgl.d.i) {
            a.b(byteBuffer, n2);
        }
        CL10.a(ay2, x2, byteBuffer, null);
        return byteBuffer;
    }

    public ByteBuffer[] a(ay ay2, ByteBuffer[] arrbyteBuffer) {
        ay2.c();
        if (arrbyteBuffer == null) {
            x x2 = this.g(ay2, 4453);
            arrbyteBuffer = new ByteBuffer[x2.m()];
            for (int i2 = 0; i2 < x2.m(); ++i2) {
                arrbyteBuffer[i2] = BufferUtils.a((int)x2.d(i2));
            }
        } else if (org.lwjgl.d.i) {
            x x3 = this.g(ay2, 4453);
            if (arrbyteBuffer.length < x3.m()) {
                throw new IllegalArgumentException("The target array is not big enough: " + x3.m() + " buffers are required.");
            }
            for (int i3 = 0; i3 < arrbyteBuffer.length; ++i3) {
                a.b(arrbyteBuffer[i3], (int)x3.d(i3));
            }
        }
        CL10.a(ay2, arrbyteBuffer, null);
        return arrbyteBuffer;
    }

    public String a(ay ay2, ae ae2, int n2) {
        ay2.c();
        int n3 = bu.c(ay2, ae2, n2);
        if (n3 <= 1) {
            return null;
        }
        ByteBuffer byteBuffer = d.a(n3);
        CL10.a(ay2, ae2, n2, byteBuffer, null);
        byteBuffer.limit(n3 - 1);
        return d.a(byteBuffer);
    }

    public int b(ay ay2, ae ae2, int n2) {
        ay2.c();
        ByteBuffer byteBuffer = d.a(4);
        CL10.a(ay2, ae2, n2, byteBuffer, null);
        return byteBuffer.getInt(0);
    }

    private static int c(ay ay2, ae ae2, int n2) {
        x x2 = d.g();
        int n3 = CL10.a(ay2, ae2, n2, null, x2);
        if (n3 != 0) {
            throw new IllegalArgumentException("Invalid parameter specified: " + org.lwjgl.d.a(n2));
        }
        return (int)x2.d(0);
    }

    protected /* synthetic */ int f(aq aq2, int n2) {
        return this.a((ay)aq2, n2);
    }

    /* synthetic */ bu(bm bm2) {
        this();
    }
}

