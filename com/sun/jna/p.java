/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ac;
import com.sun.jna.ay;
import com.sun.jna.q;

class p
extends ac
implements q {
    private final ay[] b;

    public p(ay[] array) {
        super(ay.H * (array.length + 1));
        this.b = array;
        for (int i2 = 0; i2 < array.length; ++i2) {
            this.a((long)(i2 * ay.H), array[i2]);
        }
        this.a((long)(ay.H * array.length), (ay)null);
    }

    public void a() {
        this.a(0L, this.b, 0, this.b.length);
    }
}

