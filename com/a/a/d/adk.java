/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.add;
import com.a.a.d.xc;
import java.util.Collection;
import java.util.Set;

class adk
extends add
implements xc {
    transient Set a;
    transient Set b;
    private static final long c = 0L;

    adk(xc xc2, Object object) {
        super(xc2, object, null);
    }

    xc c() {
        return (xc)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().a(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object, int n2) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().a(object, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int b(Object object, int n2) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().b(object, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int c(Object object, int n2) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().c(object, n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(Object object, int n2, int n3) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.c().a(object, n2, n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set d() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = acu.b(this.c().d(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set aS_() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = acu.b(this.c().aS_(), this.h);
            }
            return this.b;
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
            return this.c().equals(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int hashCode() {
        Object object = this.h;
        synchronized (object) {
            return this.c().hashCode();
        }
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

