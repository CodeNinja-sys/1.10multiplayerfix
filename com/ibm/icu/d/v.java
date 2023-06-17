/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.u;
import com.ibm.icu.util.dn;

final class v {
    private u a;
    private dn b;

    v(dn dn2, u u2) {
        this.b = dn2;
        this.a = (u)u2.clone();
    }

    dn a() {
        return this.b;
    }

    u b() {
        return (u)this.a.clone();
    }
}

