/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gg;

public class gl {
    public int a;
    public int b;
    public int c;
    public boolean d;

    public boolean equals(Object object) {
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        gl gl2 = (gl)object;
        return this.a == gl2.a && this.b == gl2.b && this.c == gl2.c && this.d == gl2.d;
    }

    public int hashCode() {
        int n2 = gg.a();
        n2 = gg.a(n2, this.a);
        n2 = gg.a(n2, this.b);
        n2 = gg.b(n2, this.c);
        n2 = gg.c(n2, this.d ? 1 : 0);
        return n2;
    }
}

