/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.aj;
import com.a.a.i.p;
import com.a.a.i.q;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

final class r
extends aj {
    private final Charset b;
    final /* synthetic */ p a;

    private r(p p2, Charset charset) {
        this.a = p2;
        this.b = (Charset)cl.a(charset);
    }

    @Override
    public Writer a() {
        return new OutputStreamWriter(this.a.a(), this.b);
    }

    public String toString() {
        return this.a.toString() + ".asCharSink(" + this.b + ")";
    }

    /* synthetic */ r(p p2, Charset charset, q q2) {
        this(p2, charset);
    }
}

