/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.da;
import net.java.games.input.dj;
import net.java.games.input.dk;
import net.java.games.input.q;

class dd
extends RawDeviceInfo {
    private final RawDevice a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public dd(RawDevice rawDevice, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = rawDevice;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
    }

    public final int a() {
        return 6;
    }

    public final int b() {
        return 1;
    }

    public final long c() {
        return this.a.i();
    }

    public final q a(RawDevice rawDevice, dk dk2) {
        return new da(dk2.a(), rawDevice, new q[0], new dj[0]);
    }
}

