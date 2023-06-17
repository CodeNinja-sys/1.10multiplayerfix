/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.kk;
import com.a.a.d.kl;
import com.a.a.d.nj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class kr
extends agi {
    final Iterator b;
    Object c;
    Iterator d;
    final /* synthetic */ kk e;

    private kr(kk kk2) {
        this.e = kk2;
        this.b = this.e.y().e().aO_();
        this.c = null;
        this.d = nj.a();
    }

    abstract Object b(Object var1, Object var2);

    @Override
    public boolean hasNext() {
        return this.b.hasNext() || this.d.hasNext();
    }

    public Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry)this.b.next();
            this.c = entry.getKey();
            this.d = ((Collection)entry.getValue()).iterator();
        }
        return this.b(this.c, this.d.next());
    }

    /* synthetic */ kr(kk kk2, kl kl2) {
        this(kk2);
    }
}

