/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.cv;
import com.ibm.icu.util.da;

final class cz
extends cv {
    private da[] e;
    private int f;
    private int[] g;
    private char[] h;
    static final /* synthetic */ boolean c;

    public cz(int n2) {
        this.a = 0x9DDDDD4 + n2;
        this.e = new da[n2];
        this.g = new int[n2];
        this.h = new char[n2];
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        cz cz2 = (cz)object;
        for (int i2 = 0; i2 < this.f; ++i2) {
            if (this.h[i2] == cz2.h[i2] && this.g[i2] == cz2.g[i2] && this.e[i2] == cz2.e[i2]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.b = n2;
            int n3 = 0;
            int n4 = this.f;
            do {
                da da2;
                if ((da2 = this.e[--n4]) != null) {
                    n2 = da2.a(n2 - n3);
                }
                n3 = 1;
            } while (n4 > 0);
            this.d = n2;
        }
        return n2;
    }

    public void a(cs cs2) {
        int n2;
        int n3 = this.f - 1;
        da da2 = this.e[n3];
        int n4 = n2 = da2 == null ? this.b : da2.a();
        do {
            if (this.e[--n3] == null) continue;
            this.e[n3].a(this.b, n2, cs2);
        } while (n3 > 0);
        n3 = this.f - 1;
        if (da2 == null) {
            cs2.a(this.g[n3], true);
        } else {
            da2.a(cs2);
        }
        this.d = cs2.a(this.h[n3]);
        while (--n3 >= 0) {
            boolean bl2;
            int n5;
            if (this.e[n3] == null) {
                n5 = this.g[n3];
                bl2 = true;
            } else {
                if (!c && this.e[n3].a() <= 0) {
                    throw new AssertionError();
                }
                n5 = this.d - this.e[n3].a();
                bl2 = false;
            }
            cs2.a(n5, bl2);
            this.d = cs2.a(this.h[n3]);
        }
    }

    public void a(int n2, int n3) {
        this.h[this.f] = (char)n2;
        this.e[this.f] = null;
        this.g[this.f] = n3;
        ++this.f;
        this.a = (this.a * 37 + n2) * 37 + n3;
    }

    public void a(int n2, da da2) {
        this.h[this.f] = (char)n2;
        this.e[this.f] = da2;
        this.g[this.f] = 0;
        ++this.f;
        this.a = (this.a * 37 + n2) * 37 + da2.hashCode();
    }

    static {
        c = !cs.class.desiredAssertionStatus();
    }
}

