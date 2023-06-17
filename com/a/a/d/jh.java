/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jd;
import java.io.Serializable;
import java.util.EnumMap;

class jh
implements Serializable {
    final EnumMap a;
    private static final long b = 0L;

    jh(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object a() {
        return new jd(this.a, null);
    }
}

