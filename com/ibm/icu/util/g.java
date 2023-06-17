/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.f;
import java.nio.ByteBuffer;

public final class g {
    public int a;
    private byte[] b;
    private int c;

    private g(int n2) {
        this.b = new byte[n2];
    }

    public int a() {
        return this.c;
    }

    public byte a(int n2) {
        return this.b[n2];
    }

    public void a(byte[] arrby, int n2) {
        System.arraycopy(this.b, 0, arrby, n2, this.c);
    }

    public ByteBuffer b() {
        return ByteBuffer.wrap(this.b, 0, this.c).asReadOnlyBuffer();
    }

    private void b(int n2) {
        if (this.b.length < n2) {
            byte[] arrby = new byte[Math.min(2 * this.b.length, 2 * n2)];
            System.arraycopy(this.b, 0, arrby, 0, this.c);
            this.b = arrby;
        }
    }

    private void a(byte by2) {
        this.b(this.c + 1);
        this.b[this.c++] = by2;
    }

    private void a(byte[] arrby, int n2, int n3) {
        this.b(this.c + n3);
        System.arraycopy(arrby, n2, this.b, this.c, n3);
        this.c += n3;
    }

    private void c(int n2) {
        this.c = n2;
    }

    /* synthetic */ g(int n2, f f2) {
        this(n2);
    }

    static /* synthetic */ void a(g g2, byte[] arrby, int n2, int n3) {
        g2.a(arrby, n2, n3);
    }

    static /* synthetic */ void a(g g2, int n2) {
        g2.c(n2);
    }

    static /* synthetic */ void a(g g2, byte by2) {
        g2.a(by2);
    }

    static /* synthetic */ int a(g g2) {
        return g2.c;
    }
}

