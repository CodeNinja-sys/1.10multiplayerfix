/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.hb;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

class hc
implements Iterator {
    private Map.Entry b = null;
    private Map.Entry c = this.a.b().lastEntry();
    final /* synthetic */ hb a;

    hc(hb hb2) {
        this.a = hb2;
    }

    @Override
    public boolean hasNext() {
        return this.c != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map.Entry a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            Map.Entry entry = this.c;
            return entry;
        }
        finally {
            this.b = this.c;
            this.c = this.a.b().lowerEntry(this.c.getKey());
        }
    }

    @Override
    public void remove() {
        cl.a(this.b != null);
        this.a.b().remove(this.b.getKey());
        this.b = null;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

