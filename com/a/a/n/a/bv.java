/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import java.util.concurrent.Executor;

final class bv {
    final Runnable a;
    final Executor b;
    bv c;

    bv(Runnable runnable, Executor executor, bv bv2) {
        this.a = runnable;
        this.b = executor;
        this.c = bv2;
    }
}

