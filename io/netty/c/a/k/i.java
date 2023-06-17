/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.ay;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.bm;
import io.netty.c.a.k.l;
import io.netty.util.c.ad;

public class i
extends l
implements ay {
    private bm a;

    public i(int n2, int n3) {
        this(n2, bm.a(n3));
    }

    public i(int n2, bm bm2) {
        super(n2);
        this.a(bm2);
    }

    @Override
    public ay a(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public ay a(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public bm a() {
        return this.a;
    }

    @Override
    public ay a(bm bm2) {
        this.a = bm2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Stream-ID = ");
        stringBuilder.append(this.h());
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Status: ");
        stringBuilder.append(this.a());
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ bl b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ bl d(int n2) {
        return this.a(n2);
    }
}

