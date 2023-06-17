/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.a.i;
import net.minecraft.q.b.q;
import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.p;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class e
extends g {
    private static final d c = org.apache.logging.log4j.c.c();
    private final g d;

    public e(long l2, g g2, g g3) {
        super(l2);
        this.a = g2;
        this.d = g3;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = this.d.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn3 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                q q2;
                q q3;
                boolean bl2;
                boolean bl3;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n7 = arrn[i3 + 1 + (i2 + 1) * (n4 + 2)];
                int n8 = arrn2[i3 + 1 + (i2 + 1) * (n4 + 2)];
                boolean bl4 = bl3 = (n8 - 2) % 29 == 0;
                if (n7 > 255) {
                    c.a("old! {}", n7);
                }
                boolean bl5 = bl2 = (q3 = q.a(n7)) != null && q3.e();
                if (n7 != 0 && n8 >= 2 && (n8 - 2) % 29 == 1 && !bl2) {
                    q2 = q.b(q3);
                    arrn3[i3 + i2 * n4] = q2 == null ? n7 : q.a(q2);
                    continue;
                }
                if (this.a(3) != 0 && !bl3) {
                    arrn3[i3 + i2 * n4] = n7;
                    continue;
                }
                q2 = q3;
                if (q3 == i.d) {
                    q2 = i.s;
                } else if (q3 == i.f) {
                    q2 = i.t;
                } else if (q3 == i.C) {
                    q2 = i.D;
                } else if (q3 == i.E) {
                    q2 = i.c;
                } else if (q3 == i.g) {
                    q2 = i.u;
                } else if (q3 == i.H) {
                    q2 = i.I;
                } else if (q3 == i.F) {
                    q2 = i.G;
                } else if (q3 == i.c) {
                    q2 = this.a(3) == 0 ? i.t : i.f;
                } else if (q3 == i.n) {
                    q2 = i.o;
                } else if (q3 == i.w) {
                    q2 = i.x;
                } else if (q3 == i.a) {
                    q2 = i.z;
                } else if (q3 == i.e) {
                    q2 = i.J;
                } else if (q3 == i.K) {
                    q2 = i.L;
                } else if (e.a(n7, q.a(i.N))) {
                    q2 = i.M;
                } else if (q3 == i.z && this.a(3) == 0) {
                    n6 = this.a(2);
                    q2 = n6 == 0 ? i.c : i.f;
                }
                n6 = q.a(q2);
                if (bl3 && n6 != n7) {
                    q q4 = q.b(q2);
                    int n9 = n6 = q4 == null ? n7 : q.a(q4);
                }
                if (n6 == n7) {
                    arrn3[i3 + i2 * n4] = n7;
                    continue;
                }
                int n10 = arrn[i3 + 1 + (i2 + 0) * (n4 + 2)];
                int n11 = arrn[i3 + 2 + (i2 + 1) * (n4 + 2)];
                int n12 = arrn[i3 + 0 + (i2 + 1) * (n4 + 2)];
                int n13 = arrn[i3 + 1 + (i2 + 2) * (n4 + 2)];
                int n14 = 0;
                if (e.a(n10, n7)) {
                    ++n14;
                }
                if (e.a(n11, n7)) {
                    ++n14;
                }
                if (e.a(n12, n7)) {
                    ++n14;
                }
                if (e.a(n13, n7)) {
                    ++n14;
                }
                arrn3[i3 + i2 * n4] = n14 >= 3 ? n6 : n7;
            }
        }
        return arrn3;
    }
}

