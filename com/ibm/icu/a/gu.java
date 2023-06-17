/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import java.util.Arrays;

public class gu {
    public static final int c = 32;
    protected int[] d = new int[34816];
    protected int e;
    protected int f;
    protected int g;
    protected boolean h;
    protected boolean i;
    protected int[] j;
    protected static final int k = 5;
    protected static final int l = 34816;
    protected static final int m = 2048;
    protected static final int n = 32;
    protected static final int o = 31;
    protected static final int p = 2;
    protected static final int q = 262144;
    protected static final int r = 4;
    protected static final int s = 256;
    protected static final int t = 512;
    protected static final int u = 4;
    private static final int a = 1115168;

    public boolean b(int n2) {
        if (this.i || n2 > 0x10FFFF || n2 < 0) {
            return true;
        }
        return this.d[n2 >> 5] == 0;
    }

    protected gu() {
        this.j = new int[34849];
        this.h = false;
        this.i = false;
        this.e = 34816;
    }

    protected gu(gu gu2) {
        this.e = gu2.e;
        System.arraycopy(gu2.d, 0, this.d, 0, this.e);
        this.f = gu2.f;
        this.g = gu2.g;
        this.j = new int[gu2.j.length];
        System.arraycopy(gu2.j, 0, this.j, 0, this.j.length);
        this.h = gu2.h;
        this.i = gu2.i;
    }

    protected static final boolean a(int[] arrn, int n2, int n3, int n4) {
        while (n4 > 0 && arrn[n2] == arrn[n3]) {
            ++n2;
            ++n3;
            --n4;
        }
        return n4 == 0;
    }

    protected void a() {
        Arrays.fill(this.j, 255);
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.j[Math.abs((int)this.d[i2]) >> 5] = 0;
        }
        this.j[0] = 0;
    }

    protected static final int a(int[] arrn, int n2, int n3) {
        for (int i2 = 2048; i2 < n2; i2 += 32) {
            if (!gu.a(arrn, i2, n3, 32)) continue;
            return i2;
        }
        return n2;
    }
}

