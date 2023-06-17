/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.bj;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

abstract class bk
implements bj {
    protected bk() {
    }

    protected abstract int a(aq var1, int var2, ByteBuffer var3, x var4);

    protected int f(aq aq2, int n2) {
        throw new UnsupportedOperationException();
    }

    protected x g(aq aq2, int n2) {
        int n3 = this.f(aq2, n2);
        x x2 = d.b(n3);
        x2.b(n3);
        this.a(aq2, n2, x2.a(), null);
        return x2;
    }

    public int a(aq aq2, int n2) {
        aq2.c();
        ByteBuffer byteBuffer = d.a(4);
        this.a(aq2, n2, byteBuffer, null);
        return byteBuffer.getInt(0);
    }

    public long b(aq aq2, int n2) {
        aq2.c();
        x x2 = d.g();
        this.a(aq2, n2, x2.a(), null);
        return x2.d(0);
    }

    public long[] c(aq aq2, int n2) {
        aq2.c();
        int n3 = this.f(aq2, n2);
        x x2 = d.b(n3);
        this.a(aq2, n2, x2.a(), null);
        long[] arrl = new long[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrl[i2] = x2.d(i2);
        }
        return arrl;
    }

    public long d(aq aq2, int n2) {
        aq2.c();
        ByteBuffer byteBuffer = d.a(8);
        this.a(aq2, n2, byteBuffer, null);
        return byteBuffer.getLong(0);
    }

    public String e(aq aq2, int n2) {
        aq2.c();
        int n3 = this.h(aq2, n2);
        if (n3 <= 1) {
            return null;
        }
        ByteBuffer byteBuffer = d.a(n3);
        this.a(aq2, n2, byteBuffer, null);
        byteBuffer.limit(n3 - 1);
        return d.a(byteBuffer);
    }

    protected final int h(aq aq2, int n2) {
        x x2 = d.g();
        int n3 = this.a(aq2, n2, null, x2);
        if (n3 != 0) {
            throw new IllegalArgumentException("Invalid parameter specified: " + org.lwjgl.d.a(n2));
        }
        return (int)x2.d(0);
    }
}

