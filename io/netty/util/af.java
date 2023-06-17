/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.an;
import io.netty.util.c.u;
import java.util.concurrent.ConcurrentMap;

public final class af
extends Error {
    private static final long a = -221145131122459977L;
    private static final ConcurrentMap b = u.m();
    private final an c;

    public static af a(String string) {
        return new af(string);
    }

    public af(String string) {
        super(string);
        this.c = new an(b, string, new Object[0]);
    }

    public void a(af af2) {
        if (this != af2) {
            throw new IllegalStateException("unexpected signal: " + af2);
        }
    }

    @Override
    public Throwable initCause(Throwable throwable) {
        return this;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String toString() {
        return this.c.a();
    }
}

