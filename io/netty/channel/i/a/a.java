/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.TypeUDT
 *  com.barchart.udt.nio.ChannelUDT
 *  com.barchart.udt.nio.ServerSocketChannelUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.ChannelUDT;
import com.barchart.udt.nio.ServerSocketChannelUDT;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bj;
import io.netty.channel.d.i;
import io.netty.channel.i.a.j;
import io.netty.channel.i.b;
import io.netty.channel.i.d;
import io.netty.channel.i.g;
import io.netty.channel.i.h;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;

public abstract class a
extends i
implements g {
    protected static final io.netty.util.c.b.g f = io.netty.util.c.b.h.a(a.class);
    private final h g;

    protected a(ServerSocketChannelUDT serverSocketChannelUDT) {
        super(null, (SelectableChannel)serverSocketChannelUDT, 16);
        try {
            serverSocketChannelUDT.configureBlocking(false);
            this.g = new b(this, (ChannelUDT)serverSocketChannelUDT, true);
        }
        catch (Exception exception) {
            block4: {
                try {
                    serverSocketChannelUDT.close();
                }
                catch (Exception exception2) {
                    if (!f.f()) break block4;
                    f.d("Failed to close channel.", exception2);
                }
            }
            throw new ar("Failed to configure channel.", exception);
        }
    }

    protected a(TypeUDT typeUDT) {
        this(j.a(typeUDT));
    }

    public h J() {
        return this.g;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.K().socket().bind(socketAddress, this.g.u());
    }

    @Override
    protected void B() {
        this.K().close();
    }

    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void A() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void aa() {
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
    public boolean I() {
        return this.K().socket().isBound();
    }

    protected ServerSocketChannelUDT K() {
        return (ServerSocketChannelUDT)super.V();
    }

    @Override
    protected SocketAddress x() {
        return this.K().socket().getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress i() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress u() {
        return null;
    }

    @Override
    protected SocketAddress y() {
        return null;
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.K();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.u();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.i();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.J();
    }

    @Override
    public /* synthetic */ d g() {
        return this.J();
    }
}

