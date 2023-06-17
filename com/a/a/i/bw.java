/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.cb;
import java.io.Writer;

final class bw
implements cb {
    final /* synthetic */ Writer a;

    bw(Writer writer) {
        this.a = writer;
    }

    @Override
    public void a(char c2) {
        this.a.append(c2);
    }

    @Override
    public void a() {
        this.a.flush();
    }

    @Override
    public void b() {
        this.a.close();
    }
}

