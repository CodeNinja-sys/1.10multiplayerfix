/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.wo;
import com.a.a.d.xo;
import java.util.Collection;
import java.util.Map;

class wp
extends xo {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ wo b;

    wp(wo wo2, Map.Entry entry) {
        this.b = wo2;
        this.a = entry;
    }

    @Override
    public Object a() {
        return this.a.getKey();
    }

    @Override
    public int b() {
        return ((Collection)this.a.getValue()).size();
    }
}

