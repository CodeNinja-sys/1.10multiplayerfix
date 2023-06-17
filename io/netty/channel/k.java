/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.h;
import io.netty.channel.a;
import io.netty.channel.aa;
import io.netty.channel.ab;
import io.netty.channel.ad;
import io.netty.channel.af;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.be;
import io.netty.channel.bj;
import io.netty.channel.bp;
import io.netty.channel.br;
import io.netty.channel.bv;
import io.netty.channel.bw;
import io.netty.channel.cf;
import io.netty.channel.cm;
import io.netty.channel.cn;
import io.netty.channel.cu;
import io.netty.channel.dl;
import io.netty.channel.dq;
import io.netty.channel.j;
import io.netty.channel.l;
import io.netty.channel.m;
import io.netty.channel.n;
import io.netty.channel.o;
import io.netty.channel.p;
import io.netty.channel.q;
import io.netty.channel.r;
import io.netty.channel.s;
import io.netty.channel.t;
import io.netty.channel.u;
import io.netty.channel.v;
import io.netty.channel.w;
import io.netty.channel.x;
import io.netty.channel.y;
import io.netty.channel.z;
import io.netty.util.f;
import java.net.SocketAddress;

abstract class k
extends f
implements bd {
    volatile k a;
    volatile k b;
    private final boolean d;
    private final boolean e;
    private final a f;
    private final cf g;
    private final String h;
    private boolean i;
    final io.netty.util.b.w c;
    private av j;
    private volatile Runnable k;
    private volatile Runnable l;
    private volatile Runnable m;
    private volatile Runnable n;

    k(cf cf2, io.netty.util.b.x x2, String string, boolean bl2, boolean bl3) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.f = cf2.b;
        this.g = cf2;
        this.h = string;
        if (x2 != null) {
            io.netty.util.b.w w2 = (io.netty.util.b.w)cf2.e.get(x2);
            if (w2 == null) {
                w2 = x2.c();
                cf2.e.put(x2, w2);
            }
            this.c = w2;
        } else {
            this.c = null;
        }
        this.d = bl2;
        this.e = bl3;
    }

    void a() {
        io.netty.util.b.w w2 = this.e();
        if (w2.bt_()) {
            this.y();
        } else {
            w2.execute(new l(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void y() {
        k k2 = this.b;
        if (k2 != null) {
            cf cf2 = this.g;
            synchronized (cf2) {
                this.g.a(this);
            }
            k2.a();
        }
    }

    @Override
    public an b() {
        return this.f;
    }

    @Override
    public br c() {
        return this.g;
    }

    @Override
    public h d() {
        return this.b().G().e();
    }

    @Override
    public io.netty.util.b.w e() {
        if (this.c == null) {
            return this.b().e();
        }
        return this.c;
    }

    @Override
    public String f() {
        return this.h;
    }

    @Override
    public bd g() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.z();
        } else {
            w2.execute(new u(this, k2));
        }
        return this;
    }

    private void z() {
        try {
            ((be)this.x()).g(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd h() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.A();
        } else {
            w2.execute(new v(this, k2));
        }
        return this;
    }

    private void A() {
        try {
            ((be)this.x()).h(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd i() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.B();
        } else {
            w2.execute(new w(this, k2));
        }
        return this;
    }

    private void B() {
        try {
            ((be)this.x()).a(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd j() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.C();
        } else {
            w2.execute(new x(this, k2));
        }
        return this;
    }

    private void C() {
        try {
            ((be)this.x()).b(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd a(Throwable throwable) {
        block5: {
            if (throwable == null) {
                throw new NullPointerException("cause");
            }
            k k2 = this.a;
            io.netty.util.b.w w2 = k2.e();
            if (w2.bt_()) {
                k2.c(throwable);
            } else {
                try {
                    w2.execute(new y(this, k2, throwable));
                }
                catch (Throwable throwable2) {
                    if (!cf.a.f()) break block5;
                    cf.a.d("Failed to submit an exceptionCaught() event.", throwable2);
                    cf.a.d("The exceptionCaught() event that was failed to submit was:", throwable);
                }
            }
        }
        return this;
    }

    private void c(Throwable throwable) {
        block2: {
            try {
                this.x().a(this, throwable);
            }
            catch (Throwable throwable2) {
                if (!cf.a.f()) break block2;
                cf.a.d("An exception was thrown by a user handler's exceptionCaught() method while handling the following exception:", throwable);
            }
        }
    }

    @Override
    public bd a(Object object) {
        if (object == null) {
            throw new NullPointerException("event");
        }
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.e(object);
        } else {
            w2.execute(new z(this, k2, object));
        }
        return this;
    }

    private void e(Object object) {
        try {
            ((be)this.x()).b(this, object);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd b(Object object) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.f(object);
        } else {
            w2.execute(new aa(this, k2, object));
        }
        return this;
    }

    private void f(Object object) {
        try {
            ((be)this.x()).a_(this, object);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd k() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.D();
        } else {
            Runnable runnable = k2.k;
            if (runnable == null) {
                k2.k = runnable = new ab(this, k2);
            }
            w2.execute(runnable);
        }
        return this;
    }

    private void D() {
        try {
            ((be)this.x()).i(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public bd l() {
        k k2 = this.H();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.E();
        } else {
            Runnable runnable = k2.m;
            if (runnable == null) {
                k2.m = runnable = new m(this, k2);
            }
            w2.execute(runnable);
        }
        return this;
    }

    private void E() {
        try {
            ((be)this.x()).j(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public av a(SocketAddress socketAddress) {
        return this.a(socketAddress, this.r());
    }

    @Override
    public av b(SocketAddress socketAddress) {
        return this.b(socketAddress, this.r());
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return this.a(socketAddress, socketAddress2, this.r());
    }

    @Override
    public av m() {
        return this.a(this.r());
    }

    @Override
    public av n() {
        return this.b(this.r());
    }

    @Override
    public av o() {
        return this.c(this.r());
    }

    @Override
    public av a(SocketAddress socketAddress, bw bw2) {
        if (socketAddress == null) {
            throw new NullPointerException("localAddress");
        }
        if (!this.a(bw2, false)) {
            return bw2;
        }
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.c(socketAddress, bw2);
        } else {
            io.netty.channel.k.a(w2, new n(this, k2, socketAddress, bw2), bw2, null);
        }
        return bw2;
    }

    private void c(SocketAddress socketAddress, bw bw2) {
        try {
            ((bp)this.x()).a((bd)this, socketAddress, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public av b(SocketAddress socketAddress, bw bw2) {
        return this.a(socketAddress, null, bw2);
    }

    @Override
    public av a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        }
        if (!this.a(bw2, false)) {
            return bw2;
        }
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.b(socketAddress, socketAddress2, bw2);
        } else {
            io.netty.channel.k.a(w2, new o(this, k2, socketAddress, socketAddress2, bw2), bw2, null);
        }
        return bw2;
    }

    private void b(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        try {
            ((bp)this.x()).a(this, socketAddress, socketAddress2, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public av a(bw bw2) {
        if (!this.a(bw2, false)) {
            return bw2;
        }
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            if (!this.b().F().a()) {
                k2.e(bw2);
            } else {
                k2.d(bw2);
            }
        } else {
            io.netty.channel.k.a(w2, new p(this, k2, bw2), bw2, null);
        }
        return bw2;
    }

    private void d(bw bw2) {
        try {
            ((bp)this.x()).a((bd)this, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public av b(bw bw2) {
        if (!this.a(bw2, false)) {
            return bw2;
        }
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.e(bw2);
        } else {
            io.netty.channel.k.a(w2, new q(this, k2, bw2), bw2, null);
        }
        return bw2;
    }

    private void e(bw bw2) {
        try {
            ((bp)this.x()).b(this, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public av c(bw bw2) {
        if (!this.a(bw2, false)) {
            return bw2;
        }
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.f(bw2);
        } else {
            io.netty.channel.k.a(w2, new r(this, k2, bw2), bw2, null);
        }
        return bw2;
    }

    private void f(bw bw2) {
        try {
            ((bp)this.x()).c(this, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public bd p() {
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.F();
        } else {
            Runnable runnable = k2.l;
            if (runnable == null) {
                k2.l = runnable = new s(this, k2);
            }
            w2.execute(runnable);
        }
        return this;
    }

    private void F() {
        try {
            ((bp)this.x()).c(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public av c(Object object) {
        return this.a(object, this.r());
    }

    @Override
    public av a(Object object, bw bw2) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (!this.a(bw2, true)) {
            io.netty.util.x.b(object);
            return bw2;
        }
        this.a(object, false, bw2);
        return bw2;
    }

    private void c(Object object, bw bw2) {
        try {
            ((bp)this.x()).a((bd)this, object, bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.k.a(throwable, bw2);
        }
    }

    @Override
    public bd q() {
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.G();
        } else {
            Runnable runnable = k2.n;
            if (runnable == null) {
                k2.n = runnable = new t(this, k2);
            }
            io.netty.channel.k.a(w2, runnable, this.f.v(), null);
        }
        return this;
    }

    private void G() {
        try {
            ((bp)this.x()).d(this);
        }
        catch (Throwable throwable) {
            this.d(throwable);
        }
    }

    @Override
    public av b(Object object, bw bw2) {
        if (object == null) {
            throw new NullPointerException("msg");
        }
        if (!this.a(bw2, true)) {
            io.netty.util.x.b(object);
            return bw2;
        }
        this.a(object, true, bw2);
        return bw2;
    }

    private void a(Object object, boolean bl2, bw bw2) {
        k k2 = this.I();
        io.netty.util.b.w w2 = k2.e();
        if (w2.bt_()) {
            k2.c(object, bw2);
            if (bl2) {
                k2.G();
            }
        } else {
            Object object2;
            int n2 = this.f.bB_().a(object);
            if (n2 > 0 && (object2 = this.f.t().a()) != null) {
                ((bj)object2).a(n2);
            }
            object2 = bl2 ? ad.a(k2, object, n2, bw2) : af.a(k2, object, n2, bw2);
            io.netty.channel.k.a(w2, (Runnable)object2, bw2, object);
        }
    }

    @Override
    public av d(Object object) {
        return this.b(object, this.r());
    }

    private static void a(Throwable throwable, bw bw2) {
        if (bw2 instanceof dq) {
            return;
        }
        if (!bw2.b(throwable) && cf.a.f()) {
            cf.a.d("Failed to fail the promise because it's done already: {}", (Object)bw2, (Object)throwable);
        }
    }

    private void d(Throwable throwable) {
        if (io.netty.channel.k.e(throwable)) {
            if (cf.a.f()) {
                cf.a.d("An exception was thrown by a user handler while handling an exceptionCaught event", throwable);
            }
            return;
        }
        this.c(throwable);
    }

    private static boolean e(Throwable throwable) {
        do {
            StackTraceElement[] arrstackTraceElement;
            if ((arrstackTraceElement = throwable.getStackTrace()) == null) continue;
            for (StackTraceElement stackTraceElement : arrstackTraceElement) {
                if (stackTraceElement == null) break;
                if (!"exceptionCaught".equals(stackTraceElement.getMethodName())) continue;
                return true;
            }
        } while ((throwable = throwable.getCause()) != null);
        return false;
    }

    @Override
    public bw r() {
        return new cn(this.b(), this.e());
    }

    @Override
    public bv s() {
        return new cm(this.b(), this.e());
    }

    @Override
    public av t() {
        av av2 = this.j;
        if (av2 == null) {
            this.j = av2 = new dl(this.b(), this.e());
        }
        return av2;
    }

    @Override
    public av b(Throwable throwable) {
        return new cu(this.b(), this.e(), throwable);
    }

    private boolean a(bw bw2, boolean bl2) {
        if (bw2 == null) {
            throw new NullPointerException("promise");
        }
        if (bw2.isDone()) {
            if (bw2.isCancelled()) {
                return false;
            }
            throw new IllegalArgumentException("promise already done: " + bw2);
        }
        if (bw2.e() != this.b()) {
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", bw2.e(), this.b()));
        }
        if (bw2.getClass() == cn.class) {
            return true;
        }
        if (!bl2 && bw2 instanceof dq) {
            throw new IllegalArgumentException(io.netty.util.c.ad.a(dq.class) + " not allowed for this operation");
        }
        if (bw2 instanceof j) {
            throw new IllegalArgumentException(io.netty.util.c.ad.a(j.class) + " not allowed in a pipeline");
        }
        return true;
    }

    private k H() {
        k k2 = this;
        do {
            k2 = k2.a;
        } while (!k2.d);
        return k2;
    }

    private k I() {
        k k2 = this;
        do {
            k2 = k2.b;
        } while (!k2.e);
        return k2;
    }

    @Override
    public bw u() {
        return this.f.v();
    }

    void v() {
        this.i = true;
    }

    @Override
    public boolean w() {
        return this.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(io.netty.util.b.w w2, Runnable runnable, bw bw2, Object object) {
        try {
            w2.execute(runnable);
        }
        catch (Throwable throwable) {
            try {
                bw2.a(throwable);
            }
            finally {
                if (object != null) {
                    io.netty.util.x.b(object);
                }
            }
        }
    }

    static /* synthetic */ void a(k k2) {
        k2.y();
    }

    static /* synthetic */ void b(k k2) {
        k2.z();
    }

    static /* synthetic */ void c(k k2) {
        k2.A();
    }

    static /* synthetic */ void d(k k2) {
        k2.B();
    }

    static /* synthetic */ void e(k k2) {
        k2.C();
    }

    static /* synthetic */ void a(k k2, Throwable throwable) {
        k2.c(throwable);
    }

    static /* synthetic */ void a(k k2, Object object) {
        k2.e(object);
    }

    static /* synthetic */ void b(k k2, Object object) {
        k2.f(object);
    }

    static /* synthetic */ void f(k k2) {
        k2.D();
    }

    static /* synthetic */ void g(k k2) {
        k2.E();
    }

    static /* synthetic */ void a(k k2, SocketAddress socketAddress, bw bw2) {
        k2.c(socketAddress, bw2);
    }

    static /* synthetic */ void a(k k2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        k2.b(socketAddress, socketAddress2, bw2);
    }

    static /* synthetic */ void a(k k2, bw bw2) {
        k2.e(bw2);
    }

    static /* synthetic */ void b(k k2, bw bw2) {
        k2.d(bw2);
    }

    static /* synthetic */ void c(k k2, bw bw2) {
        k2.f(bw2);
    }

    static /* synthetic */ void h(k k2) {
        k2.F();
    }

    static /* synthetic */ void i(k k2) {
        k2.G();
    }

    static /* synthetic */ a j(k k2) {
        return k2.f;
    }

    static /* synthetic */ void a(k k2, Object object, bw bw2) {
        k2.c(object, bw2);
    }
}

