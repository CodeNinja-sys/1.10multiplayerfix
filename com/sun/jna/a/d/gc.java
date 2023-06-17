/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.fx;
import com.sun.jna.a.d.fy;
import com.sun.jna.a.d.fz;
import com.sun.jna.ay;
import com.sun.jna.bd;

public class gc
extends bd {
    public byte a;
    public byte b;
    public short c;
    public short F;
    public short G;
    fx[] H;

    public gc() {
    }

    public gc(ay ay2) {
        super(ay2);
        this.j();
        this.H = new fx[this.F];
        int n2 = this.e();
        for (int i2 = 0; i2 < this.F; ++i2) {
            ay ay3 = ay2.a(n2);
            byte by2 = ay3.b(0L);
            fx fx2 = null;
            switch (by2) {
                case 0: {
                    fx2 = new fy(ay3);
                    break;
                }
                case 1: {
                    fx2 = new fz(ay3);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknwon ACE type " + by2);
                }
            }
            this.H[i2] = fx2;
            n2 += fx2.G;
        }
    }

    public fx[] s() {
        return this.H;
    }
}

