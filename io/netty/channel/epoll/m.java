/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.b.g;
import io.netty.channel.DefaultFileRegion;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.av;
import io.netty.channel.b;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.cr;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.n;
import io.netty.channel.epoll.o;
import io.netty.channel.epoll.s;
import io.netty.channel.epoll.t;
import io.netty.channel.h.i;
import io.netty.channel.h.k;
import io.netty.channel.h.l;
import io.netty.util.c.ad;
import io.netty.util.c.u;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledFuture;

public final class m
extends a
implements k {
    private static final String h = " (expected: " + ad.a(g.class) + ", " + ad.a(DefaultFileRegion.class) + ')';
    private final s i = new s(this);
    private bw j;
    private ScheduledFuture k;
    private SocketAddress l;
    private volatile InetSocketAddress m;
    private volatile InetSocketAddress n;
    private volatile boolean o;
    private volatile boolean p;

    m(an an2, int n2) {
        super(an2, n2, 1, true);
        this.n = Native.remoteAddress(n2);
        this.m = Native.localAddress(n2);
    }

    public m() {
        super(Native.a(), 1);
    }

    @Override
    protected c O() {
        return new o(this);
    }

    @Override
    protected SocketAddress x() {
        return this.m;
    }

    @Override
    protected SocketAddress y() {
        return this.n;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        Native.a(this.e, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        this.m = Native.localAddress(this.e);
    }

    private boolean a(bj bj2, g g2) {
        int n2 = g2.r();
        if (n2 == 0) {
            bj2.c();
            return true;
        }
        boolean bl2 = false;
        long l2 = 0L;
        if (g2.Z()) {
            block6: {
                int n3;
                long l3 = g2.aa();
                int n4 = g2.p();
                int n5 = g2.q();
                while ((n3 = Native.writeAddress(this.e, l3, n4, n5)) > 0) {
                    if ((l2 += (long)n3) == (long)n2) {
                        bl2 = true;
                        break block6;
                    }
                    n4 += n3;
                }
                this.M();
            }
            bj2.d(l2);
            return bl2;
        }
        if (g2.T() == 1) {
            block7: {
                int n6;
                int n7;
                int n8;
                int n9 = g2.p();
                ByteBuffer byteBuffer = g2.k(n9, g2.r());
                while ((n8 = Native.write(this.e, byteBuffer, n7 = byteBuffer.position(), n6 = byteBuffer.limit())) > 0) {
                    byteBuffer.position(n7 + n8);
                    if ((l2 += (long)n8) != (long)n2) continue;
                    bl2 = true;
                    break block7;
                }
                this.M();
            }
            bj2.d(l2);
            return bl2;
        }
        ByteBuffer[] arrbyteBuffer = g2.V();
        return this.a(bj2, arrbyteBuffer, arrbyteBuffer.length, n2);
    }

    private boolean a(bj bj2, t t2) {
        long l2 = t2.b();
        int n2 = t2.a();
        assert (l2 != 0L);
        assert (n2 != 0);
        boolean bl2 = false;
        long l3 = 0L;
        int n3 = 0;
        int n4 = n3 + n2;
        block0: while (true) {
            long l4;
            long l5;
            if ((l5 = Native.writevAddresses(this.e, t2.a(n3), n2)) == 0L) {
                this.M();
                break;
            }
            l3 += l5;
            if ((l2 -= l5) == 0L) {
                bl2 = true;
                break;
            }
            do {
                if ((l4 = t2.a(n3, l5)) == -1L) continue block0;
                --n2;
            } while (++n3 < n4 && (l5 -= l4) > 0L);
        }
        bj2.d(l3);
        return bl2;
    }

    private boolean a(bj bj2, ByteBuffer[] arrbyteBuffer, int n2, long l2) {
        assert (l2 != 0L);
        boolean bl2 = false;
        long l3 = 0L;
        int n3 = 0;
        int n4 = n3 + n2;
        block0: while (true) {
            int n5;
            long l4;
            if ((l4 = Native.writev(this.e, arrbyteBuffer, n3, n2)) == 0L) {
                this.M();
                break;
            }
            l3 += l4;
            if ((l2 -= l4) == 0L) {
                bl2 = true;
                break;
            }
            do {
                ByteBuffer byteBuffer = arrbyteBuffer[n3];
                int n6 = byteBuffer.position();
                n5 = byteBuffer.limit() - n6;
                if ((long)n5 > l4) {
                    byteBuffer.position(n6 + (int)l4);
                    continue block0;
                }
                --n2;
            } while (++n3 < n4 && (l4 -= (long)n5) > 0L);
        }
        bj2.d(l3);
        return bl2;
    }

    private boolean a(bj bj2, DefaultFileRegion defaultFileRegion) {
        long l2 = defaultFileRegion.b();
        if (defaultFileRegion.c() >= l2) {
            bj2.c();
            return true;
        }
        long l3 = defaultFileRegion.a();
        boolean bl2 = false;
        long l4 = 0L;
        for (int i2 = this.P().d() - 1; i2 >= 0; --i2) {
            long l5 = defaultFileRegion.c();
            long l6 = Native.sendfile(this.e, defaultFileRegion, l3, l5, l2 - l5);
            if (l6 == 0L) {
                this.M();
                break;
            }
            l4 += l6;
            if (defaultFileRegion.c() < l2) continue;
            bl2 = true;
            break;
        }
        if (l4 > 0L) {
            bj2.c(l4);
        }
        if (bl2) {
            bj2.c();
        }
        return bl2;
    }

    @Override
    protected void a(bj bj2) {
        int n2;
        do {
            if ((n2 = bj2.h()) != 0) continue;
            this.N();
            break;
        } while (!(n2 > 1 && bj2.b() instanceof g ? !this.c(bj2) : !this.b(bj2)));
    }

    private boolean b(bj bj2) {
        Object object = bj2.b();
        if (object instanceof g) {
            g g2 = (g)object;
            if (!this.a(bj2, g2)) {
                return false;
            }
        } else if (object instanceof DefaultFileRegion) {
            DefaultFileRegion defaultFileRegion = (DefaultFileRegion)object;
            if (!this.a(bj2, defaultFileRegion)) {
                return false;
            }
        } else {
            throw new Error();
        }
        return true;
    }

    private boolean c(bj bj2) {
        if (u.f()) {
            t t2 = t.a(bj2);
            int n2 = t2.a();
            if (n2 >= 1) {
                if (!this.a(bj2, t2)) {
                    return false;
                }
            } else {
                bj2.d(0L);
            }
        } else {
            ByteBuffer[] arrbyteBuffer = bj2.d();
            int n3 = bj2.e();
            if (n3 >= 1) {
                if (!this.a(bj2, arrbyteBuffer, n3, bj2.f())) {
                    return false;
                }
            } else {
                bj2.d(0L);
            }
        }
        return true;
    }

    @Override
    protected Object c(Object object) {
        if (object instanceof g) {
            g g2 = (g)object;
            if (!(g2.Z() || !u.f() && g2.o())) {
                g2 = this.a(g2);
                assert (g2.Z());
            }
            return g2;
        }
        if (object instanceof DefaultFileRegion) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + h);
    }

    public s P() {
        return this.i;
    }

    @Override
    public boolean Q() {
        return this.o;
    }

    @Override
    public boolean R() {
        return this.p || !this.I();
    }

    @Override
    public av S() {
        return this.d(this.p());
    }

    @Override
    public av d(bw bw2) {
        cr cr2 = this.e();
        if (cr2.bt_()) {
            try {
                Native.shutdown(this.e, false, true);
                this.p = true;
                bw2.b();
            }
            catch (Throwable throwable) {
                bw2.a(throwable);
            }
        } else {
            cr2.execute(new n(this, bw2));
        }
        return bw2;
    }

    @Override
    public i T() {
        return (i)super.b();
    }

    @Override
    protected /* synthetic */ b bv_() {
        return this.O();
    }

    @Override
    public /* synthetic */ an b() {
        return this.T();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.P();
    }

    @Override
    public /* synthetic */ l U() {
        return this.P();
    }

    static /* synthetic */ boolean a(m m2, boolean bl2) {
        m2.o = bl2;
        return m2.o;
    }

    static /* synthetic */ bw a(m m2) {
        return m2.j;
    }

    static /* synthetic */ bw a(m m2, bw bw2) {
        m2.j = bw2;
        return m2.j;
    }

    static /* synthetic */ SocketAddress a(m m2, SocketAddress socketAddress) {
        m2.l = socketAddress;
        return m2.l;
    }

    static /* synthetic */ ScheduledFuture a(m m2, ScheduledFuture scheduledFuture) {
        m2.k = scheduledFuture;
        return m2.k;
    }

    static /* synthetic */ ScheduledFuture b(m m2) {
        return m2.k;
    }

    static /* synthetic */ SocketAddress c(m m2) {
        return m2.l;
    }

    static /* synthetic */ InetSocketAddress a(m m2, InetSocketAddress inetSocketAddress) {
        m2.n = inetSocketAddress;
        return m2.n;
    }

    static /* synthetic */ InetSocketAddress b(m m2, InetSocketAddress inetSocketAddress) {
        m2.m = inetSocketAddress;
        return m2.m;
    }
}

