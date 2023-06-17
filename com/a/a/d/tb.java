/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import com.a.a.d.tv;
import java.util.Map;

final class tb
extends am {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ tv b;

    tb(Map.Entry entry, tv tv2) {
        this.a = entry;
        this.b = tv2;
    }

    @Override
    public Object getKey() {
        return this.a.getKey();
    }

    @Override
    public Object getValue() {
        return this.b.a(this.a.getKey(), this.a.getValue());
    }
}

