/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.ac;
import com.sun.jna.at;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class cx
extends bd {
    public at a;
    public at b;
    public ay c;

    public cx() {
        this.a = new at(0L);
        this.c = null;
        this.b = new at(0L);
    }

    public cx(int n2, int n3) {
        this.a = new at((long)n3);
        this.c = new ac(n3);
        this.b = new at((long)n2);
        this.d();
    }

    public cx(int n2, byte[] arrby) {
        this.a = new at((long)arrby.length);
        this.c = new ac(arrby.length);
        this.c.b(0L, arrby, 0, arrby.length);
        this.b = new at((long)n2);
        this.d();
    }

    public byte[] s() {
        return this.c.b(0L, this.a.intValue());
    }
}

