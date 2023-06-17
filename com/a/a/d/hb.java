/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ha;
import com.a.a.d.hc;
import com.a.a.d.tp;
import java.util.Iterator;
import java.util.NavigableMap;

public class hb
extends tp {
    final /* synthetic */ ha a;

    public hb(ha ha2) {
        this.a = ha2;
    }

    @Override
    NavigableMap b() {
        return this.a;
    }

    @Override
    protected Iterator c() {
        return new hc(this);
    }
}

