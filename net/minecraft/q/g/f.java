/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g;

import java.util.Random;
import net.minecraft.q.g.c;
import net.minecraft.q.g.q;
import net.minecraft.u.b.n;

public class f
extends c {
    private final q[] a;
    private final int b;

    public f(Random random, int n2) {
        this.b = n2;
        this.a = new q[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = new q(random);
        }
    }

    public double[] a(double[] arrd, int n2, int n3, int n4, int n5, int n6, int n7, double d2, double d3, double d4) {
        if (arrd == null) {
            arrd = new double[n5 * n6 * n7];
        } else {
            for (int i2 = 0; i2 < arrd.length; ++i2) {
                arrd[i2] = 0.0;
            }
        }
        double d5 = 1.0;
        for (int i3 = 0; i3 < this.b; ++i3) {
            double d6 = (double)n2 * d5 * d2;
            double d7 = (double)n3 * d5 * d3;
            double d8 = (double)n4 * d5 * d4;
            long l2 = n.d(d6);
            long l3 = n.d(d8);
            d6 -= (double)l2;
            d8 -= (double)l3;
            this.a[i3].a(arrd, d6 += (double)(l2 %= 0x1000000L), d7, d8 += (double)(l3 %= 0x1000000L), n5, n6, n7, d2 * d5, d3 * d5, d4 * d5, d5);
            d5 /= 2.0;
        }
        return arrd;
    }

    public double[] a(double[] arrd, int n2, int n3, int n4, int n5, double d2, double d3, double d4) {
        return this.a(arrd, n2, 10, n3, n4, 1, n5, d2, 1.0, d3);
    }
}

