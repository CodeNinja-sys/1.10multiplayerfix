/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import java.io.Serializable;

final class af
extends ae
implements Serializable {
    final byte[] a;
    private static final long b = 0L;

    af(byte[] arrby) {
        this.a = (byte[])cl.a(arrby);
    }

    @Override
    public int a() {
        return this.a.length * 8;
    }

    @Override
    public byte[] e() {
        return (byte[])this.a.clone();
    }

    @Override
    public int b() {
        cl.b(this.a.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.a.length);
        return this.a[0] & 0xFF | (this.a[1] & 0xFF) << 8 | (this.a[2] & 0xFF) << 16 | (this.a[3] & 0xFF) << 24;
    }

    @Override
    public long c() {
        cl.b(this.a.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.a.length);
        return this.d();
    }

    @Override
    public long d() {
        long l2 = this.a[0] & 0xFF;
        for (int i2 = 1; i2 < Math.min(this.a.length, 8); ++i2) {
            l2 |= ((long)this.a[i2] & 0xFFL) << i2 * 8;
        }
        return l2;
    }

    @Override
    void b(byte[] arrby, int n2, int n3) {
        System.arraycopy(this.a, 0, arrby, n2, n3);
    }

    @Override
    byte[] f() {
        return this.a;
    }
}

