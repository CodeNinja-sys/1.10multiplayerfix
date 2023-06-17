/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.h.a.e;
import io.netty.channel.h.a.f;
import io.netty.channel.h.i;
import io.netty.channel.h.j;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.List;

public class c
extends io.netty.channel.d.i
implements i {
    private static final bh f = new bh(false);
    private static final SelectorProvider g = SelectorProvider.provider();
    private static final g h = io.netty.util.c.b.h.a(c.class);
    private final j i = new e(this, this, this.N().socket(), null);

    private static ServerSocketChannel a(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openServerSocketChannel();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a server socket.", iOException);
        }
    }

    public c() {
        this(io.netty.channel.h.a.c.a(g));
    }

    public c(SelectorProvider selectorProvider) {
        this(io.netty.channel.h.a.c.a(selectorProvider));
    }

    public c(ServerSocketChannel serverSocketChannel) {
        super(null, serverSocketChannel, 16);
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public bh F() {
        return f;
    }

    @Override
    public j S() {
        return this.i;
    }

    @Override
    public boolean I() {
        return this.N().socket().isBound();
    }

    @Override
    public InetSocketAddress J() {
        return null;
    }

    protected ServerSocketChannel N() {
        return (ServerSocketChannel)super.V();
    }

    @Override
    protected SocketAddress x() {
        return this.N().socket().getLocalSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.N().socket().bind(socketAddress, this.i.o());
    }

    @Override
    protected void B() {
        this.N().close();
    }

    @Override
    protected int a(List list) {
        SocketChannel socketChannel = this.N().accept();
        try {
            if (socketChannel != null) {
                list.add(new f((an)this, socketChannel));
                return 1;
            }
        }
        catch (Throwable throwable) {
            h.d("Failed to create a new channel from an accepted socket.", throwable);
            try {
                socketChannel.close();
            }
            catch (Throwable throwable2) {
                h.d("Failed to close a socket.", throwable2);
            }
        }
        return 0;
    }

    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void aa() {
        throw new UnsupportedOperationException();
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
    protected boolean a(Object object, bj bj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected final Object c(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.N();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.K();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.S();
    }

    static /* synthetic */ void a(c c2, boolean bl2) {
        c2.b(bl2);
    }
}

