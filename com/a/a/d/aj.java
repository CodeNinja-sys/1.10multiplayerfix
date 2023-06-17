/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ai;
import com.a.a.d.ak;
import com.a.a.d.cl;
import com.a.a.d.dv;
import com.a.a.d.xd;
import java.util.Iterator;
import java.util.Map;

class aj
implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ ai c;

    aj(ai ai2, Iterator iterator) {
        this.c = ai2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }

    public xd a() {
        Map.Entry entry;
        this.a = entry = (Map.Entry)this.b.next();
        return new ak(this, entry);
    }

    @Override
    public void remove() {
        cl.a(this.a != null);
        ai.a(this.c, (long)((dv)this.a.getValue()).d(0));
        this.b.remove();
        this.a = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

