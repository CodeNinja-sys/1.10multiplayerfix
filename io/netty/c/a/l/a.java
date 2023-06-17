/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.l;

import io.netty.b.g;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.nio.charset.Charset;
import java.util.List;

public class a
extends t {
    private final Charset a;

    public a() {
        this(Charset.defaultCharset());
    }

    public a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.a = charset;
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(g2.a(this.a));
    }
}

