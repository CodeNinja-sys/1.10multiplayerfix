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

class afs
extends j {
    dw a;
    final /* synthetic */ dw b;
    final /* synthetic */ yi c;
    final /* synthetic */ afq d;

    afs(afq afq2, dw dw2, yi yi2) {
        this.d = afq2;
        this.b = dw2;
        this.c = yi2;
        this.a = this.b;
    }

    protected Map.Entry d() {
        if (this.a == dw.d()) {
            return (Map.Entry)this.b();
        }
        if (this.c.hasNext()) {
            yl yl2 = (yl)this.c.next();
            yl yl3 = yl.a(yl2.c, this.a);
            this.a = yl2.b;
            if (afq.a((afq)this.d).b.a((Comparable)yl3.b)) {
                return sz.a(yl3.b, (Object)yl3);
            }
        } else if (afq.a((afq)this.d).b.a((Comparable)dw.d())) {
            yl yl4 = yl.a(dw.d(), this.a);
            this.a = dw.d();
            return sz.a(dw.d(), (Object)yl4);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

