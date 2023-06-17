/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import java.io.Serializable;

final class ba
extends aw
implements Serializable {
    static final ba a = new ba();
    private static final long b = 1L;

    ba() {
    }

    @Override
    protected boolean b(Object object, Object object2) {
        return false;
    }

    @Override
    protected int b(Object object) {
        return System.identityHashCode(object);
    }

    private Object d() {
        return a;
    }
}

