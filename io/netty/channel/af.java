/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ac;
import io.netty.channel.ag;
import io.netty.channel.bw;
import io.netty.channel.dk;
import io.netty.channel.k;
import io.netty.channel.l;
import io.netty.util.p;
import io.netty.util.t;

final class af
extends ac
implements dk {
    private static final p a = new ag();

    private static af b(k k2, Object object, int n2, bw bw2) {
        af af2 = (af)a.a();
        af.a(af2, k2, object, n2, bw2);
        return af2;
    }

    private af(t t2) {
        super(t2, null);
    }

    @Override
    protected void a(t t2) {
        a.a(this, t2);
    }

    static /* synthetic */ af a(k k2, Object object, int n2, bw bw2) {
        return af.b(k2, object, n2, bw2);
    }

    /* synthetic */ af(t t2, l l2) {
        this(t2);
    }
}

