/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.j;
import java.util.Iterator;

final class nv
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ cm b;

    nv(Iterator iterator, cm cm2) {
        this.a = iterator;
        this.b = cm2;
    }

    @Override
    protected Object a() {
        while (this.a.hasNext()) {
            Object e2 = this.a.next();
            if (!this.b.a(e2)) continue;
            return e2;
        }
        return this.b();
    }
}

