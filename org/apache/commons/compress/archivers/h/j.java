/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.ba;

public final class j {
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 4;
    private static final int e = 8;
    private static final int f = 64;
    public static final int a = 2048;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private int k;
    private int l;

    public boolean a() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public boolean b() {
        return this.h;
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }

    public boolean c() {
        return this.i;
    }

    public void c(boolean bl2) {
        this.i = bl2;
    }

    public boolean d() {
        return this.i && this.j;
    }

    public void d(boolean bl2) {
        this.j = bl2;
        if (bl2) {
            this.c(true);
        }
    }

    int e() {
        return this.k;
    }

    int f() {
        return this.l;
    }

    public byte[] g() {
        return ba.a((this.h ? 8 : 0) | (this.g ? 2048 : 0) | (this.i ? 1 : 0) | (this.j ? 64 : 0));
    }

    public static j a(byte[] arrby, int n2) {
        int n3 = ba.a(arrby, n2);
        j j2 = new j();
        j2.b((n3 & 8) != 0);
        j2.a((n3 & 0x800) != 0);
        j2.d((n3 & 0x40) != 0);
        j2.c((n3 & 1) != 0);
        j2.k = (n3 & 2) != 0 ? 8192 : 4096;
        j2.l = (n3 & 4) != 0 ? 3 : 2;
        return j2;
    }

    public int hashCode() {
        return 3 * (7 * (13 * (17 * (this.i ? 1 : 0) + (this.j ? 1 : 0)) + (this.g ? 1 : 0)) + (this.h ? 1 : 0));
    }

    public boolean equals(Object object) {
        if (!(object instanceof j)) {
            return false;
        }
        j j2 = (j)object;
        return j2.i == this.i && j2.j == this.j && j2.g == this.g && j2.h == this.h;
    }
}

