/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class dw
extends bd {
    public long a;
    public int b;
    public int c;
    public char[] F;

    public dw() {
    }

    public dw(int n2) {
        this.c = n2 - 16;
        this.F = new char[this.c];
        this.d();
    }

    public dw(ay ay2) {
        super(ay2);
        this.j();
    }

    public String s() {
        return Native.a(this.F);
    }

    public void j() {
        super.j();
        this.F = new char[this.c / 2];
        this.b("Name");
    }
}

