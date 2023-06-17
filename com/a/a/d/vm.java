/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.vu;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class vm
extends vu {
    final /* synthetic */ Comparator a;

    vm(Comparator comparator) {
        this.a = comparator;
    }

    @Override
    Map a() {
        return new TreeMap(this.a);
    }
}

