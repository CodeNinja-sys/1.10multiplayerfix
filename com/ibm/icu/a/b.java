/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.d.lm;

public final class b {
    public static int a = 56613888;
    private boolean[] c;
    private int[] d;
    private int[] e;
    private int[] f;
    private final int[] g;
    private final int h;

    public b(int[] arrn, int n2) {
        this.g = arrn;
        this.h = n2;
        this.c = new boolean[256];
        this.d = new int[64];
        this.e = new int[64];
        this.f = new int[18];
        this.f[0] = this.a(2048, 0, this.h - 1);
        for (int i2 = 1; i2 <= 16; ++i2) {
            this.f[i2] = this.a(i2 << 12, this.f[i2 - 1], this.h - 1);
        }
        this.f[17] = this.h - 1;
        this.a();
    }

    public b(b b2, int[] arrn, int n2) {
        this.g = arrn;
        this.h = n2;
        this.c = (boolean[])b2.c.clone();
        this.d = (int[])b2.d.clone();
        this.e = (int[])b2.e.clone();
        this.f = (int[])b2.f.clone();
    }

    public boolean a(int n2) {
        if (n2 <= 255) {
            return this.c[n2];
        }
        if (n2 <= 2047) {
            return (this.d[n2 & 0x3F] & 1 << (n2 >> 6)) != 0;
        }
        if (n2 < 55296 || n2 >= 57344 && n2 <= 65535) {
            int n3 = n2 >> 12;
            int n4 = this.e[n2 >> 6 & 0x3F] >> n3 & 0x10001;
            if (n4 <= 1) {
                return 0 != n4;
            }
            return this.b(n2, this.f[n3], this.f[n3 + 1]);
        }
        if (n2 <= 0x10FFFF) {
            return this.b(n2, this.f[13], this.f[17]);
        }
        return false;
    }

    public final int a(CharSequence charSequence, int n2, int n3, lm lm2) {
        int n4;
        int n5 = Math.min(charSequence.length(), n3);
        if (lm.a != lm2) {
            for (n4 = n2; n4 < n5; ++n4) {
                int n6;
                char c2;
                char c3 = charSequence.charAt(n4);
                if (c3 <= '\u00ff') {
                    if (this.c[c3]) continue;
                } else if (c3 <= '\u07ff') {
                    if ((this.d[c3 & 0x3F] & 1 << (c3 >> 6)) != 0) continue;
                } else if (c3 < '\ud800' || c3 >= '\udc00' || n4 + 1 == n5 || (c2 = charSequence.charAt(n4 + 1)) < '\udc00' || c2 >= '\ue000') {
                    n6 = c3 >> 12;
                    int n7 = this.e[c3 >> 6 & 0x3F] >> n6 & 0x10001;
                    if (!(n7 <= 1 ? n7 == 0 : !this.b(c3, this.f[n6], this.f[n6 + 1]))) continue;
                } else {
                    n6 = hk.a(c3, c2);
                    if (this.b(n6, this.f[16], this.f[17])) {
                        ++n4;
                        continue;
                    }
                }
                break;
            }
        } else {
            while (n4 < n5) {
                int n8;
                char c4;
                char c5 = charSequence.charAt(n4);
                if (c5 <= '\u00ff') {
                    if (this.c[c5]) {
                        break;
                    }
                } else if (c5 <= '\u07ff') {
                    if ((this.d[c5 & 0x3F] & 1 << (c5 >> 6)) != 0) {
                        break;
                    }
                } else if (c5 < '\ud800' || c5 >= '\udc00' || n4 + 1 == n5 || (c4 = charSequence.charAt(n4 + 1)) < '\udc00' || c4 >= '\ue000') {
                    n8 = c5 >> 12;
                    int n9 = this.e[c5 >> 6 & 0x3F] >> n8 & 0x10001;
                    if (n9 <= 1 ? n9 != 0 : this.b(c5, this.f[n8], this.f[n8 + 1])) {
                        break;
                    }
                } else {
                    n8 = hk.a(c5, c4);
                    if (this.b(n8, this.f[16], this.f[17])) break;
                    ++n4;
                }
                ++n4;
            }
        }
        return n4 - n2;
    }

    public final int a(CharSequence charSequence, int n2, lm lm2) {
        block10: {
            n2 = Math.min(charSequence.length(), n2);
            if (lm.a != lm2) {
                do {
                    int n3;
                    char c2;
                    char c3;
                    if ((c3 = charSequence.charAt(--n2)) <= '\u00ff') {
                        if (this.c[c3]) continue;
                        break block10;
                    }
                    if (c3 <= '\u07ff') {
                        if ((this.d[c3 & 0x3F] & 1 << (c3 >> 6)) != 0) continue;
                        break block10;
                    }
                    if (c3 < '\ud800' || c3 < '\udc00' || 0 == n2 || (c2 = charSequence.charAt(n2 - 1)) < '\ud800' || c2 >= '\udc00') {
                        n3 = c3 >> 12;
                        int n4 = this.e[c3 >> 6 & 0x3F] >> n3 & 0x10001;
                        if (!(n4 <= 1 ? n4 == 0 : !this.b(c3, this.f[n3], this.f[n3 + 1]))) continue;
                        break block10;
                    }
                    n3 = hk.a(c2, c3);
                    if (!this.b(n3, this.f[16], this.f[17])) break block10;
                    --n2;
                } while (0 != n2);
                return 0;
            }
            do {
                int n5;
                char c4;
                char c5;
                if ((c5 = charSequence.charAt(--n2)) <= '\u00ff') {
                    if (!this.c[c5]) continue;
                    break block10;
                }
                if (c5 <= '\u07ff') {
                    if ((this.d[c5 & 0x3F] & 1 << (c5 >> 6)) == 0) continue;
                    break block10;
                }
                if (c5 < '\ud800' || c5 < '\udc00' || 0 == n2 || (c4 = charSequence.charAt(n2 - 1)) < '\ud800' || c4 >= '\udc00') {
                    n5 = c5 >> 12;
                    int n6 = this.e[c5 >> 6 & 0x3F] >> n5 & 0x10001;
                    if (!(n6 <= 1 ? n6 != 0 : this.b(c5, this.f[n5], this.f[n5 + 1]))) continue;
                    break block10;
                }
                n5 = hk.a(c4, c5);
                if (this.b(n5, this.f[16], this.f[17])) break block10;
                --n2;
            } while (0 != n2);
            return 0;
        }
        return n2 + 1;
    }

    private static void a(int[] arrn, int n2, int n3) {
        assert (64 == arrn.length);
        int n4 = n2 >> 6;
        int n5 = n2 & 0x3F;
        int n6 = 1 << n4;
        if (n2 + 1 == n3) {
            int n7 = n5;
            arrn[n7] = arrn[n7] | n6;
            return;
        }
        int n8 = n3 >> 6;
        int n9 = n3 & 0x3F;
        if (n4 == n8) {
            while (n5 < n9) {
                int n10 = n5++;
                arrn[n10] = arrn[n10] | n6;
            }
        } else {
            if (n5 > 0) {
                do {
                    int n11 = n5++;
                    arrn[n11] = arrn[n11] | n6;
                } while (n5 < 64);
                ++n4;
            }
            if (n4 < n8) {
                n6 = ~((1 << n4) - 1);
                if (n8 < 32) {
                    n6 &= (1 << n8) - 1;
                }
                n5 = 0;
                while (n5 < 64) {
                    int n12 = n5++;
                    arrn[n12] = arrn[n12] | n6;
                }
            }
            n6 = 1 << n8;
            n5 = 0;
            while (n5 < n9) {
                int n13 = n5++;
                arrn[n13] = arrn[n13] | n6;
            }
        }
    }

    private void a() {
        int n2;
        int n3;
        int n4 = 0;
        do {
            n2 = this.g[n4++];
            n3 = n4 < this.h ? this.g[n4++] : 0x110000;
            if (n2 >= 256) break;
            do {
                this.c[n2++] = true;
            } while (n2 < n3 && n2 < 256);
        } while (n3 <= 256);
        while (n2 < 2048) {
            com.ibm.icu.a.b.a(this.d, n2, n3 <= 2048 ? n3 : 2048);
            if (n3 > 2048) {
                n2 = 2048;
                break;
            }
            n2 = this.g[n4++];
            if (n4 < this.h) {
                n3 = this.g[n4++];
                continue;
            }
            n3 = 0x110000;
        }
        int n5 = 2048;
        while (n2 < 65536) {
            if (n3 > 65536) {
                n3 = 65536;
            }
            if (n2 < n5) {
                n2 = n5;
            }
            if (n2 < n3) {
                if (0 != (n2 & 0x3F)) {
                    int n6 = (n2 >>= 6) & 0x3F;
                    this.e[n6] = this.e[n6] | 65537 << (n2 >> 6);
                    n5 = n2 = n2 + 1 << 6;
                }
                if (n2 < n3) {
                    if (n2 < (n3 & 0xFFFFFFC0)) {
                        com.ibm.icu.a.b.a(this.e, n2 >> 6, n3 >> 6);
                    }
                    if (0 != (n3 & 0x3F)) {
                        int n7 = (n3 >>= 6) & 0x3F;
                        this.e[n7] = this.e[n7] | 65537 << (n3 >> 6);
                        n5 = n3 = n3 + 1 << 6;
                    }
                }
            }
            if (n3 == 65536) break;
            n2 = this.g[n4++];
            if (n4 < this.h) {
                n3 = this.g[n4++];
                continue;
            }
            n3 = 0x110000;
        }
    }

    private int a(int n2, int n3, int n4) {
        int n5;
        if (n2 < this.g[n3]) {
            return n3;
        }
        if (n3 >= n4 || n2 >= this.g[n4 - 1]) {
            return n4;
        }
        while ((n5 = n3 + n4 >>> 1) != n3) {
            if (n2 < this.g[n5]) {
                n4 = n5;
                continue;
            }
            n3 = n5;
        }
        return n4;
    }

    private final boolean b(int n2, int n3, int n4) {
        return 0 != (this.a(n2, n3, n4) & 1);
    }
}

