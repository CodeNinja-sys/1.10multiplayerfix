/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agi;
import com.a.a.d.l;
import java.util.NoSuchElementException;

public abstract class j
extends agi {
    private l a = l.b;
    private Object b;

    protected j() {
    }

    protected abstract Object a();

    protected final Object b() {
        this.a = l.c;
        return null;
    }

    @Override
    public final boolean hasNext() {
        cl.b(this.a != l.d);
        switch (this.a) {
            case c: {
                return false;
            }
            case a: {
                return true;
            }
        }
        return this.d();
    }

    private boolean d() {
        this.a = l.d;
        this.b = this.a();
        if (this.a != l.c) {
            this.a = l.a;
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = l.b;
        Object object = this.b;
        this.b = null;
        return object;
    }

    public final Object c() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.b;
    }
}

