/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.ab;
import net.java.games.input.de;
import net.java.games.input.df;
import net.java.games.input.dg;
import net.java.games.input.dj;
import net.java.games.input.dk;
import net.java.games.input.k;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;

class di
extends RawDeviceInfo {
    private final RawDevice a;
    private final int b;
    private final int c;
    private final int d;

    public di(RawDevice rawDevice, int n2, int n3, int n4) {
        this.a = rawDevice;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final long c() {
        return this.a.i();
    }

    public final q a(RawDevice rawDevice, dk dk2) {
        if (this.c == 0) {
            return null;
        }
        k[] arrk = new k[3 + this.c];
        int n2 = 0;
        arrk[n2++] = new df(rawDevice, m.a);
        arrk[n2++] = new df(rawDevice, m.b);
        arrk[n2++] = new df(rawDevice, m.c);
        for (int i2 = 0; i2 < this.c; ++i2) {
            n n3 = ab.a(ab.b(i2));
            arrk[n2++] = new dg(rawDevice, n3, i2);
        }
        de de2 = new de(dk2.a(), rawDevice, arrk, new q[0], new dj[0]);
        return de2;
    }
}

