/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.aw;
import io.netty.util.c.ad;

public class h
implements aw {
    private int a;

    public h(int n2) {
        this.a(n2);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public aw a(int n2) {
        this.a = n2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append(ad.a);
        stringBuilder.append("--> ID = ");
        stringBuilder.append(this.a());
        return stringBuilder.toString();
    }
}

