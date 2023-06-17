/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.ac;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class eq
extends bd {
    public int a;
    public ay b;

    public eq() {
    }

    public eq(ay ay2) {
        super(ay2);
        this.j();
    }

    public eq(byte[] arrby) {
        this.b = new ac(arrby.length);
        this.b.b(0L, arrby, 0, arrby.length);
        this.a = arrby.length;
        this.d();
    }

    public eq(String string) {
        this(Native.b(string));
    }

    public byte[] s() {
        return this.b == null ? null : this.b.b(0L, this.a);
    }
}

