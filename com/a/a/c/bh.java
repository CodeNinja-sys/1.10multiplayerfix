/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.ao;
import com.a.a.c.bs;
import com.a.a.c.bt;
import com.a.a.c.ct;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class bh
implements Iterator {
    int b;
    int c;
    bt d;
    AtomicReferenceArray e;
    bs f;
    ct g;
    ct h;
    final /* synthetic */ ao i;

    bh(ao ao2) {
        this.i = ao2;
        this.b = ao2.j.length - 1;
        this.c = -1;
        this.b();
    }

    public abstract Object next();

    final void b() {
        this.g = null;
        if (this.c()) {
            return;
        }
        if (this.d()) {
            return;
        }
        while (this.b >= 0) {
            this.d = this.i.j[this.b--];
            if (this.d.b == 0) continue;
            this.e = this.d.f;
            this.c = this.e.length() - 1;
            if (!this.d()) continue;
            return;
        }
    }

    boolean c() {
        if (this.f != null) {
            this.f = this.f.b();
            while (this.f != null) {
                if (this.a(this.f)) {
                    return true;
                }
                this.f = this.f.b();
            }
        }
        return false;
    }

    boolean d() {
        while (this.c >= 0) {
            if ((this.f = (bs)this.e.get(this.c--)) == null || !this.a(this.f) && !this.c()) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(bs bs2) {
        try {
            long l2 = this.i.w.a();
            Object object = bs2.d();
            Object object2 = this.i.b(bs2, l2);
            if (object2 != null) {
                this.g = new ct(this.i, object, object2);
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.d.m();
        }
    }

    @Override
    public boolean hasNext() {
        return this.g != null;
    }

    ct e() {
        if (this.g == null) {
            throw new NoSuchElementException();
        }
        this.h = this.g;
        this.b();
        return this.h;
    }

    @Override
    public void remove() {
        cl.b(this.h != null);
        this.i.remove(this.h.getKey());
        this.h = null;
    }
}

