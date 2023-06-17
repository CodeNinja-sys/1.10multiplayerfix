/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;

abstract class bd {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private Object d;
    private IOException e;
    private int f = 1;

    bd() {
    }

    public final void a() {
        try {
            this.d = this.e();
            this.f = 2;
        }
        catch (IOException iOException) {
            this.e = iOException;
            this.f = 3;
        }
    }

    public final IOException b() {
        return this.e;
    }

    public final Object c() {
        return this.d;
    }

    public final int d() {
        return this.f;
    }

    protected abstract Object e();
}

