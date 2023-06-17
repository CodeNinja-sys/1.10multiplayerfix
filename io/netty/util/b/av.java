/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.au;
import io.netty.util.b.aw;
import io.netty.util.b.l;
import io.netty.util.b.w;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

class av
extends l
implements RunnableFuture {
    protected final Callable a;

    static Callable a(Runnable runnable, Object object) {
        return new aw(runnable, object);
    }

    av(w w2, Runnable runnable, Object object) {
        this(w2, av.a(runnable, object));
    }

    av(w w2, Callable callable) {
        super(w2);
        this.a = callable;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final boolean equals(Object object) {
        return this == object;
    }

    @Override
    public void run() {
        try {
            if (this.b()) {
                Object v2 = this.a.call();
                this.c(v2);
            }
        }
        catch (Throwable throwable) {
            this.a(throwable);
        }
    }

    @Override
    public final au c(Throwable throwable) {
        throw new IllegalStateException();
    }

    protected final au a(Throwable throwable) {
        super.c(throwable);
        return this;
    }

    @Override
    public final boolean b(Throwable throwable) {
        return false;
    }

    protected final boolean d(Throwable throwable) {
        return super.b(throwable);
    }

    @Override
    public final au b(Object object) {
        throw new IllegalStateException();
    }

    protected final au c(Object object) {
        super.b(object);
        return this;
    }

    @Override
    public final boolean a_(Object object) {
        return false;
    }

    protected final boolean d(Object object) {
        return super.a_(object);
    }

    @Override
    public final boolean bn_() {
        throw new IllegalStateException();
    }

    protected final boolean b() {
        return super.bn_();
    }

    @Override
    protected StringBuilder J() {
        StringBuilder stringBuilder = super.J();
        stringBuilder.setCharAt(stringBuilder.length() - 1, ',');
        stringBuilder.append(" task: ");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder;
    }
}

