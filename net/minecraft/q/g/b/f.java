/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.b.aj;
import net.minecraft.q.b.an;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;

public class f
extends g {
    public f(long l2, g g2) {
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
                q q2 = q.b(n10);
                if (n10 == q.a(i.p)) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 != q.a(i.a) && n8 != q.a(i.a) && n7 != q.a(i.a) && n6 != q.a(i.a)) {
                        arrn2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(i.q);
                    continue;
                }
                if (q2 != null && q2.a() == an.class) {
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (this.c(n9) && this.c(n8) && this.c(n7) && this.c(n6)) {
                        if (!(f.b(n9) || f.b(n8) || f.b(n7) || f.b(n6))) {
                            arrn2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = q.a(i.r);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(i.y);
                    continue;
                }
                if (n10 != q.a(i.e) && n10 != q.a(i.J) && n10 != q.a(i.v)) {
                    if (q2 != null && q2.p()) {
                        this.a(arrn, arrn2, i3, i2, n4, n10, q.a(i.B));
                        continue;
                    }
                    if (n10 != q.a(i.M) && n10 != q.a(i.N)) {
                        if (n10 != q.a(i.a) && n10 != q.a(i.z) && n10 != q.a(i.i) && n10 != q.a(i.h)) {
                            n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                            n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                            n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                            n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                            if (!(f.b(n9) || f.b(n8) || f.b(n7) || f.b(n6))) {
                                arrn2[i3 + i2 * n4] = n10;
                                continue;
                            }
                            arrn2[i3 + i2 * n4] = q.a(i.r);
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    n9 = arrn[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = arrn[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = arrn[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = arrn[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (!(f.b(n9) || f.b(n8) || f.b(n7) || f.b(n6))) {
                        if (this.d(n9) && this.d(n8) && this.d(n7) && this.d(n6)) {
                            arrn2[i3 + i2 * n4] = n10;
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = q.a(i.d);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = n10;
                    continue;
                }
                this.a(arrn, arrn2, i3, i2, n4, n10, q.a(i.A));
            }
        }
        return arrn2;
    }

    private void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6) {
        if (f.b(n5)) {
            arrn2[n2 + n3 * n4] = n5;
        } else {
            int n7 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n8 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n9 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n10 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            arrn2[n2 + n3 * n4] = !f.b(n7) && !f.b(n8) && !f.b(n9) && !f.b(n10) ? n5 : n6;
        }
    }

    private boolean c(int n2) {
        return q.b(n2) != null && q.b(n2).a() == an.class ? true : n2 == q.a(i.y) || n2 == q.a(i.w) || n2 == q.a(i.x) || n2 == q.a(i.f) || n2 == q.a(i.g) || f.b(n2);
    }

    private boolean d(int n2) {
        return q.b(n2) instanceof aj;
    }
}

