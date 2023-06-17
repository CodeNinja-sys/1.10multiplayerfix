/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gc;
import com.ibm.icu.a.hk;
import com.ibm.icu.d.kx;
import com.ibm.icu.util.ci;
import com.ibm.icu.util.cj;

public class gw
implements ci {
    private static final int a = 2048;
    private static final int b = 55296;
    private static final int c = 56320;
    private static final int d = 1024;
    private static final int e = 32;
    private static final int f = 32;
    private gc g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    public gw(gc gc2) {
        if (gc2 == null) {
            throw new IllegalArgumentException("Argument trie cannot be null");
        }
        this.g = gc2;
        this.h = this.a(this.g.a());
        this.a();
    }

    public final boolean a(cj cj2) {
        if (this.j > 0x10FFFF) {
            return false;
        }
        if (this.j < 65536 && this.b(cj2)) {
            return true;
        }
        this.c(cj2);
        return true;
    }

    public final void a() {
        this.i = 0;
        this.j = 0;
        this.l = 0;
        this.m = this.g.k[0] << 2;
        this.k = this.m == this.g.m ? this.h : this.a(this.g.b(this.m));
        this.n = 0;
        this.o = 32;
    }

    protected int a(int n2) {
        return n2;
    }

    private final void a(cj cj2, int n2, int n3, int n4) {
        cj2.a = n2;
        cj2.b = n3;
        cj2.c = n4;
    }

    private final boolean b(cj cj2) {
        int n2 = this.k;
        this.i = this.j++;
        ++this.n;
        if (!this.b(n2)) {
            this.a(cj2, this.i, this.j, n2);
            return true;
        }
        while (this.j < 65536) {
            this.l = this.j == 55296 ? 2048 : (this.j == 56320 ? this.j >> 5 : ++this.l);
            this.n = 0;
            if (this.c(n2)) continue;
            this.a(cj2, this.i, this.j, n2);
            return true;
        }
        --this.j;
        --this.n;
        return false;
    }

    private final void c(cj cj2) {
        int n2 = this.k;
        ++this.j;
        ++this.n;
        if (kx.c(this.j) != '\udc00') {
            if (!this.b() && !this.b(n2)) {
                this.a(cj2, this.i, this.j, n2);
                this.i = this.j;
                return;
            }
            ++this.l;
            ++this.o;
            if (!this.d(n2)) {
                this.a(cj2, this.i, this.j, n2);
                this.i = this.j;
                return;
            }
        }
        int n3 = kx.b(this.j);
        while (n3 < 56320) {
            int n4 = this.g.k[n3 >> 5] << 2;
            if (n4 == this.g.m) {
                if (n2 != this.h) {
                    this.k = this.h;
                    this.m = n4;
                    this.n = 0;
                    this.a(cj2, this.i, this.j, n2);
                    this.i = this.j;
                    return;
                }
                this.j = hk.a((char)(n3 += 32), '\udc00');
                continue;
            }
            if (this.g.l == null) {
                throw new NullPointerException("The field DataManipulate in this Trie is null");
            }
            this.l = this.g.l.a(this.g.b(n4 + (n3 & 0x1F)));
            if (this.l <= 0) {
                if (n2 != this.h) {
                    this.k = this.h;
                    this.m = this.g.m;
                    this.n = 0;
                    this.a(cj2, this.i, this.j, n2);
                    this.i = this.j;
                    return;
                }
                this.j += 1024;
            } else {
                this.o = 0;
                if (!this.d(n2)) {
                    this.a(cj2, this.i, this.j, n2);
                    this.i = this.j;
                    return;
                }
            }
            ++n3;
        }
        this.a(cj2, this.i, 0x110000, n2);
    }

    private final boolean b(int n2) {
        while (this.n < 32) {
            this.k = this.a(this.g.b(this.m + this.n));
            if (this.k != n2) {
                return false;
            }
            ++this.n;
            ++this.j;
        }
        return true;
    }

    private final boolean c(int n2) {
        int n3 = this.m;
        this.m = this.g.k[this.l] << 2;
        if (this.m == n3 && this.j - this.i >= 32) {
            this.j += 32;
        } else if (this.m == this.g.m) {
            if (n2 != this.h) {
                this.k = this.h;
                this.n = 0;
                return false;
            }
            this.j += 32;
        } else if (!this.b(n2)) {
            return false;
        }
        return true;
    }

    private final boolean d(int n2) {
        while (this.o < 32) {
            this.n = 0;
            if (!this.c(n2)) {
                return false;
            }
            ++this.o;
            ++this.l;
        }
        return true;
    }

    private final boolean b() {
        if (this.l <= 0) {
            this.j += 1023;
            char c2 = kx.b(this.j);
            int n2 = this.g.k[c2 >> 5] << 2;
            if (this.g.l == null) {
                throw new NullPointerException("The field DataManipulate in this Trie is null");
            }
            this.l = this.g.l.a(this.g.b(n2 + (c2 & 0x1F)));
            --this.l;
            this.n = 32;
            return true;
        }
        return false;
    }
}

