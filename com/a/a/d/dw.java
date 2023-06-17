/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ce;
import com.a.a.d.dy;
import com.a.a.d.dz;
import com.a.a.d.ea;
import com.a.a.d.eb;
import com.a.a.d.ep;
import com.a.a.d.yl;
import com.a.a.l.a;
import java.io.Serializable;

abstract class dw
implements Serializable,
Comparable {
    final Comparable a;
    private static final long b = 0L;

    dw(Comparable comparable) {
        this.a = comparable;
    }

    abstract boolean a(Comparable var1);

    abstract ce a();

    abstract ce b();

    abstract dw a(ce var1, ep var2);

    abstract dw b(ce var1, ep var2);

    abstract void a(StringBuilder var1);

    abstract void b(StringBuilder var1);

    abstract Comparable a(ep var1);

    abstract Comparable b(ep var1);

    dw c(ep ep2) {
        return this;
    }

    public int a(dw dw2) {
        if (dw2 == dw.d()) {
            return 1;
        }
        if (dw2 == dw.e()) {
            return -1;
        }
        int n2 = yl.e(this.a, dw2.a);
        if (n2 != 0) {
            return n2;
        }
        return com.a.a.l.a.a(this instanceof dz, dw2 instanceof dz);
    }

    Comparable c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof dw) {
            dw dw2 = (dw)object;
            try {
                int n2 = this.a(dw2);
                return n2 == 0;
            }
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        return false;
    }

    static dw d() {
        return ea.f();
    }

    static dw e() {
        return dy.f();
    }

    static dw b(Comparable comparable) {
        return new eb(comparable);
    }

    static dw c(Comparable comparable) {
        return new dz(comparable);
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((dw)object);
    }
}

