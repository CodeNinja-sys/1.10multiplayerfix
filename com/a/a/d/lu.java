/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.lo;
import com.a.a.d.lr;
import java.util.Iterator;
import java.util.Map;

final class lu
extends lo {
    private final transient lr a;

    lu(lr lr2) {
        this.a = lr2;
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a.b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public int size() {
        return this.a.g();
    }

    @Override
    public agi aO_() {
        return this.a.B();
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

