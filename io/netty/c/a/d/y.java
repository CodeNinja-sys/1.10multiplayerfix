/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.aa;
import io.netty.c.a.d.ab;
import io.netty.c.a.d.bn;
import io.netty.channel.bz;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class y
extends bz {
    private final Queue a = new ArrayDeque();
    private boolean b;
    private final AtomicLong c = new AtomicLong();
    private final boolean d;

    public y() {
        this(4096, 8192, 8192, false);
    }

    public void a(boolean bl2) {
        ((bn)this.a()).a(bl2);
    }

    public boolean c() {
        return ((bn)this.a()).a();
    }

    public y(int n2, int n3, int n4) {
        this(n2, n3, n4, false);
    }

    public y(int n2, int n3, int n4, boolean bl2) {
        this(n2, n3, n4, bl2, true);
    }

    public y(int n2, int n3, int n4, boolean bl2, boolean bl3) {
        this.a(new aa(this, n2, n3, n4, bl3), new ab(this, null));
        this.d = bl2;
    }

    static /* synthetic */ boolean a(y y2) {
        return y2.b;
    }

    static /* synthetic */ Queue b(y y2) {
        return y2.a;
    }

    static /* synthetic */ boolean c(y y2) {
        return y2.d;
    }

    static /* synthetic */ AtomicLong d(y y2) {
        return y2.c;
    }

    static /* synthetic */ boolean a(y y2, boolean bl2) {
        y2.b = bl2;
        return y2.b;
    }
}

