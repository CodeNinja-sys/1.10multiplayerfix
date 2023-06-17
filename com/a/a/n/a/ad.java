/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.ae;
import com.a.a.n.a.ag;
import com.a.a.n.a.ah;
import com.a.a.n.a.ai;
import com.a.a.n.a.aj;
import com.a.a.n.a.ak;
import com.a.a.n.a.al;
import com.a.a.n.a.am;
import com.a.a.n.a.an;
import com.a.a.n.a.ao;
import com.a.a.n.a.do;
import com.a.a.n.a.dp;
import com.a.a.n.a.ds;
import com.a.a.n.a.dt;
import com.a.a.n.a.er;
import com.a.a.n.a.et;
import com.a.a.n.a.eu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class ad
implements er {
    private static final dp a = new ae("starting()");
    private static final dp b = new ag("running()");
    private static final dp c = ad.b(eu.b);
    private static final dp d = ad.b(eu.c);
    private static final dp e = ad.a(eu.a);
    private static final dp f = ad.a(eu.c);
    private static final dp g = ad.a(eu.d);
    private final ds h = new ds();
    private final dt i = new aj(this, this.h);
    private final dt j = new ak(this, this.h);
    private final dt k = new al(this, this.h);
    private final dt l = new am(this, this.h);
    private final List m = Collections.synchronizedList(new ArrayList());
    private volatile ao n = new ao(eu.a);

    private static dp a(eu eu2) {
        return new ah("terminated({from = " + (Object)((Object)eu2) + "})", eu2);
    }

    private static dp b(eu eu2) {
        return new ai("stopping({from = " + (Object)((Object)eu2) + "})", eu2);
    }

    protected ad() {
    }

    protected abstract void a();

    protected abstract void b();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final er i() {
        if (this.h.c(this.i)) {
            try {
                this.n = new ao(eu.b);
                this.m();
                this.a();
            }
            catch (Throwable throwable) {
                this.a(throwable);
            }
            finally {
                this.h.d();
                this.e();
            }
        } else {
            throw new IllegalStateException("Service " + this + " has already been started");
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final er j() {
        if (!this.h.c(this.j)) return this;
        try {
            eu eu2 = this.g();
            switch (eu2) {
                case a: {
                    this.n = new ao(eu.e);
                    this.e(eu.a);
                    return this;
                }
                case b: {
                    this.n = new ao(eu.b, true, null);
                    this.d(eu.b);
                    return this;
                }
                case c: {
                    this.n = new ao(eu.d);
                    this.d(eu.c);
                    this.b();
                    return this;
                }
                case d: 
                case e: 
                case f: {
                    throw new AssertionError((Object)("isStoppable is incorrectly implemented, saw: " + (Object)((Object)eu2)));
                }
                default: {
                    throw new AssertionError((Object)("Unexpected state: " + (Object)((Object)eu2)));
                }
            }
        }
        catch (Throwable throwable) {
            this.a(throwable);
            return this;
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void k() {
        this.h.b(this.k);
        try {
            this.c(eu.c);
        }
        finally {
            this.h.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(long l2, TimeUnit timeUnit) {
        if (this.h.b(this.k, l2, timeUnit)) {
            try {
                this.c(eu.c);
            }
            finally {
                this.h.d();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state. " + "Current state: " + (Object)((Object)this.g()));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void l() {
        this.h.b(this.l);
        try {
            this.c(eu.e);
        }
        finally {
            this.h.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void b(long l2, TimeUnit timeUnit) {
        if (this.h.b(this.l, l2, timeUnit)) {
            try {
                this.c(eu.e);
            }
            finally {
                this.h.d();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. " + "Current state: " + (Object)((Object)this.g()));
        }
    }

    private void c(eu eu2) {
        eu eu3 = this.g();
        if (eu3 != eu2) {
            if (eu3 == eu.f) {
                throw new IllegalStateException("Expected the service to be " + (Object)((Object)eu2) + ", but the service has FAILED", this.h());
            }
            throw new IllegalStateException("Expected the service to be " + (Object)((Object)eu2) + ", but was " + (Object)((Object)eu3));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void c() {
        this.h.a();
        try {
            if (this.n.a != eu.b) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + (Object)((Object)this.n.a));
                this.a(illegalStateException);
                throw illegalStateException;
            }
            if (this.n.b) {
                this.n = new ao(eu.d);
                this.b();
            } else {
                this.n = new ao(eu.c);
                this.n();
            }
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void d() {
        this.h.a();
        try {
            eu eu2 = this.n.a;
            if (eu2 != eu.d && eu2 != eu.c) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStopped() when the service is " + (Object)((Object)eu2));
                this.a(illegalStateException);
                throw illegalStateException;
            }
            this.n = new ao(eu.e);
            this.e(eu2);
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void a(Throwable throwable) {
        cl.a(throwable);
        this.h.a();
        try {
            eu eu2 = this.g();
            switch (eu2) {
                case a: 
                case e: {
                    throw new IllegalStateException("Failed while in state:" + (Object)((Object)eu2), throwable);
                }
                case b: 
                case c: 
                case d: {
                    this.n = new ao(eu.f, false, throwable);
                    this.a(eu2, throwable);
                    return;
                }
                case f: {
                    return;
                }
                default: {
                    throw new AssertionError((Object)("Unexpected state: " + (Object)((Object)eu2)));
                }
            }
        }
        finally {
            this.h.d();
            this.e();
        }
    }

    @Override
    public final boolean f() {
        return this.g() == eu.c;
    }

    @Override
    public final eu g() {
        return this.n.a();
    }

    @Override
    public final Throwable h() {
        return this.n.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void a(et et2, Executor executor) {
        cl.a(et2, (Object)"listener");
        cl.a(executor, (Object)"executor");
        this.h.a();
        try {
            if (!this.g().a()) {
                this.m.add(new do(et2, executor));
            }
        }
        finally {
            this.h.d();
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [" + (Object)((Object)this.g()) + "]";
    }

    private void e() {
        if (!this.h.g()) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                ((do)this.m.get(i2)).a();
            }
        }
    }

    private void m() {
        a.a(this.m);
    }

    private void n() {
        b.a(this.m);
    }

    private void d(eu eu2) {
        if (eu2 == eu.b) {
            c.a(this.m);
        } else if (eu2 == eu.c) {
            d.a(this.m);
        } else {
            throw new AssertionError();
        }
    }

    private void e(eu eu2) {
        switch (eu2) {
            case a: {
                e.a(this.m);
                break;
            }
            case c: {
                f.a(this.m);
                break;
            }
            case d: {
                g.a(this.m);
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    private void a(eu eu2, Throwable throwable) {
        new an(this, "failed({from = " + (Object)((Object)eu2) + ", cause = " + throwable + "})", eu2, throwable).a(this.m);
    }
}

