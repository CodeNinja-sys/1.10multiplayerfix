/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jz;
import com.a.a.d.lw;
import com.a.a.d.lx;
import java.util.Comparator;

class ly
extends jz {
    private final Comparator a;
    private static final long b = 0L;

    ly(lw lw2) {
        super(lw2);
        this.a = lw2.comparator();
    }

    @Override
    Object a() {
        lx lx2 = new lx(this.a);
        return this.a(lx2);
    }
}

