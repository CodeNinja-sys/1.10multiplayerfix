/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.bj;
import io.netty.c.a.k.z;
import io.netty.util.c.ad;

public class b
implements z {
    private int a;
    private bj b;

    public b(int n2) {
        this(n2, 0);
    }

    public b(int n2, int n3) {
        this(n2, bj.a(n3));
    }

    public b(int n2, bj bj2) {
        this.a(n2);
        this.a(bj2);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public z a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Last-good-stream-ID cannot be negative: " + n2);
        }
        this.a = n2;
        return this;
    }

    @Override
    public bj b() {
        return this.b;
    }

    @Override
    public z a(bj bj2) {
        this.b = bj2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Last-good-stream-ID = ");
        stringBuilder.append(this.a());
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Status: ");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }
}

