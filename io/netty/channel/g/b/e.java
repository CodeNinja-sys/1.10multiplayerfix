/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

import com.sun.nio.sctp.SctpChannel;
import com.sun.nio.sctp.SctpServerChannel;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.g.b.a;
import io.netty.channel.g.b.f;
import io.netty.channel.g.b.g;
import io.netty.channel.g.h;
import io.netty.channel.g.i;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class e
extends io.netty.channel.e.e
implements h {
    private static final io.netty.util.c.b.g d = io.netty.util.c.b.h.a(e.class);
    private static final bh e = new bh(false);
    private final SctpServerChannel f;
    private final i g;
    private final Selector h;

    private static SctpServerChannel K() {
        try {
            return SctpServerChannel.open();
        }
        catch (IOException iOException) {
            throw new ar("failed to create a sctp server channel", iOException);
        }
    }

    public e() {
        this(io.netty.channel.g.b.e.K());
    }

    public e(SctpServerChannel sctpServerChannel) {
        super(null);
        if (sctpServerChannel == null) {
            throw new NullPointerException("sctp server channel");
        }
        this.f = sctpServerChannel;
        boolean bl2 = false;
        try {
            sctpServerChannel.configureBlocking(false);
            this.h = Selector.open();
            sctpServerChannel.register(this.h, 16);
            this.g = new io.netty.channel.g.b.h(this, this, sctpServerChannel, null);
            bl2 = true;
        }
        catch (Exception exception) {
            throw new ar("failed to initialize a sctp server channel", exception);
        }
        finally {
            if (!bl2) {
                try {
                    sctpServerChannel.close();
                }
                catch (IOException iOException) {
                    d.d("Failed to close a sctp server channel.", iOException);
                }
            }
        }
    }

    @Override
    public bh F() {
        return e;
    }

    @Override
    public i g() {
        return this.g;
    }

    public InetSocketAddress J() {
        return null;
    }

    @Override
    public InetSocketAddress i() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public boolean H() {
        return this.f.isOpen();
    }

    @Override
    protected SocketAddress x() {
        try {
            Iterator<SocketAddress> iterator = this.f.getAllLocalAddresses().iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public Set u() {
        try {
            Set<SocketAddress> set = this.f.getAllLocalAddresses();
            LinkedHashSet<InetSocketAddress> linkedHashSet = new LinkedHashSet<InetSocketAddress>(set.size());
            for (SocketAddress socketAddress : set) {
                linkedHashSet.add((InetSocketAddress)socketAddress);
            }
            return linkedHashSet;
        }
        catch (Throwable throwable) {
            return Collections.emptySet();
        }
    }

    @Override
    public boolean I() {
        return this.H() && this.x() != null;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.f.bind(socketAddress, this.g.p());
    }

    @Override
    protected void B() {
        try {
            this.h.close();
        }
        catch (IOException iOException) {
            d.d("Failed to close a selector.", iOException);
        }
        this.f.close();
    }

    @Override
    protected int a(List list) {
        int n2;
        block7: {
            if (!this.I()) {
                return -1;
            }
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            n2 = 0;
            try {
                int n3 = this.h.select(1000L);
                if (n3 > 0) {
                    Iterator<SelectionKey> iterator = this.h.selectedKeys().iterator();
                    do {
                        SelectionKey selectionKey = iterator.next();
                        iterator.remove();
                        if (!selectionKey.isAcceptable() || (abstractInterruptibleChannel = this.f.accept()) == null) continue;
                        list.add(new a(this, (SctpChannel)abstractInterruptibleChannel));
                        ++n2;
                    } while (iterator.hasNext());
                    return n2;
                }
            }
            catch (Throwable throwable) {
                d.d("Failed to create a new channel from an accepted sctp channel.", throwable);
                if (abstractInterruptibleChannel == null) break block7;
                try {
                    abstractInterruptibleChannel.close();
                }
                catch (Throwable throwable2) {
                    d.d("Failed to close a sctp channel.", throwable2);
                }
            }
        }
        return n2;
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        if (this.e().bt_()) {
            try {
                this.f.bindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.e().execute(new f(this, inetAddress, bw2));
        }
        return bw2;
    }

    @Override
    public av b(InetAddress inetAddress) {
        return this.b(inetAddress, this.p());
    }

    @Override
    public av b(InetAddress inetAddress, bw bw2) {
        if (this.e().bt_()) {
            try {
                this.f.unbindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.e().execute(new g(this, inetAddress, bw2));
        }
        return bw2;
    }

    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
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
    protected void a(bj bj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected Object c(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.i();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.g();
    }

    static /* synthetic */ void a(e e2, boolean bl2) {
        e2.a(bl2);
    }
}

