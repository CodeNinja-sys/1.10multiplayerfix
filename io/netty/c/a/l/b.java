/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.l;

import io.netty.b.w;
import io.netty.c.a.u;
import io.netty.channel.bd;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.List;

public class b
extends u {
    private final Charset a;

    public b() {
        this(Charset.defaultCharset());
    }

    public b(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.a = charset;
    }

    protected void a(bd bd2, CharSequence charSequence, List list) {
        if (charSequence.length() == 0) {
            return;
        }
        list.add(w.a(bd2.d(), CharBuffer.wrap(charSequence), this.a));
    }
}

