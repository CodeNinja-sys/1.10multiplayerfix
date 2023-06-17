/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ir;
import com.a.a.d.iz;
import com.a.a.d.ka;
import com.a.a.d.sz;
import com.a.a.d.yx;
import com.a.a.d.za;
import java.util.Map;

class zb
extends ir {
    final /* synthetic */ za a;

    zb(za za2) {
        this.a = za2;
    }

    public Map.Entry b(int n2) {
        ka ka2 = yx.a(this.a.a.a)[n2];
        return sz.a(ka2.getValue(), ka2.getKey());
    }

    @Override
    iz b() {
        return this.a;
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

