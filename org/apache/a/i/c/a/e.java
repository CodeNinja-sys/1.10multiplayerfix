/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.apache.a.f.i;
import org.apache.a.f.w;
import org.apache.a.i.c.a.a;
import org.apache.a.i.c.a.f;
import org.apache.a.i.c.a.g;
import org.apache.a.i.c.a.h;
import org.apache.a.i.c.a.l;
import org.apache.a.i.c.a.m;
import org.apache.a.i.c.b;
import org.apache.a.l.j;
import org.apache.commons.d.c;

public class e
extends a {
    private final org.apache.commons.d.a q = org.apache.commons.d.c.b(this.getClass());
    private final Lock r;
    protected final org.apache.a.f.e h;
    protected final org.apache.a.f.a.g i;
    protected final Set j;
    protected final Queue k;
    protected final Queue l;
    protected final Map m;
    private final long s;
    private final TimeUnit t;
    protected volatile boolean n;
    protected volatile int o;
    protected volatile int p;

    public e(org.apache.a.f.e e2, org.apache.a.f.a.g g2, int n2) {
        this(e2, g2, n2, -1L, TimeUnit.MILLISECONDS);
    }

    public e(org.apache.a.f.e e2, org.apache.a.f.a.g g2, int n2, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(e2, "Connection operator");
        org.apache.a.o.a.a(g2, "Connections per route");
        this.r = this.a;
        this.j = this.b;
        this.h = e2;
        this.i = g2;
        this.o = n2;
        this.k = this.f();
        this.l = this.g();
        this.m = this.h();
        this.s = l2;
        this.t = timeUnit;
    }

    protected Lock e() {
        return this.r;
    }

    public e(org.apache.a.f.e e2, j j2) {
        this(e2, org.apache.a.f.a.e.b(j2), org.apache.a.f.a.e.c(j2));
    }

    protected Queue f() {
        return new LinkedList();
    }

    protected Queue g() {
        return new LinkedList();
    }

    protected Map h() {
        return new HashMap();
    }

    protected h b(org.apache.a.f.b.b b2) {
        return new h(b2, this.i);
    }

    protected l a(Condition condition, h h2) {
        return new l(condition, h2);
    }

    private void b(org.apache.a.i.c.a.b b2) {
        w w2 = b2.c();
        if (w2 != null) {
            try {
                w2.close();
            }
            catch (IOException iOException) {
                this.q.b("I/O error closing connection", iOException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected h a(org.apache.a.f.b.b b2, boolean bl2) {
        h h2 = null;
        this.r.lock();
        try {
            h2 = (h)this.m.get(b2);
            if (h2 == null && bl2) {
                h2 = this.b(b2);
                this.m.put(b2, h2);
            }
        }
        finally {
            this.r.unlock();
        }
        return h2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int c(org.apache.a.f.b.b b2) {
        this.r.lock();
        try {
            h h2 = this.a(b2, false);
            int n2 = h2 != null ? h2.e() : 0;
            return n2;
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int i() {
        this.r.lock();
        try {
            int n2 = this.p;
            return n2;
        }
        finally {
            this.r.unlock();
        }
    }

    public g a(org.apache.a.f.b.b b2, Object object) {
        m m2 = new m();
        return new f(this, m2, b2, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected org.apache.a.i.c.a.b a(org.apache.a.f.b.b b2, Object object, long l2, TimeUnit timeUnit, m m2) {
        Date date = null;
        if (l2 > 0L) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(l2));
        }
        org.apache.a.i.c.a.b b3 = null;
        this.r.lock();
        try {
            h h2 = this.a(b2, true);
            l l3 = null;
            while (b3 == null) {
                boolean bl2;
                org.apache.a.o.b.a(!this.n, "Connection pool shut down");
                if (this.q.a()) {
                    this.q.b("[" + b2 + "] total kept alive: " + this.k.size() + ", total issued: " + this.j.size() + ", total allocated: " + this.p + " out of " + this.o);
                }
                if ((b3 = this.a(h2, object)) != null) {
                    break;
                }
                boolean bl3 = bl2 = h2.d() > 0;
                if (this.q.a()) {
                    this.q.b("Available capacity: " + h2.d() + " out of " + h2.b() + " [" + b2 + "][" + object + "]");
                }
                if (bl2 && this.p < this.o) {
                    b3 = this.a(h2, this.h);
                    continue;
                }
                if (bl2 && !this.k.isEmpty()) {
                    this.j();
                    h2 = this.a(b2, true);
                    b3 = this.a(h2, this.h);
                    continue;
                }
                if (this.q.a()) {
                    this.q.b("Need to wait for connection [" + b2 + "][" + object + "]");
                }
                if (l3 == null) {
                    l3 = this.a(this.r.newCondition(), h2);
                    m2.a(l3);
                }
                boolean bl4 = false;
                try {
                    h2.a(l3);
                    this.l.add(l3);
                    bl4 = l3.a(date);
                }
                finally {
                    h2.b(l3);
                    this.l.remove(l3);
                }
                if (bl4 || date == null || date.getTime() > System.currentTimeMillis()) continue;
                throw new i("Timeout waiting for connection from pool");
            }
        }
        finally {
            this.r.unlock();
        }
        return b3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.i.c.a.b b2, boolean bl2, long l2, TimeUnit timeUnit) {
        org.apache.a.f.b.b b3 = b2.d();
        if (this.q.a()) {
            this.q.b("Releasing connection [" + b3 + "][" + b2.a() + "]");
        }
        this.r.lock();
        try {
            if (this.n) {
                this.b(b2);
                return;
            }
            this.j.remove(b2);
            h h2 = this.a(b3, true);
            if (bl2 && h2.d() >= 0) {
                if (this.q.a()) {
                    String string = l2 > 0L ? "for " + l2 + " " + (Object)((Object)timeUnit) : "indefinitely";
                    this.q.b("Pooling connection [" + b3 + "][" + b2.a() + "]; keep alive " + string);
                }
                h2.a(b2);
                b2.a(l2, timeUnit);
                this.k.add(b2);
            } else {
                this.b(b2);
                h2.f();
                --this.p;
            }
            this.a(h2);
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected org.apache.a.i.c.a.b a(h h2, Object object) {
        org.apache.a.i.c.a.b b2 = null;
        this.r.lock();
        try {
            boolean bl2 = false;
            while (!bl2) {
                b2 = h2.a(object);
                if (b2 != null) {
                    if (this.q.a()) {
                        this.q.b("Getting free connection [" + h2.a() + "][" + object + "]");
                    }
                    this.k.remove(b2);
                    if (b2.a(System.currentTimeMillis())) {
                        if (this.q.a()) {
                            this.q.b("Closing expired free connection [" + h2.a() + "][" + object + "]");
                        }
                        this.b(b2);
                        h2.f();
                        --this.p;
                        continue;
                    }
                    this.j.add(b2);
                    bl2 = true;
                    continue;
                }
                bl2 = true;
                if (!this.q.a()) continue;
                this.q.b("No free connections [" + h2.a() + "][" + object + "]");
            }
        }
        finally {
            this.r.unlock();
        }
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected org.apache.a.i.c.a.b a(h h2, org.apache.a.f.e e2) {
        if (this.q.a()) {
            this.q.b("Creating new connection [" + h2.a() + "]");
        }
        org.apache.a.i.c.a.b b2 = new org.apache.a.i.c.a.b(e2, h2.a(), this.s, this.t);
        this.r.lock();
        try {
            h2.b(b2);
            ++this.p;
            this.j.add(b2);
        }
        finally {
            this.r.unlock();
        }
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(org.apache.a.i.c.a.b b2) {
        org.apache.a.f.b.b b3 = b2.d();
        if (this.q.a()) {
            this.q.b("Deleting connection [" + b3 + "][" + b2.a() + "]");
        }
        this.r.lock();
        try {
            this.b(b2);
            h h2 = this.a(b3, true);
            h2.c(b2);
            --this.p;
            if (h2.c()) {
                this.m.remove(b3);
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void j() {
        this.r.lock();
        try {
            org.apache.a.i.c.a.b b2 = (org.apache.a.i.c.a.b)this.k.remove();
            if (b2 != null) {
                this.a(b2);
            } else if (this.q.a()) {
                this.q.b("No free connection to delete");
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(org.apache.a.f.b.b b2) {
        this.r.lock();
        try {
            h h2 = this.a(b2, true);
            h2.f();
            if (h2.c()) {
                this.m.remove(b2);
            }
            --this.p;
            this.a(h2);
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(h h2) {
        l l2 = null;
        this.r.lock();
        try {
            if (h2 != null && h2.g()) {
                if (this.q.a()) {
                    this.q.b("Notifying thread waiting on pool [" + h2.a() + "]");
                }
                l2 = h2.h();
            } else if (!this.l.isEmpty()) {
                if (this.q.a()) {
                    this.q.b("Notifying thread waiting on any pool");
                }
                l2 = (l)this.l.remove();
            } else if (this.q.a()) {
                this.q.b("Notifying no-one, there are no waiting threads");
            }
            if (l2 != null) {
                l2.d();
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        this.r.lock();
        try {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                org.apache.a.i.c.a.b b2 = (org.apache.a.i.c.a.b)iterator.next();
                if (b2.c().c()) continue;
                iterator.remove();
                this.a(b2);
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, TimeUnit timeUnit) {
        long l3;
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        long l4 = l3 = l2 > 0L ? l2 : 0L;
        if (this.q.a()) {
            this.q.b("Closing connections idle longer than " + l3 + " " + (Object)((Object)timeUnit));
        }
        long l5 = System.currentTimeMillis() - timeUnit.toMillis(l3);
        this.r.lock();
        try {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                org.apache.a.i.c.a.b b2 = (org.apache.a.i.c.a.b)iterator.next();
                if (b2.g() > l5) continue;
                if (this.q.a()) {
                    this.q.b("Closing connection last used @ " + new Date(b2.g()));
                }
                iterator.remove();
                this.a(b2);
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        this.q.b("Closing expired connections");
        long l2 = System.currentTimeMillis();
        this.r.lock();
        try {
            Iterator iterator = this.k.iterator();
            while (iterator.hasNext()) {
                org.apache.a.i.c.a.b b2 = (org.apache.a.i.c.a.b)iterator.next();
                if (!b2.a(l2)) continue;
                if (this.q.a()) {
                    this.q.b("Closing connection expired @ " + new Date(b2.h()));
                }
                iterator.remove();
                this.a(b2);
            }
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        this.r.lock();
        try {
            Object object;
            Object object2;
            if (this.n) {
                return;
            }
            this.n = true;
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                object2 = (org.apache.a.i.c.a.b)iterator.next();
                iterator.remove();
                this.b((org.apache.a.i.c.a.b)object2);
            }
            object2 = this.k.iterator();
            while (object2.hasNext()) {
                object = (org.apache.a.i.c.a.b)object2.next();
                object2.remove();
                if (this.q.a()) {
                    this.q.b("Closing connection [" + ((org.apache.a.i.c.a.b)object).d() + "][" + ((b)object).a() + "]");
                }
                this.b((org.apache.a.i.c.a.b)object);
            }
            object = this.l.iterator();
            while (object.hasNext()) {
                l l2 = (l)object.next();
                object.remove();
                l2.d();
            }
            this.m.clear();
        }
        finally {
            this.r.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2) {
        this.r.lock();
        try {
            this.o = n2;
        }
        finally {
            this.r.unlock();
        }
    }

    public int k() {
        return this.o;
    }

    static /* synthetic */ Lock a(e e2) {
        return e2.r;
    }
}

