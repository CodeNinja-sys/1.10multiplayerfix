/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.hk;
import com.ibm.icu.a.jc;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.d.lm;
import java.util.ArrayList;

public class jb {
    public static final int a = 32;
    public static final int b = 16;
    public static final int c = 8;
    public static final int d = 2;
    public static final int e = 1;
    public static final int f = 63;
    public static final int g = 42;
    public static final int h = 41;
    public static final int i = 26;
    public static final int j = 25;
    static final short k = 255;
    static final short l = 254;
    private lf m;
    private lf n;
    private ArrayList o;
    private short[] p;
    private int q;
    private boolean r;
    private jc s;

    public jb(lf lf2, ArrayList arrayList, int n2) {
        int n3;
        int n4;
        int n5;
        this.m = new lf(0, 0x10FFFF);
        this.o = arrayList;
        this.r = n2 == 63;
        this.m.g(lf2);
        if (0 != (n2 & 1)) {
            this.n = this.m;
        }
        this.s = new jc();
        int n6 = this.o.size();
        boolean bl2 = false;
        for (n5 = 0; n5 < n6; ++n5) {
            String string = (String)this.o.get(n5);
            n4 = string.length();
            n3 = this.m.a((CharSequence)string, lm.b);
            if (n3 < n4) {
                bl2 = true;
            }
            if (0 == (n2 & 8) || n4 <= this.q) continue;
            this.q = n4;
        }
        if (!bl2) {
            this.q = 0;
            return;
        }
        if (this.r) {
            this.m.l();
        }
        n4 = this.r ? n6 * 2 : n6;
        this.p = new short[n4];
        int n7 = this.r ? n6 : 0;
        for (n5 = 0; n5 < n6; ++n5) {
            String string = (String)this.o.get(n5);
            int n8 = string.length();
            n3 = this.m.a((CharSequence)string, lm.b);
            if (n3 < n8) {
                int n9;
                if (0 != (n2 & 8)) {
                    if (0 != (n2 & 2)) {
                        if (0 != (n2 & 0x20)) {
                            this.p[n5] = jb.b(n3);
                        }
                        if (0 != (n2 & 0x10)) {
                            n3 = n8 - this.m.b((CharSequence)string, n8, lm.b);
                            this.p[n7 + n5] = jb.b(n3);
                        }
                    } else {
                        this.p[n7 + n5] = 0;
                        this.p[n5] = 0;
                    }
                }
                if (0 == (n2 & 1)) continue;
                if (0 != (n2 & 0x20)) {
                    n9 = string.codePointAt(0);
                    this.c(n9);
                }
                if (0 == (n2 & 0x10)) continue;
                n9 = string.codePointBefore(n8);
                this.c(n9);
                continue;
            }
            if (this.r) {
                this.p[n7 + n5] = 255;
                this.p[n5] = 255;
                continue;
            }
            this.p[n5] = 255;
        }
        if (this.r) {
            this.n.l();
        }
    }

    public jb(jb jb2, ArrayList arrayList) {
        this.m = jb2.m;
        this.o = arrayList;
        this.q = jb2.q;
        this.r = true;
        this.n = jb2.n == jb2.m ? this.m : (lf)jb2.n.clone();
        this.s = new jc();
        this.p = (short[])jb2.p.clone();
    }

    public boolean a() {
        return this.q != 0;
    }

    public boolean a(int n2) {
        return this.m.b(n2);
    }

    private void c(int n2) {
        if (this.n == null || this.n == this.m) {
            if (this.m.b(n2)) {
                return;
            }
            this.n = this.m.m();
        }
        this.n.e(n2);
    }

    public synchronized int a(CharSequence charSequence, int n2, int n3, lm lm2) {
        if (lm2 == lm.a) {
            return this.a(charSequence, n2, n3);
        }
        int n4 = this.m.a(charSequence.subSequence(n2, n2 + n3), lm.b);
        if (n4 == n3) {
            return n3;
        }
        int n5 = 0;
        if (lm2 == lm.b) {
            n5 = this.q;
        }
        this.s.a(n5);
        int n6 = n2 + n4;
        int n7 = n3 - n4;
        int n8 = this.o.size();
        while (true) {
            int n9;
            int n10;
            int n11;
            if (lm2 == lm.b) {
                block1: for (n11 = 0; n11 < n8; ++n11) {
                    n10 = this.p[n11];
                    if (n10 == 255) continue;
                    String string = (String)this.o.get(n11);
                    n9 = string.length();
                    if (n10 >= 254) {
                        n10 = n9;
                        n10 = string.offsetByCodePoints(n10, -1);
                    }
                    if (n10 > n4) {
                        n10 = n4;
                    }
                    for (int i2 = n9 - n10; i2 <= n7; ++i2) {
                        if (!this.s.d(i2) && jb.a(charSequence, n6 - n10, n3, string, n9)) {
                            if (i2 == n7) {
                                return n3;
                            }
                            this.s.c(i2);
                        }
                        if (n10 == 0) continue block1;
                        --n10;
                    }
                }
            } else {
                n10 = 0;
                int n12 = 0;
                block3: for (n11 = 0; n11 < n8; ++n11) {
                    n9 = this.p[n11];
                    String string = (String)this.o.get(n11);
                    int n13 = string.length();
                    if (n9 >= 254) {
                        n9 = n13;
                    }
                    if (n9 > n4) {
                        n9 = n4;
                    }
                    for (int i3 = n13 - n9; i3 <= n7 && n9 >= n12; --n9, ++i3) {
                        if (n9 <= n12 && i3 <= n10 || !jb.a(charSequence, n6 - n9, n3, string, n13)) continue;
                        n10 = i3;
                        n12 = n9;
                        continue block3;
                    }
                }
                if (n10 != 0 || n12 != 0) {
                    n6 += n10;
                    if ((n7 -= n10) == 0) {
                        return n3;
                    }
                    n4 = 0;
                    continue;
                }
            }
            if (n4 != 0 || n6 == 0) {
                if (this.s.b()) {
                    return n6 - n2;
                }
            } else {
                if (this.s.b()) {
                    n4 = this.m.a(charSequence.subSequence(n6, n6 + n7), lm.b);
                    if (n4 == n7 || n4 == 0) {
                        return n6 + n4 - n2;
                    }
                    n6 += n4;
                    n7 -= n4;
                    continue;
                }
                n4 = jb.a(this.m, charSequence, n6, n7);
                if (n4 > 0) {
                    if (n4 == n7) {
                        return n3;
                    }
                    n6 += n4;
                    n7 -= n4;
                    this.s.b(n4);
                    n4 = 0;
                    continue;
                }
            }
            n10 = this.s.c();
            n6 += n10;
            n7 -= n10;
            n4 = 0;
        }
    }

    public synchronized int a(CharSequence charSequence, int n2, lm lm2) {
        if (lm2 == lm.a) {
            return this.a(charSequence, n2);
        }
        int n3 = this.m.b(charSequence, n2, lm.b);
        if (n3 == 0) {
            return 0;
        }
        int n4 = n2 - n3;
        int n5 = 0;
        if (lm2 == lm.b) {
            n5 = this.q;
        }
        this.s.a(n5);
        int n6 = this.o.size();
        int n7 = 0;
        if (this.r) {
            n7 = n6;
        }
        while (true) {
            int n8;
            int n9;
            int n10;
            if (lm2 == lm.b) {
                block1: for (n10 = 0; n10 < n6; ++n10) {
                    int n11;
                    n9 = this.p[n7 + n10];
                    if (n9 == 255) continue;
                    String string = (String)this.o.get(n10);
                    n8 = string.length();
                    if (n9 >= 254) {
                        n9 = n8;
                        n11 = 0;
                        n11 = string.offsetByCodePoints(0, 1);
                        n9 -= n11;
                    }
                    if (n9 > n4) {
                        n9 = n4;
                    }
                    for (n11 = n8 - n9; n11 <= n3; ++n11) {
                        if (!this.s.d(n11) && jb.a(charSequence, n3 - n11, n2, string, n8)) {
                            if (n11 == n3) {
                                return 0;
                            }
                            this.s.c(n11);
                        }
                        if (n9 == 0) continue block1;
                        --n9;
                    }
                }
            } else {
                n9 = 0;
                int n12 = 0;
                block3: for (n10 = 0; n10 < n6; ++n10) {
                    n8 = this.p[n7 + n10];
                    String string = (String)this.o.get(n10);
                    int n13 = string.length();
                    if (n8 >= 254) {
                        n8 = n13;
                    }
                    if (n8 > n4) {
                        n8 = n4;
                    }
                    for (int i2 = n13 - n8; i2 <= n3 && n8 >= n12; --n8, ++i2) {
                        if (n8 <= n12 && i2 <= n9 || !jb.a(charSequence, n3 - i2, n2, string, n13)) continue;
                        n9 = i2;
                        n12 = n8;
                        continue block3;
                    }
                }
                if (n9 != 0 || n12 != 0) {
                    if ((n3 -= n9) == 0) {
                        return 0;
                    }
                    n4 = 0;
                    continue;
                }
            }
            if (n4 != 0 || n3 == n2) {
                if (this.s.b()) {
                    return n3;
                }
            } else {
                if (this.s.b()) {
                    n9 = n3;
                    n3 = this.m.b(charSequence, n9, lm.b);
                    n4 = n9 - n3;
                    if (n3 != 0 && n4 != 0) continue;
                    return n3;
                }
                n4 = jb.a(this.m, charSequence, n3);
                if (n4 > 0) {
                    if (n4 == n3) {
                        return 0;
                    }
                    n3 -= n4;
                    this.s.b(n4);
                    n4 = 0;
                    continue;
                }
            }
            n3 -= this.s.c();
            n4 = 0;
        }
    }

    private int a(CharSequence charSequence, int n2, int n3) {
        int n4;
        int n5 = n2;
        int n6 = n3;
        int n7 = this.o.size();
        do {
            int n8;
            if ((n8 = this.n.a(charSequence.subSequence(n5, n5 + n6), lm.a)) == n6) {
                return n3;
            }
            n4 = jb.a(this.m, charSequence, n5 += n8, n6 -= n8);
            if (n4 > 0) {
                return n5 - n2;
            }
            for (n8 = 0; n8 < n7; ++n8) {
                String string;
                int n9;
                if (this.p[n8] == 255 || (n9 = (string = (String)this.o.get(n8)).length()) > n6 || !jb.a(charSequence, n5, n3, string, n9)) continue;
                return n5 - n2;
            }
            n5 -= n4;
        } while ((n6 += n4) != 0);
        return n3;
    }

    private int a(CharSequence charSequence, int n2) {
        int n3;
        int n4 = n2;
        int n5 = this.o.size();
        do {
            if ((n4 = this.n.b(charSequence, n4, lm.a)) == 0) {
                return 0;
            }
            n3 = jb.a(this.m, charSequence, n4);
            if (n3 > 0) {
                return n4;
            }
            for (int i2 = 0; i2 < n5; ++i2) {
                String string;
                int n6;
                if (this.p[i2] == 255 || (n6 = (string = (String)this.o.get(i2)).length()) > n4 || !jb.a(charSequence, n4 - n6, n2, string, n6)) continue;
                return n4;
            }
        } while ((n4 += n3) != 0);
        return 0;
    }

    static short b(int n2) {
        return (short)(n2 < 254 ? (int)n2 : 254);
    }

    private static boolean a(CharSequence charSequence, int n2, String string, int n3) {
        int n4 = n2 + n3;
        while (n3-- > 0) {
            if (charSequence.charAt(--n4) == string.charAt(n3)) continue;
            return false;
        }
        return true;
    }

    static boolean a(CharSequence charSequence, int n2, int n3, String string, int n4) {
        return !(0 < n2 && kx.c(charSequence.charAt(n2 - 1)) && kx.b(charSequence.charAt(n2 + 0)) || n4 < n3 && kx.c(charSequence.charAt(n2 + n4 - 1)) && kx.b(charSequence.charAt(n2 + n4)) || !jb.a(charSequence, n2, string, n4));
    }

    static int a(lf lf2, CharSequence charSequence, int n2, int n3) {
        char c2;
        char c3 = charSequence.charAt(n2);
        if (c3 >= '\ud800' && c3 <= '\udbff' && n3 >= 2 && kx.b(c2 = charSequence.charAt(n2 + 1))) {
            int n4 = hk.a(c3, c2);
            return lf2.b(n4) ? 2 : -2;
        }
        return lf2.b(c3) ? 1 : -1;
    }

    static int a(lf lf2, CharSequence charSequence, int n2) {
        char c2;
        char c3 = charSequence.charAt(n2 - 1);
        if (c3 >= '\udc00' && c3 <= '\udfff' && n2 >= 2 && kx.c(c2 = charSequence.charAt(n2 - 2))) {
            int n3 = hk.a(c2, c3);
            return lf2.b(n3) ? 2 : -2;
        }
        return lf2.b(c3) ? 1 : -1;
    }
}

