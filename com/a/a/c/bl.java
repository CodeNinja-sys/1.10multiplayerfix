/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.du;
import com.a.a.c.ab;
import com.a.a.c.ao;
import com.a.a.c.bm;
import com.a.a.c.bs;
import com.a.a.c.cg;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import com.a.a.n.a.fo;
import com.a.a.n.a.gm;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

class bl
implements cg {
    volatile cg a;
    final fo b = fo.c();
    final du c = du.a();

    public bl() {
        this(ao.p());
    }

    public bl(cg cg2) {
        this.a = cg2;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d() {
        return this.a.d();
    }

    @Override
    public int a() {
        return this.a.a();
    }

    public boolean b(Object object) {
        return this.b.a(object);
    }

    public boolean a(Throwable throwable) {
        return this.b.a(throwable);
    }

    private dl b(Throwable throwable) {
        return ci.a(throwable);
    }

    @Override
    public void a(Object object) {
        if (object != null) {
            this.b(object);
        } else {
            this.a = ao.p();
        }
    }

    public dl a(Object object, ab ab2) {
        this.c.d();
        Object object2 = this.a.get();
        try {
            if (object2 == null) {
                Object object3 = ab2.a(object);
                return this.b(object3) ? this.b : ci.a(object3);
            }
            dl dl2 = ab2.a(object, object2);
            if (dl2 == null) {
                return ci.a(null);
            }
            return ci.b(dl2, new bm(this));
        }
        catch (Throwable throwable) {
            if (throwable instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return this.a(throwable) ? this.b : this.b(throwable);
        }
    }

    public long f() {
        return this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override
    public Object e() {
        return gm.a(this.b);
    }

    @Override
    public Object get() {
        return this.a.get();
    }

    public cg g() {
        return this.a;
    }

    @Override
    public bs b() {
        return null;
    }

    @Override
    public cg a(ReferenceQueue referenceQueue, Object object, bs bs2) {
        return this;
    }
}

