/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class j
extends g {
    public j(long l2, g g2) {
        super(l2);
        this.a = g2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = n4 + 2;
        int n9 = n5 + 2;
        int[] arrn = this.a.a(n6, n7, n8, n9);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = this.c(arrn[i3 + 0 + (i2 + 1) * n8]);
                int n11 = this.c(arrn[i3 + 2 + (i2 + 1) * n8]);
                int n12 = this.c(arrn[i3 + 1 + (i2 + 0) * n8]);
                int n13 = this.c(arrn[i3 + 1 + (i2 + 2) * n8]);
                int n14 = this.c(arrn[i3 + 1 + (i2 + 1) * n8]);
                arrn2[i3 + i2 * n4] = n14 == n10 && n14 == n12 && n14 == n11 && n14 == n13 ? -1 : q.a(i.i);
            }
        }
        return arrn2;
    }

    private int c(int n2) {
        return n2 >= 2 ? 2 + (n2 & 1) : n2;
    }
}

