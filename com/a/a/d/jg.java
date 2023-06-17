/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jd;
import com.a.a.d.jf;
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

class jg
extends agi {
    private final Iterator b;
    final /* synthetic */ jf a;

    jg(jf jf2) {
        this.a = jf2;
        this.b = jd.a(this.a.a).entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public Map.Entry a() {
        Map.Entry entry = (Map.Entry)this.b.next();
        return sz.a(entry.getKey(), entry.getValue());
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

