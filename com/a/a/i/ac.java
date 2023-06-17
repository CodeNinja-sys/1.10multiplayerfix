/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.cc;
import com.a.a.i.s;
import java.io.InputStream;

final class ac
extends s {
    final /* synthetic */ cc a;

    ac(cc cc2) {
        this.a = cc2;
    }

    @Override
    public InputStream a() {
        return (InputStream)this.a.h();
    }

    public String toString() {
        return "ByteStreams.asByteSource(" + this.a + ")";
    }
}

