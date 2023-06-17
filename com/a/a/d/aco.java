/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acn;
import com.a.a.d.acp;
import java.util.Iterator;
import java.util.Map;

class aco
implements Iterator {
    final /* synthetic */ Iterator a;
    final /* synthetic */ acn b;

    aco(acn acn2, Iterator iterator) {
        this.b = acn2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry a() {
        Map.Entry entry = (Map.Entry)this.a.next();
        return new acp(this, entry);
    }

    @Override
    public void remove() {
        this.a.remove();
        this.b.a.e();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

