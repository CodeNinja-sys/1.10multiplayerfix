/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.cn;
import io.netty.channel.cr;
import io.netty.channel.ct;
import io.netty.channel.dk;
import io.netty.util.b.az;
import io.netty.util.b.w;
import io.netty.util.b.x;
import java.util.concurrent.ThreadFactory;

public abstract class dj
extends az
implements cr {
    protected dj(ct ct2, ThreadFactory threadFactory, boolean bl2) {
        super(ct2, threadFactory, bl2);
    }

    @Override
    public ct a() {
        return (ct)super.d();
    }

    @Override
    public cr b() {
        return (cr)super.c();
    }

    @Override
    public av a(an an2) {
        return this.a(an2, new cn(an2, this));
    }

    @Override
    public av a(an an2, bw bw2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        if (bw2 == null) {
            throw new NullPointerException("promise");
        }
        an2.t().a(this, bw2);
        return bw2;
    }

    @Override
    protected boolean a(Runnable runnable) {
        return !(runnable instanceof dk);
    }

    @Override
    public /* synthetic */ x d() {
        return this.a();
    }

    @Override
    public /* synthetic */ w c() {
        return this.b();
    }
}

