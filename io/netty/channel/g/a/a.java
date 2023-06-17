/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.a;

import com.sun.nio.sctp.Association;
import com.sun.nio.sctp.MessageInfo;
import com.sun.nio.sctp.NotificationHandler;
import com.sun.nio.sctp.SctpChannel;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.d.i;
import io.netty.channel.dg;
import io.netty.channel.g.a.b;
import io.netty.channel.g.a.d;
import io.netty.channel.g.c;
import io.netty.channel.g.f;
import io.netty.channel.g.g;
import io.netty.channel.g.h;
import io.netty.util.c.ad;
import io.netty.util.c.u;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class a
extends i
implements c {
    private static final bh f = new bh(false);
    private static final io.netty.util.c.b.g g = io.netty.util.c.b.h.a(a.class);
    private final io.netty.channel.g.d h;
    private final NotificationHandler i;
    private dg j;

    private static SctpChannel K() {
        try {
            return SctpChannel.open();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a sctp channel.", iOException);
        }
    }

    public a() {
        this(a.K());
    }

    public a(SctpChannel sctpChannel) {
        this(null, sctpChannel);
    }

    public a(an an2, SctpChannel sctpChannel) {
        super(an2, sctpChannel, 1);
        try {
            sctpChannel.configureBlocking(false);
            this.h = new d(this, this, sctpChannel, null);
            this.i = new g(this);
        }
        catch (IOException iOException) {
            block4: {
                try {
                    sctpChannel.close();
                }
                catch (IOException iOException2) {
                    if (!g.f()) break block4;
                    g.d("Failed to close a partially initialized sctp channel.", iOException2);
                }
            }
            throw new ar("Failed to enter non-blocking mode.", iOException);
        }
    }

    @Override
    public InetSocketAddress u() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress C() {
        return (InetSocketAddress)super.h();
    }

    @Override
    public h g() {
        return (h)super.b();
    }

    @Override
    public bh F() {
        return f;
    }

    @Override
    public Association i() {
        try {
            return this.J().association();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public Set w() {
        try {
            Set<SocketAddress> set = this.J().getAllLocalAddresses();
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
    public io.netty.channel.g.d z() {
        return this.h;
    }

    @Override
    public Set D() {
        try {
            Set<SocketAddress> set = this.J().getRemoteAddresses();
            HashSet<InetSocketAddress> hashSet = new HashSet<InetSocketAddress>(set.size());
            for (SocketAddress socketAddress : set) {
                hashSet.add((InetSocketAddress)socketAddress);
            }
            return hashSet;
        }
        catch (Throwable throwable) {
            return Collections.emptySet();
        }
    }

    protected SctpChannel J() {
        return (SctpChannel)super.V();
    }

    @Override
    public boolean I() {
        SctpChannel sctpChannel = this.J();
        return sctpChannel.isOpen() && this.i() != null;
    }

    @Override
    protected SocketAddress x() {
        try {
            Iterator<SocketAddress> iterator = this.J().getAllLocalAddresses().iterator();
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
    protected SocketAddress y() {
        try {
            Iterator<SocketAddress> iterator = this.J().getRemoteAddresses().iterator();
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
        this.J().bind(socketAddress);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.J().bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            boolean bl3 = this.J().connect(socketAddress);
            if (!bl3) {
                this.X().interestOps(8);
            }
            bl2 = true;
            boolean bl4 = bl3;
            return bl4;
        }
        finally {
            if (!bl2) {
                this.B();
            }
        }
    }

    @Override
    protected void aa() {
        if (!this.J().finishConnect()) {
            throw new Error();
        }
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        this.J().close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected int a(List list) {
        int n2;
        SctpChannel sctpChannel = this.J();
        dg dg2 = this.j;
        if (dg2 == null) {
            this.j = dg2 = this.z().f().a();
        }
        io.netty.b.g g2 = dg2.a(this.z().e());
        boolean bl2 = true;
        try {
            ByteBuffer byteBuffer = g2.k(g2.q(), g2.s());
            n2 = byteBuffer.position();
            MessageInfo messageInfo = sctpChannel.receive(byteBuffer, null, this.i);
            if (messageInfo == null) {
                int n3 = 0;
                return n3;
            }
            list.add(new f(messageInfo, g2.h(g2.q() + byteBuffer.position() - n2)));
            bl2 = false;
            int n4 = 1;
            return n4;
        }
        catch (Throwable throwable) {
            u.a(throwable);
            n2 = -1;
            return n2;
        }
        finally {
            int n5 = g2.r();
            dg2.a(n5);
            if (bl2) {
                g2.ad();
            }
        }
    }

    @Override
    protected boolean a(Object object, bj bj2) {
        ByteBuffer byteBuffer;
        boolean bl2;
        f f2 = (f)object;
        io.netty.b.g g2 = f2.a();
        int n2 = g2.r();
        if (n2 == 0) {
            return true;
        }
        io.netty.b.h h2 = this.d();
        boolean bl3 = bl2 = g2.T() != 1;
        if (!bl2 && !g2.o() && h2.h()) {
            bl2 = true;
        }
        if (!bl2) {
            byteBuffer = g2.U();
        } else {
            g2 = h2.d(n2).b(g2);
            byteBuffer = g2.U();
        }
        MessageInfo messageInfo = MessageInfo.createOutgoing(this.i(), null, f2.e());
        messageInfo.payloadProtocolID(f2.f());
        messageInfo.streamNumber(f2.e());
        int n3 = this.J().send(byteBuffer, messageInfo);
        return n3 > 0;
    }

    @Override
    protected final Object c(Object object) {
        if (object instanceof f) {
            f f2 = (f)object;
            io.netty.b.g g2 = f2.a();
            if (g2.o() && g2.T() == 1) {
                return f2;
            }
            return new f(f2.f(), f2.e(), this.a(f2, g2));
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + " (expected: " + ad.a(f.class));
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        if (this.W().bt_()) {
            try {
                this.J().bindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.W().execute(new b(this, inetAddress, bw2));
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
                this.J().unbindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.W().execute(new io.netty.channel.g.a.c(this, inetAddress, bw2));
        }
        return bw2;
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.C();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.u();
    }

    @Override
    public /* synthetic */ an b() {
        return this.g();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.z();
    }

    static /* synthetic */ void a(a a2, boolean bl2) {
        a2.b(bl2);
    }
}

