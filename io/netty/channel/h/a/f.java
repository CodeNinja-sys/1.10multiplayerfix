/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.cv;
import io.netty.channel.d.a;
import io.netty.channel.h.a.g;
import io.netty.channel.h.a.h;
import io.netty.channel.h.i;
import io.netty.channel.h.k;
import io.netty.channel.h.l;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public class f
extends a
implements k {
    private static final bh f = new bh(false);
    private static final SelectorProvider g = SelectorProvider.provider();
    private final l h;

    private static SocketChannel a(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openSocketChannel();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a socket.", iOException);
        }
    }

    public f() {
        this(io.netty.channel.h.a.f.a(g));
    }

    public f(SelectorProvider selectorProvider) {
        this(io.netty.channel.h.a.f.a(selectorProvider));
    }

    public f(SocketChannel socketChannel) {
        this(null, socketChannel);
    }

    public f(an an2, SocketChannel socketChannel) {
        super(an2, socketChannel);
        this.h = new h(this, this, socketChannel.socket(), null);
    }

    @Override
    public i T() {
        return (i)super.b();
    }

    @Override
    public bh F() {
        return f;
    }

    @Override
    public l U() {
        return this.h;
    }

    protected SocketChannel P() {
        return (SocketChannel)super.V();
    }

    @Override
    public boolean I() {
        SocketChannel socketChannel = this.P();
        return socketChannel.isOpen() && socketChannel.isConnected();
    }

    @Override
    public boolean Q() {
        return super.Q();
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress J() {
        return (InetSocketAddress)super.h();
    }

    @Override
    public boolean R() {
        return this.P().socket().isOutputShutdown() || !this.I();
    }

    @Override
    public av S() {
        return this.d(this.p());
    }

    @Override
    public av d(bw bw2) {
        io.netty.channel.d.l l2 = this.W();
        if (l2.bt_()) {
            try {
                this.P().socket().shutdownOutput();
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            l2.execute(new g(this, bw2));
        }
        return bw2;
    }

    @Override
    protected SocketAddress x() {
        return this.P().socket().getLocalSocketAddress();
    }

    @Override
    protected SocketAddress y() {
        return this.P().socket().getRemoteSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.P().socket().bind(socketAddress);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.P().socket().bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            boolean bl3 = this.P().connect(socketAddress);
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
        if (!this.P().finishConnect()) {
            throw new Error();
        }
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void B() {
        this.P().close();
    }

    @Override
    protected int a(io.netty.b.g g2) {
        return g2.a(this.P(), g2.s());
    }

    @Override
    protected int b(io.netty.b.g g2) {
        int n2 = g2.r();
        return g2.a(this.P(), n2);
    }

    @Override
    protected long a(cv cv2) {
        long l2 = cv2.c();
        return cv2.a(this.P(), l2);
    }

    @Override
    protected void a(bj bj2) {
        block10: {
            boolean bl2;
            boolean bl3;
            do {
                int n2;
                if ((n2 = bj2.h()) == 0) {
                    this.N();
                    break block10;
                }
                long l2 = 0L;
                bl3 = false;
                bl2 = false;
                ByteBuffer[] arrbyteBuffer = bj2.d();
                int n3 = bj2.e();
                long l3 = bj2.f();
                SocketChannel socketChannel = this.P();
                block0 : switch (n3) {
                    case 0: {
                        super.a(bj2);
                        return;
                    }
                    case 1: {
                        int n4;
                        ByteBuffer byteBuffer = arrbyteBuffer[0];
                        for (n4 = this.U().d() - 1; n4 >= 0; --n4) {
                            int n5 = socketChannel.write(byteBuffer);
                            if (n5 == 0) {
                                bl2 = true;
                                break block0;
                            }
                            l2 += (long)n5;
                            if ((l3 -= (long)n5) != 0L) continue;
                            bl3 = true;
                            break block0;
                        }
                        break;
                    }
                    default: {
                        int n4;
                        for (n4 = this.U().d() - 1; n4 >= 0; --n4) {
                            long l4 = socketChannel.write(arrbyteBuffer, 0, n3);
                            if (l4 == 0L) {
                                bl2 = true;
                                break block0;
                            }
                            l2 += l4;
                            if ((l3 -= l4) != 0L) continue;
                            bl3 = true;
                            break block0;
                        }
                    }
                }
                bj2.d(l2);
            } while (bl3);
            this.a(bl2);
        }
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.P();
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
    public /* synthetic */ an b() {
        return this.T();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.U();
    }

    static /* synthetic */ void a(f f2, boolean bl2) {
        f2.b(bl2);
    }
}

