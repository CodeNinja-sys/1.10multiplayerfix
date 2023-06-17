/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ji;
import java.io.Serializable;
import java.util.EnumSet;

class jk
implements Serializable {
    final EnumSet a;
    private static final long b = 0L;

    jk(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object a() {
        return new ji((EnumSet)this.a.clone(), null);
    }
}

