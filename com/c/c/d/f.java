/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.c.c.b.r;
import com.c.c.d.h;
import com.c.c.d.i;
import com.c.c.d.j;
import com.c.c.d.k;
import com.c.c.d.l;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.minecraft.s.b;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f {
    private static final d a = org.apache.logging.log4j.c.c();
    private final ScheduledExecutorService b = Executors.newScheduledThreadPool(3);
    private static final int c = 60;
    private static final int d = 10;
    private static final int e = 60;
    private static final int f = 10;
    private volatile boolean g = true;
    private j h = new j(this, null);
    private i i = new i(this, null);
    private l j = new l(this, null);
    private h k = new h(this, null);
    private Set l = aad.a();
    private List m = ov.a();
    private r n;
    private int o;
    private boolean p = false;
    private ScheduledFuture q;
    private ScheduledFuture r;
    private ScheduledFuture s;
    private ScheduledFuture t;
    private Map u = new ConcurrentHashMap(com.c.c.d.k.values().length);

    public boolean a() {
        return this.g;
    }

    public synchronized void b() {
        if (this.g) {
            this.g = false;
            this.l();
            this.k();
        }
    }

    public synchronized void a(List list) {
        if (this.g) {
            this.g = false;
            this.l();
            for (k k2 : list) {
                this.u.put(k2, false);
                switch (k2) {
                    case a: {
                        this.q = this.b.scheduleAtFixedRate(this.h, 0L, 60L, TimeUnit.SECONDS);
                        break;
                    }
                    case b: {
                        this.r = this.b.scheduleAtFixedRate(this.i, 0L, 10L, TimeUnit.SECONDS);
                        break;
                    }
                    case c: {
                        this.s = this.b.scheduleAtFixedRate(this.j, 0L, 60L, TimeUnit.SECONDS);
                        break;
                    }
                    case d: {
                        this.t = this.b.scheduleAtFixedRate(this.k, 0L, 10L, TimeUnit.SECONDS);
                    }
                }
            }
        }
    }

    public boolean a(k k2) {
        Boolean bl2 = (Boolean)this.u.get((Object)k2);
        return bl2 == null ? false : bl2;
    }

    public void c() {
        for (k k2 : this.u.keySet()) {
            this.u.put(k2, false);
        }
    }

    public synchronized void d() {
        this.i();
        this.b();
    }

    public synchronized List e() {
        return ov.a((Iterable)this.m);
    }

    public synchronized int f() {
        return this.o;
    }

    public synchronized boolean g() {
        return this.p;
    }

    public synchronized r h() {
        return this.n;
    }

    public synchronized void i() {
        this.g = true;
        this.l();
    }

    private void k() {
        for (k k2 : com.c.c.d.k.values()) {
            this.u.put(k2, false);
        }
        this.q = this.b.scheduleAtFixedRate(this.h, 0L, 60L, TimeUnit.SECONDS);
        this.r = this.b.scheduleAtFixedRate(this.i, 0L, 10L, TimeUnit.SECONDS);
        this.s = this.b.scheduleAtFixedRate(this.j, 0L, 60L, TimeUnit.SECONDS);
        this.t = this.b.scheduleAtFixedRate(this.k, 0L, 10L, TimeUnit.SECONDS);
    }

    private void l() {
        try {
            if (this.q != null) {
                this.q.cancel(false);
            }
            if (this.r != null) {
                this.r.cancel(false);
            }
            if (this.s != null) {
                this.s.cancel(false);
            }
            if (this.t != null) {
                this.t.cancel(false);
            }
        }
        catch (Exception exception) {
            a.b("Failed to cancel Realms tasks", (Throwable)exception);
        }
    }

    private synchronized void b(List list) {
        int n2 = 0;
        for (com.c.c.b.i i2 : this.l) {
            if (!list.remove(i2)) continue;
            ++n2;
        }
        if (n2 == 0) {
            this.l.clear();
        }
        this.m = list;
    }

    public synchronized void a(com.c.c.b.i i2) {
        this.m.remove(i2);
        this.l.add(i2);
    }

    private void c(List list) {
        Collections.sort(list, new com.c.c.b.k(net.minecraft.s.b.h()));
    }

    private boolean m() {
        return !this.g;
    }

    static /* synthetic */ boolean a(f f2) {
        return f2.m();
    }

    static /* synthetic */ void a(f f2, List list) {
        f2.c(list);
    }

    static /* synthetic */ void b(f f2, List list) {
        f2.b(list);
    }

    static /* synthetic */ Map b(f f2) {
        return f2.u;
    }

    static /* synthetic */ d j() {
        return a;
    }

    static /* synthetic */ int a(f f2, int n2) {
        f2.o = n2;
        return f2.o;
    }

    static /* synthetic */ boolean a(f f2, boolean bl2) {
        f2.p = bl2;
        return f2.p;
    }

    static /* synthetic */ r a(f f2, r r2) {
        f2.n = r2;
        return f2.n;
    }
}

