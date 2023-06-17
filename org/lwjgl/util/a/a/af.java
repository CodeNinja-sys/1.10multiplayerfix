/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.f;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.h;
import org.lwjgl.util.a.a.k;
import org.lwjgl.util.a.a.l;

class af {
    af() {
    }

    static boolean a(f f2) {
        g g2;
        g g3 = f2.c;
        assert (g3.d != g3 && g3.d.d != g3);
        while (k.b(g3.b.e, g3.e)) {
            g3 = g3.c.b;
        }
        while (k.b(g3.e, g3.b.e)) {
            g3 = g3.d;
        }
        g g4 = g3.c.b;
        while (g3.d != g4) {
            if (k.b(g3.b.e, g4.e)) {
                while (g4.d != g3 && (k.a(g4.d) || k.b(g4.e, g4.b.e, g4.d.b.e) <= 0.0)) {
                    g2 = l.c(g4.d, g4);
                    if (g2 == null) {
                        return false;
                    }
                    g4 = g2.b;
                }
                g4 = g4.c.b;
                continue;
            }
            while (g4.d != g3 && (k.b(g3.c.b) || k.b(g3.b.e, g3.e, g3.c.b.e) >= 0.0)) {
                g2 = l.c(g3, g3.c.b);
                if (g2 == null) {
                    return false;
                }
                g3 = g2.b;
            }
            g3 = g3.d;
        }
        assert (g4.d != g3);
        while (g4.d.d != g3) {
            g2 = l.c(g4.d, g4);
            if (g2 == null) {
                return false;
            }
            g4 = g2.b;
        }
        return true;
    }

    public static boolean a(h h2) {
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            f f3 = f2.a;
            if (f2.g && !af.a(f2)) {
                return false;
            }
            f2 = f3;
        }
        return true;
    }

    public static void b(h h2) {
        f f2 = h2.b.a;
        while (f2 != h2.b) {
            f f3 = f2.a;
            if (!f2.g) {
                l.a(f2);
            }
            f2 = f3;
        }
    }

    public static boolean a(h h2, int n2, boolean bl2) {
        g g2 = h2.c.a;
        while (g2 != h2.c) {
            g g3 = g2.a;
            if (g2.b.f.g != g2.f.g) {
                g2.h = g2.f.g ? n2 : -n2;
            } else if (!bl2) {
                g2.h = 0;
            } else if (!l.c(g2)) {
                return false;
            }
            g2 = g3;
        }
        return true;
    }
}

