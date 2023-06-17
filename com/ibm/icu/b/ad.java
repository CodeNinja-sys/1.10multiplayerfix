/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.b;

import com.ibm.icu.b.aa;
import com.ibm.icu.b.ae;
import com.ibm.icu.d.kx;

public final class ad {
    private char[] a = new char[0];
    private char[] b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private static int i = 32;
    private static ae[] j = new ae[i];
    private int k = -1;
    private int l = 0;
    private int m = 0;
    private static int[] n = new int[]{40, 41, 60, 62, 91, 93, 123, 125, 171, 187, 8216, 8217, 8220, 8221, 8249, 8250, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315};
    private static int o = 1 << ad.f(n.length);
    private static int p = n.length - o;

    public ad() {
        char[] arrc = null;
        this.a(arrc, 0, 0);
    }

    public ad(String string) {
        this.a(string);
    }

    public ad(String string, int n2, int n3) {
        this.a(string, n2, n3);
    }

    public ad(char[] arrc) {
        this.a(arrc);
    }

    public ad(char[] arrc, int n2, int n3) {
        this.a(arrc, n2, n3);
    }

    public final void a() {
        while (this.g()) {
            this.h();
        }
        this.f = this.d;
        this.g = this.d;
        this.h = -1;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        this.c = this.d;
    }

    public final void a(int n2, int n3) {
        int n4 = 0;
        if (this.b != null) {
            n4 = this.b.length;
        }
        if (n2 < 0 || n3 < 0 || n2 > n4 - n3) {
            throw new IllegalArgumentException();
        }
        this.d = n2;
        this.e = n2 + n3;
        this.a();
    }

    public final void a(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            arrc = this.a;
        }
        this.b = arrc;
        this.a(n2, n3);
    }

    public final void a(char[] arrc) {
        int n2 = 0;
        if (arrc != null) {
            n2 = arrc.length;
        }
        this.a(arrc, 0, n2);
    }

    public final void a(String string, int n2, int n3) {
        char[] arrc = null;
        if (string != null) {
            arrc = string.toCharArray();
        }
        this.a(arrc, n2, n3);
    }

    public final void a(String string) {
        int n2 = 0;
        if (string != null) {
            n2 = string.length();
        }
        this.a(string, 0, n2);
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.g;
    }

    public final int d() {
        return this.h;
    }

    public final boolean e() {
        if (this.g >= this.e) {
            return false;
        }
        this.h = 0;
        this.f = this.g;
        this.j();
        while (this.c < this.e) {
            int n2 = kx.a(this.b, this.d, this.e, this.c - this.d);
            int n3 = kx.a(n2);
            int n4 = aa.a(n2);
            int n5 = ad.g(n2);
            this.c += n3;
            if (n5 >= 0) {
                if ((n5 & 1) == 0) {
                    this.e(n5, this.h);
                } else {
                    int n6 = n5 & 0xFFFFFFFE;
                    while (this.g() && this.i().a != n6) {
                        this.h();
                    }
                    if (this.g()) {
                        n4 = this.i().b;
                    }
                }
            }
            if (ad.b(this.h, n4)) {
                if (this.h <= 1 && n4 > 1) {
                    this.h = n4;
                    this.e(this.h);
                }
                if (n5 < 0 || (n5 & 1) == 0) continue;
                this.h();
                continue;
            }
            this.c -= n3;
            break;
        }
        this.g = this.c;
        return true;
    }

    private static boolean b(int n2, int n3) {
        return n2 <= 1 || n3 <= 1 || n2 == n3;
    }

    private static final int a(int n2) {
        return n2 % i;
    }

    private static final int c(int n2, int n3) {
        return ad.a(n2 + n3);
    }

    private static final int b(int n2) {
        return ad.c(n2, 1);
    }

    private static final int d(int n2, int n3) {
        return ad.a(n2 + i - n3);
    }

    private static final int c(int n2) {
        return ad.d(n2, 1);
    }

    private static final int d(int n2) {
        if (n2 < i) {
            ++n2;
        }
        return n2;
    }

    private final boolean f() {
        return this.l <= 0;
    }

    private final boolean g() {
        return !this.f();
    }

    private final void e(int n2, int n3) {
        this.l = ad.d(this.l);
        this.m = ad.d(this.m);
        this.k = ad.b(this.k);
        ad.j[this.k] = new ae(n2, n3);
    }

    private final void h() {
        if (this.f()) {
            return;
        }
        ad.j[this.k] = null;
        if (this.m > 0) {
            --this.m;
        }
        --this.l;
        this.k = ad.c(this.k);
        if (this.f()) {
            this.k = -1;
        }
    }

    private final ae i() {
        return j[this.k];
    }

    private final void j() {
        this.m = 0;
    }

    private final void e(int n2) {
        int n3 = ad.d(this.k, this.m);
        while (this.m-- > 0) {
            n3 = ad.b(n3);
            ad.j[n3].b = n2;
        }
    }

    private static final byte f(int n2) {
        if (n2 <= 0) {
            return -32;
        }
        byte by2 = 0;
        if (n2 >= 65536) {
            n2 >>= 16;
            by2 = (byte)(by2 + 16);
        }
        if (n2 >= 256) {
            n2 >>= 8;
            by2 = (byte)(by2 + 8);
        }
        if (n2 >= 16) {
            n2 >>= 4;
            by2 = (byte)(by2 + 4);
        }
        if (n2 >= 4) {
            n2 >>= 2;
            by2 = (byte)(by2 + 2);
        }
        if (n2 >= 2) {
            n2 >>= 1;
            by2 = (byte)(by2 + 1);
        }
        return by2;
    }

    private static int g(int n2) {
        int n3 = o;
        int n4 = 0;
        if (n2 >= n[p]) {
            n4 = p;
        }
        while (n3 > 1) {
            if (n2 < n[n4 + (n3 >>= 1)]) continue;
            n4 += n3;
        }
        if (n[n4] != n2) {
            n4 = -1;
        }
        return n4;
    }
}

