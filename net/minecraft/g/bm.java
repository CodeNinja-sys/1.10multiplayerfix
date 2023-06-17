/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fk;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.aj;
import net.minecraft.u.b.g;
import net.minecraft.v.d;

public abstract class bm
extends cn {
    public static final c b = net.minecraft.g.b.c.b("decayable");
    public static final c c = net.minecraft.g.b.c.b("check_decay");
    protected boolean d;
    int[] e;

    public bm() {
        super(h.j);
        this.b(true);
        this.a(net.minecraft.v.d.c);
        this.c(0.2f);
        this.f(1);
        this.a(fk.c);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        int n2;
        int n3;
        boolean bl2 = true;
        int n4 = 2;
        int n5 = b2.cy_();
        if (k2.a(new net.minecraft.u.b.b(n5 - 2, (n3 = b2.k()) - 2, (n2 = b2.l()) - 2), new net.minecraft.u.b.b(n5 + 2, n3 + 2, n2 + 2))) {
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    for (int i4 = -1; i4 <= 1; ++i4) {
                        net.minecraft.u.b.b b4 = b2.a(i2, i3, i4);
                        b b5 = k2.n(b4);
                        if (b5.d() != h.j || ((Boolean)b5.a(c)).booleanValue()) continue;
                        k2.a(b4, b5.a(c, Boolean.valueOf(true)), 4);
                    }
                }
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C && ((Boolean)b3.a(c)).booleanValue() && ((Boolean)b3.a(b)).booleanValue()) {
            int n2;
            int n3 = 4;
            int n4 = 5;
            int n5 = b2.cy_();
            int n6 = b2.k();
            int n7 = b2.l();
            int n8 = 32;
            int n9 = 1024;
            int n10 = 16;
            if (this.e == null) {
                this.e = new int[32768];
            }
            if (k2.a(new net.minecraft.u.b.b(n5 - 5, n6 - 5, n7 - 5), new net.minecraft.u.b.b(n5 + 5, n6 + 5, n7 + 5))) {
                int n11;
                int n12;
                int n13;
                g g2 = new g();
                for (n13 = -4; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            b b4 = k2.n(g2.b(n5 + n13, n6 + n12, n7 + n11));
                            cn cn2 = b4.c();
                            if (cn2 != p.r && cn2 != p.s) {
                                if (b4.d() == h.j) {
                                    this.e[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = -2;
                                    continue;
                                }
                                this.e[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = -1;
                                continue;
                            }
                            this.e[(n13 + 16) * 1024 + (n12 + 16) * 32 + n11 + 16] = 0;
                        }
                    }
                }
                for (n13 = 1; n13 <= 4; ++n13) {
                    for (n12 = -4; n12 <= 4; ++n12) {
                        for (n11 = -4; n11 <= 4; ++n11) {
                            for (int i2 = -4; i2 <= 4; ++i2) {
                                if (this.e[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16] != n13 - 1) continue;
                                if (this.e[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.e[(n12 + 16 - 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.e[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] == -2) {
                                    this.e[(n12 + 16 + 1) * 1024 + (n11 + 16) * 32 + i2 + 16] = n13;
                                }
                                if (this.e[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] == -2) {
                                    this.e[(n12 + 16) * 1024 + (n11 + 16 - 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.e[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] == -2) {
                                    this.e[(n12 + 16) * 1024 + (n11 + 16 + 1) * 32 + i2 + 16] = n13;
                                }
                                if (this.e[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] == -2) {
                                    this.e[(n12 + 16) * 1024 + (n11 + 16) * 32 + (i2 + 16 - 1)] = n13;
                                }
                                if (this.e[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] != -2) continue;
                                this.e[(n12 + 16) * 1024 + (n11 + 16) * 32 + i2 + 16 + 1] = n13;
                            }
                        }
                    }
                }
            }
            if ((n2 = this.e[16912]) >= 0) {
                k2.a(b2, b3.a(c, Boolean.valueOf(false)), 4);
            } else {
                this.c(k2, b2);
            }
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        if (k2.A(b3.b()) && !k2.n(b3.c()).t() && random.nextInt(15) == 1) {
            double d2 = (float)b3.cy_() + random.nextFloat();
            double d3 = (double)b3.k() - 0.05;
            double d4 = (float)b3.l() + random.nextFloat();
            k2.a(aj.s, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        this.b(k2, b2, k2.n(b2), 0);
        k2.f(b2);
    }

    @Override
    public int a(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(p.g);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        if (!k2.C) {
            int n3 = this.i(b3);
            if (n2 > 0 && (n3 -= 2 << n2) < 10) {
                n3 = 10;
            }
            if (k2.p.nextInt(n3) == 0) {
                cg cg2 = this.a(b3, k2.p, n2);
                bm.a(k2, b2, new cu(cg2, 1, this.k(b3)));
            }
            n3 = 200;
            if (n2 > 0 && (n3 -= 10 << n2) < 40) {
                n3 = 40;
            }
            this.a(k2, b2, b3, n3);
        }
    }

    protected void a(k k2, net.minecraft.u.b.b b2, b b3, int n2) {
    }

    protected int i(b b2) {
        return 20;
    }

    @Override
    public boolean d(b b2) {
        return !this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return this.d ? net.minecraft.u.c.b : net.minecraft.u.c.a;
    }

    @Override
    public boolean bT_() {
        return false;
    }

    public abstract net.minecraft.g.b b(int var1);

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return !this.d && n2.n(b3.a(ad2)).c() == this ? false : super.a(b2, n2, b3, ad2);
    }
}

