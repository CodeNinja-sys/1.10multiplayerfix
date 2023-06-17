/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.cc;
import java.lang.ref.WeakReference;

final class ch
extends WeakReference {
    final Throwable a;
    ch b;
    final long c;

    ch(cc cc2, Throwable throwable, ch ch2) {
        super(cc2, cc.L());
        this.a = throwable;
        this.b = ch2;
        this.c = Thread.currentThread().getId();
    }
}

