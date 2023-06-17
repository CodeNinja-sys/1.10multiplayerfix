/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.d.kx;
import com.ibm.icu.util.ac;
import com.ibm.icu.util.ad;
import com.ibm.icu.util.i;
import java.io.IOException;
import java.util.Iterator;

public final class z
implements Cloneable,
Iterable {
    private static i[] t = new i[]{com.ibm.icu.util.i.d, com.ibm.icu.util.i.c};
    static final int a = 5;
    static final int b = 48;
    static final int c = 16;
    static final int d = 64;
    static final int e = 63;
    static final int f = 32768;
    static final int g = 16383;
    static final int h = 16384;
    static final int i = 32767;
    static final int j = 0x3FFEFFFF;
    static final int k = 255;
    static final int l = 16448;
    static final int m = 32704;
    static final int n = 0xFDFFFF;
    static final int o = 64511;
    static final int p = 64512;
    static final int q = 65535;
    static final int r = 0x3FEFFFF;
    private CharSequence u;
    private int v;
    private int w;
    private int x;

    public z(CharSequence charSequence, int n2) {
        this.u = charSequence;
        this.w = this.v = n2;
        this.x = -1;
    }

    public Object clone() {
        return super.clone();
    }

    public z a() {
        this.w = this.v;
        this.x = -1;
        return this;
    }

    public z a(ad ad2) {
        ad.a(ad2, this.u);
        ad.a(ad2, this.v);
        ad.b(ad2, this.w);
        ad.c(ad2, this.x);
        return this;
    }

    public z b(ad ad2) {
        if (this.u != ad.a(ad2) || this.u == null || this.v != ad.b(ad2)) {
            throw new IllegalArgumentException("incompatible trie state");
        }
        this.w = ad.c(ad2);
        this.x = ad.d(ad2);
        return this;
    }

    public i b() {
        char c2;
        int n2 = this.w;
        if (n2 < 0) {
            return com.ibm.icu.util.i.a;
        }
        return this.x < 0 && (c2 = this.u.charAt(n2)) >= '@' ? t[c2 >> 15] : com.ibm.icu.util.i.b;
    }

    public i a(int n2) {
        this.x = -1;
        return this.e(this.v, n2);
    }

    public i b(int n2) {
        return n2 <= 65535 ? this.a(n2) : (this.a(kx.b(n2)).c() ? this.c(kx.c(n2)) : com.ibm.icu.util.i.a);
    }

    public i c(int n2) {
        int n3 = this.w;
        if (n3 < 0) {
            return com.ibm.icu.util.i.a;
        }
        int n4 = this.x;
        if (n4 >= 0) {
            if (n2 == this.u.charAt(n3++)) {
                char c2;
                this.x = --n4;
                this.w = n3;
                return n4 < 0 && (c2 = this.u.charAt(n3)) >= '@' ? t[c2 >> 15] : com.ibm.icu.util.i.b;
            }
            this.f();
            return com.ibm.icu.util.i.a;
        }
        return this.e(n3, n2);
    }

    public i d(int n2) {
        return n2 <= 65535 ? this.c(n2) : (this.c(kx.b(n2)).c() ? this.c(kx.c(n2)) : com.ibm.icu.util.i.a);
    }

    public i a(CharSequence charSequence, int n2, int n3) {
        if (n2 >= n3) {
            return this.b();
        }
        int n4 = this.w;
        if (n4 < 0) {
            return com.ibm.icu.util.i.a;
        }
        int n5 = this.x;
        block0: while (true) {
            int n6;
            if (n2 == n3) {
                this.x = n5;
                this.w = n4;
                return n5 < 0 && (n6 = this.u.charAt(n4)) >= 64 ? t[n6 >> 15] : com.ibm.icu.util.i.b;
            }
            char c2 = charSequence.charAt(n2++);
            if (n5 >= 0) {
                if (c2 != this.u.charAt(n4)) {
                    this.f();
                    return com.ibm.icu.util.i.a;
                }
                ++n4;
                --n5;
                continue;
            }
            this.x = n5;
            n6 = this.u.charAt(n4++);
            while (true) {
                if (n6 < 48) {
                    i i2 = this.a(n4, n6, (int)c2);
                    if (i2 == com.ibm.icu.util.i.a) {
                        return com.ibm.icu.util.i.a;
                    }
                    if (n2 == n3) {
                        return i2;
                    }
                    if (i2 == com.ibm.icu.util.i.c) {
                        this.f();
                        return com.ibm.icu.util.i.a;
                    }
                    c2 = charSequence.charAt(n2++);
                    n4 = this.w;
                    n6 = this.u.charAt(n4++);
                    continue;
                }
                if (n6 < 64) {
                    n5 = n6 - 48;
                    if (c2 != this.u.charAt(n4)) {
                        this.f();
                        return com.ibm.icu.util.i.a;
                    }
                    ++n4;
                    --n5;
                    continue block0;
                }
                if ((n6 & 0x8000) != 0) {
                    this.f();
                    return com.ibm.icu.util.i.a;
                }
                n4 = z.d(n4, n6);
                n6 &= 0x3F;
            }
            break;
        }
    }

    public int c() {
        int n2 = this.w;
        char c2 = this.u.charAt(n2++);
        assert (c2 >= '@');
        return (c2 & 0x8000) != 0 ? z.e(this.u, n2, c2 & 0x7FFF) : z.f(this.u, n2, c2);
    }

    public long d() {
        int n2 = this.w;
        if (n2 < 0) {
            return 0L;
        }
        long l2 = z.a(this.u, n2 + this.x + 1, 0L);
        return l2 << 31 >> 31;
    }

    public int a(Appendable appendable) {
        int n2;
        int n3 = this.w;
        if (n3 < 0) {
            return 0;
        }
        if (this.x >= 0) {
            z.a(appendable, (int)this.u.charAt(n3));
            return 1;
        }
        if ((n2 = this.u.charAt(n3++)) >= 64) {
            if ((n2 & 0x8000) != 0) {
                return 0;
            }
            n3 = z.d(n3, n2);
            n2 &= 0x3F;
        }
        if (n2 < 48) {
            if (n2 == 0) {
                n2 = this.u.charAt(n3++);
            }
            z.a(this.u, n3, ++n2, appendable);
            return n2;
        }
        z.a(appendable, (int)this.u.charAt(n3));
        return 1;
    }

    public ac e() {
        return new ac(this.u, this.w, this.x, 0, null);
    }

    public ac e(int n2) {
        return new ac(this.u, this.w, this.x, n2, null);
    }

    public static ac b(CharSequence charSequence, int n2, int n3) {
        return new ac(charSequence, n2, -1, n3, null);
    }

    private void f() {
        this.w = -1;
    }

    private static int e(CharSequence charSequence, int n2, int n3) {
        int n4 = n3 < 16384 ? n3 : (n3 < 32767 ? n3 - 16384 << 16 | charSequence.charAt(n2) : charSequence.charAt(n2) << 16 | charSequence.charAt(n2 + 1));
        return n4;
    }

    private static int c(int n2, int n3) {
        if (n3 >= 16384) {
            n2 = n3 < 32767 ? ++n2 : (n2 += 2);
        }
        return n2;
    }

    private static int c(CharSequence charSequence, int n2) {
        char c2 = charSequence.charAt(n2++);
        return z.c(n2, c2 & 0x7FFF);
    }

    private static int f(CharSequence charSequence, int n2, int n3) {
        assert (64 <= n3 && n3 < 32768);
        int n4 = n3 < 16448 ? (n3 >> 6) - 1 : (n3 < 32704 ? (n3 & 0x7FC0) - 16448 << 10 | charSequence.charAt(n2) : charSequence.charAt(n2) << 16 | charSequence.charAt(n2 + 1));
        return n4;
    }

    private static int d(int n2, int n3) {
        assert (64 <= n3 && n3 < 32768);
        if (n3 >= 16448) {
            n2 = n3 < 32704 ? ++n2 : (n2 += 2);
        }
        return n2;
    }

    private static int d(CharSequence charSequence, int n2) {
        int n3;
        if ((n3 = charSequence.charAt(n2++)) >= 64512) {
            if (n3 == 65535) {
                n3 = charSequence.charAt(n2) << 16 | charSequence.charAt(n2 + 1);
                n2 += 2;
            } else {
                n3 = n3 - 64512 << 16 | charSequence.charAt(n2++);
            }
        }
        return n2 + n3;
    }

    private static int e(CharSequence charSequence, int n2) {
        char c2;
        if ((c2 = charSequence.charAt(n2++)) >= '\ufc00') {
            n2 = c2 == '\uffff' ? (n2 += 2) : ++n2;
        }
        return n2;
    }

    private i a(int n2, int n3, int n4) {
        if (n3 == 0) {
            n3 = this.u.charAt(n2++);
        }
        ++n3;
        while (n3 > 5) {
            if (n4 < this.u.charAt(n2++)) {
                n3 >>= 1;
                n2 = z.d(this.u, n2);
                continue;
            }
            n3 -= n3 >> 1;
            n2 = z.e(this.u, n2);
        }
        do {
            if (n4 == this.u.charAt(n2++)) {
                i i2;
                int n5 = this.u.charAt(n2);
                if ((n5 & 0x8000) != 0) {
                    i2 = com.ibm.icu.util.i.c;
                } else {
                    int n6;
                    ++n2;
                    if (n5 < 16384) {
                        n6 = n5;
                    } else if (n5 < 32767) {
                        n6 = n5 - 16384 << 16 | this.u.charAt(n2++);
                    } else {
                        n6 = this.u.charAt(n2) << 16 | this.u.charAt(n2 + 1);
                        n2 += 2;
                    }
                    n5 = this.u.charAt(n2 += n6);
                    i2 = n5 >= 64 ? t[n5 >> 15] : com.ibm.icu.util.i.b;
                }
                this.w = n2;
                return i2;
            }
            n2 = z.c(this.u, n2);
        } while (--n3 > 1);
        if (n4 == this.u.charAt(n2++)) {
            this.w = n2;
            char c2 = this.u.charAt(n2);
            return c2 >= '@' ? t[c2 >> 15] : com.ibm.icu.util.i.b;
        }
        this.f();
        return com.ibm.icu.util.i.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    private i e(int n2, int n3) {
        int n4 = this.u.charAt(n2++);
        while (true) {
            if (n4 < 48) {
                return this.a(n2, n4, n3);
            }
            if (n4 < 64) {
                i i2;
                int n5 = n4 - 48;
                if (n3 != this.u.charAt(n2++)) break;
                this.x = --n5;
                this.w = n2;
                if (n5 < 0) {
                    char c2 = this.u.charAt(n2);
                    n4 = c2;
                    if (c2 >= '@') {
                        i2 = t[n4 >> 15];
                        return i2;
                    }
                }
                i2 = com.ibm.icu.util.i.b;
                return i2;
            }
            if ((n4 & 0x8000) != 0) break;
            n2 = z.d(n2, n4);
            n4 &= 0x3F;
        }
        this.f();
        return com.ibm.icu.util.i.a;
    }

    private static long a(CharSequence charSequence, int n2, int n3, long l2) {
        while (n3 > 5) {
            if ((l2 = z.a(charSequence, z.d(charSequence, ++n2), n3 >> 1, l2)) == 0L) {
                return 0L;
            }
            n3 -= n3 >> 1;
            n2 = z.e(charSequence, n2);
        }
        do {
            int n4 = ++n2;
            int n5 = charSequence.charAt(n4);
            boolean bl2 = (n5 & 0x8000) != 0;
            int n6 = z.e(charSequence, ++n2, n5 &= 0x7FFF);
            n2 = z.c(n2, n5);
            if (bl2) {
                if (l2 != 0L) {
                    if (n6 == (int)(l2 >> 1)) continue;
                    return 0L;
                }
                l2 = (long)n6 << 1 | 1L;
                continue;
            }
            if ((l2 = z.a(charSequence, n2 + n6, l2)) != 0L) continue;
            return 0L;
        } while (--n3 > 1);
        return (long)(n2 + 1) << 33 | l2 & 0x1FFFFFFFFL;
    }

    private static long a(CharSequence charSequence, int n2, long l2) {
        int n3 = charSequence.charAt(n2++);
        while (true) {
            if (n3 < 48) {
                if (n3 == 0) {
                    n3 = charSequence.charAt(n2++);
                }
                if ((l2 = z.a(charSequence, n2, n3 + '\u0001', l2)) == 0L) {
                    return 0L;
                }
                n2 = (int)(l2 >>> 33);
                n3 = charSequence.charAt(n2++);
                continue;
            }
            if (n3 < 64) {
                n2 += n3 - 48 + 1;
                n3 = charSequence.charAt(n2++);
                continue;
            }
            boolean bl2 = (n3 & 0x8000) != 0;
            int n4 = bl2 ? z.e(charSequence, n2, n3 & 0x7FFF) : z.f(charSequence, n2, n3);
            if (l2 != 0L) {
                if (n4 != (int)(l2 >> 1)) {
                    return 0L;
                }
            } else {
                l2 = (long)n4 << 1 | 1L;
            }
            if (bl2) {
                return l2;
            }
            n2 = z.d(n2, n3);
            n3 &= 0x3F;
        }
    }

    private static void a(CharSequence charSequence, int n2, int n3, Appendable appendable) {
        while (n3 > 5) {
            z.a(charSequence, z.d(charSequence, ++n2), n3 >> 1, appendable);
            n3 -= n3 >> 1;
            n2 = z.e(charSequence, n2);
        }
        do {
            z.a(appendable, (int)charSequence.charAt(n2++));
            n2 = z.c(charSequence, n2);
        } while (--n3 > 1);
        z.a(appendable, (int)charSequence.charAt(n2));
    }

    private static void a(Appendable appendable, int n2) {
        try {
            appendable.append((char)n2);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public /* synthetic */ Iterator iterator() {
        return this.e();
    }

    static /* synthetic */ int a(int n2, int n3) {
        return z.d(n2, n3);
    }

    static /* synthetic */ int c(CharSequence charSequence, int n2, int n3) {
        return z.e(charSequence, n2, n3);
    }

    static /* synthetic */ int d(CharSequence charSequence, int n2, int n3) {
        return z.f(charSequence, n2, n3);
    }

    static /* synthetic */ int a(CharSequence charSequence, int n2) {
        return z.e(charSequence, n2);
    }

    static /* synthetic */ int b(CharSequence charSequence, int n2) {
        return z.d(charSequence, n2);
    }

    static /* synthetic */ int b(int n2, int n3) {
        return z.c(n2, n3);
    }
}

