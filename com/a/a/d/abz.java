/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abx;
import com.a.a.d.aby;
import com.a.a.d.adw;
import com.a.a.d.adx;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Map;

class abz
implements Iterator {
    final Iterator a;
    Map.Entry b;
    Iterator c;
    final /* synthetic */ abx d;

    private abz(abx abx2) {
        this.d = abx2;
        this.a = this.d.a.entrySet().iterator();
        this.c = nj.c();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    public adw a() {
        if (!this.c.hasNext()) {
            this.b = (Map.Entry)this.a.next();
            this.c = ((Map)this.b.getValue()).entrySet().iterator();
        }
        Map.Entry entry = (Map.Entry)this.c.next();
        return adx.a(this.b.getKey(), entry.getKey(), entry.getValue());
    }

    @Override
    public void remove() {
        this.c.remove();
        if (((Map)this.b.getValue()).isEmpty()) {
            this.a.remove();
        }
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ abz(abx abx2, aby aby2) {
        this(abx2);
    }
}

