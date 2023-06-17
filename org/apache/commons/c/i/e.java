/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

class e
implements Iterator {
    private final Calendar a;
    private final Calendar b;

    e(Calendar calendar, Calendar calendar2) {
        this.a = calendar2;
        this.b = calendar;
        this.b.add(5, -1);
    }

    @Override
    public boolean hasNext() {
        return this.b.before(this.a);
    }

    public Calendar a() {
        if (this.b.equals(this.a)) {
            throw new NoSuchElementException();
        }
        this.b.add(5, 1);
        return (Calendar)this.b.clone();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

