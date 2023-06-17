/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hl;
import java.io.Serializable;

abstract class hj
implements hl,
Serializable {
    private static final long c = 1L;
    protected final hl a;
    protected final hl b;
    private final String d;

    protected hj(hl hl2, hl hl3, String string) {
        this.a = hl2;
        this.b = hl3;
        this.d = string;
    }

    public int a(int n2) {
        return this.a.a(this.b.a(n2));
    }

    public String toString() {
        return this.a.toString() + this.d + this.b.toString();
    }
}

