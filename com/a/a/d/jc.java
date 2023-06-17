/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import java.io.Serializable;

class jc
extends am
implements Serializable {
    final Object e;
    final Object f;
    private static final long a = 0L;

    jc(Object object, Object object2) {
        this.e = object;
        this.f = object2;
    }

    @Override
    public final Object getKey() {
        return this.e;
    }

    @Override
    public final Object getValue() {
        return this.f;
    }

    @Override
    public final Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }
}

