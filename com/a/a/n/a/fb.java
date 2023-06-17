/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.kk;
import com.a.a.n.a.dp;
import com.a.a.n.a.dq;
import com.a.a.n.a.du;
import com.a.a.n.a.er;
import com.a.a.n.a.eu;
import com.a.a.n.a.fc;
import com.a.a.n.a.fd;
import com.a.a.n.a.fe;
import com.a.a.n.a.ff;
import com.a.a.n.a.fg;
import com.a.a.n.a.fh;
import com.a.a.n.a.fi;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class fb {
    private static final Logger a = Logger.getLogger(fb.class.getName());
    private static final dp b = new fc("healthy()");
    private static final dp c = new fd("stopped()");
    private final fi d;
    private final jl e;

    public fb(Iterable iterable) {
        jl jl2 = jl.a(iterable);
        if (jl2.isEmpty()) {
            a.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", new fe(null));
            jl2 = jl.a(new fg(null));
        }
        this.d = new fi(jl2);
        this.e = jl2;
        WeakReference<fi> weakReference = new WeakReference<fi>(this.d);
        dq dq2 = du.a();
        for (er er2 : jl2) {
            er2.a(new fh(er2, weakReference), dq2);
            cl.a(er2.g() == eu.a, "Can only manage NEW services, %s", new Object[]{er2});
        }
        this.d.a();
    }

    public void a(ff ff2, Executor executor) {
        this.d.a(ff2, executor);
    }

    public void a(ff ff2) {
        this.d.a(ff2, du.a());
    }

    public fb a() {
        for (er er2 : this.e) {
            eu eu2 = er2.g();
            cl.b(eu2 == eu.a, "Service %s is %s, cannot start it.", new Object[]{er2, eu2});
        }
        for (er er2 : this.e) {
            try {
                er2.i();
            }
            catch (IllegalStateException illegalStateException) {
                a.log(Level.WARNING, "Unable to start Service " + er2, illegalStateException);
            }
        }
        return this;
    }

    public void b() {
        this.d.b();
    }

    public void a(long l2, TimeUnit timeUnit) {
        this.d.a(l2, timeUnit);
    }

    public fb c() {
        for (er er2 : this.e) {
            er2.j();
        }
        return this;
    }

    public void d() {
        this.d.c();
    }

    public void b(long l2, TimeUnit timeUnit) {
        this.d.b(l2, timeUnit);
    }

    public boolean e() {
        for (er er2 : this.e) {
            if (er2.f()) continue;
            return false;
        }
        return true;
    }

    public kk f() {
        return this.d.d();
    }

    public jt g() {
        return this.d.e();
    }

    public String toString() {
        return cc.a(fb.class).a("services", cm.a((Collection)this.e, cn.a(cn.a(fg.class)))).toString();
    }

    static /* synthetic */ Logger h() {
        return a;
    }

    static /* synthetic */ dp i() {
        return c;
    }

    static /* synthetic */ dp j() {
        return b;
    }
}

