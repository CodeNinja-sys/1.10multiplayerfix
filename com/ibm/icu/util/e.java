/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.h;
import com.ibm.icu.util.i;
import com.ibm.icu.util.j;
import java.io.IOException;
import java.util.Iterator;

public final class e
implements Cloneable,
Iterable {
    private static i[] u = new i[]{com.ibm.icu.util.i.d, com.ibm.icu.util.i.c};
    static final int a = 5;
    static final int b = 16;
    static final int c = 16;
    static final int d = 32;
    private static final int v = 1;
    static final int e = 16;
    static final int f = 64;
    static final int g = 81;
    static final int h = 6911;
    static final int i = 108;
    static final int j = 126;
    static final int k = 0x11FFFF;
    static final int l = 127;
    static final int m = 191;
    static final int n = 192;
    static final int o = 240;
    static final int p = 254;
    static final int q = 255;
    static final int r = 12287;
    static final int s = 917503;
    private byte[] w;
    private int x;
    private int y;
    private int z;

    public e(byte[] arrby, int n2) {
        this.w = arrby;
        this.y = this.x = n2;
        this.z = -1;
    }

    public Object clone() {
        return super.clone();
    }

    public e a() {
        this.y = this.x;
        this.z = -1;
        return this;
    }

    public e a(j j2) {
        com.ibm.icu.util.j.a(j2, this.w);
        com.ibm.icu.util.j.a(j2, this.x);
        com.ibm.icu.util.j.b(j2, this.y);
        com.ibm.icu.util.j.c(j2, this.z);
        return this;
    }

    public e b(j j2) {
        if (this.w != com.ibm.icu.util.j.a(j2) || this.w == null || this.x != com.ibm.icu.util.j.b(j2)) {
            throw new IllegalArgumentException("incompatible trie state");
        }
        this.y = com.ibm.icu.util.j.c(j2);
        this.z = com.ibm.icu.util.j.d(j2);
        return this;
    }

    public i b() {
        int n2;
        int n3 = this.y;
        if (n3 < 0) {
            return com.ibm.icu.util.i.a;
        }
        return this.z < 0 && (n2 = this.w[n3] & 0xFF) >= 32 ? u[n2 & 1] : com.ibm.icu.util.i.b;
    }

    public i a(int n2) {
        this.z = -1;
        if (n2 < 0) {
            n2 += 256;
        }
        return this.c(this.x, n2);
    }

    public i b(int n2) {
        int n3;
        int n4 = this.y;
        if (n4 < 0) {
            return com.ibm.icu.util.i.a;
        }
        if (n2 < 0) {
            n2 += 256;
        }
        if ((n3 = this.z) >= 0) {
            if (n2 == (this.w[n4++] & 0xFF)) {
                int n5;
                this.z = --n3;
                this.y = n4;
                return n3 < 0 && (n5 = this.w[n4] & 0xFF) >= 32 ? u[n5 & 1] : com.ibm.icu.util.i.b;
            }
            this.f();
            return com.ibm.icu.util.i.a;
        }
        return this.c(n4, n2);
    }

    public i a(byte[] arrby, int n2, int n3) {
        if (n2 >= n3) {
            return this.b();
        }
        int n4 = this.y;
        if (n4 < 0) {
            return com.ibm.icu.util.i.a;
        }
        int n5 = this.z;
        block0: while (true) {
            int n6;
            if (n2 == n3) {
                this.z = n5;
                this.y = n4;
                return n5 < 0 && (n6 = this.w[n4] & 0xFF) >= 32 ? u[n6 & 1] : com.ibm.icu.util.i.b;
            }
            byte by2 = arrby[n2++];
            if (n5 >= 0) {
                if (by2 != this.w[n4]) {
                    this.f();
                    return com.ibm.icu.util.i.a;
                }
                ++n4;
                --n5;
                continue;
            }
            this.z = n5;
            while (true) {
                if ((n6 = this.w[n4++] & 0xFF) < 16) {
                    i i2 = this.a(n4, n6, by2 & 0xFF);
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
                    by2 = arrby[n2++];
                    n4 = this.y;
                    continue;
                }
                if (n6 < 32) {
                    n5 = n6 - 16;
                    if (by2 != this.w[n4]) {
                        this.f();
                        return com.ibm.icu.util.i.a;
                    }
                    ++n4;
                    --n5;
                    continue block0;
                }
                if ((n6 & 1) != 0) {
                    this.f();
                    return com.ibm.icu.util.i.a;
                }
                n4 = com.ibm.icu.util.e.b(n4, n6);
                if (!t && (this.w[n4] & 0xFF) >= 32) break block0;
            }
            break;
        }
        throw new AssertionError();
    }

    public int c() {
        int n2 = this.y;
        int n3 = this.w[n2++] & 0xFF;
        assert (n3 >= 32);
        return com.ibm.icu.util.e.d(this.w, n2, n3 >> 1);
    }

    public long d() {
        int n2 = this.y;
        if (n2 < 0) {
            return 0L;
        }
        long l2 = com.ibm.icu.util.e.a(this.w, n2 + this.z + 1, 0L);
        return l2 << 31 >> 31;
    }

    public int a(Appendable appendable) {
        int n2;
        int n3 = this.y;
        if (n3 < 0) {
            return 0;
        }
        if (this.z >= 0) {
            com.ibm.icu.util.e.a(appendable, this.w[n3] & 0xFF);
            return 1;
        }
        if ((n2 = this.w[n3++] & 0xFF) >= 32) {
            if ((n2 & 1) != 0) {
                return 0;
            }
            n3 = com.ibm.icu.util.e.b(n3, n2);
            n2 = this.w[n3++] & 0xFF;
            assert (n2 < 32);
        }
        if (n2 < 16) {
            if (n2 == 0) {
                n2 = this.w[n3++] & 0xFF;
            }
            com.ibm.icu.util.e.a(this.w, n3, ++n2, appendable);
            return n2;
        }
        com.ibm.icu.util.e.a(appendable, this.w[n3] & 0xFF);
        return 1;
    }

    public h e() {
        return new h(this.w, this.y, this.z, 0, null);
    }

    public h c(int n2) {
        return new h(this.w, this.y, this.z, n2, null);
    }

    public static h b(byte[] arrby, int n2, int n3) {
        return new h(arrby, n2, -1, n3, null);
    }

    private void f() {
        this.y = -1;
    }

    private static int d(byte[] arrby, int n2, int n3) {
        int n4 = n3 < 81 ? n3 - 16 : (n3 < 108 ? n3 - 81 << 8 | arrby[n2] & 0xFF : (n3 < 126 ? n3 - 108 << 16 | (arrby[n2] & 0xFF) << 8 | arrby[n2 + 1] & 0xFF : (n3 == 126 ? (arrby[n2] & 0xFF) << 16 | (arrby[n2 + 1] & 0xFF) << 8 | arrby[n2 + 2] & 0xFF : arrby[n2] << 24 | (arrby[n2 + 1] & 0xFF) << 16 | (arrby[n2 + 2] & 0xFF) << 8 | arrby[n2 + 3] & 0xFF)));
        return n4;
    }

    private static int b(int n2, int n3) {
        assert (n3 >= 32);
        if (n3 >= 162) {
            n2 = n3 < 216 ? ++n2 : (n3 < 252 ? (n2 += 2) : (n2 += 3 + (n3 >> 1 & 1)));
        }
        return n2;
    }

    private static int c(byte[] arrby, int n2) {
        int n3 = arrby[n2++] & 0xFF;
        return com.ibm.icu.util.e.b(n2, n3);
    }

    private static int d(byte[] arrby, int n2) {
        int n3;
        if ((n3 = arrby[n2++] & 0xFF) >= 192) {
            if (n3 < 240) {
                n3 = n3 - 192 << 8 | arrby[n2++] & 0xFF;
            } else if (n3 < 254) {
                n3 = n3 - 240 << 16 | (arrby[n2] & 0xFF) << 8 | arrby[n2 + 1] & 0xFF;
                n2 += 2;
            } else if (n3 == 254) {
                n3 = (arrby[n2] & 0xFF) << 16 | (arrby[n2 + 1] & 0xFF) << 8 | arrby[n2 + 2] & 0xFF;
                n2 += 3;
            } else {
                n3 = arrby[n2] << 24 | (arrby[n2 + 1] & 0xFF) << 16 | (arrby[n2 + 2] & 0xFF) << 8 | arrby[n2 + 3] & 0xFF;
                n2 += 4;
            }
        }
        return n2 + n3;
    }

    private static int e(byte[] arrby, int n2) {
        int n3;
        if ((n3 = arrby[n2++] & 0xFF) >= 192) {
            n2 = n3 < 240 ? ++n2 : (n3 < 254 ? (n2 += 2) : (n2 += 3 + (n3 & 1)));
        }
        return n2;
    }

    private i a(int n2, int n3, int n4) {
        if (n3 == 0) {
            n3 = this.w[n2++] & 0xFF;
        }
        ++n3;
        while (n3 > 5) {
            if (n4 < (this.w[n2++] & 0xFF)) {
                n3 >>= 1;
                n2 = com.ibm.icu.util.e.d(this.w, n2);
                continue;
            }
            n3 -= n3 >> 1;
            n2 = com.ibm.icu.util.e.e(this.w, n2);
        }
        do {
            if (n4 == (this.w[n2++] & 0xFF)) {
                i i2;
                int n5 = this.w[n2] & 0xFF;
                assert (n5 >= 32);
                if ((n5 & 1) != 0) {
                    i2 = com.ibm.icu.util.i.c;
                } else {
                    int n6;
                    ++n2;
                    if ((n5 >>= 1) < 81) {
                        n6 = n5 - 16;
                    } else if (n5 < 108) {
                        n6 = n5 - 81 << 8 | this.w[n2++] & 0xFF;
                    } else if (n5 < 126) {
                        n6 = n5 - 108 << 16 | (this.w[n2] & 0xFF) << 8 | this.w[n2 + 1] & 0xFF;
                        n2 += 2;
                    } else if (n5 == 126) {
                        n6 = (this.w[n2] & 0xFF) << 16 | (this.w[n2 + 1] & 0xFF) << 8 | this.w[n2 + 2] & 0xFF;
                        n2 += 3;
                    } else {
                        n6 = this.w[n2] << 24 | (this.w[n2 + 1] & 0xFF) << 16 | (this.w[n2 + 2] & 0xFF) << 8 | this.w[n2 + 3] & 0xFF;
                        n2 += 4;
                    }
                    n5 = this.w[n2 += n6] & 0xFF;
                    i2 = n5 >= 32 ? u[n5 & 1] : com.ibm.icu.util.i.b;
                }
                this.y = n2;
                return i2;
            }
            n2 = com.ibm.icu.util.e.c(this.w, n2);
        } while (--n3 > 1);
        if (n4 == (this.w[n2++] & 0xFF)) {
            this.y = n2;
            int n7 = this.w[n2] & 0xFF;
            return n7 >= 32 ? u[n7 & 1] : com.ibm.icu.util.i.b;
        }
        this.f();
        return com.ibm.icu.util.i.a;
    }

    private i c(int n2, int n3) {
        block4: {
            while (true) {
                int n4;
                if ((n4 = this.w[n2++] & 0xFF) < 16) {
                    return this.a(n2, n4, n3);
                }
                if (n4 < 32) {
                    int n5 = n4 - 16;
                    if (n3 == (this.w[n2++] & 0xFF)) {
                        this.z = --n5;
                        this.y = n2;
                        return n5 < 0 && (n4 = this.w[n2] & 0xFF) >= 32 ? u[n4 & 1] : com.ibm.icu.util.i.b;
                    }
                    break block4;
                }
                if ((n4 & 1) != 0) break block4;
                n2 = com.ibm.icu.util.e.b(n2, n4);
                assert ((this.w[n2] & 0xFF) < 32);
            }
        }
        this.f();
        return com.ibm.icu.util.i.a;
    }

    private static long a(byte[] arrby, int n2, int n3, long l2) {
        while (n3 > 5) {
            if ((l2 = com.ibm.icu.util.e.a(arrby, com.ibm.icu.util.e.d(arrby, ++n2), n3 >> 1, l2)) == 0L) {
                return 0L;
            }
            n3 -= n3 >> 1;
            n2 = com.ibm.icu.util.e.e(arrby, n2);
        }
        do {
            int n4 = ++n2;
            int n5 = arrby[n4] & 0xFF;
            boolean bl2 = (n5 & 1) != 0;
            int n6 = com.ibm.icu.util.e.d(arrby, ++n2, n5 >> 1);
            n2 = com.ibm.icu.util.e.b(n2, n5);
            if (bl2) {
                if (l2 != 0L) {
                    if (n6 == (int)(l2 >> 1)) continue;
                    return 0L;
                }
                l2 = (long)n6 << 1 | 1L;
                continue;
            }
            if ((l2 = com.ibm.icu.util.e.a(arrby, n2 + n6, l2)) != 0L) continue;
            return 0L;
        } while (--n3 > 1);
        return (long)(n2 + 1) << 33 | l2 & 0x1FFFFFFFFL;
    }

    private static long a(byte[] arrby, int n2, long l2) {
        while (true) {
            int n3;
            if ((n3 = arrby[n2++] & 0xFF) < 16) {
                if (n3 == 0) {
                    n3 = arrby[n2++] & 0xFF;
                }
                if ((l2 = com.ibm.icu.util.e.a(arrby, n2, n3 + 1, l2)) == 0L) {
                    return 0L;
                }
                n2 = (int)(l2 >>> 33);
                continue;
            }
            if (n3 < 32) {
                n2 += n3 - 16 + 1;
                continue;
            }
            boolean bl2 = (n3 & 1) != 0;
            int n4 = com.ibm.icu.util.e.d(arrby, n2, n3 >> 1);
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
            n2 = com.ibm.icu.util.e.b(n2, n3);
        }
    }

    private static void a(byte[] arrby, int n2, int n3, Appendable appendable) {
        while (n3 > 5) {
            com.ibm.icu.util.e.a(arrby, com.ibm.icu.util.e.d(arrby, ++n2), n3 >> 1, appendable);
            n3 -= n3 >> 1;
            n2 = com.ibm.icu.util.e.e(arrby, n2);
        }
        do {
            com.ibm.icu.util.e.a(appendable, arrby[n2++] & 0xFF);
            n2 = com.ibm.icu.util.e.c(arrby, n2);
        } while (--n3 > 1);
        com.ibm.icu.util.e.a(appendable, arrby[n2] & 0xFF);
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

    static /* synthetic */ int c(byte[] arrby, int n2, int n3) {
        return com.ibm.icu.util.e.d(arrby, n2, n3);
    }

    static /* synthetic */ int a(int n2, int n3) {
        return com.ibm.icu.util.e.b(n2, n3);
    }

    static /* synthetic */ int a(byte[] arrby, int n2) {
        return com.ibm.icu.util.e.e(arrby, n2);
    }

    static /* synthetic */ int b(byte[] arrby, int n2) {
        return com.ibm.icu.util.e.d(arrby, n2);
    }
}

