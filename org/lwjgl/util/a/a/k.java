/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.j;

class k {
    private k() {
    }

    static double a(j j2, j j3, j j4) {
        assert (k.b(j2, j3) && k.b(j3, j4));
        double d2 = j3.f - j2.f;
        double d3 = j4.f - j3.f;
        if (d2 + d3 > 0.0) {
            if (d2 < d3) {
                return j3.g - j2.g + (j2.g - j4.g) * (d2 / (d2 + d3));
            }
            return j3.g - j4.g + (j4.g - j2.g) * (d3 / (d2 + d3));
        }
        return 0.0;
    }

    static double b(j j2, j j3, j j4) {
        assert (k.b(j2, j3) && k.b(j3, j4));
        double d2 = j3.f - j2.f;
        double d3 = j4.f - j3.f;
        if (d2 + d3 > 0.0) {
            return (j3.g - j4.g) * d2 + (j3.g - j2.g) * d3;
        }
        return 0.0;
    }

    static double c(j j2, j j3, j j4) {
        assert (k.c(j2, j3) && k.c(j3, j4));
        double d2 = j3.g - j2.g;
        double d3 = j4.g - j3.g;
        if (d2 + d3 > 0.0) {
            if (d2 < d3) {
                return j3.f - j2.f + (j2.f - j4.f) * (d2 / (d2 + d3));
            }
            return j3.f - j4.f + (j4.f - j2.f) * (d3 / (d2 + d3));
        }
        return 0.0;
    }

    static double d(j j2, j j3, j j4) {
        assert (k.c(j2, j3) && k.c(j3, j4));
        double d2 = j3.g - j2.g;
        double d3 = j4.g - j3.g;
        if (d2 + d3 > 0.0) {
            return (j3.f - j4.f) * d2 + (j3.f - j2.f) * d3;
        }
        return 0.0;
    }

    static boolean e(j j2, j j3, j j4) {
        return j2.f * (j3.g - j4.g) + j3.f * (j4.g - j2.g) + j4.f * (j2.g - j3.g) >= 0.0;
    }

    static double a(double d2, double d3, double d4, double d5) {
        d2 = d2 < 0.0 ? 0.0 : d2;
        double d6 = d4 = d4 < 0.0 ? 0.0 : d4;
        if (d2 <= d4) {
            if (d4 == 0.0) {
                return (d3 + d5) / 2.0;
            }
            return d3 + (d5 - d3) * (d2 / (d2 + d4));
        }
        return d5 + (d3 - d5) * (d4 / (d2 + d4));
    }

    static void a(j j2, j j3, j j4, j j5, j j6) {
        double d2;
        double d3;
        j j7;
        if (!k.b(j2, j3)) {
            j7 = j2;
            j2 = j3;
            j3 = j7;
        }
        if (!k.b(j4, j5)) {
            j7 = j4;
            j4 = j5;
            j5 = j7;
        }
        if (!k.b(j2, j4)) {
            j7 = j2;
            j2 = j4;
            j4 = j7;
            j7 = j3;
            j3 = j5;
            j5 = j7;
        }
        if (!k.b(j4, j3)) {
            j6.f = (j4.f + j3.f) / 2.0;
        } else if (k.b(j3, j5)) {
            d3 = k.a(j2, j4, j3);
            if (d3 + (d2 = k.a(j4, j3, j5)) < 0.0) {
                d3 = -d3;
                d2 = -d2;
            }
            j6.f = k.a(d3, j4.f, d2, j3.f);
        } else {
            d3 = k.b(j2, j4, j3);
            if (d3 + (d2 = -k.b(j2, j5, j3)) < 0.0) {
                d3 = -d3;
                d2 = -d2;
            }
            j6.f = k.a(d3, j4.f, d2, j5.f);
        }
        if (!k.c(j2, j3)) {
            j7 = j2;
            j2 = j3;
            j3 = j7;
        }
        if (!k.c(j4, j5)) {
            j7 = j4;
            j4 = j5;
            j5 = j7;
        }
        if (!k.c(j2, j4)) {
            j7 = j4;
            j4 = j2;
            j2 = j7;
            j7 = j5;
            j5 = j3;
            j3 = j7;
        }
        if (!k.c(j4, j3)) {
            j6.g = (j4.g + j3.g) / 2.0;
        } else if (k.c(j3, j5)) {
            d3 = k.c(j2, j4, j3);
            if (d3 + (d2 = k.c(j4, j3, j5)) < 0.0) {
                d3 = -d3;
                d2 = -d2;
            }
            j6.g = k.a(d3, j4.g, d2, j3.g);
        } else {
            d3 = k.d(j2, j4, j3);
            if (d3 + (d2 = -k.d(j2, j5, j3)) < 0.0) {
                d3 = -d3;
                d2 = -d2;
            }
            j6.g = k.a(d3, j4.g, d2, j5.g);
        }
    }

    static boolean a(j j2, j j3) {
        return j2.f == j3.f && j2.g == j3.g;
    }

    static boolean b(j j2, j j3) {
        return j2.f < j3.f || j2.f == j3.f && j2.g <= j3.g;
    }

    static boolean c(j j2, j j3) {
        return j2.g < j3.g || j2.g == j3.g && j2.f <= j3.f;
    }

    static boolean a(g g2) {
        return k.b(g2.b.e, g2.e);
    }

    static boolean b(g g2) {
        return k.b(g2.e, g2.b.e);
    }

    static double d(j j2, j j3) {
        return Math.abs(j2.f - j3.f) + Math.abs(j2.g - j3.g);
    }
}

