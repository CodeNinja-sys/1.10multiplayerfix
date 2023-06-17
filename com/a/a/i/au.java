/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.aj;
import com.a.a.i.aq;
import com.a.a.i.cl;
import java.io.Writer;

final class au
extends aj {
    final /* synthetic */ cl a;

    au(cl cl2) {
        this.a = cl2;
    }

    @Override
    public Writer a() {
        return aq.a((Appendable)this.a.d());
    }

    public String toString() {
        return "CharStreams.asCharSink(" + this.a + ")";
    }
}

