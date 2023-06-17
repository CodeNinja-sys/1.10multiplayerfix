/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.bx;
import java.util.Map;

class by
implements Map.Entry {
    private final Object a;
    private final Object b;
    private final bx c;

    by(bx bx2, Object object, Object object2) {
        this.c = bx2;
        this.a = object;
        this.b = object2;
    }

    public Object getKey() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }
}

