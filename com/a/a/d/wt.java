/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.ws;
import java.util.Iterator;
import java.util.NoSuchElementException;

class wt
implements Iterator {
    int a;
    final /* synthetic */ ws b;

    wt(ws ws2) {
        this.b = ws2;
    }

    @Override
    public boolean hasNext() {
        return this.a == 0 && this.b.b.a.containsKey(this.b.a);
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.a;
        return this.b.b.a.get(this.b.a);
    }

    @Override
    public void remove() {
        cl.a(this.a == 1);
        this.a = -1;
        this.b.b.a.remove(this.b.a);
    }
}

