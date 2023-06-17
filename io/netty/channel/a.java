/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.h;
import io.netty.channel.an;
import io.netty.channel.ao;
import io.netty.channel.av;
import io.netty.channel.b;
import io.netty.channel.bj;
import io.netty.channel.br;
import io.netty.channel.bv;
import io.netty.channel.bw;
import io.netty.channel.cf;
import io.netty.channel.cm;
import io.netty.channel.cn;
import io.netty.channel.cr;
import io.netty.channel.cu;
import io.netty.channel.cz;
import io.netty.channel.dl;
import io.netty.channel.dq;
import io.netty.channel.j;
import io.netty.util.c.ag;
import io.netty.util.c.b.g;
import io.netty.util.c.d;
import io.netty.util.f;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;

public abstract class a
extends f
implements an {
    private static final g c = io.netty.util.c.b.h.a(a.class);
    static final ClosedChannelException a = new ClosedChannelException();
    static final NotYetConnectedException b = new NotYetConnectedException();
    private cz d;
    private final an e;
    private final long f = ag.b().nextLong();
    private final ao g;
    private final cf h;
    private final av i = new dl(this, null);
    private final dq j = new dq(this, true);
    private final dq k = new dq(this, false);
    private final j l = new j(this);
    private volatile SocketAddress m;
    private volatile SocketAddress n;
    private volatile cr o;
    private volatile boolean p;
    private boolean q;
    private String r;

    protected a(an an2) {
        this.e = an2;
        this.g = this.bv_();
        this.h = new cf(this);
    }

    @Override
    public boolean a() {
        bj bj2 = this.g.a();
        return bj2 != null && bj2.g();
    }

    @Override
    public an b() {
        return this.e;
    }

    @Override
    public br c() {
        return this.h;
    }

    @Override
    public h d() {
        return this.G().e();
    }

    @Override
    public cr e() {
        cr cr2 = this.o;
        if (cr2 == null) {
            throw new IllegalStateException("channel not registered to an event loop");
        }
        return cr2;
    }

    @Override
    public SocketAddress f() {
        SocketAddress socketAddress = this.m;
        if (socketAddress == null) {
            try {
                this.m = socketAddress = this.t().b();
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return socketAddress;
    }

    protected void bz_() {
        this.m = null;
    }

    @Override
    public SocketAddress h() {
        SocketAddress socketAddress = this.n;
        if (socketAddress == null) {
            try {
                this.n = socketAddress = this.t().c();
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return socketAddress;
    }

    protected void bA_() {
        this.n = null;
    }

    @Override
    public boolean j() {
        return this.p;
    }

    @Override
    public av a(SocketAddress socketAddress) {
        return this.h.a(socketAddress);
    }

    @Override
    public av b(SocketAddress socketAddress) {
        return this.h.b(socketAddress);
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return this.h.a(socketAddress, socketAddress2);
    }

    @Override
    public av k() {
        return this.h.p();
    }

    @Override
    public av l() {
        return this.h.q();
    }

    @Override
    public av m() {
        return this.h.r();
    }

    @Override
    public an n() {
        this.h.t();
        return this;
    }

    @Override
    public av a(SocketAddress socketAddress, bw bw2) {
        return this.h.a(socketAddress, bw2);
    }

    @Override
    public av b(SocketAddress socketAddress, bw bw2) {
        return this.h.b(socketAddress, bw2);
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        return this.h.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public av a(bw bw2) {
        return this.h.a(bw2);
    }

    @Override
    public av b(bw bw2) {
        return this.h.b(bw2);
    }

    @Override
    public av c(bw bw2) {
        return this.h.c(bw2);
    }

    @Override
    public an o() {
        this.h.s();
        return this;
    }

    @Override
    public av a(Object object) {
        return this.h.c(object);
    }

    @Override
    public av a(Object object, bw bw2) {
        return this.h.a(object, bw2);
    }

    @Override
    public av b(Object object) {
        return this.h.d(object);
    }

    @Override
    public av b(Object object, bw bw2) {
        return this.h.b(object, bw2);
    }

    @Override
    public bw p() {
        return new cn(this);
    }

    @Override
    public bv q() {
        return new cm(this);
    }

    @Override
    public av r() {
        return this.i;
    }

    @Override
    public av a(Throwable throwable) {
        return new cu(this, null, throwable);
    }

    @Override
    public av s() {
        return this.l;
    }

    @Override
    public ao t() {
        return this.g;
    }

    protected abstract b bv_();

    public final int hashCode() {
        return (int)this.f;
    }

    public final boolean equals(Object object) {
        return this == object;
    }

    public final int a(an an2) {
        if (this == an2) {
            return 0;
        }
        long l2 = this.f - (long)an2.hashCode();
        if (l2 > 0L) {
            return 1;
        }
        if (l2 < 0L) {
            return -1;
        }
        l2 = System.identityHashCode(this) - System.identityHashCode(an2);
        if (l2 != 0L) {
            return (int)l2;
        }
        throw new Error();
    }

    public String toString() {
        boolean bl2 = this.I();
        if (this.q == bl2 && this.r != null) {
            return this.r;
        }
        SocketAddress socketAddress = this.h();
        SocketAddress socketAddress2 = this.f();
        if (socketAddress != null) {
            SocketAddress socketAddress3;
            SocketAddress socketAddress4;
            if (this.e == null) {
                socketAddress4 = socketAddress2;
                socketAddress3 = socketAddress;
            } else {
                socketAddress4 = socketAddress;
                socketAddress3 = socketAddress2;
            }
            this.r = String.format("[id: 0x%08x, %s %s %s]", (int)this.f, socketAddress4, bl2 ? "=>" : ":>", socketAddress3);
        } else {
            this.r = socketAddress2 != null ? String.format("[id: 0x%08x, %s]", (int)this.f, socketAddress2) : String.format("[id: 0x%08x]", (int)this.f);
        }
        this.q = bl2;
        return this.r;
    }

    @Override
    public final bw v() {
        return this.j;
    }

    final cz bB_() {
        if (this.d == null) {
            this.d = this.G().k().a();
        }
        return this.d;
    }

    protected abstract boolean a(cr var1);

    protected abstract SocketAddress x();

    protected abstract SocketAddress y();

    protected void bw_() {
    }

    protected abstract void c(SocketAddress var1);

    protected abstract void A();

    protected abstract void B();

    protected void bx_() {
    }

    protected abstract void by_();

    protected abstract void a(bj var1);

    protected Object c(Object object) {
        return object;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((an)object);
    }

    static /* synthetic */ cr a(a a2, cr cr2) {
        a2.o = cr2;
        return a2.o;
    }

    static /* synthetic */ g E() {
        return c;
    }

    static /* synthetic */ j a(a a2) {
        return a2.l;
    }

    static /* synthetic */ boolean a(a a2, boolean bl2) {
        a2.p = bl2;
        return a2.p;
    }

    static /* synthetic */ cf b(a a2) {
        return a2.h;
    }

    static /* synthetic */ boolean c(a a2) {
        return a2.p;
    }

    static /* synthetic */ dq d(a a2) {
        return a2.k;
    }

    static {
        a.setStackTrace(io.netty.util.c.d.k);
        b.setStackTrace(io.netty.util.c.d.k);
    }
}

