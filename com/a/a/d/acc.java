/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aby;
import com.a.a.d.aca;
import com.a.a.d.acd;
import com.a.a.d.j;
import java.util.Iterator;
import java.util.Map;

class acc
extends j {
    final Iterator a;
    final /* synthetic */ aca b;

    private acc(aca aca2) {
        this.b = aca2;
        this.a = this.b.b.a.entrySet().iterator();
    }

    protected Map.Entry d() {
        while (this.a.hasNext()) {
            Map.Entry entry = (Map.Entry)this.a.next();
            if (!((Map)entry.getValue()).containsKey(this.b.a)) continue;
            return new acd(this, entry);
        }
        return (Map.Entry)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }

    /* synthetic */ acc(aca aca2, aby aby2) {
        this(aca2);
    }
}

