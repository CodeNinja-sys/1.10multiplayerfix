/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.gc;
import com.sun.jna.ac;
import com.sun.jna.bd;

public class gw
extends bd {
    public byte a;
    public byte b;
    public short c;
    public int F;
    public int G;
    public int H;
    public int I;
    private gc J = null;

    public gw() {
    }

    public gw(byte[] arrby) {
        super(new ac(arrby.length));
        this.g().b(0L, arrby, 0, arrby.length);
        this.t();
    }

    public gw(ac ac2) {
        super(ac2);
        this.t();
    }

    public gc s() {
        return this.J;
    }

    private final void t() {
        this.j();
        if (this.I != 0) {
            this.J = new gc(this.g().a(this.I));
        }
    }
}

