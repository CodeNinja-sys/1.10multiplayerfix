/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.sz;
import java.util.Map;

final class tx
implements cm {
    final /* synthetic */ cm a;

    tx(cm cm2) {
        this.a = cm2;
    }

    public boolean a(Map.Entry entry) {
        return this.a.a(sz.a(entry.getValue(), entry.getKey()));
    }
}

