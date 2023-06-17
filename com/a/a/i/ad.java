/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.cl;
import com.a.a.i.p;
import java.io.OutputStream;

final class ad
extends p {
    final /* synthetic */ cl a;

    ad(cl cl2) {
        this.a = cl2;
    }

    @Override
    public OutputStream a() {
        return (OutputStream)this.a.d();
    }

    public String toString() {
        return "ByteStreams.asByteSink(" + this.a + ")";
    }
}

