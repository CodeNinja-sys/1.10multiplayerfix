/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g.b;

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
import io.netty.channel.dg;
import io.netty.channel.e.e;
import io.netty.channel.g.b.b;
import io.netty.channel.g.b.c;
import io.netty.channel.g.b.d;
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
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class a
extends e
implements io.netty.channel.g.c {
    private static final io.netty.util.c.b.g d = io.netty.util.c.b.h.a(a.class);
    private static final bh e = new bh(false);
    private static final String f = " (expected: " + ad.a(f.class) + ')';
    private final SctpChannel g;
    private final io.netty.channel.g.d h;
    private final Selector i;
    private final Selector j;
    private final Selector k;
    private final NotificationHandler l;
    private dg m;

    private static SctpChannel J() {
        try {
            return SctpChannel.open();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a sctp channel.", iOException);
        }
    }

    public a() {
        this(a.J());
    }

    public a(SctpChannel sctpChannel) {
        this(null, sctpChannel);
    }

    public a(an an2, SctpChannel sctpChannel) {
        super(an2);
        this.g = sctpChannel;
        boolean bl2 = false;
        try {
            sctpChannel.configureBlocking(false);
            this.i = Selector.open();
            this.j = Selector.open();
            this.k = Selector.open();
            sctpChannel.register(this.i, 1);
            sctpChannel.register(this.j, 4);
            sctpChannel.register(this.k, 8);
            this.h = new d(this, this, sctpChannel, null);
            this.l = new g(this);
            bl2 = true;
        }
        catch (Exception exception) {
            throw new ar("failed to initialize a sctp channel", exception);
        }
        finally {
            if (!bl2) {
                try {
                    sctpChannel.close();
                }
                catch (IOException iOException) {
                    d.d("Failed to close a sctp channel.", iOException);
                }
            }
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
        return e;
    }

    @Override
    public io.netty.channel.g.d z() {
        return this.h;
    }

    @Override
    public boolean H() {
        return this.g.isOpen();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected int a(List list) {
        boolean bl2;
        if (!this.i.isOpen()) {
            return 0;
        }
        int n2 = 0;
        int n3 = this.i.select(1000L);
        boolean bl3 = bl2 = n3 > 0;
        if (!bl2) {
            return n2;
        }
        Set<SelectionKey> set = this.i.selectedKeys();
        try {
            for (SelectionKey selectionKey : set) {
                dg dg2 = this.m;
                if (dg2 == null) {
                    this.m = dg2 = this.z().f().a();
                }
                io.netty.b.g g2 = dg2.a(this.z().e());
                boolean bl4 = true;
                try {
                    ByteBuffer byteBuffer = g2.j(g2.q(), g2.s());
                    MessageInfo messageInfo = this.g.receive(byteBuffer, null, this.l);
                    if (messageInfo == null) {
                        int n4 = n2;
                        return n4;
                    }
                    byteBuffer.flip();
                    list.add(new f(messageInfo, g2.h(g2.q() + byteBuffer.remaining())));
                    bl4 = false;
                    ++n2;
                }
                catch (Throwable throwable) {
                    u.a(throwable);
                }
                finally {
                    int n5 = g2.r();
                    dg2.a(n5);
                    if (!bl4) continue;
                    g2.ad();
                }
            }
        }
        finally {
            set.clear();
        }
        return n2;
    }

    @Override
    protected void a(bj bj2) {
        if (!this.j.isOpen()) {
            return;
        }
        int n2 = bj2.h();
        int n3 = this.j.select(1000L);
        if (n3 > 0) {
            Set<SelectionKey> set = this.j.selectedKeys();
            if (set.isEmpty()) {
                return;
            }
            Iterator<SelectionKey> iterator = set.iterator();
            int n4 = 0;
            do {
                ByteBuffer byteBuffer;
                if (n4 == n2) {
                    return;
                }
                iterator.next();
                iterator.remove();
                f f2 = (f)bj2.b();
                if (f2 == null) {
                    return;
                }
                io.netty.b.g g2 = f2.a();
                int n5 = g2.r();
                if (g2.T() != -1) {
                    byteBuffer = g2.U();
                } else {
                    byteBuffer = ByteBuffer.allocate(n5);
                    g2.a(g2.p(), byteBuffer);
                    byteBuffer.flip();
                }
                MessageInfo messageInfo = MessageInfo.createOutgoing(this.i(), null, f2.e());
                messageInfo.payloadProtocolID(f2.f());
                messageInfo.streamNumber(f2.e());
                this.g.send(byteBuffer, messageInfo);
                ++n4;
                bj2.c();
            } while (iterator.hasNext());
            return;
        }
    }

    @Override
    protected Object c(Object object) {
        if (object instanceof f) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + f);
    }

    @Override
    public Association i() {
        try {
            return this.g.association();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public boolean I() {
        return this.H() && this.i() != null;
    }

    @Override
    protected SocketAddress x() {
        try {
            Iterator<SocketAddress> iterator = this.g.getAllLocalAddresses().iterator();
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
    public Set w() {
        try {
            Set<SocketAddress> set = this.g.getAllLocalAddresses();
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
    protected SocketAddress y() {
        try {
            Iterator<SocketAddress> iterator = this.g.getRemoteAddresses().iterator();
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
    public Set D() {
        try {
            Set<SocketAddress> set = this.g.getRemoteAddresses();
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
    protected void c(SocketAddress socketAddress) {
        this.g.bind(socketAddress);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.g.bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            this.g.connect(socketAddress);
            boolean bl3 = false;
            while (!bl3) {
                if (this.k.select(1000L) < 0) continue;
                Set<SelectionKey> set = this.k.selectedKeys();
                for (SelectionKey selectionKey : set) {
                    if (!selectionKey.isConnectable()) continue;
                    set.clear();
                    bl3 = true;
                    break;
                }
                set.clear();
            }
            bl2 = this.g.finishConnect();
        }
        finally {
            if (!bl2) {
                this.B();
            }
        }
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        a.a("read", this.i);
        a.a("write", this.j);
        a.a("connect", this.k);
        this.g.close();
    }

    private static void a(String string, Selector selector) {
        try {
            selector.close();
        }
        catch (IOException iOException) {
            d.d("Failed to close a " + string + " selector.", iOException);
        }
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        if (this.e().bt_()) {
            try {
                this.g.bindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.e().execute(new b(this, inetAddress, bw2));
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
                this.g.unbindAddress(inetAddress);
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            this.e().execute(new c(this, inetAddress, bw2));
        }
        return bw2;
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
        a2.a(bl2);
    }
}

