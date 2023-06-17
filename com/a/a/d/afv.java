/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aft;
import com.a.a.d.j;
import com.a.a.d.sz;
import com.a.a.d.yi;
import com.a.a.d.yl;
import java.util.Map;

class afv
extends j {
    final /* synthetic */ yi a;
    final /* synthetic */ aft b;

    afv(aft aft2, yi yi2) {
        this.b = aft2;
        this.a = yi2;
    }

    protected Map.Entry d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        yl yl2 = (yl)this.a.next();
        return aft.a((aft)this.b).b.a((Comparable)yl2.c) ? sz.a(yl2.c, (Object)yl2) : (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

