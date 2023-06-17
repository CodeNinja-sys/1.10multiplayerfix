/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aff;
import com.a.a.d.afg;
import com.a.a.d.afj;
import com.a.a.d.j;
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

class afk
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ afj b;

    afk(afj afj2, Iterator iterator) {
        this.b = afj2;
        this.a = iterator;
    }

    protected Map.Entry d() {
        aff aff2;
        while (this.a.hasNext() && (aff2 = (aff)this.a.next()).b().a(afg.a((afg)this.b.a.a).c) < 0) {
            if (aff2.c().a(afg.a((afg)this.b.a.a).b) <= 0) continue;
            return sz.a(aff2.a().c(afg.a(this.b.a.a)), aff2.getValue());
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

