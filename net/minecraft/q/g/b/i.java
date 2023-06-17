/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class i
extends g {
    public i(long l2, g g2) {
        super(l2);
        this.a = g2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = arrn[i3 + 1 + (i2 + 1) * (n4 + 2)];
                if (this.a(57) == 0) {
                    if (n6 == q.a(net.minecraft.a.i.c)) {
                        arrn2[i3 + i2 * n4] = q.a(net.minecraft.a.i.Q);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n6;
                    continue;
                }
                arrn2[i3 + i2 * n4] = n6;
            }
        }
        return arrn2;
    }
}

