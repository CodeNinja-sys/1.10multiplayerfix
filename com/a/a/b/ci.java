/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.b;
import com.a.a.b.cg;
import com.a.a.b.ch;
import com.a.a.b.cl;
import java.util.Iterator;

class ci
extends b {
    private final Iterator b;
    final /* synthetic */ ch a;

    ci(ch ch2) {
        this.a = ch2;
        this.b = (Iterator)cl.a(this.a.a.iterator());
    }

    @Override
    protected Object a() {
        while (this.b.hasNext()) {
            cg cg2 = (cg)this.b.next();
            if (!cg2.b()) continue;
            return cg2.c();
        }
        return this.b();
    }
}

