/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.av;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.o;
import io.netty.util.c.ad;

public class r
extends o
implements bm {
    private bp a;

    public r(br br2, bp bp2) {
        this(br2, bp2, true);
    }

    public r(br br2, bp bp2, boolean bl2) {
        super(br2, bl2);
        if (bp2 == null) {
            throw new NullPointerException("status");
        }
        this.a = bp2;
    }

    @Override
    public bp s() {
        return this.a;
    }

    @Override
    public bm b(bp bp2) {
        if (bp2 == null) {
            throw new NullPointerException("status");
        }
        this.a = bp2;
        return this;
    }

    @Override
    public bm b(br br2) {
        super.c(br2);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(decodeResult: ");
        stringBuilder.append(this.i());
        stringBuilder.append(')');
        stringBuilder.append(ad.a);
        stringBuilder.append(this.r().d());
        stringBuilder.append(' ');
        stringBuilder.append(this.s());
        stringBuilder.append(ad.a);
        this.a(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - ad.a.length());
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ av c(br br2) {
        return this.b(br2);
    }
}

