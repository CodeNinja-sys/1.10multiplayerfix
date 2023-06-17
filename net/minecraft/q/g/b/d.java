/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class d
extends g {
    public d(long l2, g g2) {
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
                int n10;
                int n11 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                int n12 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                int n13 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                int n14 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                arrn2[i3 + i2 * n4] = n10 = arrn[i3 + 1 + (i2 + 1) * n8];
                this.a((long)(i3 + n2), (long)(i2 + n3));
                if (n10 != 0 || n11 != 0 || n12 != 0 || n13 != 0 || n14 != 0 || this.a(2) != 0) continue;
                arrn2[i3 + i2 * n4] = 1;
            }
        }
        return arrn2;
    }
}

