/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hg;
import java.util.Iterator;

public abstract class go
extends hg
implements Iterator {
    protected go() {
    }

    protected abstract Iterator a();

    @Override
    public boolean hasNext() {
        return this.a().hasNext();
    }

    public Object next() {
        return this.a().next();
    }

    @Override
    public void remove() {
        this.a().remove();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

