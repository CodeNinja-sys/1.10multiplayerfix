/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import a.a.a.a.c.ad;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.a.f;
import net.minecraft.g.c.b;
import net.minecraft.g.hn;
import net.minecraft.q.ac;
import net.minecraft.q.v;
import net.minecraft.u.ae;
import net.minecraft.u.af;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;

public class g {
    private final v a;
    private final Random b;
    private final as c = new bl(4096);

    public g(v v2) {
        this.a = v2;
        this.b = new Random(v2.A());
    }

    public void a(net.minecraft.w.n n2, float f2) {
        if (this.a.q.a().a() != 1) {
            if (!this.b(n2, f2)) {
                this.a(n2);
                this.b(n2, f2);
            }
        } else {
            int n3 = n.c(n2.aU);
            int n4 = n.c(n2.aV) - 1;
            int n5 = n.c(n2.aW);
            boolean bl2 = true;
            boolean bl3 = false;
            for (int i2 = -2; i2 <= 2; ++i2) {
                for (int i3 = -2; i3 <= 2; ++i3) {
                    for (int i4 = -1; i4 < 3; ++i4) {
                        int n6 = n3 + i3 * 1 + i2 * 0;
                        int n7 = n4 + i4;
                        int n8 = n5 + i3 * 0 - i2 * 1;
                        boolean bl4 = i4 < 0;
                        this.a.b(new net.minecraft.u.b.b(n6, n7, n8), bl4 ? p.Z.v() : p.a.v());
                    }
                }
            }
            n2.b(n3, n4, n5, n2.ba, 0.0f);
            n2.aX = 0.0;
            n2.aY = 0.0;
            n2.aZ = 0.0;
        }
    }

    public boolean b(net.minecraft.w.n n2, float f2) {
        Object object;
        net.minecraft.u.b.b b2;
        int n3 = 128;
        double d2 = -1.0;
        int n4 = n.c(n2.aU);
        int n5 = n.c(n2.aW);
        boolean bl2 = true;
        Object object2 = net.minecraft.u.b.b.c;
        long l2 = m.a(n4, n5);
        if (this.c.b(l2)) {
            b2 = (ac)this.c.c(l2);
            d2 = 0.0;
            object2 = b2;
            ((ac)b2).a = this.a.B();
            bl2 = false;
        } else {
            b2 = new net.minecraft.u.b.b(n2);
            for (int i2 = -128; i2 <= 128; ++i2) {
                for (int i3 = -128; i3 <= 128; ++i3) {
                    object = b2.a(i2, this.a.M() - 1 - b2.k(), i3);
                    while (((t)object).k() >= 0) {
                        net.minecraft.u.b.b b3 = ((net.minecraft.u.b.b)object).c();
                        if (this.a.n((net.minecraft.u.b.b)object).c() == p.aY) {
                            b3 = ((net.minecraft.u.b.b)object).c();
                            while (this.a.n(b3).c() == p.aY) {
                                object = b3;
                                b3 = b3.c();
                            }
                            double d3 = ((t)object).i(b2);
                            if (d2 < 0.0 || d3 < d2) {
                                d2 = d3;
                                object2 = object;
                            }
                        }
                        object = b3;
                    }
                }
            }
        }
        if (d2 >= 0.0) {
            if (bl2) {
                this.c.a(l2, new ac(this, (net.minecraft.u.b.b)object2, this.a.B()));
            }
            double d4 = (double)((t)object2).cy_() + 0.5;
            double d5 = (double)((t)object2).l() + 0.5;
            object = p.aY.d(this.a, (net.minecraft.u.b.b)object2);
            boolean bl3 = ((f)object).b().f().d() == af.b;
            double d6 = ((f)object).b().l() == ae.a ? (double)((f)object).a().l() : (double)((f)object).a().cy_();
            double d7 = (double)(((f)object).a().k() + 1) - n2.cI().c * (double)((f)object).e();
            if (bl3) {
                d6 += 1.0;
            }
            if (((f)object).b().l() == ae.a) {
                d5 = d6 + (1.0 - n2.cI().b) * (double)((f)object).d() * (double)((f)object).b().f().d().a();
            } else {
                d4 = d6 + (1.0 - n2.cI().b) * (double)((f)object).d() * (double)((f)object).b().f().d().a();
            }
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            if (((f)object).b().e() == n2.cJ()) {
                f3 = 1.0f;
                f4 = 1.0f;
            } else if (((f)object).b().e() == n2.cJ().e()) {
                f3 = -1.0f;
                f4 = -1.0f;
            } else if (((f)object).b().e() == n2.cJ().f()) {
                f5 = 1.0f;
                f6 = -1.0f;
            } else {
                f5 = -1.0f;
                f6 = 1.0f;
            }
            double d8 = n2.aX;
            double d9 = n2.aZ;
            n2.aX = d8 * (double)f3 + d9 * (double)f6;
            n2.aZ = d8 * (double)f5 + d9 * (double)f4;
            n2.ba = f2 - (float)(n2.cJ().e().c() * 90) + (float)(((f)object).b().c() * 90);
            if (n2 instanceof net.minecraft.w.a.g) {
                ((net.minecraft.w.a.g)n2).a.a(d4, d7, d5, n2.ba, n2.bb);
            } else {
                n2.b(d4, d7, d5, n2.ba, n2.bb);
            }
            return true;
        }
        return false;
    }

    public boolean a(net.minecraft.w.n n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        double d2;
        int n10;
        double d3;
        int n11;
        int n12 = 16;
        double d4 = -1.0;
        int n13 = n.c(n2.aU);
        int n14 = n.c(n2.aV);
        int n15 = n.c(n2.aW);
        int n16 = n13;
        int n17 = n14;
        int n18 = n15;
        int n19 = 0;
        int n20 = this.b.nextInt(4);
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g();
        for (n11 = n13 - 16; n11 <= n13 + 16; ++n11) {
            d3 = (double)n11 + 0.5 - n2.aU;
            for (n10 = n15 - 16; n10 <= n15 + 16; ++n10) {
                d2 = (double)n10 + 0.5 - n2.aW;
                block2: for (n9 = this.a.M() - 1; n9 >= 0; --n9) {
                    if (!this.a.c(g2.b(n11, n9, n10))) continue;
                    while (n9 > 0 && this.a.c(g2.b(n11, n9 - 1, n10))) {
                        --n9;
                    }
                    for (n8 = n20; n8 < n20 + 4; ++n8) {
                        n7 = n8 % 2;
                        n6 = 1 - n7;
                        if (n8 % 4 >= 2) {
                            n7 = -n7;
                            n6 = -n6;
                        }
                        for (int i2 = 0; i2 < 3; ++i2) {
                            for (n5 = 0; n5 < 4; ++n5) {
                                for (int i3 = -1; i3 < 4; ++i3) {
                                    n4 = n11 + (n5 - 1) * n7 + i2 * n6;
                                    n3 = n9 + i3;
                                    int n21 = n10 + (n5 - 1) * n6 - i2 * n7;
                                    g2.b(n4, n3, n21);
                                    if (i3 < 0 && !this.a.n(g2).d().a() || i3 >= 0 && !this.a.c(g2)) continue block2;
                                }
                            }
                        }
                        double d5 = (double)n9 + 0.5 - n2.aV;
                        double d6 = d3 * d3 + d5 * d5 + d2 * d2;
                        if (!(d4 < 0.0) && !(d6 < d4)) continue;
                        d4 = d6;
                        n16 = n11;
                        n17 = n9;
                        n18 = n10;
                        n19 = n8 % 4;
                    }
                }
            }
        }
        if (d4 < 0.0) {
            for (n11 = n13 - 16; n11 <= n13 + 16; ++n11) {
                d3 = (double)n11 + 0.5 - n2.aU;
                for (n10 = n15 - 16; n10 <= n15 + 16; ++n10) {
                    d2 = (double)n10 + 0.5 - n2.aW;
                    block10: for (n9 = this.a.M() - 1; n9 >= 0; --n9) {
                        if (!this.a.c(g2.b(n11, n9, n10))) continue;
                        while (n9 > 0 && this.a.c(g2.b(n11, n9 - 1, n10))) {
                            --n9;
                        }
                        for (n8 = n20; n8 < n20 + 2; ++n8) {
                            n7 = n8 % 2;
                            n6 = 1 - n7;
                            for (int i4 = 0; i4 < 4; ++i4) {
                                for (n5 = -1; n5 < 4; ++n5) {
                                    int n22 = n11 + (i4 - 1) * n7;
                                    n4 = n9 + n5;
                                    n3 = n10 + (i4 - 1) * n6;
                                    g2.b(n22, n4, n3);
                                    if (n5 < 0 && !this.a.n(g2).d().a() || n5 >= 0 && !this.a.c(g2)) continue block10;
                                }
                            }
                            double d7 = (double)n9 + 0.5 - n2.aV;
                            double d8 = d3 * d3 + d7 * d7 + d2 * d2;
                            if (!(d4 < 0.0) && !(d8 < d4)) continue;
                            d4 = d8;
                            n16 = n11;
                            n17 = n9;
                            n18 = n10;
                            n19 = n8 % 2;
                        }
                    }
                }
            }
        }
        n11 = n16;
        int n23 = n17;
        int n24 = n18;
        n10 = n19 % 2;
        int n25 = 1 - n10;
        if (n19 % 4 >= 2) {
            n10 = -n10;
            n25 = -n25;
        }
        if (d4 < 0.0) {
            n23 = n17 = n.a(n17, 70, this.a.M() - 10);
            for (int i5 = -1; i5 <= 1; ++i5) {
                for (n9 = 1; n9 < 3; ++n9) {
                    for (n8 = -1; n8 < 3; ++n8) {
                        n7 = n11 + (n9 - 1) * n10 + i5 * n25;
                        n6 = n23 + n8;
                        int n26 = n24 + (n9 - 1) * n25 - i5 * n10;
                        n5 = n8 < 0 ? 1 : 0;
                        this.a.b(new net.minecraft.u.b.b(n7, n6, n26), n5 != 0 ? p.Z.v() : p.a.v());
                    }
                }
            }
        }
        b b2 = p.aY.v().a(hn.a, (Comparable)((Object)(n10 == 0 ? ae.c : ae.a)));
        for (n9 = 0; n9 < 4; ++n9) {
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n11 + (n8 - 1) * n10;
                    int n27 = n23 + n7;
                    n5 = n24 + (n8 - 1) * n25;
                    boolean bl2 = n8 == 0 || n8 == 3 || n7 == -1 || n7 == 3;
                    this.a.a(new net.minecraft.u.b.b(n6, n27, n5), bl2 ? p.Z.v() : b2, 2);
                }
            }
            for (n8 = 0; n8 < 4; ++n8) {
                for (n7 = -1; n7 < 4; ++n7) {
                    n6 = n11 + (n8 - 1) * n10;
                    int n28 = n23 + n7;
                    n5 = n24 + (n8 - 1) * n25;
                    net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(n6, n28, n5);
                    this.a.b(b3, this.a.n(b3).c());
                }
            }
        }
        return true;
    }

    public void a(long l2) {
        if (l2 % 100L == 0L) {
            long l3 = l2 - 300L;
            ad ad2 = this.c.c().a();
            while (ad2.hasNext()) {
                ac ac2 = (ac)ad2.next();
                if (ac2 != null && ac2.a >= l3) continue;
                ad2.remove();
            }
        }
    }
}

