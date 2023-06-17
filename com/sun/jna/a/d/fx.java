/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.es;
import com.sun.jna.a.d.ga;
import com.sun.jna.a.d.gr;
import com.sun.jna.ay;

public abstract class fx
extends ga {
    public int a;
    public es b;

    public fx(ay ay2) {
        super(ay2);
        this.j();
        int n2 = this.G - this.e() + 4;
        int n3 = 8;
        byte[] arrby = ay2.b((long)n3, n2);
        this.H = new gr(arrby);
    }
}

