/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.dk;
import net.java.games.input.q;

class cu
extends RawDeviceInfo {
    private final RawDevice a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public cu(RawDevice rawDevice, int n2, int n3, int n4, int n5, int n6) {
        this.a = rawDevice;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
    }

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.e;
    }

    public final long c() {
        return this.a.i();
    }

    public final q a(RawDevice rawDevice, dk dk2) {
        return null;
    }
}

