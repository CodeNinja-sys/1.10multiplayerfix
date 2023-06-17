/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yi;
import java.util.Iterator;

class oa
implements yi {
    private final Iterator a;
    private boolean b;
    private Object c;

    public oa(Iterator iterator) {
        this.a = (Iterator)cl.a(iterator);
    }

    @Override
    public boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override
    public Object next() {
        if (!this.b) {
            return this.a.next();
        }
        Object object = this.c;
        this.b = false;
        this.c = null;
        return object;
    }

    @Override
    public void remove() {
        cl.b(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }

    @Override
    public Object a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }
}

