/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.co;
import com.a.a.i.s;
import java.io.InputStream;
import java.net.URL;

final class cp
extends s {
    private final URL a;

    private cp(URL uRL) {
        this.a = (URL)cl.a(uRL);
    }

    @Override
    public InputStream a() {
        return this.a.openStream();
    }

    public String toString() {
        return "Resources.asByteSource(" + this.a + ")";
    }

    /* synthetic */ cp(URL uRL, co co2) {
        this(uRL);
    }
}

