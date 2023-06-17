/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.ab;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;
import net.minecraft.q.g.h;

public class o
extends g {
    private q[] c = new q[]{i.d, i.d, i.d, i.K, i.K, i.c};
    private final q[] d = new q[]{i.f, i.E, i.e, i.c, i.C, i.h};
    private final q[] e = new q[]{i.f, i.e, i.g, i.c};
    private final q[] f = new q[]{i.n, i.n, i.n, i.F};
    private final a g;

    public o(long l2, g g2, ab ab2, String string) {
        super(l2);
        this.a = g2;
        if (ab2 == ab.h) {
            this.c = new q[]{i.d, i.f, i.e, i.h, i.c, i.g};
            this.g = null;
        } else {
            this.g = ab2 == ab.f ? h.a(string).b() : null;
        }
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2, n3, n4, n5);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = arrn[i3 + i2 * n4];
                int n7 = (n6 & 0xF00) >> 8;
                n6 &= 0xFFFFF0FF;
                if (this.g != null && this.g.F >= 0) {
                    arrn2[i3 + i2 * n4] = this.g.F;
                    continue;
                }
                if (o.b(n6)) {
                    arrn2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == q.a(i.p)) {
                    arrn2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == 1) {
                    if (n7 > 0) {
                        if (this.a(3) == 0) {
                            arrn2[i3 + i2 * n4] = q.a(i.O);
                            continue;
                        }
                        arrn2[i3 + i2 * n4] = q.a(i.N);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(this.c[this.a(this.c.length)]);
                    continue;
                }
                if (n6 == 2) {
                    if (n7 > 0) {
                        arrn2[i3 + i2 * n4] = q.a(i.w);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(this.d[this.a(this.d.length)]);
                    continue;
                }
                if (n6 == 3) {
                    if (n7 > 0) {
                        arrn2[i3 + i2 * n4] = q.a(i.H);
                        continue;
                    }
                    arrn2[i3 + i2 * n4] = q.a(this.e[this.a(this.e.length)]);
                    continue;
                }
                arrn2[i3 + i2 * n4] = n6 == 4 ? q.a(this.f[this.a(this.f.length)]) : q.a(i.p);
            }
        }
        return arrn2;
    }
}

