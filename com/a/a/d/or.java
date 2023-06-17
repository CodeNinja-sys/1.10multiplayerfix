/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;

final class or
extends am {
    final Object a;
    Object b;
    or c;
    or d;
    or e;
    or f;

    or(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b;
    }

    @Override
    public Object setValue(Object object) {
        Object object2 = this.b;
        this.b = object;
        return object2;
    }
}

