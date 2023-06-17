/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.an;
import com.a.b.b.s;
import com.a.b.c.a;
import com.a.b.d.e;
import com.a.b.k;

class t
extends an {
    private an f;
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ k c;
    final /* synthetic */ a d;
    final /* synthetic */ s e;

    t(s s2, boolean bl2, boolean bl3, k k2, a a2) {
        this.e = s2;
        this.a = bl2;
        this.b = bl3;
        this.c = k2;
        this.d = a2;
    }

    public Object a(com.a.b.d.a a2) {
        if (this.a) {
            a2.n();
            return null;
        }
        return this.b().a(a2);
    }

    public void a(e e2, Object object) {
        if (this.b) {
            e2.f();
            return;
        }
        this.b().a(e2, object);
    }

    private an b() {
        an an2 = this.f;
        return an2 != null ? an2 : (this.f = this.c.a(this.e, this.d));
    }
}

