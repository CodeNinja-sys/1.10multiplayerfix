/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.c.l;

final class ai
extends l {
    final Thread a;
    final Runnable b;
    final boolean c;

    ai(Thread thread, Runnable runnable, boolean bl2) {
        this.a = thread;
        this.b = runnable;
        this.c = bl2;
    }

    public ai a() {
        return this;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ai)) {
            return false;
        }
        ai ai2 = (ai)object;
        return this.a == ai2.a && this.b == ai2.b;
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }
}

