/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.a;
import com.sun.jna.ac;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class gr
extends bd {
    public ay a;

    public gr() {
    }

    public gr(byte[] arrby) {
        super(new ac(arrby.length));
        this.g().b(0L, arrby, 0, arrby.length);
        this.j();
    }

    public gr(int n2) {
        super(new ac(n2));
    }

    public gr(ay ay2) {
        super(ay2);
        this.j();
    }

    public byte[] s() {
        int n2 = com.sun.jna.a.d.a.g.a(this);
        return this.g().b(0L, n2);
    }
}

