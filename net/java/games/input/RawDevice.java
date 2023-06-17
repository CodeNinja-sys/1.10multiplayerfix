/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.DataQueue;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.RawInputEventQueue;
import net.java.games.input.dc;
import net.java.games.input.dh;

final class RawDevice {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 4;
    public static final int j = 8;
    public static final int k = 16;
    public static final int l = 32;
    public static final int m = 64;
    public static final int n = 128;
    public static final int o = 256;
    public static final int p = 512;
    public static final int q = 1024;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 4;
    public static final int v = 2;
    public static final int w = 1;
    public static final int x = 0;
    public static final int y = 256;
    public static final int z = 257;
    public static final int A = 260;
    public static final int B = 261;
    private final RawInputEventQueue E;
    private final long F;
    private final int G;
    private DataQueue H;
    private DataQueue I;
    private DataQueue J;
    private DataQueue K;
    private final boolean[] L = new boolean[5];
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private final boolean[] V = new boolean[255];
    static Class C;
    static Class D;

    public RawDevice(RawInputEventQueue rawInputEventQueue, long l2, int n2) {
        this.E = rawInputEventQueue;
        this.F = l2;
        this.G = n2;
        this.c(32);
    }

    public final synchronized void a(long l2, int n2, int n3, int n4, long l3, long l4, long l5, long l6) {
        if (this.I.g()) {
            dh dh2 = (dh)this.I.d();
            dh2.a(l2, n2, n3, n4, l3, l4, l5, l6);
        }
    }

    public final synchronized void a(long l2, int n2, int n3, int n4, int n5, long l3) {
        if (this.H.g()) {
            dc dc2 = (dc)this.H.d();
            dc2.a(l2, n2, n3, n4, n5, l3);
        }
    }

    public final synchronized void a() {
        this.M = 0;
        this.O = 0;
        this.N = 0;
        this.I.f();
        while (this.I.g()) {
            dh dh2 = (dh)this.I.d();
            boolean bl2 = this.b(dh2);
            if (!bl2 || !this.K.g()) continue;
            dh dh3 = (dh)this.K.d();
            dh3.a(dh2);
        }
        this.I.e();
    }

    public final synchronized void b() {
        this.H.f();
        while (this.H.g()) {
            dc dc2 = (dc)this.H.d();
            boolean bl2 = this.b(dc2);
            if (!bl2 || !this.J.g()) continue;
            dc dc3 = (dc)this.J.d();
            dc3.a(dc2);
        }
        this.H.e();
    }

    private final boolean a(int n2, int n3, int n4, int n5) {
        if (n2 >= this.L.length) {
            return false;
        }
        if ((n3 & n4) != 0) {
            this.L[n2] = true;
            return true;
        }
        if ((n3 & n5) != 0) {
            this.L[n2] = false;
            return true;
        }
        return false;
    }

    private final boolean b(dc dc2) {
        int n2 = dc2.b();
        int n3 = dc2.a();
        if (n3 >= this.V.length) {
            return false;
        }
        if (n2 == 256 || n2 == 260) {
            this.V[n3] = true;
            return true;
        }
        if (n2 == 257 || n2 == 261) {
            this.V[n3] = false;
            return true;
        }
        return false;
    }

    public final boolean a(int n2) {
        return this.V[n2];
    }

    private final boolean b(dh dh2) {
        int n2;
        int n3;
        boolean bl2 = false;
        int n4 = dh2.c();
        bl2 = this.a(0, n4, 1, 2) || bl2;
        bl2 = this.a(1, n4, 4, 8) || bl2;
        bl2 = this.a(2, n4, 16, 32) || bl2;
        bl2 = this.a(3, n4, 64, 128) || bl2;
        boolean bl3 = bl2 = this.a(4, n4, 256, 512) || bl2;
        if ((dh2.b() & 1) != 0) {
            n3 = dh2.d() - this.P;
            n2 = dh2.e() - this.Q;
            this.P = dh2.d();
            this.Q = dh2.e();
        } else {
            n3 = dh2.d();
            n2 = dh2.e();
        }
        int n5 = 0;
        if ((n4 & 0x400) != 0) {
            n5 = dh2.a();
        }
        this.N += n3;
        this.O += n2;
        this.M += n5;
        bl2 = n3 != 0 || n2 != 0 || n5 != 0 || bl2;
        return bl2;
    }

    public final int c() {
        return this.M;
    }

    public final int d() {
        return this.R;
    }

    public final int e() {
        return this.S;
    }

    public final int f() {
        return this.N;
    }

    public final int g() {
        return this.O;
    }

    public final synchronized boolean a(dc dc2) {
        this.J.f();
        if (!this.J.g()) {
            this.J.e();
            return false;
        }
        dc dc3 = (dc)this.J.d();
        dc2.a(dc3);
        this.J.e();
        return true;
    }

    public final synchronized boolean a(dh dh2) {
        this.K.f();
        if (!this.K.g()) {
            this.K.e();
            return false;
        }
        dh dh3 = (dh)this.K.d();
        if ((dh3.b() & 1) != 0) {
            this.R = dh3.d() - this.T;
            this.S = dh3.e() - this.U;
            this.T = dh3.d();
            this.U = dh3.e();
        } else {
            this.R = dh3.d();
            this.S = dh3.e();
        }
        dh2.a(dh3);
        this.K.e();
        return true;
    }

    public final boolean b(int n2) {
        if (n2 >= this.L.length) {
            return false;
        }
        return this.L[n2];
    }

    public final void c(int n2) {
        this.H = new DataQueue(n2, C == null ? (C = RawDevice.a("net.java.games.input.dc")) : C);
        this.I = new DataQueue(n2, D == null ? (D = RawDevice.a("net.java.games.input.dh")) : D);
        this.J = new DataQueue(n2, C == null ? (C = RawDevice.a("net.java.games.input.dc")) : C);
        this.K = new DataQueue(n2, D == null ? (D = RawDevice.a("net.java.games.input.dh")) : D);
    }

    public final int h() {
        return this.G;
    }

    public final long i() {
        return this.F;
    }

    public final String j() {
        return RawDevice.nGetName(this.F);
    }

    private static final native String nGetName(long var0);

    public final RawDeviceInfo k() {
        return RawDevice.nGetInfo(this, this.F);
    }

    private static final native RawDeviceInfo nGetInfo(RawDevice var0, long var1);

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

