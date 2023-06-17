/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.b.du;
import com.a.a.d.aac;
import com.a.a.d.iz;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.kk;
import com.a.a.d.lo;
import com.a.a.d.lr;
import com.a.a.d.ls;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.d.we;
import com.a.a.d.xc;
import com.a.a.d.yd;
import com.a.a.n.a.do;
import com.a.a.n.a.ds;
import com.a.a.n.a.dt;
import com.a.a.n.a.er;
import com.a.a.n.a.eu;
import com.a.a.n.a.fb;
import com.a.a.n.a.ff;
import com.a.a.n.a.fg;
import com.a.a.n.a.fj;
import com.a.a.n.a.fk;
import com.a.a.n.a.fl;
import com.a.a.n.a.fm;
import com.a.a.n.a.fn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

final class fi {
    final ds a = new ds();
    final aac b = we.c(new EnumMap(eu.class), new fj(this));
    final xc c = this.b.r();
    final Map d = sz.g();
    boolean e;
    boolean f;
    final int g;
    final dt h = new fk(this, this.a);
    final dt i = new fl(this, this.a);
    final List j = Collections.synchronizedList(new ArrayList());

    fi(iz iz2) {
        this.g = iz2.size();
        this.b.c((Object)eu.a, iz2);
        for (er er2 : iz2) {
            this.d.put(er2, du.a());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a() {
        block5: {
            this.a.a();
            try {
                if (!this.f) {
                    this.e = true;
                    break block5;
                }
                ArrayList arrayList = ov.a();
                for (er er2 : this.d().E()) {
                    if (er2.g() == eu.a) continue;
                    arrayList.add(er2);
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayList);
            }
            finally {
                this.a.d();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(ff ff2, Executor executor) {
        cl.a(ff2, (Object)"listener");
        cl.a(executor, (Object)"executor");
        this.a.a();
        try {
            if (!this.i.a()) {
                this.j.add(new do(ff2, executor));
            }
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b() {
        this.a.b(this.h);
        try {
            this.i();
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l2, TimeUnit timeUnit) {
        this.a.a();
        try {
            if (!this.a.f(this.h, l2, timeUnit)) {
                throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + we.a(this.b, cn.a(lo.b((Object)eu.a, (Object)eu.b))));
            }
            this.i();
        }
        finally {
            this.a.d();
        }
    }

    void c() {
        this.a.b(this.i);
        this.a.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(long l2, TimeUnit timeUnit) {
        this.a.a();
        try {
            if (!this.a.f(this.i, l2, timeUnit)) {
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + we.a(this.b, cn.a(cn.a(lo.b((Object)eu.e, (Object)eu.f)))));
            }
        }
        finally {
            this.a.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    kk d() {
        ls ls2 = lr.b();
        this.a.a();
        try {
            for (Map.Entry entry : this.b.u()) {
                if (entry.getValue() instanceof fg) continue;
                ls2.a(entry.getKey(), entry.getValue());
            }
        }
        finally {
            this.a.d();
        }
        return ls2.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    jt e() {
        ArrayList arrayList;
        this.a.a();
        try {
            arrayList = ov.b(this.c.size() - this.c.a((Object)eu.a) + this.c.a((Object)eu.b));
            for (Map.Entry object : this.d.entrySet()) {
                Object object2 = (er)object.getKey();
                du du2 = (du)object.getValue();
                if (du2.c() || this.b.b((Object)eu.a, object2) || object2 instanceof fg) continue;
                arrayList.add(sz.a(object2, (Object)du2.a(TimeUnit.MILLISECONDS)));
            }
        }
        finally {
            this.a.d();
        }
        Collections.sort(arrayList, yd.d().a(new fm(this)));
        ju ju2 = jt.n();
        for (Object object2 : arrayList) {
            ju2.a((Map.Entry)object2);
        }
        return ju2.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(er er2, eu eu2, eu eu3) {
        cl.a(er2);
        cl.a(eu2 != eu3);
        this.a.a();
        try {
            this.f = true;
            if (!this.e) {
                return;
            }
            cl.b(this.b.c((Object)eu2, er2), "Service %s not at the expected location in the state map %s", new Object[]{er2, eu2});
            cl.b(this.b.a((Object)eu3, er2), "Service %s in the state map unexpectedly at %s", new Object[]{er2, eu3});
            du du2 = (du)this.d.get(er2);
            if (eu2 == eu.a) {
                du2.d();
            }
            if (eu3.compareTo(eu.c) >= 0 && du2.c()) {
                du2.e();
                if (!(er2 instanceof fg)) {
                    fb.h().log(Level.FINE, "Started {0} in {1}.", new Object[]{er2, du2});
                }
            }
            if (eu3 == eu.f) {
                this.a(er2);
            }
            if (this.c.a((Object)eu.c) == this.g) {
                this.g();
            } else if (this.c.a((Object)eu.e) + this.c.a((Object)eu.f) == this.g) {
                this.f();
            }
        }
        finally {
            this.a.d();
            this.h();
        }
    }

    void f() {
        fb.i().a(this.j);
    }

    void g() {
        fb.j().a(this.j);
    }

    void a(er er2) {
        new fn(this, "failed({service=" + er2 + "})", er2).a(this.j);
    }

    void h() {
        cl.b(!this.a.g(), "It is incorrect to execute listeners with the monitor held.");
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            ((do)this.j.get(i2)).a();
        }
    }

    void i() {
        if (this.c.a((Object)eu.c) != this.g) {
            throw new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + we.a(this.b, cn.a(cn.a((Object)eu.c))));
        }
    }
}

