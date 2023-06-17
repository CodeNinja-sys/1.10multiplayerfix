/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ai;
import com.a.a.d.cl;
import com.a.a.d.dv;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

class al
implements Iterator {
    final Iterator a;
    Map.Entry b;
    int c;
    boolean d;
    final /* synthetic */ ai e;

    al(ai ai2) {
        this.e = ai2;
        this.a = ai.a(ai2).entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.c > 0 || this.a.hasNext();
    }

    public Object next() {
        if (this.c == 0) {
            this.b = (Map.Entry)this.a.next();
            this.c = ((dv)this.b.getValue()).a();
        }
        --this.c;
        this.d = true;
        return this.b.getKey();
    }

    @Override
    public void remove() {
        cl.a(this.d);
        int n2 = ((dv)this.b.getValue()).a();
        if (n2 <= 0) {
            throw new ConcurrentModificationException();
        }
        if (((dv)this.b.getValue()).b(-1) == 0) {
            this.a.remove();
        }
        ai.b(this.e);
        this.d = false;
    }
}

