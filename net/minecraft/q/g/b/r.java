/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class r
extends g {
    private final g c;
    private final g d;

    public r(long l2, g g2, g g3) {
        super(l2);
        this.c = g2;
        this.d = g3;
    }

    @Override
    public void a(long l2) {
        this.c.a(l2);
        this.d.a(l2);
        super.a(l2);
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.c.a(n2, n3, n4, n5);
        int[] arrn2 = this.d.a(n2, n3, n4, n5);
        int[] arrn3 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            if (arrn[i2] != q.a(i.a) && arrn[i2] != q.a(i.z)) {
                if (arrn2[i2] == q.a(i.i)) {
                    if (arrn[i2] == q.a(i.n)) {
                        arrn3[i2] = q.a(i.m);
                        continue;
                    }
                    if (arrn[i2] != q.a(i.p) && arrn[i2] != q.a(i.q)) {
                        arrn3[i2] = arrn2[i2] & 0xFF;
                        continue;
                    }
                    arrn3[i2] = q.a(i.q);
                    continue;
                }
                arrn3[i2] = arrn[i2];
                continue;
            }
            arrn3[i2] = arrn[i2];
        }
        return arrn3;
    }
}

