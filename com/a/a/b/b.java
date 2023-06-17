/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class b
implements Iterator {
    private d a = d.b;
    private Object b;

    protected b() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.a = d.c;
        return null;
    }

    @Override
    public final boolean hasNext() {
        cl.b(this.a != d.d);
        switch (this.a) {
            case c: {
                return false;
            }
            case a: {
                return true;
            }
        }
        return this.c();
    }

    private boolean c() {
        this.a = d.d;
        this.b = this.a();
        if (this.a != d.c) {
            this.a = d.a;
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = d.b;
        Object object = this.b;
        this.b = null;
        return object;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

