/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.bq;
import io.netty.util.c.ad;

public class o
implements bq {
    private int a;
    private int b;

    public o(int n2, int n3) {
        this.a(n2);
        this.b(n3);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public bq a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Stream-ID cannot be negative: " + n2);
        }
        this.a = n2;
        return this;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public bq b(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("Delta-Window-Size must be positive: " + n2);
        }
        this.b = n2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Stream-ID = ");
        stringBuilder.append(this.a());
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Delta-Window-Size = ");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }
}

