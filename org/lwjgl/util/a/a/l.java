/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.f;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.h;
import org.lwjgl.util.a.a.j;

class l {
    private l() {
    }

    static g a(g g2) {
        g g3;
        g g4 = new g(true);
        g g5 = new g(false);
        if (!g2.i) {
            g2 = g2.b;
        }
        g5.a = g3 = g2.b.a;
        g3.b.a = g4;
        g4.a = g2;
        g2.b.a = g5;
        g4.b = g5;
        g4.c = g4;
        g4.d = g5;
        g4.e = null;
        g4.f = null;
        g4.h = 0;
        g4.g = null;
        g5.b = g4;
        g5.c = g5;
        g5.d = g4;
        g5.e = null;
        g5.f = null;
        g5.h = 0;
        g5.g = null;
        return g4;
    }

    static void a(g g2, g g3) {
        g g4 = g2.c;
        g g5 = g3.c;
        g4.b.d = g3;
        g5.b.d = g2;
        g2.c = g5;
        g3.c = g4;
    }

    static void a(j j2, g g2, j j3) {
        j j4;
        j j5 = j2;
        assert (j5 != null);
        j5.b = j4 = j3.b;
        j4.a = j5;
        j5.a = j3;
        j3.b = j5;
        j5.c = g2;
        j5.d = null;
        g g3 = g2;
        do {
            g3.e = j5;
        } while ((g3 = g3.c) != g2);
    }

    static void a(f f2, g g2, f f3) {
        f f4;
        f f5 = f2;
        assert (f5 != null);
        f5.b = f4 = f3.b;
        f4.a = f5;
        f5.a = f3;
        f3.b = f5;
        f5.c = g2;
        f5.d = null;
        f5.e = null;
        f5.f = false;
        f5.g = f3.g;
        g g3 = g2;
        do {
            g3.f = f5;
        } while ((g3 = g3.d) != g2);
    }

    static void b(g g2) {
        g g3;
        if (!g2.i) {
            g2 = g2.b;
        }
        g g4 = g2.a;
        g4.b.a = g3 = g2.b.a;
        g3.b.a = g4;
    }

    static void a(j j2, j j3) {
        g g2;
        g g3 = g2 = j2.c;
        do {
            g3.e = j3;
        } while ((g3 = g3.c) != g2);
        j j4 = j2.b;
        j j5 = j2.a;
        j5.b = j4;
        j4.a = j5;
    }

    static void a(f f2, f f3) {
        g g2;
        g g3 = g2 = f2.c;
        do {
            g3.f = f3;
        } while ((g3 = g3.d) != g2);
        f f4 = f2.b;
        f f5 = f2.a;
        f5.b = f4;
        f4.a = f5;
    }

    public static g a(h h2) {
        j j2 = new j();
        j j3 = new j();
        f f2 = new f();
        g g2 = l.a(h2.c);
        if (g2 == null) {
            return null;
        }
        l.a(j2, g2, h2.a);
        l.a(j3, g2.b, h2.a);
        l.a(f2, g2, h2.b);
        return g2;
    }

    public static boolean b(g g2, g g3) {
        Object object;
        boolean bl2 = false;
        boolean bl3 = false;
        if (g2 == g3) {
            return true;
        }
        if (g3.e != g2.e) {
            bl3 = true;
            l.a(g3.e, g2.e);
        }
        if (g3.f != g2.f) {
            bl2 = true;
            l.a(g3.f, g2.f);
        }
        l.a(g3, g2);
        if (!bl3) {
            object = new j();
            l.a((j)object, g3, g2.e);
            g2.e.c = g2;
        }
        if (!bl2) {
            object = new f();
            l.a((f)object, g3, g2.f);
            g2.f.c = g2;
        }
        return true;
    }

    static boolean c(g g2) {
        g g3 = g2.b;
        boolean bl2 = false;
        if (g2.f != g2.b.f) {
            bl2 = true;
            l.a(g2.f, g2.b.f);
        }
        if (g2.c == g2) {
            l.a(g2.e, null);
        } else {
            g2.b.f.c = g2.b.d;
            g2.e.c = g2.c;
            l.a(g2, g2.b.d);
            if (!bl2) {
                f f2 = new f();
                l.a(f2, g2, g2.f);
            }
        }
        if (g3.c == g3) {
            l.a(g3.e, null);
            l.a(g3.f, null);
        } else {
            g2.f.c = g3.b.d;
            g3.e.c = g3.c;
            l.a(g3, g3.b.d);
        }
        l.b(g2);
        return true;
    }

    static g d(g g2) {
        g g3 = l.a(g2);
        g g4 = g3.b;
        l.a(g3, g2.d);
        g3.e = g2.b.e;
        j j2 = new j();
        l.a(j2, g4, g3.e);
        g3.f = g4.f = g2.f;
        return g3;
    }

    public static g e(g g2) {
        g g3 = l.d(g2);
        g g4 = g3.b;
        l.a(g2.b, g2.b.b.d);
        l.a(g2.b, g4);
        g2.b.e = g4.e;
        g4.b.e.c = g4.b;
        g4.b.f = g2.b.f;
        g4.h = g2.h;
        g4.b.h = g2.b.h;
        return g4;
    }

    static g c(g g2, g g3) {
        boolean bl2 = false;
        g g4 = l.a(g2);
        g g5 = g4.b;
        if (g3.f != g2.f) {
            bl2 = true;
            l.a(g3.f, g2.f);
        }
        l.a(g4, g2.d);
        l.a(g5, g3);
        g4.e = g2.b.e;
        g5.e = g3.e;
        g4.f = g5.f = g2.f;
        g2.f.c = g5;
        if (!bl2) {
            f f2 = new f();
            l.a(f2, g4, g2.f);
        }
        return g4;
    }

    static void a(f f2) {
        g g2;
        g g3 = f2.c;
        g g4 = g3.d;
        do {
            g2 = g4;
            g4 = g2.d;
            g2.f = null;
            if (g2.b.f != null) continue;
            if (g2.c == g2) {
                l.a(g2.e, null);
            } else {
                g2.e.c = g2.c;
                l.a(g2, g2.b.d);
            }
            g g5 = g2.b;
            if (g5.c == g5) {
                l.a(g5.e, null);
            } else {
                g5.e.c = g5.c;
                l.a(g5, g5.b.d);
            }
            l.b(g2);
        } while (g2 != g3);
        f f3 = f2.b;
        f f4 = f2.a;
        f4.b = f3;
        f3.a = f4;
    }

    public static h a() {
        h h2 = new h();
        j j2 = h2.a;
        f f2 = h2.b;
        g g2 = h2.c;
        g g3 = h2.d;
        j2.a = j2.b = j2;
        j2.c = null;
        j2.d = null;
        f2.a = f2.b = f2;
        f2.c = null;
        f2.d = null;
        f2.e = null;
        f2.f = false;
        f2.g = false;
        g2.a = g2;
        g2.b = g3;
        g2.c = null;
        g2.d = null;
        g2.e = null;
        g2.f = null;
        g2.h = 0;
        g2.g = null;
        g3.a = g3;
        g3.b = g2;
        g3.c = null;
        g3.d = null;
        g3.e = null;
        g3.f = null;
        g3.h = 0;
        g3.g = null;
        return h2;
    }

    static h a(h h2, h h3) {
        f f2 = h2.b;
        j j2 = h2.a;
        g g2 = h2.c;
        f f3 = h3.b;
        j j3 = h3.a;
        g g3 = h3.c;
        if (f3.a != f3) {
            f2.b.a = f3.a;
            f3.a.b = f2.b;
            f3.b.a = f2;
            f2.b = f3.b;
        }
        if (j3.a != j3) {
            j2.b.a = j3.a;
            j3.a.b = j2.b;
            j3.b.a = j2;
            j2.b = j3.b;
        }
        if (g3.a != g3) {
            g2.b.a.b.a = g3.a;
            g3.a.b.a = g2.b.a;
            g3.b.a.b.a = g2;
            g2.b.a = g3.b.a;
        }
        return h2;
    }

    static void b(h h2) {
        f f2 = h2.b;
        while (f2.a != f2) {
            l.a(f2.a);
        }
        assert (h2.a.a == h2.a);
    }

    public static void c(h h2) {
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            f f3;
            f2 = f3 = f2.a;
        }
        j j2 = h2.a.a;
        while (j2 != h2.a) {
            j j3;
            j2 = j3 = j2.a;
        }
        g g2 = h2.c.a;
        while (g2 != h2.c) {
            g g3;
            g2 = g3 = g2.a;
        }
    }

    public static void d(h h2) {
        j j2;
        g g2;
        f f2;
        f f3 = h2.b;
        j j3 = h2.a;
        g g3 = h2.c;
        f f4 = f3;
        f4 = f3;
        while ((f2 = f4.a) != f3) {
            assert (f2.b == f4);
            g2 = f2.c;
            do {
                assert (g2.b != g2);
                assert (g2.b.b == g2);
                assert (g2.d.c.b == g2);
                assert (g2.c.b.d == g2);
                assert (g2.f == f2);
            } while ((g2 = g2.d) != f2.c);
            f4 = f2;
        }
        assert (f2.b == f4 && f2.c == null && f2.d == null);
        j j4 = j3;
        j4 = j3;
        while ((j2 = j4.a) != j3) {
            assert (j2.b == j4);
            g2 = j2.c;
            do {
                assert (g2.b != g2);
                assert (g2.b.b == g2);
                assert (g2.d.c.b == g2);
                assert (g2.c.b.d == g2);
                assert (g2.e == j2);
            } while ((g2 = g2.c) != j2.c);
            j4 = j2;
        }
        assert (j2.b == j4 && j2.c == null && j2.d == null);
        g g4 = g3;
        g4 = g3;
        while ((g2 = g4.a) != g3) {
            assert (g2.b.a == g4.b);
            assert (g2.b != g2);
            assert (g2.b.b == g2);
            assert (g2.e != null);
            assert (g2.b.e != null);
            assert (g2.d.c.b == g2);
            assert (g2.c.b.d == g2);
            g4 = g2;
        }
        assert (g2.b.a == g4.b && g2.b == h2.d && g2.b.b == g2 && g2.e == null && g2.b.e == null && g2.f == null && g2.b.f == null);
    }
}

