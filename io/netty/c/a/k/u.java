/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.k.bp;
import io.netty.c.a.k.p;
import io.netty.c.a.k.w;
import io.netty.c.a.k.x;

public class u {
    private final int a;
    private final int b;
    private final x c;
    private w d;
    private byte e;
    private int f;
    private int g;
    private int h;

    public u(bp bp2, x x2) {
        this(bp2, x2, 8192);
    }

    public u(bp bp2, x x2, int n2) {
        if (bp2 == null) {
            throw new NullPointerException("spdyVersion");
        }
        if (x2 == null) {
            throw new NullPointerException("delegate");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxChunkSize must be a positive integer: " + n2);
        }
        this.a = bp2.a();
        this.c = x2;
        this.b = n2;
        this.d = w.a;
    }

    public void a(g g2) {
        block16: while (true) {
            switch (this.d) {
                case a: {
                    int n2;
                    int n3;
                    boolean bl2;
                    if (g2.r() < 8) {
                        return;
                    }
                    int n4 = g2.p();
                    int n5 = n4 + 4;
                    int n6 = n4 + 5;
                    g2.A(8);
                    boolean bl3 = bl2 = (g2.m(n4) & 0x80) != 0;
                    if (bl2) {
                        n3 = p.a(g2, n4) & 0x7FFF;
                        n2 = p.a(g2, n4 + 2);
                        this.g = 0;
                    } else {
                        n3 = this.a;
                        n2 = 0;
                        this.g = p.c(g2, n4);
                    }
                    this.e = g2.m(n5);
                    this.f = p.b(g2, n6);
                    if (n3 != this.a) {
                        this.d = w.n;
                        this.c.a("Invalid SPDY Version");
                        continue block16;
                    }
                    if (!u.a(this.g, n2, this.e, this.f)) {
                        this.d = w.n;
                        this.c.a("Invalid Frame Error");
                        continue block16;
                    }
                    this.d = u.a(n2, this.f);
                    continue block16;
                }
                case b: {
                    if (this.f == 0) {
                        this.d = w.a;
                        this.c.a(this.g, u.a(this.e, (byte)1), bi.a(0));
                        continue block16;
                    }
                    int n7 = Math.min(this.b, this.f);
                    if (g2.r() < n7) {
                        return;
                    }
                    g g3 = g2.l().a(n7);
                    g3.b(g2, n7);
                    this.f -= n7;
                    if (this.f == 0) {
                        this.d = w.a;
                    }
                    boolean bl4 = this.f == 0 && u.a(this.e, (byte)1);
                    this.c.a(this.g, bl4, g3);
                    continue block16;
                }
                case c: {
                    if (g2.r() < 10) {
                        return;
                    }
                    int n8 = g2.p();
                    this.g = p.c(g2, n8);
                    int n9 = p.c(g2, n8 + 4);
                    byte by2 = (byte)(g2.m(n8 + 8) >> 5 & 7);
                    boolean bl4 = u.a(this.e, (byte)1);
                    boolean bl5 = u.a(this.e, (byte)2);
                    g2.A(10);
                    this.f -= 10;
                    if (this.g == 0) {
                        this.d = w.n;
                        this.c.a("Invalid SYN_STREAM Frame");
                        continue block16;
                    }
                    this.d = w.l;
                    this.c.a(this.g, n9, by2, bl4, bl5);
                    continue block16;
                }
                case d: {
                    if (g2.r() < 4) {
                        return;
                    }
                    this.g = p.c(g2, g2.p());
                    boolean bl4 = u.a(this.e, (byte)1);
                    g2.A(4);
                    this.f -= 4;
                    if (this.g == 0) {
                        this.d = w.n;
                        this.c.a("Invalid SYN_REPLY Frame");
                        continue block16;
                    }
                    this.d = w.l;
                    this.c.a(this.g, bl4);
                    continue block16;
                }
                case e: {
                    if (g2.r() < 8) {
                        return;
                    }
                    this.g = p.c(g2, g2.p());
                    int n10 = p.d(g2, g2.p() + 4);
                    g2.A(8);
                    if (this.g == 0 || n10 == 0) {
                        this.d = w.n;
                        this.c.a("Invalid RST_STREAM Frame");
                        continue block16;
                    }
                    this.d = w.a;
                    this.c.a(this.g, n10);
                    continue block16;
                }
                case f: {
                    if (g2.r() < 4) {
                        return;
                    }
                    boolean bl6 = u.a(this.e, (byte)1);
                    this.h = p.c(g2, g2.p());
                    g2.A(4);
                    this.f -= 4;
                    if ((this.f & 7) != 0 || this.f >> 3 != this.h) {
                        this.d = w.n;
                        this.c.a("Invalid SETTINGS Frame");
                        continue block16;
                    }
                    this.d = w.g;
                    this.c.b(bl6);
                    continue block16;
                }
                case g: {
                    if (this.h == 0) {
                        this.d = w.a;
                        this.c.d();
                        continue block16;
                    }
                    if (g2.r() < 8) {
                        return;
                    }
                    byte by3 = g2.m(g2.p());
                    int n11 = p.b(g2, g2.p() + 1);
                    int n12 = p.d(g2, g2.p() + 4);
                    boolean bl7 = u.a(by3, (byte)1);
                    boolean bl8 = u.a(by3, (byte)2);
                    g2.A(8);
                    --this.h;
                    this.c.a(n11, n12, bl7, bl8);
                    continue block16;
                }
                case h: {
                    if (g2.r() < 4) {
                        return;
                    }
                    int n13 = p.d(g2, g2.p());
                    g2.A(4);
                    this.d = w.a;
                    this.c.a(n13);
                    continue block16;
                }
                case i: {
                    if (g2.r() < 8) {
                        return;
                    }
                    int n14 = p.c(g2, g2.p());
                    int n10 = p.d(g2, g2.p() + 4);
                    g2.A(8);
                    this.d = w.a;
                    this.c.b(n14, n10);
                    continue block16;
                }
                case j: {
                    if (g2.r() < 4) {
                        return;
                    }
                    this.g = p.c(g2, g2.p());
                    boolean bl4 = u.a(this.e, (byte)1);
                    g2.A(4);
                    this.f -= 4;
                    if (this.g == 0) {
                        this.d = w.n;
                        this.c.a("Invalid HEADERS Frame");
                        continue block16;
                    }
                    this.d = w.l;
                    this.c.b(this.g, bl4);
                    continue block16;
                }
                case k: {
                    if (g2.r() < 8) {
                        return;
                    }
                    this.g = p.c(g2, g2.p());
                    int n15 = p.c(g2, g2.p() + 4);
                    g2.A(8);
                    if (n15 == 0) {
                        this.d = w.n;
                        this.c.a("Invalid WINDOW_UPDATE Frame");
                        continue block16;
                    }
                    this.d = w.a;
                    this.c.c(this.g, n15);
                    continue block16;
                }
                case l: {
                    if (this.f == 0) {
                        this.d = w.a;
                        this.c.e();
                        continue block16;
                    }
                    if (!g2.u()) {
                        return;
                    }
                    int n16 = Math.min(g2.r(), this.f);
                    g g4 = g2.l().a(n16);
                    g4.b(g2, n16);
                    this.f -= n16;
                    this.c.a(g4);
                    continue block16;
                }
                case m: {
                    int n17 = Math.min(g2.r(), this.f);
                    g2.A(n17);
                    this.f -= n17;
                    if (this.f == 0) {
                        this.d = w.a;
                        continue block16;
                    }
                    return;
                }
                case n: {
                    g2.A(g2.r());
                    return;
                }
            }
            break;
        }
        throw new Error("Shouldn't reach here.");
    }

    private static boolean a(byte by2, byte by3) {
        return (by2 & by3) != 0;
    }

    private static w a(int n2, int n3) {
        switch (n2) {
            case 0: {
                return w.b;
            }
            case 1: {
                return w.c;
            }
            case 2: {
                return w.d;
            }
            case 3: {
                return w.e;
            }
            case 4: {
                return w.f;
            }
            case 6: {
                return w.h;
            }
            case 7: {
                return w.i;
            }
            case 8: {
                return w.j;
            }
            case 9: {
                return w.k;
            }
        }
        if (n3 != 0) {
            return w.m;
        }
        return w.a;
    }

    private static boolean a(int n2, int n3, byte by2, int n4) {
        switch (n3) {
            case 0: {
                return n2 != 0;
            }
            case 1: {
                return n4 >= 10;
            }
            case 2: {
                return n4 >= 4;
            }
            case 3: {
                return by2 == 0 && n4 == 8;
            }
            case 4: {
                return n4 >= 4;
            }
            case 6: {
                return n4 == 4;
            }
            case 7: {
                return n4 == 8;
            }
            case 8: {
                return n4 >= 4;
            }
            case 9: {
                return n4 == 8;
            }
        }
        return true;
    }
}

