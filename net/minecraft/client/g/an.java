/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ar;
import net.minecraft.client.g.e.d;
import net.minecraft.client.g.e.q;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

public class an {
    protected final ar a;
    protected final k b;
    protected int c;
    protected int d;
    protected int e;
    public q[] f;

    public an(k k2, int n2, ar ar2, d d2) {
        this.a = ar2;
        this.b = k2;
        this.a(n2);
        this.a(d2);
    }

    protected void a(d d2) {
        int n2 = this.d * this.c * this.e;
        this.f = new q[n2];
        int n3 = 0;
        for (int i2 = 0; i2 < this.d; ++i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                for (int i4 = 0; i4 < this.e; ++i4) {
                    int n4 = (i4 * this.c + i3) * this.d + i2;
                    this.f[n4] = d2.a(this.b, this.a, n3++);
                    this.f[n4].a(i2 * 16, i3 * 16, i4 * 16);
                }
            }
        }
    }

    public void a() {
        q[] arrq = this.f;
        int n2 = this.f.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            q q2 = arrq[i2];
            q2.a();
        }
    }

    protected void a(int n2) {
        int n3;
        this.d = n3 = n2 * 2 + 1;
        this.c = 16;
        this.e = n3;
    }

    public void a(double d2, double d3) {
        int n2 = n.c(d2) - 8;
        int n3 = n.c(d3) - 8;
        int n4 = this.d * 16;
        for (int i2 = 0; i2 < this.d; ++i2) {
            int n5 = this.a(n2, n4, i2);
            for (int i3 = 0; i3 < this.e; ++i3) {
                int n6 = this.a(n3, n4, i3);
                for (int i4 = 0; i4 < this.c; ++i4) {
                    int n7 = i4 * 16;
                    q q2 = this.f[(i3 * this.c + i4) * this.d + i2];
                    q2.a(n5, n7, n6);
                }
            }
        }
    }

    private int a(int n2, int n3, int n4) {
        int n5 = n4 * 16;
        int n6 = n5 - n2 + n3 / 2;
        if (n6 < 0) {
            n6 -= n3 - 1;
        }
        return n5 - n6 / n3 * n3;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        int n8 = n.a(n2, 16);
        int n9 = n.a(n3, 16);
        int n10 = n.a(n4, 16);
        int n11 = n.a(n5, 16);
        int n12 = n.a(n6, 16);
        int n13 = n.a(n7, 16);
        for (int i2 = n8; i2 <= n11; ++i2) {
            int n14 = i2 % this.d;
            if (n14 < 0) {
                n14 += this.d;
            }
            for (int i3 = n9; i3 <= n12; ++i3) {
                int n15 = i3 % this.c;
                if (n15 < 0) {
                    n15 += this.c;
                }
                for (int i4 = n10; i4 <= n13; ++i4) {
                    int n16 = i4 % this.e;
                    if (n16 < 0) {
                        n16 += this.e;
                    }
                    int n17 = (n16 * this.c + n15) * this.d + n14;
                    q q2 = this.f[n17];
                    q2.a(bl2);
                }
            }
        }
    }

    protected q a(b b2) {
        int n2 = n.a(b2.cy_(), 16);
        int n3 = n.a(b2.k(), 16);
        int n4 = n.a(b2.l(), 16);
        if (n3 >= 0 && n3 < this.c) {
            if ((n2 %= this.d) < 0) {
                n2 += this.d;
            }
            if ((n4 %= this.e) < 0) {
                n4 += this.e;
            }
            int n5 = (n4 * this.c + n3) * this.d + n2;
            return this.f[n5];
        }
        return null;
    }
}

