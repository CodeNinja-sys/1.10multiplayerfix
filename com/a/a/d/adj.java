/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.acw;
import com.a.a.d.adn;
import com.a.a.d.vi;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class adj
extends adn
implements vi {
    transient Set a;
    transient Collection b;
    transient Collection c;
    transient Map d;
    transient xc e;
    private static final long f = 0L;

    vi b() {
        return (vi)super.e();
    }

    adj(vi vi2, Object object) {
        super(vi2, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int g() {
        Object object = this.h;
        synchronized (object) {
            return this.b().g();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean o() {
        Object object = this.h;
        synchronized (object) {
            return this.b().o();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean f(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().f(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean g(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().g(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.b().b(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection c(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return acu.a(this.b().c(object), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.b().a(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c(Object object, Iterable iterable) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().c(object, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(vi vi2) {
        Object object = this.h;
        synchronized (object) {
            return this.b().a(vi2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection b(Object object, Iterable iterable) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().b(object, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.b().c(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection d(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().d(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void h() {
        Object object = this.h;
        synchronized (object) {
            this.b().h();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set q() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = acu.b(this.b().q(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection j() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = acu.b(this.b().j(), this.h);
            }
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Collection l() {
        Object object = this.h;
        synchronized (object) {
            if (this.c == null) {
                this.c = acu.a(this.b().l(), this.h);
            }
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map c() {
        Object object = this.h;
        synchronized (object) {
            if (this.d == null) {
                this.d = new acw(this.b().c(), this.h);
            }
            return this.d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public xc r() {
        Object object = this.h;
        synchronized (object) {
            if (this.e == null) {
                this.e = acu.a(this.b().r(), this.h);
            }
            return this.e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = this.h;
        synchronized (object2) {
            return this.b().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.b().hashCode();
        }
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }
}

