/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.afx;
import com.a.a.d.j;
import com.a.a.d.sz;
import com.a.a.d.yl;
import java.util.Iterator;
import java.util.Map;

class afz
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ afx b;

    afz(afx afx2, Iterator iterator) {
        this.b = afx2;
        this.a = iterator;
    }

    protected Map.Entry d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        yl yl2 = (yl)this.a.next();
        if (afx.a((afx)this.b).b.a(yl2.c) >= 0) {
            return (Map.Entry)this.b();
        }
        yl2 = yl2.c(afx.a(this.b));
        if (afx.b(this.b).f(yl2.b)) {
            return sz.a(yl2.b, (Object)yl2);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

