/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

public final class aa {
    public static final aa a = new aa();
    private final Throwable b;

    private aa() {
        this.b = null;
    }

    public aa(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.b = throwable;
    }

    public boolean a() {
        return this.b == null;
    }

    public Throwable b() {
        return this.b;
    }
}

