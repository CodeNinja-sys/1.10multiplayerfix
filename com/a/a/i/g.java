/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.e;
import com.a.a.b.m;
import com.a.a.i.h;
import java.math.RoundingMode;
import java.util.Arrays;

final class g
extends m {
    private final String w;
    private final char[] x;
    final int s;
    final int t;
    final int u;
    final int v;
    private final byte[] y;
    private final boolean[] z;

    g(String string, char[] arrc) {
        char c2;
        this.w = (String)cl.a(string);
        this.x = (char[])cl.a(arrc);
        try {
            this.t = com.a.a.j.g.a(arrc.length, RoundingMode.UNNECESSARY);
        }
        catch (ArithmeticException arithmeticException) {
            throw new IllegalArgumentException("Illegal alphabet length " + arrc.length, arithmeticException);
        }
        int n2 = Math.min(8, Integer.lowestOneBit(this.t));
        this.u = 8 / n2;
        this.v = this.t / n2;
        this.s = arrc.length - 1;
        byte[] arrby = new byte[128];
        Arrays.fill(arrby, (byte)-1);
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            c2 = arrc[i2];
            cl.a(com.a.a.b.m.b.c(c2), "Non-ASCII character: %s", new Object[]{Character.valueOf(c2)});
            cl.a(arrby[c2] == -1, "Duplicate character: %s", new Object[]{Character.valueOf(c2)});
            arrby[c2] = (byte)i2;
        }
        this.y = arrby;
        boolean[] arrbl = new boolean[this.u];
        for (c2 = '\u0000'; c2 < this.v; ++c2) {
            arrbl[com.a.a.j.g.a((int)(c2 * 8), (int)this.t, (RoundingMode)RoundingMode.CEILING)] = true;
        }
        this.z = arrbl;
    }

    char a(int n2) {
        return this.x[n2];
    }

    boolean b(int n2) {
        return this.z[n2 % this.u];
    }

    int d(char c2) {
        if (c2 > '\u007f' || this.y[c2] == -1) {
            throw new h("Unrecognized character: " + c2);
        }
        return this.y[c2];
    }

    private boolean f() {
        for (char c2 : this.x) {
            if (!com.a.a.b.e.c(c2)) continue;
            return true;
        }
        return false;
    }

    private boolean g() {
        for (char c2 : this.x) {
            if (!com.a.a.b.e.d(c2)) continue;
            return true;
        }
        return false;
    }

    g d() {
        if (!this.f()) {
            return this;
        }
        cl.b(!this.g(), "Cannot call upperCase() on a mixed-case alphabet");
        char[] arrc = new char[this.x.length];
        for (int i2 = 0; i2 < this.x.length; ++i2) {
            arrc[i2] = com.a.a.b.e.b(this.x[i2]);
        }
        return new g(this.w + ".upperCase()", arrc);
    }

    g e() {
        if (!this.g()) {
            return this;
        }
        cl.b(!this.f(), "Cannot call lowerCase() on a mixed-case alphabet");
        char[] arrc = new char[this.x.length];
        for (int i2 = 0; i2 < this.x.length; ++i2) {
            arrc[i2] = com.a.a.b.e.a(this.x[i2]);
        }
        return new g(this.w + ".lowerCase()", arrc);
    }

    @Override
    public boolean c(char c2) {
        return com.a.a.b.m.b.c(c2) && this.y[c2] != -1;
    }

    @Override
    public String toString() {
        return this.w;
    }
}

