/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.e;
import io.netty.util.b.l;
import io.netty.util.b.w;
import java.util.concurrent.TimeUnit;

public abstract class g
extends e {
    private final w a;

    protected g(w w2) {
        this.a = w2;
    }

    protected w a() {
        return this.a;
    }

    @Override
    public ab a_(ad ad2) {
        if (ad2 == null) {
            throw new NullPointerException("listener");
        }
        l.a(this.a(), this, ad2);
        return this;
    }

    @Override
    public ab a_(ad ... arrad) {
        if (arrad == null) {
            throw new NullPointerException("listeners");
        }
        for (ad ad2 : arrad) {
            if (ad2 == null) break;
            l.a(this.a(), this, ad2);
        }
        return this;
    }

    @Override
    public ab b_(ad ad2) {
        return this;
    }

    @Override
    public ab b_(ad ... arrad) {
        return this;
    }

    @Override
    public ab k() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this;
    }

    @Override
    public boolean a(long l2, TimeUnit timeUnit) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }

    @Override
    public ab bl_() {
        return this;
    }

    @Override
    public ab bj_() {
        return this;
    }

    @Override
    public boolean a_(long l2) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }

    @Override
    public ab bi_() {
        return this;
    }

    @Override
    public boolean b(long l2, TimeUnit timeUnit) {
        return true;
    }

    @Override
    public boolean b(long l2) {
        return true;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public boolean bp_() {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return false;
    }
}

