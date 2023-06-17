/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.yd;
import java.util.Comparator;
import java.util.Map;

final class ar
extends yd {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Map b;

    ar(Comparator comparator, Map map) {
        this.a = comparator;
        this.b = map;
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.a.compare(this.b.get(object), this.b.get(object2));
    }
}

