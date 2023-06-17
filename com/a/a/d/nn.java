/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.NoSuchElementException;

final class nn
extends agi {
    boolean a;
    final /* synthetic */ Object b;

    nn(Object object) {
        this.b = object;
    }

    @Override
    public boolean hasNext() {
        return !this.a;
    }

    public Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}

