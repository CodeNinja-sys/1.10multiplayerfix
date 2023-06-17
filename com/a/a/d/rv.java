/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.qy;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.sy;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

abstract class rv
implements Iterator {
    int b;
    int c;
    sa d;
    AtomicReferenceArray e;
    rz f;
    sy g;
    sy h;
    final /* synthetic */ qy i;

    rv(qy qy2) {
        this.i = qy2;
        this.b = qy2.j.length - 1;
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
            this.e = this.d.e;
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
            if ((this.f = (rz)this.e.get(this.c--)) == null || !this.a(this.f) && !this.c()) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(rz rz2) {
        try {
            Object object = rz2.d();
            Object object2 = this.i.c(rz2);
            if (object2 != null) {
                this.g = new sy(this.i, object, object2);
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.d.n();
        }
    }

    @Override
    public boolean hasNext() {
        return this.g != null;
    }

    sy e() {
        if (this.g == null) {
            throw new NoSuchElementException();
        }
        this.h = this.g;
        this.b();
        return this.h;
    }

    @Override
    public void remove() {
        cl.a(this.h != null);
        this.i.remove(this.h.getKey());
        this.h = null;
    }
}

