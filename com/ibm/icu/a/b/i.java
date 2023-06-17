/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.a.r;
import com.ibm.icu.a.b.c;
import com.ibm.icu.a.b.d;
import com.ibm.icu.a.b.g;
import com.ibm.icu.a.b.l;
import com.ibm.icu.a.b.u;
import com.ibm.icu.a.b.v;
import java.util.Collection;

public class i
implements v {
    private static i a;
    private r b;

    public static i a() {
        if (a == null) {
            com.ibm.icu.a.b.a.u u2 = com.ibm.icu.a.b.a.u.b();
            a = new i(u2);
        }
        return a;
    }

    public i(r r2) {
        this.b = r2;
    }

    public l b() {
        return new c(this);
    }

    public u c() {
        return new g(this.b);
    }

    public com.ibm.icu.a.b.r d() {
        return new d(this.b);
    }

    public Collection e() {
        return this.b.a();
    }
}

