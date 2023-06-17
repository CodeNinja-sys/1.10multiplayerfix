/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.ay;
import com.sun.jna.bd;

public class aa
extends bd {
    public int a;
    public short b;
    public short c;
    public byte[] F = new byte[8];

    public aa() {
    }

    public aa(ay ay2) {
        super(ay2);
        this.j();
    }

    public aa(byte[] arrby) {
        if (arrby.length != 16) {
            throw new IllegalArgumentException("Invalid data length: " + arrby.length);
        }
        long l2 = arrby[3] & 0xFF;
        l2 <<= 8;
        l2 |= (long)(arrby[2] & 0xFF);
        l2 <<= 8;
        l2 |= (long)(arrby[1] & 0xFF);
        l2 <<= 8;
        this.a = (int)(l2 |= (long)(arrby[0] & 0xFF));
        int n2 = arrby[5] & 0xFF;
        n2 <<= 8;
        this.b = (short)(n2 |= arrby[4] & 0xFF);
        int n3 = arrby[7] & 0xFF;
        n3 <<= 8;
        this.c = (short)(n3 |= arrby[6] & 0xFF);
        this.F[0] = arrby[8];
        this.F[1] = arrby[9];
        this.F[2] = arrby[10];
        this.F[3] = arrby[11];
        this.F[4] = arrby[12];
        this.F[5] = arrby[13];
        this.F[6] = arrby[14];
        this.F[7] = arrby[15];
    }
}

