/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import com.a.a.d.cl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class vo
implements dx,
Serializable {
    private final int a;

    vo(int n2) {
        this.a = cl.a(n2, "expectedValuesPerKey");
    }

    public List b() {
        return new ArrayList(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

