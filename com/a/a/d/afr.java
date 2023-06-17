/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afq;
import com.a.a.d.dw;
import com.a.a.d.j;
import com.a.a.d.sz;
import com.a.a.d.yi;
import com.a.a.d.yl;
import java.util.Map;

class afr
extends j {
    dw a;
    final /* synthetic */ dw b;
    final /* synthetic */ yi c;
    final /* synthetic */ afq d;

    afr(afq afq2, dw dw2, yi yi2) {
        this.d = afq2;
        this.b = dw2;
        this.c = yi2;
        this.a = this.b;
    }

    protected Map.Entry d() {
        yl yl2;
        if (afq.a((afq)this.d).c.a((Comparable)this.a) || this.a == dw.e()) {
            return (Map.Entry)this.b();
        }
        if (this.c.hasNext()) {
            yl yl3 = (yl)this.c.next();
            yl2 = yl.a(this.a, yl3.b);
            this.a = yl3.c;
        } else {
            yl2 = yl.a(this.a, dw.e());
            this.a = dw.e();
        }
        return sz.a(yl2.b, (Object)yl2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

