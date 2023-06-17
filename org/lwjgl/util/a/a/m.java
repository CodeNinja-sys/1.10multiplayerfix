/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.f;
import org.lwjgl.util.a.a.g;
import org.lwjgl.util.a.a.i;
import org.lwjgl.util.a.a.j;

class m {
    static boolean a;
    static double b;
    static double c;
    private static final boolean e = false;
    static final /* synthetic */ boolean d;

    private m() {
    }

    private static double a(double[] arrd, double[] arrd2) {
        return arrd[0] * arrd2[0] + arrd[1] * arrd2[1] + arrd[2] * arrd2[2];
    }

    static void a(double[] arrd) {
        double d2 = arrd[0] * arrd[0] + arrd[1] * arrd[1] + arrd[2] * arrd[2];
        if (!d && !(d2 > 0.0)) {
            throw new AssertionError();
        }
        d2 = Math.sqrt(d2);
        arrd[0] = arrd[0] / d2;
        arrd[1] = arrd[1] / d2;
        arrd[2] = arrd[2] / d2;
    }

    static int b(double[] arrd) {
        int n2 = 0;
        if (Math.abs(arrd[1]) > Math.abs(arrd[0])) {
            n2 = 1;
        }
        if (Math.abs(arrd[2]) > Math.abs(arrd[n2])) {
            n2 = 2;
        }
        return n2;
    }

    static void a(i i2, double[] arrd) {
        int n2;
        j j2 = i2.b.a;
        double[] arrd2 = new double[3];
        double[] arrd3 = new double[3];
        j[] arrj = new j[3];
        j[] arrj2 = new j[3];
        double[] arrd4 = new double[3];
        double[] arrd5 = new double[3];
        double[] arrd6 = new double[3];
        arrd2[2] = -2.0E150;
        arrd2[1] = -2.0E150;
        arrd2[0] = -2.0E150;
        arrd3[2] = 2.0E150;
        arrd3[1] = 2.0E150;
        arrd3[0] = 2.0E150;
        j j3 = j2.a;
        while (j3 != j2) {
            for (n2 = 0; n2 < 3; ++n2) {
                double d2 = j3.e[n2];
                if (d2 < arrd3[n2]) {
                    arrd3[n2] = d2;
                    arrj[n2] = j3;
                }
                if (!(d2 > arrd2[n2])) continue;
                arrd2[n2] = d2;
                arrj2[n2] = j3;
            }
            j3 = j3.a;
        }
        n2 = 0;
        if (arrd2[1] - arrd3[1] > arrd2[0] - arrd3[0]) {
            n2 = 1;
        }
        if (arrd2[2] - arrd3[2] > arrd2[n2] - arrd3[n2]) {
            n2 = 2;
        }
        if (arrd3[n2] >= arrd2[n2]) {
            arrd[0] = 0.0;
            arrd[1] = 0.0;
            arrd[2] = 1.0;
            return;
        }
        double d3 = 0.0;
        j j4 = arrj[n2];
        j j5 = arrj2[n2];
        arrd4[0] = j4.e[0] - j5.e[0];
        arrd4[1] = j4.e[1] - j5.e[1];
        arrd4[2] = j4.e[2] - j5.e[2];
        j3 = j2.a;
        while (j3 != j2) {
            arrd5[0] = j3.e[0] - j5.e[0];
            arrd5[1] = j3.e[1] - j5.e[1];
            arrd5[2] = j3.e[2] - j5.e[2];
            arrd6[0] = arrd4[1] * arrd5[2] - arrd4[2] * arrd5[1];
            arrd6[1] = arrd4[2] * arrd5[0] - arrd4[0] * arrd5[2];
            arrd6[2] = arrd4[0] * arrd5[1] - arrd4[1] * arrd5[0];
            double d4 = arrd6[0] * arrd6[0] + arrd6[1] * arrd6[1] + arrd6[2] * arrd6[2];
            if (d4 > d3) {
                d3 = d4;
                arrd[0] = arrd6[0];
                arrd[1] = arrd6[1];
                arrd[2] = arrd6[2];
            }
            j3 = j3.a;
        }
        if (d3 <= 0.0) {
            arrd[2] = 0.0;
            arrd[1] = 0.0;
            arrd[0] = 0.0;
            arrd[m.b((double[])arrd4)] = 1.0;
        }
    }

    static void a(i i2) {
        f f2 = i2.b.b;
        j j2 = i2.b.a;
        double d2 = 0.0;
        f f3 = f2.a;
        while (f3 != f2) {
            g g2 = f3.c;
            if (g2.h > 0) {
                do {
                    d2 += (g2.e.f - g2.b.e.f) * (g2.e.g + g2.b.e.g);
                } while ((g2 = g2.d) != f3.c);
            }
            f3 = f3.a;
        }
        if (d2 < 0.0) {
            j j3 = j2.a;
            while (j3 != j2) {
                j3.g = -j3.g;
                j3 = j3.a;
            }
            i2.e[0] = -i2.e[0];
            i2.e[1] = -i2.e[1];
            i2.e[2] = -i2.e[2];
        }
    }

    public static void b(i i2) {
        j j2 = i2.b.a;
        double[] arrd = new double[3];
        boolean bl2 = false;
        arrd[0] = i2.c[0];
        arrd[1] = i2.c[1];
        arrd[2] = i2.c[2];
        if (arrd[0] == 0.0 && arrd[1] == 0.0 && arrd[2] == 0.0) {
            m.a(i2, arrd);
            bl2 = true;
        }
        double[] arrd2 = i2.d;
        double[] arrd3 = i2.e;
        int n2 = m.b(arrd);
        arrd2[n2] = 0.0;
        arrd2[(n2 + 1) % 3] = b;
        arrd2[(n2 + 2) % 3] = c;
        arrd3[n2] = 0.0;
        arrd3[(n2 + 1) % 3] = arrd[n2] > 0.0 ? -c : c;
        arrd3[(n2 + 2) % 3] = arrd[n2] > 0.0 ? b : -b;
        j j3 = j2.a;
        while (j3 != j2) {
            j3.f = m.a(j3.e, arrd2);
            j3.g = m.a(j3.e, arrd3);
            j3 = j3.a;
        }
        if (bl2) {
            m.a(i2);
        }
    }

    static {
        boolean bl2 = d = !m.class.desiredAssertionStatus();
        if (a) {
            b = 0.5094153956495538;
            c = 0.8605207462201063;
        } else {
            b = 1.0;
            c = 0.0;
        }
    }
}

