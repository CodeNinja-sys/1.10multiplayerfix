/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.iz;
import com.a.a.d.kk;
import java.util.Iterator;
import java.util.Map;

class kp
extends iz {
    final kk a;
    private static final long b = 0L;

    kp(kk kk2) {
        this.a = kk2;
    }

    @Override
    public agi aO_() {
        return this.a.B();
    }

    @Override
    boolean a() {
        return this.a.w();
    }

    @Override
    public int size() {
        return this.a.g();
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
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

