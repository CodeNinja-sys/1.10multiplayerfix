/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ae;
import com.a.b.ak;
import com.a.b.al;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.c.a;
import com.a.b.k;
import com.a.b.v;

class am
implements ap {
    private final a a;
    private final boolean b;
    private final Class c;
    private final ae d;
    private final v e;

    private am(Object object, a a2, boolean bl2, Class class_) {
        this.d = object instanceof ae ? (ae)object : null;
        this.e = object instanceof v ? (v)object : null;
        com.a.b.b.a.a(this.d != null || this.e != null);
        this.a = a2;
        this.b = bl2;
        this.c = class_;
    }

    public an a(k k2, a a2) {
        boolean bl2 = this.a != null ? this.a.equals(a2) || this.b && this.a.b() == a2.a() : this.c.isAssignableFrom(a2.a());
        return bl2 ? new ak(this.d, this.e, k2, a2, this, null) : null;
    }

    /* synthetic */ am(Object object, a a2, boolean bl2, Class class_, al al2) {
        this(object, a2, bl2, class_);
    }
}

