/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.co;
import com.ibm.icu.d.kv;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;

public abstract class en
extends kv {
    static final long b = -7182021401701778240L;

    protected en() {
    }

    public static en a(dn dn2) {
        return new co(dn2);
    }

    public static en a() {
        return en.a(dn.a(dr.b));
    }
}

