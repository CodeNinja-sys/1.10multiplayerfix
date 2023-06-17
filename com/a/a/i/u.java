/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ak;
import com.a.a.i.s;
import com.a.a.i.t;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

final class u
extends ak {
    private final Charset b;
    final /* synthetic */ s a;

    private u(s s2, Charset charset) {
        this.a = s2;
        this.b = (Charset)cl.a(charset);
    }

    @Override
    public Reader a() {
        return new InputStreamReader(this.a.a(), this.b);
    }

    public String toString() {
        return this.a.toString() + ".asCharSource(" + this.b + ")";
    }

    /* synthetic */ u(s s2, Charset charset, t t2) {
        this(s2, charset);
    }
}

