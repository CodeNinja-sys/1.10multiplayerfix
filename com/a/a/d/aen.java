/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ael;
import com.a.a.d.j;
import java.util.Comparator;
import java.util.Iterator;

class aen
extends j {
    Object a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ Comparator c;
    final /* synthetic */ ael d;

    aen(ael ael2, Iterator iterator, Comparator comparator) {
        this.d = ael2;
        this.b = iterator;
        this.c = comparator;
    }

    @Override
    protected Object a() {
        while (this.b.hasNext()) {
            Object e2 = this.b.next();
            boolean bl2 = this.a != null && this.c.compare(e2, this.a) == 0;
            if (bl2) continue;
            this.a = e2;
            return this.a;
        }
        this.a = null;
        return this.b();
    }
}

