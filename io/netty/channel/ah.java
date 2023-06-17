/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.a;
import io.netty.channel.aj;
import io.netty.channel.b;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.dh;
import java.net.SocketAddress;

public abstract class ah
extends a
implements dh {
    private static final bh c = new bh(false);

    protected ah() {
        super(null);
    }

    @Override
    public bh F() {
        return c;
    }

    @Override
    public SocketAddress h() {
        return null;
    }

    @Override
    protected SocketAddress y() {
        return null;
    }

    @Override
    protected void A() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected b bv_() {
        return new aj(this, null);
    }

    @Override
    protected void a(bj bj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected final Object c(Object object) {
        throw new UnsupportedOperationException();
    }
}

