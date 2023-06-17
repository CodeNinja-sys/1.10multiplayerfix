/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import java.io.Serializable;

final class ay
extends aw
implements Serializable {
    static final ay a = new ay();
    private static final long b = 1L;

    ay() {
    }

    @Override
    protected boolean b(Object object, Object object2) {
        return object.equals(object2);
    }

    @Override
    public int b(Object object) {
        return object.hashCode();
    }

    private Object d() {
        return a;
    }
}

