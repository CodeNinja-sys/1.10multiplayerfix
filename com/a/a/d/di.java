/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.dg;
import com.a.a.d.j;
import com.a.a.d.xd;
import com.a.a.d.xe;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class di
extends j {
    private Iterator b;
    final /* synthetic */ dg a;

    di(dg dg2) {
        this.a = dg2;
        this.b = dg.a(this.a).entrySet().iterator();
    }

    protected xd d() {
        Map.Entry entry;
        int n2;
        do {
            if (this.b.hasNext()) continue;
            return (xd)this.b();
        } while ((n2 = ((AtomicInteger)(entry = (Map.Entry)this.b.next()).getValue()).get()) == 0);
        return xe.a(entry.getKey(), n2);
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

