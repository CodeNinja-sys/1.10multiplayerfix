/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.av;
import com.a.a.d.aw;
import com.a.a.d.tp;
import java.util.Iterator;
import java.util.NavigableMap;

final class ax
extends tp {
    final /* synthetic */ av a;

    private ax(av av2) {
        this.a = av2;
    }

    @Override
    NavigableMap b() {
        return this.a;
    }

    @Override
    Iterator c() {
        return this.a.b();
    }

    /* synthetic */ ax(av av2, aw aw2) {
        this(av2);
    }
}

