/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afx;
import com.a.a.d.dw;
import com.a.a.d.j;
import com.a.a.d.sz;
import com.a.a.d.yl;
import java.util.Iterator;
import java.util.Map;

class afy
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ dw b;
    final /* synthetic */ afx c;

    afy(afx afx2, Iterator iterator, dw dw2) {
        this.c = afx2;
        this.a = iterator;
        this.b = dw2;
    }

    protected Map.Entry d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        yl yl2 = (yl)this.a.next();
        if (this.b.a((Comparable)yl2.b)) {
            return (Map.Entry)this.b();
        }
        yl2 = yl2.c(afx.a(this.c));
        return sz.a(yl2.b, (Object)yl2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

