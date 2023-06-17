/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.NoSuchElementException;

public abstract class az
extends agi {
    private Object a;

    protected az(Object object) {
        this.a = object;
    }

    protected abstract Object a(Object var1);

    @Override
    public final boolean hasNext() {
        return this.a != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            Object object = this.a;
            return object;
        }
        finally {
            this.a = this.a(this.a);
        }
    }
}

