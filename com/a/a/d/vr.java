/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import com.a.a.d.cl;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

final class vr
implements dx,
Serializable {
    private final int a;

    vr(int n2) {
        this.a = cl.a(n2, "expectedValuesPerKey");
    }

    public Set b() {
        return new LinkedHashSet(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

