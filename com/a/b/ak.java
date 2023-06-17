/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ae;
import com.a.b.al;
import com.a.b.am;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b.ag;
import com.a.b.d.a;
import com.a.b.d.e;
import com.a.b.k;
import com.a.b.v;
import com.a.b.w;

final class ak
extends an {
    private final ae a;
    private final v b;
    private final k c;
    private final com.a.b.c.a d;
    private final ap e;
    private an f;

    private ak(ae ae2, v v2, k k2, com.a.b.c.a a2, ap ap2) {
        this.a = ae2;
        this.b = v2;
        this.c = k2;
        this.d = a2;
        this.e = ap2;
    }

    public Object a(a a2) {
        if (this.b == null) {
            return this.b().a(a2);
        }
        w w2 = ag.a(a2);
        if (w2.s()) {
            return null;
        }
        return this.b.b(w2, this.d.b(), this.c.b);
    }

    public void a(e e2, Object object) {
        if (this.a == null) {
            this.b().a(e2, object);
            return;
        }
        if (object == null) {
            e2.f();
            return;
        }
        w w2 = this.a.a(object, this.d.b(), this.c.c);
        ag.a(w2, e2);
    }

    private an b() {
        an an2 = this.f;
        return an2 != null ? an2 : (this.f = this.c.a(this.e, this.d));
    }

    public static ap a(com.a.b.c.a a2, Object object) {
        return new am(object, a2, false, null, null);
    }

    public static ap b(com.a.b.c.a a2, Object object) {
        boolean bl2 = a2.b() == a2.a();
        return new am(object, a2, bl2, null, null);
    }

    public static ap a(Class class_, Object object) {
        return new am(object, null, false, class_, null);
    }

    /* synthetic */ ak(ae ae2, v v2, k k2, com.a.b.c.a a2, ap ap2, al al2) {
        this(ae2, v2, k2, a2, ap2);
    }
}

