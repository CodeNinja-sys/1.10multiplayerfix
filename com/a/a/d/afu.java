/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aft;
import com.a.a.d.j;
import com.a.a.d.sz;
import com.a.a.d.yl;
import java.util.Iterator;
import java.util.Map;

class afu
extends j {
    final /* synthetic */ Iterator a;
    final /* synthetic */ aft b;

    afu(aft aft2, Iterator iterator) {
        this.b = aft2;
        this.a = iterator;
    }

    protected Map.Entry d() {
        if (!this.a.hasNext()) {
            return (Map.Entry)this.b();
        }
        yl yl2 = (yl)this.a.next();
        if (aft.a((aft)this.b).c.a((Comparable)yl2.c)) {
            return (Map.Entry)this.b();
        }
        return sz.a(yl2.c, (Object)yl2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

