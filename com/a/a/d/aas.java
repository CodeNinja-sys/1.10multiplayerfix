/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aar;
import com.a.a.d.agi;
import com.a.a.d.jl;
import java.util.NoSuchElementException;

class aas
extends agi {
    final jl a;
    int b;
    final /* synthetic */ aar c;

    aas(aar aar2) {
        this.c = aar2;
        this.a = aar.a(this.c).g().h();
        this.b = aar.b(this.c);
    }

    @Override
    public boolean hasNext() {
        return this.b != 0;
    }

    public Object next() {
        int n2 = Integer.numberOfTrailingZeros(this.b);
        if (n2 == 32) {
            throw new NoSuchElementException();
        }
        this.b &= ~(1 << n2);
        return this.a.get(n2);
    }
}

