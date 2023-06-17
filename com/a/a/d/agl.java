/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.yd;
import java.io.Serializable;

final class agl
extends yd
implements Serializable {
    static final agl a = new agl();
    private static final long b = 0L;

    @Override
    public int compare(Object object, Object object2) {
        return object.toString().compareTo(object2.toString());
    }

    private Object j() {
        return a;
    }

    public String toString() {
        return "Ordering.usingToString()";
    }

    private agl() {
    }
}

