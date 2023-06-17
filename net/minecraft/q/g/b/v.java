/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.b.ak;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class v
extends g {
    public v(long l2, g g2) {
        super(l2);
        this.a = g2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                int n7;
                int n8;
                int n9;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n10 = arrn[i3 + 1 + (i2 + 1) * (n4 + 2)];
                if (this.a(arrn, arrn2, i3, i2, n4, n10, q.a(i.e), q.a(i.v)) || this.b(arrn, arrn2, i3, i2, n4, n10, q.a(i.N), q.a(i.M)) || this.b(arrn, arrn2, i3, i2, n4, n10, q.a(i.O), q.a(i.M)) || this.b(arrn, arrn2, i3, i2, n4, n10, q.a(i.H), q.a(i.g))) continue;
                if (n10 == q.a(i.d)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != q.a(i.n) && n8 != q.a(i.n) && n7 != q.a(i.n) && n6 != q.a(i.n)) {
                        arrn2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(i.J);
                    continue;
                }
                if (n10 == q.a(i.h)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != q.a(i.d) && n8 != q.a(i.d) && n7 != q.a(i.d) && n6 != q.a(i.d) && n9 != q.a(i.F) && n8 != q.a(i.F) && n7 != q.a(i.F) && n6 != q.a(i.F) && n9 != q.a(i.n) && n8 != q.a(i.n) && n7 != q.a(i.n) && n6 != q.a(i.n)) {
                        if (n9 != q.a(i.w) && n6 != q.a(i.w) && n8 != q.a(i.w) && n7 != q.a(i.w)) {
                            arrn2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = q.a(i.y);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(i.c);
                    continue;
                }
                arrn2[i3 + i2 * n4] = n10;
            }
        }
        return arrn2;
    }

    private boolean a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!v.a(n5, n6)) {
            return false;
        }
        int n8 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n9 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n10 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n11 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        arrn2[n2 + n3 * n4] = this.b(n8, n6) && this.b(n9, n6) && this.b(n10, n6) && this.b(n11, n6) ? n5 : n7;
        return true;
    }

    private boolean b(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 != n6) {
            return false;
        }
        int n8 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n9 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n10 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n11 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        arrn2[n2 + n3 * n4] = v.a(n8, n6) && v.a(n9, n6) && v.a(n10, n6) && v.a(n11, n6) ? n5 : n7;
        return true;
    }

    private boolean b(int n2, int n3) {
        if (v.a(n2, n3)) {
            return true;
        }
        q q2 = q.b(n2);
        q q3 = q.b(n3);
        if (q2 != null && q3 != null) {
            ak ak2;
            ak ak3 = q2.b();
            return ak3 == (ak2 = q3.b()) || ak3 == ak.c || ak2 == ak.c;
        }
        return false;
    }
}

