/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.b.a.p;
import com.a.b.b.a.s;
import com.a.b.b.a.x;
import com.a.b.c.a;
import com.a.b.d.e;
import com.a.b.k;
import java.lang.reflect.Field;

class q
extends s {
    final an a;
    final /* synthetic */ k b;
    final /* synthetic */ a c;
    final /* synthetic */ Field d;
    final /* synthetic */ boolean e;
    final /* synthetic */ p f;

    q(p p2, String string, boolean bl2, boolean bl3, k k2, a a2, Field field, boolean bl4) {
        this.f = p2;
        this.b = k2;
        this.c = a2;
        this.d = field;
        this.e = bl4;
        super(string, bl2, bl3);
        this.a = this.b.a(this.c);
    }

    void a(e e2, Object object) {
        Object object2 = this.d.get(object);
        x x2 = new x(this.b, this.a, this.c.b());
        ((an)x2).a(e2, object2);
    }

    void a(com.a.b.d.a a2, Object object) {
        Object object2 = this.a.a(a2);
        if (object2 != null || !this.e) {
            this.d.set(object, object2);
        }
    }
}

