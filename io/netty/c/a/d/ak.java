/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.channel.a.a;

public final class ak {
    private final String a;
    private final a b;

    public ak(String string, a a2) {
        if (string == null) {
            throw new NullPointerException("targetContentEncoding");
        }
        if (a2 == null) {
            throw new NullPointerException("contentEncoder");
        }
        this.a = string;
        this.b = a2;
    }

    public String a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }
}

