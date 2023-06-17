/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jw;
import com.a.a.d.jy;
import java.util.Iterator;
import java.util.Map;

class jx
extends agi {
    final /* synthetic */ Iterator a;
    final /* synthetic */ jw b;

    jx(jw jw2, Iterator iterator) {
        this.b = jw2;
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Map.Entry a() {
        Map.Entry entry = (Map.Entry)this.a.next();
        return new jy(this, entry);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

