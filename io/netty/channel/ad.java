/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ac;
import io.netty.channel.ae;
import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.channel.l;
import io.netty.util.p;
import io.netty.util.t;

final class ad
extends ac {
    private static final p a = new ae();

    private static ad b(k k2, Object object, int n2, bw bw2) {
        ad ad2 = (ad)a.a();
        ad.a(ad2, k2, object, n2, bw2);
        return ad2;
    }

    private ad(t t2) {
        super(t2, null);
    }

    @Override
    public void a(k k2, Object object, bw bw2) {
        super.a(k2, object, bw2);
        k.i(k2);
    }

    @Override
    protected void a(t t2) {
        a.a(this, t2);
    }

    static /* synthetic */ ad a(k k2, Object object, int n2, bw bw2) {
        return ad.b(k2, object, n2, bw2);
    }

    /* synthetic */ ad(t t2, l l2) {
        this(t2);
    }
}

