/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.a;
import io.netty.channel.an;
import io.netty.channel.cr;
import io.netty.channel.dm;
import io.netty.channel.e.c;
import io.netty.channel.e.d;
import java.net.SocketAddress;

public abstract class b
extends a {
    protected static final int c = 1000;
    private volatile boolean d;
    private final Runnable e = new c(this);

    protected b(an an2) {
        super(an2);
    }

    @Override
    protected io.netty.channel.b bv_() {
        return new d(this, null);
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof dm;
    }

    protected abstract void b(SocketAddress var1, SocketAddress var2);

    @Override
    protected void by_() {
        if (this.O()) {
            return;
        }
        this.a(true);
        this.e().execute(this.e);
    }

    protected abstract void M();

    protected boolean O() {
        return this.d;
    }

    protected void a(boolean bl2) {
        this.d = bl2;
    }
}

