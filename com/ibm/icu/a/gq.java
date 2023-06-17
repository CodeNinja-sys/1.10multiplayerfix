/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.gg;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.gn;
import com.ibm.icu.a.gp;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.gt;

public class gq
extends gg {
    private static final int P = 65535;
    private static final int Q = 262140;
    private static final int R = 16384;
    private static final int S = 131072;
    private static final int T = 2656;
    private static final int U = 2720;
    private static final int V = 192;
    private static final int W = 256;
    private static final int X = 2176;
    private int[] Y = new int[544];
    private int[] Z = new int[35488];
    private int[] aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private int[] ag = new int[34852];
    private boolean ah = false;

    public gq(int n2, int n3) {
        this.e(n2, n3);
    }

    private void e(int n2, int n3) {
        int n4;
        int n5;
        this.h = n2;
        this.i = n3;
        this.j = 0x110000;
        this.aa = new int[16384];
        this.ac = 16384;
        this.h = n2;
        this.i = n3;
        this.j = 0x110000;
        this.ad = 0;
        this.af = false;
        for (n5 = 0; n5 < 128; ++n5) {
            this.aa[n5] = this.h;
        }
        while (n5 < 192) {
            this.aa[n5] = this.i;
            ++n5;
        }
        for (n5 = 192; n5 < 256; ++n5) {
            this.aa[n5] = this.h;
        }
        this.l = 192;
        this.f = 256;
        n5 = 0;
        for (n4 = 0; n4 < 128; n4 += 32) {
            this.Z[n5] = n4;
            this.ag[n5] = 1;
            ++n5;
        }
        while (n4 < 192) {
            this.ag[n5] = 0;
            ++n5;
            n4 += 32;
        }
        this.ag[n5++] = 34845;
        n4 += 32;
        while (n4 < 256) {
            this.ag[n5] = 0;
            ++n5;
            n4 += 32;
        }
        for (n5 = 4; n5 < 2080; ++n5) {
            this.Z[n5] = 192;
        }
        for (n5 = 0; n5 < 576; ++n5) {
            this.Z[2080 + n5] = -1;
        }
        for (n5 = 0; n5 < 64; ++n5) {
            this.Z[2656 + n5] = 192;
        }
        this.ae = 2656;
        this.ab = 2720;
        n5 = 0;
        n4 = 0;
        while (n5 < 32) {
            this.Y[n5] = n4;
            ++n5;
            n4 += 64;
        }
        while (n5 < 544) {
            this.Y[n5] = 2656;
            ++n5;
        }
        for (n5 = 128; n5 < 2048; n5 += 32) {
            this.d(n5, this.h);
        }
    }

    public gq(gg gg2) {
        this.e(gg2.h, gg2.i);
        for (gl gl2 : gg2) {
            this.a(gl2, true);
        }
    }

    private boolean a(int n2, boolean bl2) {
        int n3 = Character.isHighSurrogate((char)n2) && bl2 ? 320 + (n2 >> 5) : this.Y[n2 >> 11] + (n2 >> 5 & 0x3F);
        int n4 = this.Z[n3];
        return n4 == this.l;
    }

    private int d() {
        int n2 = this.ab;
        int n3 = n2 + 64;
        if (n3 > this.Z.length) {
            throw new IllegalStateException("Internal error in Trie2 creation.");
        }
        this.ab = n3;
        System.arraycopy(this.Z, this.ae, this.Z, n2, 64);
        return n2;
    }

    private int b(int n2, boolean bl2) {
        if (n2 >= 55296 && n2 < 56320 && bl2) {
            return 2048;
        }
        int n3 = n2 >> 11;
        int n4 = this.Y[n3];
        if (n4 == this.ae) {
            this.Y[n3] = n4 = this.d();
        }
        return n4;
    }

    private int b(int n2) {
        int n3;
        if (this.ad != 0) {
            n3 = this.ad;
            this.ad = -this.ag[n3 >> 5];
        } else {
            n3 = this.f;
            int n4 = n3 + 32;
            if (n4 > this.ac) {
                int n5;
                if (this.ac < 131072) {
                    n5 = 131072;
                } else if (this.ac < 1115264) {
                    n5 = 1115264;
                } else {
                    throw new IllegalStateException("Internal error in Trie2 creation.");
                }
                int[] arrn = new int[n5];
                System.arraycopy(this.aa, 0, arrn, 0, this.f);
                this.aa = arrn;
                this.ac = n5;
            }
            this.f = n4;
        }
        System.arraycopy(this.aa, n2, this.aa, n3, 32);
        this.ag[n3 >> 5] = 0;
        return n3;
    }

    private void c(int n2) {
        this.ag[n2 >> 5] = -this.ad;
        this.ad = n2;
    }

    private boolean d(int n2) {
        return n2 != this.l && 1 == this.ag[n2 >> 5];
    }

    private void f(int n2, int n3) {
        int n4 = n3 >> 5;
        this.ag[n4] = this.ag[n4] + 1;
        int n5 = this.Z[n2];
        int n6 = n5 >> 5;
        this.ag[n6] = this.ag[n6] - 1;
        if (0 == this.ag[n6]) {
            this.c(n5);
        }
        this.Z[n2] = n3;
    }

    private int c(int n2, boolean bl2) {
        int n3 = this.b(n2, bl2);
        int n4 = this.Z[n3 += n2 >> 5 & 0x3F];
        if (this.d(n4)) {
            return n4;
        }
        int n5 = this.b(n4);
        this.f(n3, n5);
        return n5;
    }

    public gq d(int n2, int n3) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            throw new IllegalArgumentException("Invalid code point.");
        }
        this.a(n2, true, n3);
        this.m = 0;
        return this;
    }

    private gq a(int n2, boolean bl2, int n3) {
        if (this.af) {
            this.e();
        }
        int n4 = this.c(n2, bl2);
        this.aa[n4 + (n2 & 31)] = n3;
        return this;
    }

    private void e() {
        gq gq2 = new gq(this);
        this.Y = gq2.Y;
        this.Z = gq2.Z;
        this.aa = gq2.aa;
        this.ab = gq2.ab;
        this.ac = gq2.ac;
        this.af = gq2.af;
        this.a = gq2.a;
        this.b = gq2.b;
        this.c = gq2.c;
        this.d = gq2.d;
        this.e = gq2.e;
        this.f = gq2.f;
        this.ae = gq2.ae;
        this.h = gq2.h;
        this.i = gq2.i;
        this.j = gq2.j;
        this.k = gq2.k;
        this.l = gq2.l;
    }

    private void g(int n2, int n3) {
        int n4 = n2 + 32;
        while (n2 < n4) {
            this.aa[n2++] = n3;
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        int n7 = n2 + n4;
        if (bl2) {
            for (int i2 = n2 + n3; i2 < n7; ++i2) {
                this.aa[i2] = n5;
            }
        } else {
            for (int i3 = n2 + n3; i3 < n7; ++i3) {
                if (this.aa[i3] != n6) continue;
                this.aa[i3] = n5;
            }
        }
    }

    public gq a(int n2, int n3, int n4, boolean bl2) {
        int n5;
        int n6;
        if (n2 > 0x10FFFF || n2 < 0 || n3 > 0x10FFFF || n3 < 0 || n2 > n3) {
            throw new IllegalArgumentException("Invalid code point range.");
        }
        if (!bl2 && n4 == this.h) {
            return this;
        }
        this.m = 0;
        if (this.af) {
            this.e();
        }
        int n7 = n3 + 1;
        if ((n2 & 0x1F) != 0) {
            n6 = this.c(n2, true);
            n5 = n2 + 32 & 0xFFFFFFE0;
            if (n5 <= n7) {
                this.a(n6, n2 & 0x1F, 32, n4, this.h, bl2);
                n2 = n5;
            } else {
                this.a(n6, n2 & 0x1F, n7 & 0x1F, n4, this.h, bl2);
                return this;
            }
        }
        int n8 = n7 & 0x1F;
        int n9 = n4 == this.h ? this.l : -1;
        while (n2 < (n7 &= 0xFFFFFFE0)) {
            boolean bl3 = false;
            if (n4 == this.h && this.a(n2, true)) {
                n2 += 32;
                continue;
            }
            n5 = this.b(n2, true);
            n6 = this.Z[n5 += n2 >> 5 & 0x3F];
            if (this.d(n6)) {
                if (bl2 && n6 >= 2176) {
                    bl3 = true;
                } else {
                    this.a(n6, 0, 32, n4, this.h, bl2);
                }
            } else if (this.aa[n6] != n4 && (bl2 || n6 == this.l)) {
                bl3 = true;
            }
            if (bl3) {
                if (n9 >= 0) {
                    this.f(n5, n9);
                } else {
                    n9 = this.c(n2, true);
                    this.g(n9, n4);
                }
            }
            n2 += 32;
        }
        if (n8 > 0) {
            n6 = this.c(n2, true);
            this.a(n6, 0, n8, n4, this.h, bl2);
        }
        return this;
    }

    public gq a(gl gl2, boolean bl2) {
        this.m = 0;
        if (gl2.d) {
            for (int i2 = gl2.a; i2 <= gl2.b; ++i2) {
                if (!bl2 && this.a((char)i2) != this.h) continue;
                this.a((char)i2, gl2.c);
            }
        } else {
            this.a(gl2.a, gl2.b, gl2.c, bl2);
        }
        return this;
    }

    public gq a(char c2, int n2) {
        this.m = 0;
        this.a((int)c2, false, n2);
        return this;
    }

    public int a(int n2) {
        if (n2 < 0 || n2 > 0x10FFFF) {
            return this.i;
        }
        return this.d(n2, true);
    }

    private int d(int n2, boolean bl2) {
        if (n2 >= this.j && (n2 < 55296 || n2 >= 56320 || bl2)) {
            return this.aa[this.f - 4];
        }
        int n3 = n2 >= 55296 && n2 < 56320 && bl2 ? 320 + (n2 >> 5) : this.Y[n2 >> 11] + (n2 >> 5 & 0x3F);
        int n4 = this.Z[n3];
        return this.aa[n4 + (n2 & 0x1F)];
    }

    public int a(char c2) {
        return this.d((int)c2, false);
    }

    private boolean a(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            if (arrn[n2 + i2] == arrn[n3 + i2]) continue;
            return false;
        }
        return true;
    }

    private int h(int n2, int n3) {
        for (int i2 = 0; i2 <= (n2 -= 64); ++i2) {
            if (!this.a(this.Z, i2, n3, 64)) continue;
            return i2;
        }
        return -1;
    }

    private int b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 <= (n2 -= n4); i2 += 4) {
            if (!this.a(this.aa, i2, n3, n4)) continue;
            return i2;
        }
        return -1;
    }

    private int e(int n2) {
        int n3;
        int n4;
        if (n2 == this.h) {
            n4 = this.ae;
            n3 = this.l;
        } else {
            n4 = -1;
            n3 = -1;
        }
        int n5 = 0x110000;
        int n6 = 544;
        int n7 = n5;
        while (n7 > 0) {
            int n8;
            if ((n8 = this.Y[--n6]) == n4) {
                n7 -= 2048;
                continue;
            }
            n4 = n8;
            if (n8 == this.ae) {
                if (n2 != this.h) {
                    return n7;
                }
                n7 -= 2048;
                continue;
            }
            int n9 = 64;
            while (n9 > 0) {
                int n10;
                if ((n10 = this.Z[n8 + --n9]) == n3) {
                    n7 -= 32;
                    continue;
                }
                n3 = n10;
                if (n10 == this.l) {
                    if (n2 != this.h) {
                        return n7;
                    }
                    n7 -= 32;
                    continue;
                }
                int n11 = 32;
                while (n11 > 0) {
                    int n12;
                    if ((n12 = this.aa[n10 + --n11]) != n2) {
                        return n7;
                    }
                    --n7;
                }
            }
        }
        return 0;
    }

    private void f() {
        int n2 = 192;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            this.ag[n4] = n3;
            n3 += 32;
            ++n4;
        }
        int n5 = 64;
        int n6 = n5 >> 5;
        n3 = n2;
        while (n3 < this.f) {
            int n7;
            int n8;
            if (n3 == 2176) {
                n5 = 32;
                n6 = 1;
            }
            if (this.ag[n3 >> 5] <= 0) {
                n3 += n5;
                continue;
            }
            int n9 = this.b(n2, n3, n5);
            if (n9 >= 0) {
                n8 = n3 >> 5;
                for (n4 = n6; n4 > 0; --n4) {
                    this.ag[n8++] = n9;
                    n9 += 32;
                }
                n3 += n5;
                continue;
            }
            for (n7 = n5 - 4; n7 > 0 && !this.a(this.aa, n2 - n7, n3, n7); n7 -= 4) {
            }
            if (n7 > 0 || n2 < n3) {
                n9 = n2 - n7;
                n8 = n3 >> 5;
                for (n4 = n6; n4 > 0; --n4) {
                    this.ag[n8++] = n9;
                    n9 += 32;
                }
                n3 += n7;
                for (n4 = n5 - n7; n4 > 0; --n4) {
                    this.aa[n2++] = this.aa[n3++];
                }
                continue;
            }
            n8 = n3 >> 5;
            for (n4 = n6; n4 > 0; --n4) {
                this.ag[n8++] = n3;
                n3 += 32;
            }
            n2 = n3;
        }
        for (n4 = 0; n4 < this.ab; ++n4) {
            if (n4 == 2080) {
                n4 += 576;
            }
            this.Z[n4] = this.ag[this.Z[n4] >> 5];
        }
        this.l = this.ag[this.l >> 5];
        while ((n2 & 3) != 0) {
            this.aa[n2++] = this.h;
        }
        if (this.ah) {
            System.out.printf("compacting UTrie2: count of 32-bit data words %d->%d\n", this.f, n2);
        }
        this.f = n2;
    }

    private void g() {
        int n2 = 2080;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            this.ag[n4] = n3;
            n3 += 64;
            ++n4;
        }
        n2 += 32 + (this.j - 65536 >> 11);
        n3 = 2656;
        while (n3 < this.ab) {
            int n5;
            int n6 = this.h(n2, n3);
            if (n6 >= 0) {
                this.ag[n3 >> 6] = n6;
                n3 += 64;
                continue;
            }
            for (n5 = 63; n5 > 0 && !this.a(this.Z, n2 - n5, n3, n5); --n5) {
            }
            if (n5 > 0 || n2 < n3) {
                this.ag[n3 >> 6] = n2 - n5;
                n3 += n5;
                for (n4 = 64 - n5; n4 > 0; --n4) {
                    this.Z[n2++] = this.Z[n3++];
                }
                continue;
            }
            this.ag[n3 >> 6] = n3;
            n2 = n3 += 64;
        }
        for (n4 = 0; n4 < 544; ++n4) {
            this.Y[n4] = this.ag[this.Y[n4] >> 6];
        }
        this.ae = this.ag[this.ae >> 6];
        while ((n2 & 3) != 0) {
            this.Z[n2++] = 262140;
        }
        if (this.ah) {
            System.out.printf("compacting UTrie2: count of 16-bit index-2 words %d->%d\n", this.ab, n2);
        }
        this.ab = n2;
    }

    private void h() {
        int n2 = this.a(0x10FFFF);
        int n3 = this.e(n2);
        if ((n3 = n3 + 2047 & 0xFFFFF800) == 0x110000) {
            n2 = this.i;
        }
        this.j = n3;
        if (this.ah) {
            System.out.printf("UTrie2: highStart U+%04x  highValue 0x%x  initialValue 0x%x\n", this.j, n2, this.h);
        }
        if (this.j < 0x110000) {
            int n4 = this.j <= 65536 ? 65536 : this.j;
            this.a(n4, 0x10FFFF, this.h, true);
        }
        this.f();
        if (this.j > 65536) {
            this.g();
        } else if (this.ah) {
            System.out.printf("UTrie2: highStart U+%04x  count of 16-bit index-2 words %d->%d\n", this.j, this.ab, 2112);
        }
        this.aa[this.f++] = n2;
        while ((this.f & 3) != 0) {
            this.aa[this.f++] = this.h;
        }
        this.af = true;
    }

    public gs b() {
        gs gs2 = new gs();
        this.a(gs2, gp.a);
        return gs2;
    }

    public gt c() {
        gt gt2 = new gt();
        this.a(gt2, gp.b);
        return gt2;
    }

    private void a(gg gg2, gp gp2) {
        int n2;
        if (!this.af) {
            this.h();
        }
        int n3 = this.j <= 65536 ? 2112 : this.ab;
        int n4 = gp2 == gp.a ? n3 : 0;
        if (n3 > 65535 || n4 + this.l > 65535 || n4 + 2176 > 65535 || n4 + this.f > 262140) {
            throw new UnsupportedOperationException("Trie2 data is too large.");
        }
        int n5 = n3;
        if (gp2 == gp.a) {
            n5 += this.f;
        } else {
            gg2.d = new int[this.f];
        }
        gg2.b = new char[n5];
        gg2.e = n3;
        gg2.f = this.f;
        gg2.g = this.j <= 65536 ? 65535 : 0 + this.ae;
        gg2.h = this.h;
        gg2.i = this.i;
        gg2.j = this.j;
        gg2.k = n4 + this.f - 4;
        gg2.l = n4 + this.l;
        gg2.a = new gn();
        gg2.a.a = 1416784178;
        gg2.a.b = gp2 == gp.a ? 0 : 1;
        gg2.a.c = gg2.e;
        gg2.a.d = gg2.f >> 2;
        gg2.a.e = gg2.g;
        gg2.a.f = gg2.l;
        gg2.a.g = gg2.j >> 11;
        int n6 = 0;
        for (n2 = 0; n2 < 2080; ++n2) {
            gg2.b[n6++] = (char)(this.Z[n2] + n4 >> 2);
        }
        if (this.ah) {
            System.out.println("\n\nIndex2 for BMP limit is " + Integer.toHexString(n6));
        }
        for (n2 = 0; n2 < 2; ++n2) {
            gg2.b[n6++] = (char)(n4 + 128);
        }
        while (n2 < 32) {
            gg2.b[n6++] = (char)(n4 + this.Z[n2 << 1]);
            ++n2;
        }
        if (this.ah) {
            System.out.println("Index2 for UTF-8 2byte values limit is " + Integer.toHexString(n6));
        }
        if (this.j > 65536) {
            int n7 = this.j - 65536 >> 11;
            int n8 = 2112 + n7;
            for (n2 = 0; n2 < n7; ++n2) {
                gg2.b[n6++] = (char)(0 + this.Y[n2 + 32]);
            }
            if (this.ah) {
                System.out.println("Index 1 for supplementals, limit is " + Integer.toHexString(n6));
            }
            for (n2 = 0; n2 < this.ab - n8; ++n2) {
                gg2.b[n6++] = (char)(n4 + this.Z[n8 + n2] >> 2);
            }
            if (this.ah) {
                System.out.println("Index 2 for supplementals, limit is " + Integer.toHexString(n6));
            }
        }
        switch (gp2) {
            case a: {
                assert (n6 == n4);
                gg2.c = n6;
                for (n2 = 0; n2 < this.f; ++n2) {
                    gg2.b[n6++] = (char)this.aa[n2];
                }
                break;
            }
            case b: {
                for (n2 = 0; n2 < this.f; ++n2) {
                    gg2.d[n2] = this.aa[n2];
                }
                break;
            }
        }
    }
}

