/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import com.a.a.d.jx;
import com.a.a.d.lo;
import java.util.Map;

class jy
extends am {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ jx b;

    jy(jx jx2, Map.Entry entry) {
        this.b = jx2;
        this.a = entry;
    }

    @Override
    public Object getKey() {
        return this.a.getKey();
    }

    public lo a() {
        return lo.d(this.a.getValue());
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.a();
    }
}

