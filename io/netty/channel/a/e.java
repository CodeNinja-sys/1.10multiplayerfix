/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.a;

import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bw;
import io.netty.channel.cn;
import io.netty.channel.cr;
import io.netty.channel.ct;
import io.netty.util.b.a;
import io.netty.util.b.ab;
import io.netty.util.b.w;
import io.netty.util.b.x;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

final class e
extends a
implements cr {
    private final Queue a = new ArrayDeque(2);

    e() {
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        this.a.add(runnable);
    }

    void e() {
        Runnable runnable;
        while ((runnable = (Runnable)this.a.poll()) != null) {
            runnable.run();
        }
    }

    @Override
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ab bs_() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean br_() {
        return false;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) {
        Thread.sleep(timeUnit.toMillis(l2));
        return false;
    }

    @Override
    public av a(an an2) {
        return this.a(an2, new cn(an2, this));
    }

    @Override
    public av a(an an2, bw bw2) {
        an2.t().a(this, bw2);
        return bw2;
    }

    @Override
    public boolean bt_() {
        return true;
    }

    @Override
    public boolean a(Thread thread) {
        return true;
    }

    @Override
    public cr b() {
        return this;
    }

    @Override
    public ct a() {
        return this;
    }

    @Override
    public /* synthetic */ w c() {
        return this.b();
    }

    @Override
    public /* synthetic */ x d() {
        return this.a();
    }
}

