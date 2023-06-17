/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.an;
import io.netty.util.b.ao;
import io.netty.util.b.ap;
import io.netty.util.b.w;

final class aq
implements ap {
    final /* synthetic */ an a;

    private aq(an an2) {
        this.a = an2;
    }

    @Override
    public w a() {
        return an.b(this.a)[Math.abs(an.d(this.a).getAndIncrement() % an.b(this.a).length)];
    }

    /* synthetic */ aq(an an2, ao ao2) {
        this(an2);
    }
}

