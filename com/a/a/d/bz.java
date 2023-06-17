/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cg;
import com.a.a.d.by;
import com.a.a.d.j;

class bz
extends j {
    boolean a;
    boolean b;
    final /* synthetic */ by c;

    bz(by by2) {
        this.c = by2;
    }

    @Override
    protected Object a() {
        cg cg2;
        if (!this.a) {
            this.a = true;
            cg2 = this.c.b.a(this.c.a);
            if (cg2.b()) {
                return cg2.c();
            }
        }
        if (!this.b) {
            this.b = true;
            cg2 = this.c.b.b(this.c.a);
            if (cg2.b()) {
                return cg2.c();
            }
        }
        return this.b();
    }
}

