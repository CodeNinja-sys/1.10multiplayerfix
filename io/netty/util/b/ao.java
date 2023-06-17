/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ac;
import io.netty.util.b.an;

class ao
implements ac {
    final /* synthetic */ an a;

    ao(an an2) {
        this.a = an2;
    }

    @Override
    public void a(ab ab2) {
        if (an.a(this.a).incrementAndGet() == an.b(this.a).length) {
            an.c(this.a).b((Object)null);
        }
    }
}

