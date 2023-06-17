/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import java.util.Map;

final class ta
extends agi {
    final /* synthetic */ agi a;

    ta(agi agi2) {
        this.a = agi2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Object next() {
        return ((Map.Entry)this.a.next()).getValue();
    }
}

