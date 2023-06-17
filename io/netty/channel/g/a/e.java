/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.a;

import com.sun.nio.sctp.SctpChannel;
import com.sun.nio.sctp.SctpServerChannel;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.g.a.a;
import io.netty.channel.g.a.f;
import io.netty.channel.g.a.g;
import io.netty.channel.g.h;
import io.netty.channel.g.i;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class e
extends io.netty.channel.d.i
implements h {
    private static final bh f = new bh(false);
    private final i g = new io.netty.channel.g.a.h(this, this, this.K(), null);

    private static SctpServerChannel N() {
        try {
            return SctpServerChannel.open();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a server socket.", iOException);
        }
    }

    public e() {
        super(null, e.N(), 16);
    }

    @Override
    public bh F() {
        return f;
    }

    @Override
    public Set u() {
        try {
            Set<SocketAddress> set = this.K().getAllLocalAddresses();
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
    public i g() {
        return this.g;
    }

    @Override
    public boolean I() {
        return this.H() && !this.u().isEmpty();
    }

    public InetSocketAddress J() {
        return null;
    }

    @Override
    public InetSocketAddress i() {
        return (InetSocketAddress)super.f();
    }

    protected SctpServerChannel K() {
        return (SctpServerChannel)super.V();
    }

    @Override
    protected SocketAddress x() {
        try {
            Iterator<SocketAddress> iterator = this.K().getAllLocalAddresses().iterator();
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
    protected void c(SocketAddress socketAddress) {
        this.K().bind(socketAddress, this.g.p());
    }

    @Override
    protected void B() {
        this.K().close();
    }

    @Override
    protected int a(List list) {
        SctpChannel sctpChannel = this.K().accept();
        if (sctpChannel == null) {
            return 0;
        }
        list.add(new a(this, sctpChannel));
        return 1;
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        if (this.W().bt_()) {
            try {
                this.K().bindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.W().execute(new f(this, inetAddress, bw2));
        }
        return bw2;
    }

    @Override
    public av b(InetAddress inetAddress) {
        return this.b(inetAddress, this.p());
    }

    @Override
    public av b(InetAddress inetAddress, bw bw2) {
        if (this.W().bt_()) {
            try {
                this.K().unbindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.W().execute(new g(this, inetAddress, bw2));
        }
        return bw2;
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
    protected Object c(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.K();
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
        e2.b(bl2);
    }
}

