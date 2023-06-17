/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.ac;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class be
extends bd {
    public short a;
    public short b;
    public ay c;

    public String s() {
        byte[] arrby = this.c.b(0L, this.a);
        if (arrby.length < 2 || arrby[arrby.length - 1] != 0) {
            ac ac2 = new ac(arrby.length + 2);
            ac2.b(0L, arrby, 0, arrby.length);
            return ac2.a(0L, true);
        }
        return this.c.a(0L, true);
    }
}

