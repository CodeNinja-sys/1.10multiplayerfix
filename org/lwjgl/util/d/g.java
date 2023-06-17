/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.util.Iterator;
import org.lwjgl.util.d.f;
import org.lwjgl.util.d.i;

class g
implements Iterator {
    private int b;
    final /* synthetic */ f a;

    g(f f2) {
        this.a = f2;
    }

    public boolean hasNext() {
        return this.b < this.a.b;
    }

    public i a() {
        this.a.a.a(this.a.a.a(this.b++));
        return this.a.a;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

