/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import com.a.a.d.cl;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

final class vq
implements dx,
Serializable {
    private final int a;

    vq(int n2) {
        this.a = cl.a(n2, "expectedValuesPerKey");
    }

    public Set b() {
        return new HashSet(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

