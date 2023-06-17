/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jt;
import com.a.a.d.kd;
import com.a.a.d.lo;
import java.util.Map;

abstract class kc
extends lo {
    kc() {
    }

    abstract jt b();

    @Override
    public int size() {
        return this.b().size();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            Object object2 = this.b().get(entry.getKey());
            return object2 != null && object2.equals(entry.getValue());
        }
        return false;
    }

    @Override
    boolean a() {
        return this.b().b();
    }

    @Override
    Object aR_() {
        return new kd(this.b());
    }
}

