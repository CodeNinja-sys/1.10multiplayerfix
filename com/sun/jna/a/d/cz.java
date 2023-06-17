/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.cy;
import com.sun.jna.at;
import com.sun.jna.bd;

public class cz
extends bd {
    public at a = new at(0L);
    public at b = new at(1L);
    public cy[] c;

    public cz() {
        cy cy2 = new cy();
        this.c = (cy[])cy2.e(1);
        this.d();
    }

    public cz(int n2, byte[] arrby) {
        cy cy2 = new cy(n2, arrby);
        this.c = (cy[])cy2.e(1);
        this.d();
    }

    public cz(int n2, int n3) {
        cy cy2 = new cy(n2, n3);
        this.c = (cy[])cy2.e(1);
        this.d();
    }

    public byte[] s() {
        if (this.c == null || this.b == null) {
            throw new RuntimeException("pBuffers | cBuffers");
        }
        if (this.b.intValue() == 1) {
            return this.c[0].s();
        }
        throw new RuntimeException("cBuffers > 1");
    }
}

