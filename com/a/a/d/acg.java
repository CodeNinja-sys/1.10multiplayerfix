/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abx;
import com.a.a.d.aby;
import com.a.a.d.j;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Map;

class acg
extends j {
    final Map a;
    final Iterator b;
    Iterator c;
    final /* synthetic */ abx d;

    private acg(abx abx2) {
        this.d = abx2;
        this.a = (Map)this.d.b.a();
        this.b = this.d.a.values().iterator();
        this.c = nj.a();
    }

    @Override
    protected Object a() {
        while (true) {
            if (this.c.hasNext()) {
                Map.Entry entry = (Map.Entry)this.c.next();
                if (this.a.containsKey(entry.getKey())) continue;
                this.a.put(entry.getKey(), entry.getValue());
                return entry.getKey();
            }
            if (!this.b.hasNext()) break;
            this.c = ((Map)this.b.next()).entrySet().iterator();
        }
        return this.b();
    }

    /* synthetic */ acg(abx abx2, aby aby2) {
        this(abx2);
    }
}

