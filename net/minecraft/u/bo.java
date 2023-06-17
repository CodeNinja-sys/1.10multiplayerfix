/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.k.a;

public class bo
extends RuntimeException {
    private final a a;

    public bo(a a2) {
        this.a = a2;
    }

    public a a() {
        return this.a;
    }

    @Override
    public Throwable getCause() {
        return this.a.b();
    }

    @Override
    public String getMessage() {
        return this.a.a();
    }
}

