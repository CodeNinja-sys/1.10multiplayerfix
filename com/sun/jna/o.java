/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ac;
import com.sun.jna.au;
import com.sun.jna.q;

class o
extends ac
implements q {
    private final au[] b;

    public o(au[] arrau) {
        super(Native.a(arrau.getClass(), (Object)arrau));
        this.b = arrau;
        this.a(0L, this.b, this.b.getClass());
    }

    public void a() {
        this.a(0L, this.b.getClass(), this.b);
    }
}

