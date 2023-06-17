/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.an;
import io.netty.util.b.ao;
import io.netty.util.b.ap;
import io.netty.util.b.w;

final class ar
implements ap {
    final /* synthetic */ an a;

    private ar(an an2) {
        this.a = an2;
    }

    @Override
    public w a() {
        return an.b(this.a)[an.d(this.a).getAndIncrement() & an.b(this.a).length - 1];
    }

    /* synthetic */ ar(an an2, ao ao2) {
        this(an2);
    }
}

