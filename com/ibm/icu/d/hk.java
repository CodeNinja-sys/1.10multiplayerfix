/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hi;
import com.ibm.icu.d.hl;
import com.ibm.icu.d.hn;
import com.ibm.icu.d.hr;
import java.io.Serializable;

class hk
implements hr,
Serializable {
    private static final long a = 1L;
    private final String b;
    private final hl c;

    public hk(String string, hl hl2) {
        this.b = string;
        this.c = hl2;
    }

    public hr a(hl hl2) {
        return new hk(this.b, new hi(this.c, hl2));
    }

    public hr b(hl hl2) {
        return new hk(this.b, new hn(this.c, hl2));
    }

    public String a() {
        return this.b;
    }

    public boolean a(double d2) {
        return this.c.a(d2);
    }

    public int a(int n2) {
        return this.c.a(n2);
    }

    public boolean b() {
        return this.c.a();
    }

    public String toString() {
        return this.b + ": " + this.c;
    }
}

