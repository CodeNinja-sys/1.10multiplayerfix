/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.aa;
import org.lwjgl.util.a.a.b;
import org.lwjgl.util.a.a.f;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.h;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.a.x;
import org.lwjgl.util.a.a.y;
import org.lwjgl.util.a.a.z;

class v {
    private static final boolean b = false;
    private static final y c = new y(null);
    private static final z d = new z(null);
    private static final aa e = new aa(null);
    private static final int f = 2;

    private v() {
    }

    public static void a(i i2, h h2) {
        i2.m = null;
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            f2.f = false;
            f2 = f2.a;
        }
        f2 = h2.b.a;
        while (f2 != h2.b) {
            if (f2.g && !f2.f) {
                v.a(i2, f2);
                assert (f2.f);
            }
            f2 = f2.a;
        }
        if (i2.m != null) {
            v.b(i2, i2.m);
            i2.m = null;
        }
    }

    static void a(i i2, f f2) {
        g g2 = f2.c;
        x x2 = new x(null);
        x2.a = 1L;
        x2.b = g2;
        x2.c = e;
        if (!i2.k) {
            x x3 = v.a(g2);
            if (x3.a > x2.a) {
                x2 = x3;
            }
            x3 = v.a(g2.d);
            if (x3.a > x2.a) {
                x2 = x3;
            }
            x3 = v.a(g2.c.b);
            if (x3.a > x2.a) {
                x2 = x3;
            }
            x3 = v.b(g2);
            if (x3.a > x2.a) {
                x2 = x3;
            }
            x3 = v.b(g2.d);
            if (x3.a > x2.a) {
                x2 = x3;
            }
            x3 = v.b(g2.c.b);
            if (x3.a > x2.a) {
                x2 = x3;
            }
        }
        x2.c.a(i2, x2.b, x2.a);
    }

    private static boolean b(f f2) {
        return !f2.g || f2.f;
    }

    private static f b(f f2, f f3) {
        f2.e = f3;
        f2.f = true;
        return f2;
    }

    private static void c(f f2) {
        while (f2 != null) {
            f2.f = false;
            f2 = f2.e;
        }
    }

    static x a(g g2) {
        x x2 = new x(0L, null, c, null);
        f f2 = null;
        g g3 = g2;
        while (!v.b(g3.f)) {
            f2 = v.b(g3.f, f2);
            ++x2.a;
            g3 = g3.c;
        }
        g3 = g2;
        while (!v.b(g3.b.f)) {
            f2 = v.b(g3.b.f, f2);
            ++x2.a;
            g3 = g3.b.d;
        }
        x2.b = g3;
        v.c(f2);
        return x2;
    }

    private static boolean a(long l2) {
        return (l2 & 1L) == 0L;
    }

    static x b(g g2) {
        x x2 = new x(0L, null, d, null);
        long l2 = 0L;
        long l3 = 0L;
        f f2 = null;
        g g3 = g2;
        while (!v.b(g3.f)) {
            f2 = v.b(g3.f, f2);
            ++l3;
            g3 = g3.d.b;
            if (v.b(g3.f)) break;
            f2 = v.b(g3.f, f2);
            ++l3;
            g3 = g3.c;
        }
        g g4 = g3;
        g3 = g2;
        while (!v.b(g3.b.f)) {
            f2 = v.b(g3.b.f, f2);
            ++l2;
            g3 = g3.b.d;
            if (v.b(g3.b.f)) break;
            f2 = v.b(g3.b.f, f2);
            ++l2;
            g3 = g3.b.c.b;
        }
        g g5 = g3;
        x2.a = l3 + l2;
        if (v.a(l3)) {
            x2.b = g4.b;
        } else if (v.a(l2)) {
            x2.b = g5;
        } else {
            --x2.a;
            x2.b = g5.c;
        }
        v.c(f2);
        return x2;
    }

    static void b(i i2, f f2) {
        int n2 = -1;
        i2.b(4);
        while (f2 != null) {
            g g2 = f2.c;
            do {
                if (i2.k) {
                    int n3;
                    int n4 = n3 = !g2.b.f.g ? 1 : 0;
                    if (n2 != n3) {
                        n2 = n3;
                        i2.a(n2 != 0);
                    }
                }
                i2.b(g2.e.d);
            } while ((g2 = g2.d) != f2.c);
            f2 = f2.e;
        }
        i2.h();
    }

    public static void b(i i2, h h2) {
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            if (f2.g) {
                i2.b(2);
                g g2 = f2.c;
                do {
                    i2.b(g2.e.d);
                } while ((g2 = g2.d) != f2.c);
                i2.h();
            }
            f2 = f2.a;
        }
    }

    static int a(i i2, double[] arrd, boolean bl2) {
        b[] arrb = i2.o;
        int n2 = i2.n;
        double[] arrd2 = new double[3];
        int n3 = 0;
        if (!bl2) {
            arrd[2] = 0.0;
            arrd[1] = 0.0;
            arrd[0] = 0.0;
        }
        int n4 = 1;
        double d2 = arrb[n4].a[0] - arrb[0].a[0];
        double d3 = arrb[n4].a[1] - arrb[0].a[1];
        double d4 = arrb[n4].a[2] - arrb[0].a[2];
        while (++n4 < n2) {
            double d5 = d2;
            double d6 = d3;
            double d7 = d4;
            d2 = arrb[n4].a[0] - arrb[0].a[0];
            d3 = arrb[n4].a[1] - arrb[0].a[1];
            d4 = arrb[n4].a[2] - arrb[0].a[2];
            arrd2[0] = d6 * d4 - d7 * d3;
            arrd2[1] = d7 * d2 - d5 * d4;
            arrd2[2] = d5 * d3 - d6 * d2;
            double d8 = arrd2[0] * arrd[0] + arrd2[1] * arrd[1] + arrd2[2] * arrd[2];
            if (!bl2) {
                if (d8 >= 0.0) {
                    arrd[0] = arrd[0] + arrd2[0];
                    arrd[1] = arrd[1] + arrd2[1];
                    arrd[2] = arrd[2] + arrd2[2];
                    continue;
                }
                arrd[0] = arrd[0] - arrd2[0];
                arrd[1] = arrd[1] - arrd2[1];
                arrd[2] = arrd[2] - arrd2[2];
                continue;
            }
            if (d8 == 0.0) continue;
            if (d8 > 0.0) {
                if (n3 < 0) {
                    return 2;
                }
                n3 = 1;
                continue;
            }
            if (n3 > 0) {
                return 2;
            }
            n3 = -1;
        }
        return n3;
    }

    public static boolean a(i i2) {
        int n2;
        b[] arrb = i2.o;
        int n3 = i2.n;
        double[] arrd = new double[3];
        if (i2.n < 3) {
            return true;
        }
        arrd[0] = i2.c[0];
        arrd[1] = i2.c[1];
        arrd[2] = i2.c[2];
        if (arrd[0] == 0.0 && arrd[1] == 0.0 && arrd[2] == 0.0) {
            v.a(i2, arrd, false);
        }
        if ((n2 = v.a(i2, arrd, true)) == 2) {
            return false;
        }
        return n2 == 0;
    }

    static /* synthetic */ f a(f f2, f f3) {
        return v.b(f2, f3);
    }

    static /* synthetic */ boolean a(f f2) {
        return v.b(f2);
    }
}

