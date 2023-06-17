/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.j;
import io.netty.a.m;
import io.netty.a.n;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.channel.bi;
import io.netty.channel.ct;
import io.netty.util.b.ad;
import io.netty.util.c;
import java.util.Map;
import java.util.concurrent.TimeUnit;

class l
extends bf {
    private final ct a;
    private final ba b;
    private final Map.Entry[] c;
    private final Map.Entry[] d;

    l(ct ct2, ba ba2, Map.Entry[] arrentry, Map.Entry[] arrentry2) {
        this.a = ct2;
        this.b = ba2;
        this.c = arrentry;
        this.d = arrentry2;
    }

    @Override
    public void a_(bd bd2, Object object) {
        an an2 = (an)object;
        an2.c().b(new ba[]{this.b});
        for (Map.Entry entry : this.c) {
            try {
                if (an2.G().a((bi)entry.getKey(), entry.getValue())) continue;
                j.o().d("Unknown channel option: " + entry);
            }
            catch (Throwable throwable) {
                j.o().d("Failed to set a channel option: " + an2, throwable);
            }
        }
        for (Map.Entry entry : this.d) {
            an2.a((c)entry.getKey()).set(entry.getValue());
        }
        try {
            this.a.a(an2).a((ad)new m(this, an2));
        }
        catch (Throwable throwable) {
            l.b(an2, throwable);
        }
    }

    private static void b(an an2, Throwable throwable) {
        an2.t().d();
        j.o().d("Failed to register an accepted channel: " + an2, throwable);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        ap ap2 = bd2.b().G();
        if (ap2.g()) {
            ap2.a(false);
            bd2.b().e().a(new n(this, ap2), 1L, TimeUnit.SECONDS);
        }
        bd2.a(throwable);
    }

    static /* synthetic */ void a(an an2, Throwable throwable) {
        l.b(an2, throwable);
    }
}

