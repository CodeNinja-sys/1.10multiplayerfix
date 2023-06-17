/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.br;
import io.netty.c.a.d.o;
import io.netty.util.c.ad;

public class q
extends o
implements bj {
    private aw a;
    private String b;

    public q(br br2, aw aw2, String string) {
        this(br2, aw2, string, true);
    }

    public q(br br2, aw aw2, String string, boolean bl2) {
        super(br2, bl2);
        if (aw2 == null) {
            throw new NullPointerException("method");
        }
        if (string == null) {
            throw new NullPointerException("uri");
        }
        this.a = aw2;
        this.b = string;
    }

    @Override
    public aw s() {
        return this.a;
    }

    @Override
    public String t() {
        return this.b;
    }

    @Override
    public bj b(aw aw2) {
        if (aw2 == null) {
            throw new NullPointerException("method");
        }
        this.a = aw2;
        return this;
    }

    @Override
    public bj b(String string) {
        if (string == null) {
            throw new NullPointerException("uri");
        }
        this.b = string;
        return this;
    }

    @Override
    public bj b(br br2) {
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
        stringBuilder.append(this.s());
        stringBuilder.append(' ');
        stringBuilder.append(this.t());
        stringBuilder.append(' ');
        stringBuilder.append(this.r().d());
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

