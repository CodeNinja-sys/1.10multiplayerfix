/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.IDirectInputDevice;
import net.java.games.input.l;
import net.java.games.input.m;

final class DIDeviceObject {
    private static final int a = 120;
    private final IDirectInputDevice b;
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final String i;
    private final l j;
    private final int k;
    private final long l;
    private final long m;
    private final int n;
    private int o;
    private int p;

    public DIDeviceObject(IDirectInputDevice iDirectInputDevice, l l2, byte[] arrby, int n2, int n3, int n4, int n5, int n6, String string, int n7) {
        this.b = iDirectInputDevice;
        this.j = l2;
        this.c = arrby;
        this.d = n3;
        this.e = n4;
        this.f = n5;
        this.g = n2;
        this.h = n6;
        this.i = string;
        this.k = n7;
        if (this.o() && !this.p()) {
            long[] arrl = iDirectInputDevice.a(n3);
            this.l = arrl[0];
            this.m = arrl[1];
            this.n = iDirectInputDevice.b(n3);
        } else {
            this.l = Integer.MIN_VALUE;
            this.m = Integer.MAX_VALUE;
            this.n = 0;
        }
    }

    public final synchronized int a(int n2) {
        if (this.b.a()) {
            return n2;
        }
        int n3 = n2 - this.o;
        this.o = n2;
        return n3;
    }

    public final synchronized int b(int n2) {
        if (this.b.a()) {
            return n2;
        }
        int n3 = n2 - this.p;
        this.p = n2;
        return n3;
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.k;
    }

    public final IDirectInputDevice c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final l e() {
        return this.j;
    }

    public final String f() {
        return this.i;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.e;
    }

    public final byte[] i() {
        return this.c;
    }

    public final int j() {
        return this.h;
    }

    public final long k() {
        return this.l;
    }

    public final long l() {
        return this.m;
    }

    public final float m() {
        return this.n;
    }

    public final boolean n() {
        return (this.e & 0xC) != 0;
    }

    public final boolean o() {
        return (this.e & 3) != 0;
    }

    public final boolean p() {
        return this.o() && (this.e & 1) != 0;
    }

    public final boolean q() {
        return this.o() && this.j != net.java.games.input.m.C;
    }

    public final float a(float f2) {
        if (this.c().e() == 18 && this.j == net.java.games.input.m.c) {
            return f2 / 120.0f;
        }
        if (this.n()) {
            return ((int)f2 & 0x80) != 0 ? 1.0f : 0.0f;
        }
        if (this.j == net.java.games.input.m.C) {
            int n2 = (int)f2;
            if ((n2 & 0xFFFF) == 65535) {
                return 0.0f;
            }
            int n3 = 2250;
            if (n2 >= 0 && n2 < n3) {
                return 0.25f;
            }
            if (n2 < 3 * n3) {
                return 0.375f;
            }
            if (n2 < 5 * n3) {
                return 0.5f;
            }
            if (n2 < 7 * n3) {
                return 0.625f;
            }
            if (n2 < 9 * n3) {
                return 0.75f;
            }
            if (n2 < 11 * n3) {
                return 0.875f;
            }
            if (n2 < 13 * n3) {
                return 1.0f;
            }
            if (n2 < 15 * n3) {
                return 0.125f;
            }
            return 0.25f;
        }
        if (this.o() && !this.p()) {
            return 2.0f * (f2 - (float)this.l) / (float)(this.m - this.l) - 1.0f;
        }
        return f2;
    }
}

