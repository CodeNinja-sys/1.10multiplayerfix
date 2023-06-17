/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.f;

import io.netty.c.f.f;
import io.netty.channel.bd;
import java.util.List;

class g
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ List b;
    final /* synthetic */ f c;

    g(f f2, bd bd2, List list) {
        this.c = f2;
        this.a = bd2;
        this.b = list;
    }

    @Override
    public void run() {
        f.a(this.c, this.a, this.b);
    }
}

