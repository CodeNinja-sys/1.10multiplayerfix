/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.q;
import io.netty.util.s;
import java.util.concurrent.atomic.AtomicInteger;

final class w
extends AtomicInteger {
    private final s[] a = new s[16];
    private int b;
    private w c;

    private w() {
    }

    /* synthetic */ w(q q2) {
        this();
    }

    static /* synthetic */ w a(w w2, w w3) {
        w2.c = w3;
        return w2.c;
    }

    static /* synthetic */ s[] a(w w2) {
        return w2.a;
    }

    static /* synthetic */ int b(w w2) {
        return w2.b;
    }

    static /* synthetic */ w c(w w2) {
        return w2.c;
    }

    static /* synthetic */ int a(w w2, int n2) {
        w2.b = n2;
        return w2.b;
    }
}

