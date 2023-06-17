/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.a;
import org.lwjgl.util.a.a.ad;
import org.lwjgl.util.a.a.ae;
import org.lwjgl.util.a.a.c;
import org.lwjgl.util.a.a.e;
import org.lwjgl.util.a.a.f;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.h;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.a.j;
import org.lwjgl.util.a.a.k;
import org.lwjgl.util.a.a.l;
import org.lwjgl.util.a.a.n;

class ac {
    private static final boolean b = false;
    private static final double c = 4.0E150;

    private ac() {
    }

    private static void g(i i2) {
    }

    private static void a(g g2, g g3) {
        g2.h += g3.h;
        g2.b.h += g3.b.h;
    }

    private static a c(a a2) {
        return (a)org.lwjgl.util.a.a.c.a(org.lwjgl.util.a.a.c.c(a2.b));
    }

    private static a d(a a2) {
        return (a)org.lwjgl.util.a.a.c.a(org.lwjgl.util.a.a.c.b(a2.b));
    }

    static boolean a(i i2, a a2, a a3) {
        double d2;
        j j2 = i2.j;
        g g2 = a2.a;
        g g3 = a3.a;
        if (g2.b.e == j2) {
            if (g3.b.e == j2) {
                if (k.b(g2.e, g3.e)) {
                    return k.b(g3.b.e, g2.e, g3.e) <= 0.0;
                }
                return k.b(g2.b.e, g3.e, g2.e) >= 0.0;
            }
            return k.b(g3.b.e, j2, g3.e) <= 0.0;
        }
        if (g3.b.e == j2) {
            return k.b(g2.b.e, j2, g2.e) >= 0.0;
        }
        double d3 = k.a(g2.b.e, j2, g2.e);
        return d3 >= (d2 = k.a(g3.b.e, j2, g3.e));
    }

    static void a(i i2, a a2) {
        if (a2.g && !a && a2.a.h != 0) {
            throw new AssertionError();
        }
        a2.a.g = null;
        org.lwjgl.util.a.a.c.a(i2.h, a2.b);
    }

    static boolean a(a a2, g g2) {
        assert (a2.g);
        if (!l.c(a2.a)) {
            return false;
        }
        a2.g = false;
        a2.a = g2;
        g2.g = a2;
        return true;
    }

    static a a(a a2) {
        j j2 = a2.a.e;
        do {
            a2 = ac.d(a2);
        } while (a2.a.e == j2);
        if (a2.g) {
            g g2 = l.c(ac.c((a)a2).a.b, a2.a.d);
            if (g2 == null) {
                return null;
            }
            if (!ac.a(a2, g2)) {
                return null;
            }
            a2 = ac.d(a2);
        }
        return a2;
    }

    static a b(a a2) {
        j j2 = a2.a.b.e;
        do {
            a2 = ac.d(a2);
        } while (a2.a.b.e == j2);
        return a2;
    }

    static a a(i i2, a a2, g g2) {
        a a3 = new a();
        if (a3 == null) {
            throw new RuntimeException();
        }
        a3.a = g2;
        a3.b = org.lwjgl.util.a.a.c.a(i2.h, a2.b, a3);
        if (a3.b == null) {
            throw new RuntimeException();
        }
        a3.g = false;
        a3.e = false;
        a3.f = false;
        g2.g = a3;
        return a3;
    }

    static boolean a(i i2, int n2) {
        switch (i2.f) {
            case 100130: {
                return (n2 & 1) != 0;
            }
            case 100131: {
                return n2 != 0;
            }
            case 100132: {
                return n2 > 0;
            }
            case 100133: {
                return n2 < 0;
            }
            case 100134: {
                return n2 >= 2 || n2 <= -2;
            }
        }
        throw new InternalError();
    }

    static void b(i i2, a a2) {
        a2.c = ac.d((a)a2).c + a2.a.h;
        a2.d = ac.a(i2, a2.c);
    }

    static void c(i i2, a a2) {
        g g2 = a2.a;
        f f2 = g2.f;
        f2.g = a2.d;
        f2.c = g2;
        ac.a(i2, a2);
    }

    static g b(i i2, a a2, a a3) {
        a a4 = a2;
        g g2 = a2.a;
        while (a4 != a3) {
            a4.g = false;
            a a5 = ac.c(a4);
            g g3 = a5.a;
            if (g3.e != g2.e) {
                if (!a5.g) {
                    ac.c(i2, a4);
                    break;
                }
                g3 = l.c(g2.c.b, g3.b);
                if (g3 == null) {
                    throw new RuntimeException();
                }
                if (!ac.a(a5, g3)) {
                    throw new RuntimeException();
                }
            }
            if (g2.c != g3) {
                if (!l.b(g3.b.d, g3)) {
                    throw new RuntimeException();
                }
                if (!l.b(g2, g3)) {
                    throw new RuntimeException();
                }
            }
            ac.c(i2, a4);
            g2 = a5.a;
            a4 = a5;
        }
        return g2;
    }

    static void a(i i2, a a2, g g2, g g3, g g4, boolean bl2) {
        a a3;
        boolean bl3 = true;
        g g5 = g2;
        do {
            assert (k.b(g5.e, g5.b.e));
            ac.a(i2, a2, g5.b);
        } while ((g5 = g5.c) != g3);
        if (g4 == null) {
            g4 = ac.c((a)a2).a.b.c;
        }
        a a4 = a2;
        g g6 = g4;
        while (true) {
            a3 = ac.c(a4);
            g5 = a3.a.b;
            if (g5.e != g6.e) break;
            if (g5.c != g6) {
                if (!l.b(g5.b.d, g5)) {
                    throw new RuntimeException();
                }
                if (!l.b(g6.b.d, g5)) {
                    throw new RuntimeException();
                }
            }
            a3.c = a4.c - g5.h;
            a3.d = ac.a(i2, a3.c);
            a4.f = true;
            if (!bl3 && ac.d(i2, a4)) {
                ac.a(g5, g6);
                ac.a(i2, a4);
                if (!l.c(g6)) {
                    throw new RuntimeException();
                }
            }
            bl3 = false;
            a4 = a3;
            g6 = g5;
        }
        a4.f = true;
        assert (a4.c - g5.h == a3.c);
        if (bl2) {
            ac.g(i2, a4);
        }
    }

    static void a(i i2, j j2, Object[] arrobject, float[] arrf, boolean bl2) {
        double[] arrd = new double[]{j2.e[0], j2.e[1], j2.e[2]};
        Object[] arrobject2 = new Object[1];
        i2.a(arrd, arrobject, arrf, arrobject2);
        j2.d = arrobject2[0];
        if (j2.d == null) {
            if (!bl2) {
                j2.d = arrobject[0];
            } else if (!i2.g) {
                i2.c(100156);
                i2.g = true;
            }
        }
    }

    static void a(i i2, g g2, g g3) {
        Object[] arrobject = new Object[4];
        float[] arrf = new float[]{0.5f, 0.5f, 0.0f, 0.0f};
        arrobject[0] = g2.e.d;
        arrobject[1] = g3.e.d;
        ac.a(i2, g2.e, arrobject, arrf, false);
        if (!l.b(g2, g3)) {
            throw new RuntimeException();
        }
    }

    static void a(j j2, j j3, j j4, float[] arrf) {
        double d2 = k.d(j3, j2);
        double d3 = k.d(j4, j2);
        arrf[0] = (float)(0.5 * d3 / (d2 + d3));
        arrf[1] = (float)(0.5 * d2 / (d2 + d3));
        j2.e[0] = j2.e[0] + ((double)arrf[0] * j3.e[0] + (double)arrf[1] * j4.e[0]);
        j2.e[1] = j2.e[1] + ((double)arrf[0] * j3.e[1] + (double)arrf[1] * j4.e[1]);
        j2.e[2] = j2.e[2] + ((double)arrf[0] * j3.e[2] + (double)arrf[1] * j4.e[2]);
    }

    static void a(i i2, j j2, j j3, j j4, j j5, j j6) {
        Object[] arrobject = new Object[4];
        float[] arrf = new float[4];
        float[] arrf2 = new float[2];
        float[] arrf3 = new float[2];
        arrobject[0] = j3.d;
        arrobject[1] = j4.d;
        arrobject[2] = j5.d;
        arrobject[3] = j6.d;
        j2.e[2] = 0.0;
        j2.e[1] = 0.0;
        j2.e[0] = 0.0;
        ac.a(j2, j3, j4, arrf2);
        ac.a(j2, j5, j6, arrf3);
        System.arraycopy(arrf2, 0, arrf, 0, 2);
        System.arraycopy(arrf3, 0, arrf, 2, 2);
        ac.a(i2, j2, arrobject, arrf, true);
    }

    static boolean d(i i2, a a2) {
        a a3 = ac.c(a2);
        g g2 = a2.a;
        g g3 = a3.a;
        if (k.b(g2.e, g3.e)) {
            if (k.b(g3.b.e, g2.e, g3.e) > 0.0) {
                return false;
            }
            if (!k.a(g2.e, g3.e)) {
                if (l.e(g3.b) == null) {
                    throw new RuntimeException();
                }
                if (!l.b(g2, g3.b.d)) {
                    throw new RuntimeException();
                }
                a3.f = true;
                a2.f = true;
            } else if (g2.e != g3.e) {
                i2.i.a(g2.e.h);
                ac.a(i2, g3.b.d, g2);
            }
        } else {
            if (k.b(g2.b.e, g3.e, g2.e) < 0.0) {
                return false;
            }
            a2.f = true;
            ac.d((a)a2).f = true;
            if (l.e(g2.b) == null) {
                throw new RuntimeException();
            }
            if (!l.b(g3.b.d, g2)) {
                throw new RuntimeException();
            }
        }
        return true;
    }

    static boolean e(i i2, a a2) {
        a a3 = ac.c(a2);
        g g2 = a2.a;
        g g3 = a3.a;
        assert (!k.a(g2.b.e, g3.b.e));
        if (k.b(g2.b.e, g3.b.e)) {
            if (k.b(g2.b.e, g3.b.e, g2.e) < 0.0) {
                return false;
            }
            a2.f = true;
            ac.d((a)a2).f = true;
            g g4 = l.e(g2);
            if (g4 == null) {
                throw new RuntimeException();
            }
            if (!l.b(g3.b, g4)) {
                throw new RuntimeException();
            }
            g4.f.g = a2.d;
        } else {
            if (k.b(g3.b.e, g2.b.e, g3.e) > 0.0) {
                return false;
            }
            a3.f = true;
            a2.f = true;
            g g5 = l.e(g3);
            if (g5 == null) {
                throw new RuntimeException();
            }
            if (!l.b(g2.d, g3.b)) {
                throw new RuntimeException();
            }
            g5.b.f.g = a2.d;
        }
        return true;
    }

    static boolean f(i i2, a a2) {
        j j2;
        double d2;
        a a3 = ac.c(a2);
        g g2 = a2.a;
        g g3 = a3.a;
        j j3 = g2.e;
        j j4 = g3.e;
        j j5 = g2.b.e;
        j j6 = g3.b.e;
        j j7 = new j();
        assert (!k.a(j6, j5));
        assert (k.b(j5, i2.j, j3) <= 0.0);
        assert (k.b(j6, i2.j, j4) >= 0.0);
        assert (j3 != i2.j && j4 != i2.j);
        assert (!a2.g && !a3.g);
        if (j3 == j4) {
            return false;
        }
        double d3 = Math.min(j3.g, j5.g);
        if (d3 > (d2 = Math.max(j4.g, j6.g))) {
            return false;
        }
        if (k.b(j3, j4) ? k.b(j6, j3, j4) > 0.0 : k.b(j5, j4, j3) < 0.0) {
            return false;
        }
        ac.g(i2);
        k.a(j5, j3, j6, j4, j7);
        assert (Math.min(j3.g, j5.g) <= j7.g);
        assert (j7.g <= Math.max(j4.g, j6.g));
        assert (Math.min(j6.f, j5.f) <= j7.f);
        assert (j7.f <= Math.max(j4.f, j3.f));
        if (k.b(j7, i2.j)) {
            j7.f = i2.j.f;
            j7.g = i2.j.g;
        }
        j j8 = j2 = k.b(j3, j4) ? j3 : j4;
        if (k.b(j2, j7)) {
            j7.f = j2.f;
            j7.g = j2.g;
        }
        if (k.a(j7, j3) || k.a(j7, j4)) {
            ac.d(i2, a2);
            return false;
        }
        if (!k.a(j5, i2.j) && k.b(j5, i2.j, j7) >= 0.0 || !k.a(j6, i2.j) && k.b(j6, i2.j, j7) <= 0.0) {
            if (j6 == i2.j) {
                if (l.e(g2.b) == null) {
                    throw new RuntimeException();
                }
                if (!l.b(g3.b, g2)) {
                    throw new RuntimeException();
                }
                if ((a2 = ac.a(a2)) == null) {
                    throw new RuntimeException();
                }
                g2 = ac.c((a)a2).a;
                ac.b(i2, ac.c(a2), a3);
                ac.a(i2, a2, g2.b.d, g2, g2, true);
                return true;
            }
            if (j5 == i2.j) {
                if (l.e(g3.b) == null) {
                    throw new RuntimeException();
                }
                if (!l.b(g2.d, g3.b.d)) {
                    throw new RuntimeException();
                }
                a3 = a2;
                a2 = ac.b(a2);
                g g4 = ac.c((a)a2).a.b.c;
                a3.a = g3.b.d;
                g3 = ac.b(i2, a3, null);
                ac.a(i2, a2, g3.c, g2.b.c, g4, true);
                return true;
            }
            if (k.b(j5, i2.j, j7) >= 0.0) {
                a2.f = true;
                ac.d((a)a2).f = true;
                if (l.e(g2.b) == null) {
                    throw new RuntimeException();
                }
                g2.e.f = i2.j.f;
                g2.e.g = i2.j.g;
            }
            if (k.b(j6, i2.j, j7) <= 0.0) {
                a3.f = true;
                a2.f = true;
                if (l.e(g3.b) == null) {
                    throw new RuntimeException();
                }
                g3.e.f = i2.j.f;
                g3.e.g = i2.j.g;
            }
            return false;
        }
        if (l.e(g2.b) == null) {
            throw new RuntimeException();
        }
        if (l.e(g3.b) == null) {
            throw new RuntimeException();
        }
        if (!l.b(g3.b.d, g2)) {
            throw new RuntimeException();
        }
        g2.e.f = j7.f;
        g2.e.g = j7.g;
        g2.e.h = i2.i.a(g2.e);
        if ((long)g2.e.h == Long.MAX_VALUE) {
            i2.i.a();
            i2.i = null;
            throw new RuntimeException();
        }
        ac.a(i2, g2.e, j3, j5, j4, j6);
        a3.f = true;
        a2.f = true;
        ac.d((a)a2).f = true;
        return false;
    }

    static void g(i i2, a a2) {
        a a3 = ac.c(a2);
        while (true) {
            if (a3.f) {
                a2 = a3;
                a3 = ac.c(a3);
                continue;
            }
            if (!a2.f) {
                a3 = a2;
                if ((a2 = ac.d(a2)) == null || !a2.f) {
                    return;
                }
            }
            a2.f = false;
            g g2 = a2.a;
            g g3 = a3.a;
            if (g2.b.e != g3.b.e && ac.e(i2, a2)) {
                if (a3.g) {
                    ac.a(i2, a3);
                    if (!l.c(g3)) {
                        throw new RuntimeException();
                    }
                    a3 = ac.c(a2);
                    g3 = a3.a;
                } else if (a2.g) {
                    ac.a(i2, a2);
                    if (!l.c(g2)) {
                        throw new RuntimeException();
                    }
                    a2 = ac.d(a3);
                    g2 = a2.a;
                }
            }
            if (g2.e != g3.e) {
                if (!(g2.b.e == g3.b.e || a2.g || a3.g || g2.b.e != i2.j && g3.b.e != i2.j)) {
                    if (ac.f(i2, a2)) {
                        return;
                    }
                } else {
                    ac.d(i2, a2);
                }
            }
            if (g2.e != g3.e || g2.b.e != g3.b.e) continue;
            ac.a(g3, g2);
            ac.a(i2, a2);
            if (!l.c(g2)) {
                throw new RuntimeException();
            }
            a2 = ac.d(a3);
        }
    }

    static void b(i i2, a a2, g g2) {
        g g3 = g2.c;
        a a3 = ac.c(a2);
        g g4 = a2.a;
        g g5 = a3.a;
        boolean bl2 = false;
        if (g4.b.e != g5.b.e) {
            ac.f(i2, a2);
        }
        if (k.a(g4.e, i2.j)) {
            if (!l.b(g3.b.d, g4)) {
                throw new RuntimeException();
            }
            if ((a2 = ac.a(a2)) == null) {
                throw new RuntimeException();
            }
            g3 = ac.c((a)a2).a;
            ac.b(i2, ac.c(a2), a3);
            bl2 = true;
        }
        if (k.a(g5.e, i2.j)) {
            if (!l.b(g2, g5.b.d)) {
                throw new RuntimeException();
            }
            g2 = ac.b(i2, a3, null);
            bl2 = true;
        }
        if (bl2) {
            ac.a(i2, a2, g2.c, g3, g3, true);
            return;
        }
        g g6 = k.b(g5.e, g4.e) ? g5.b.d : g4;
        if ((g6 = l.c(g2.c.b, g6)) == null) {
            throw new RuntimeException();
        }
        ac.a(i2, a2, g6, g6.c, g6.c, false);
        g6.b.g.g = true;
        ac.g(i2, a2);
    }

    static void a(i i2, a a2, j j2) {
        g g2;
        g g3 = a2.a;
        if (k.a(g3.e, j2)) {
            assert (false);
            ac.a(i2, g3, j2.c);
            return;
        }
        if (!k.a(g3.b.e, j2)) {
            if (l.e(g3.b) == null) {
                throw new RuntimeException();
            }
            if (a2.g) {
                if (!l.c(g3.c)) {
                    throw new RuntimeException();
                }
                a2.g = false;
            }
            if (!l.b(j2.c, g3)) {
                throw new RuntimeException();
            }
            ac.b(i2, j2);
            return;
        }
        assert (false);
        a2 = ac.b(a2);
        a a3 = ac.c(a2);
        g g4 = a3.a.b;
        g g5 = g2 = g4.c;
        if (a3.g) {
            assert (g5 != g4);
            ac.a(i2, a3);
            if (!l.c(g4)) {
                throw new RuntimeException();
            }
            g4 = g5.b.d;
        }
        if (!l.b(j2.c, g4)) {
            throw new RuntimeException();
        }
        if (!k.a(g5)) {
            g5 = null;
        }
        ac.a(i2, a2, g4.c, g2, g5, true);
    }

    static void a(i i2, j j2) {
        a a2;
        a a3 = new a();
        a3.a = j2.c.b;
        a a4 = (a)org.lwjgl.util.a.a.c.a(org.lwjgl.util.a.a.c.b(i2.h, a3));
        a a5 = ac.c(a4);
        g g2 = a4.a;
        g g3 = a5.a;
        if (k.b(g2.b.e, j2, g2.e) == 0.0) {
            ac.a(i2, a4, j2);
            return;
        }
        a a6 = a2 = k.b(g3.b.e, g2.b.e) ? a4 : a5;
        if (a4.d || a2.g) {
            g g4;
            if (a2 == a4) {
                g4 = l.c(j2.c.b, g2.d);
                if (g4 == null) {
                    throw new RuntimeException();
                }
            } else {
                g g5 = l.c(g3.b.c.b, j2.c);
                if (g5 == null) {
                    throw new RuntimeException();
                }
                g4 = g5.b;
            }
            if (a2.g) {
                if (!ac.a(a2, g4)) {
                    throw new RuntimeException();
                }
            } else {
                ac.b(i2, ac.a(i2, a4, g4));
            }
            ac.b(i2, j2);
        } else {
            ac.a(i2, a4, j2.c, j2.c, null, true);
        }
    }

    static void b(i i2, j j2) {
        i2.j = j2;
        ac.g(i2);
        g g2 = j2.c;
        while (g2.g == null) {
            g2 = g2.c;
            if (g2 != j2.c) continue;
            ac.a(i2, j2);
            return;
        }
        a a2 = ac.a(g2.g);
        if (a2 == null) {
            throw new RuntimeException();
        }
        a a3 = ac.c(a2);
        g g3 = a3.a;
        g g4 = ac.b(i2, a3, null);
        if (g4.c == g3) {
            ac.b(i2, a2, g4);
        } else {
            ac.a(i2, a2, g4.c, g3, g3, true);
        }
    }

    static void a(i i2, double d2) {
        a a2 = new a();
        if (a2 == null) {
            throw new RuntimeException();
        }
        g g2 = l.a(i2.b);
        if (g2 == null) {
            throw new RuntimeException();
        }
        g2.e.f = 4.0E150;
        g2.e.g = d2;
        g2.b.e.f = -4.0E150;
        g2.b.e.g = d2;
        i2.j = g2.b.e;
        a2.a = g2;
        a2.c = 0;
        a2.d = false;
        a2.g = false;
        a2.e = true;
        a2.f = false;
        a2.b = org.lwjgl.util.a.a.c.a(i2.h, a2);
        if (a2.b == null) {
            throw new RuntimeException();
        }
    }

    static void a(i i2) {
        i2.h = org.lwjgl.util.a.a.c.a(i2, new ad(i2));
        if (i2.h == null) {
            throw new RuntimeException();
        }
        ac.a(i2, -4.0E150);
        ac.a(i2, 4.0E150);
    }

    static void b(i i2) {
        a a2;
        int n2 = 0;
        while ((a2 = (a)org.lwjgl.util.a.a.c.a(org.lwjgl.util.a.a.c.b(i2.h))) != null) {
            if (!a2.e) {
                assert (a2.g);
                assert (++n2 == 1);
            }
            assert (a2.c == 0);
            ac.a(i2, a2);
        }
        org.lwjgl.util.a.a.c.a(i2.h);
    }

    static void c(i i2) {
        g g2 = i2.b.c;
        g g3 = g2.a;
        while (g3 != g2) {
            g g4 = g3.a;
            g g5 = g3.d;
            if (k.a(g3.e, g3.b.e) && g3.d.d != g3) {
                ac.a(i2, g5, g3);
                if (!l.c(g3)) {
                    throw new RuntimeException();
                }
                g3 = g5;
                g5 = g3.d;
            }
            if (g5.d == g3) {
                if (g5 != g3) {
                    if (g5 == g4 || g5 == g4.b) {
                        g4 = g4.a;
                    }
                    if (!l.c(g5)) {
                        throw new RuntimeException();
                    }
                }
                if (g3 == g4 || g3 == g4.b) {
                    g4 = g4.a;
                }
                if (!l.c(g3)) {
                    throw new RuntimeException();
                }
            }
            g3 = g4;
        }
    }

    static boolean d(i i2) {
        i2.i = n.a(new ae());
        n n2 = i2.i;
        if (n2 == null) {
            return false;
        }
        j j2 = i2.b.a;
        j j3 = j2.a;
        while (j3 != j2) {
            j3.h = n2.a(j3);
            if ((long)j3.h == Long.MAX_VALUE) break;
            j3 = j3.a;
        }
        if (j3 != j2 || !n2.b()) {
            i2.i.a();
            i2.i = null;
            return false;
        }
        return true;
    }

    static void e(i i2) {
        i2.i.a();
    }

    static boolean a(h h2) {
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            f f3 = f2.a;
            g g2 = f2.c;
            assert (g2.d != g2);
            if (g2.d.d == g2) {
                ac.a(g2.c, g2);
                if (!l.c(g2)) {
                    return false;
                }
            }
            f2 = f3;
        }
        return true;
    }

    public static boolean f(i i2) {
        j j2;
        i2.g = false;
        ac.c(i2);
        if (!ac.d(i2)) {
            return false;
        }
        ac.a(i2);
        while ((j2 = (j)i2.i.c()) != null) {
            j j3;
            while ((j3 = (j)i2.i.d()) != null && k.a(j3, j2)) {
                j3 = (j)i2.i.c();
                ac.a(i2, j2.c, j3.c);
            }
            ac.b(i2, j2);
        }
        i2.j = ((a)org.lwjgl.util.a.a.c.a((e)org.lwjgl.util.a.a.c.b((c)i2.h))).a.e;
        ac.g(i2);
        ac.b(i2);
        ac.e(i2);
        if (!ac.a(i2.b)) {
            return false;
        }
        l.d(i2.b);
        return true;
    }
}

