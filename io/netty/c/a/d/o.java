/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.br;
import io.netty.c.a.d.k;
import io.netty.c.a.d.p;
import io.netty.util.c.ad;
import java.util.Map;

public abstract class o
extends p
implements av {
    private br a;
    private final ar b;

    protected o(br br2) {
        this(br2, true);
    }

    protected o(br br2, boolean bl2) {
        if (br2 == null) {
            throw new NullPointerException("version");
        }
        this.a = br2;
        this.b = new k(bl2);
    }

    @Override
    public ar q() {
        return this.b;
    }

    @Override
    public br r() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(version: ");
        stringBuilder.append(this.r().d());
        stringBuilder.append(", keepAlive: ");
        stringBuilder.append(ar.a(this));
        stringBuilder.append(')');
        stringBuilder.append(ad.a);
        this.a(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - ad.a.length());
        return stringBuilder.toString();
    }

    @Override
    public av c(br br2) {
        if (br2 == null) {
            throw new NullPointerException("version");
        }
        this.a = br2;
        return this;
    }

    void a(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.q()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(ad.a);
        }
    }
}

