/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.a;
import io.netty.util.b.ab;
import io.netty.util.b.af;
import io.netty.util.b.ak;
import io.netty.util.b.al;
import io.netty.util.b.at;
import io.netty.util.b.au;
import io.netty.util.b.x;
import io.netty.util.b.y;
import java.util.concurrent.TimeUnit;

public final class aj
extends a {
    public static final aj a = new aj();
    private final ab b = new y(af.a, new UnsupportedOperationException());

    private aj() {
    }

    @Override
    public x d() {
        return null;
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
    public ab a(long l2, long l3, TimeUnit timeUnit) {
        return this.bs_();
    }

    @Override
    public ab bs_() {
        return this.b;
    }

    @Override
    public void shutdown() {
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
        return false;
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        runnable.run();
    }

    @Override
    public au n() {
        return new al(this);
    }

    @Override
    public at o() {
        return new ak(this);
    }
}

