/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.bd;

public class ge
extends bd {
    public int a;
    public int b;
    public int c;
    public char[] F = new char[1];

    private ge() {
    }

    public ge(int n2) {
        if (n2 < this.e()) {
            throw new IllegalArgumentException("Size must greater than " + this.e() + ", requested " + n2);
        }
        this.c(n2);
    }

    public String s() {
        return new String(this.F, 0, this.c / 2);
    }

    public void j() {
        this.F = new char[0];
        super.j();
        this.F = this.g().c(12L, this.c / 2);
    }

    public ge t() {
        if (this.a == 0) {
            return null;
        }
        ge ge2 = new ge();
        ge2.a(this.g(), this.a);
        ge2.j();
        return ge2;
    }
}

