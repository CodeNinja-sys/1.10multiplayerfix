/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Arrays;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.bw;
import net.minecraft.g.c.b;
import net.minecraft.g.eg;
import net.minecraft.g.gd;
import net.minecraft.g.hy;
import net.minecraft.g.ic;
import net.minecraft.m.cd;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.g;
import net.minecraft.q.b.q;
import net.minecraft.q.b.t;
import net.minecraft.q.f.e;
import net.minecraft.q.k;

public class aj
extends q {
    protected static final b a = net.minecraft.a.p.d.v().a(eg.a, (Comparable)((Object)ic.b));
    protected static final b b = net.minecraft.a.p.c.v();
    protected static final b c = net.minecraft.a.p.cz.v();
    protected static final b B = net.minecraft.a.p.cu.v();
    protected static final b C = B.a(bw.a, (Comparable)((Object)cd.b));
    protected static final b D = net.minecraft.a.p.m.v().a(gd.b, (Comparable)((Object)hy.b));
    private b[] E;
    private long F;
    private net.minecraft.q.g.b G;
    private net.minecraft.q.g.b H;
    private net.minecraft.q.g.b I;
    private final boolean J;
    private final boolean K;

    public aj(boolean bl2, boolean bl3, ab ab2) {
        super(ab2);
        this.J = bl2;
        this.K = bl3;
        this.y.clear();
        this.u = D;
        this.v = B;
        this.w.A = -999;
        this.w.E = 20;
        this.w.G = 3;
        this.w.H = 5;
        this.w.C = 0;
        this.y.clear();
        if (bl3) {
            this.w.A = 5;
        }
    }

    @Override
    protected t d() {
        return new g(this, null);
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return q;
    }

    @Override
    public int b(net.minecraft.u.b.b b2) {
        return 10387789;
    }

    @Override
    public int a(net.minecraft.u.b.b b2) {
        return 9470285;
    }

    @Override
    public void a(k k2, Random random, net.minecraft.u.b.b b2) {
        super.a(k2, random, b2);
    }

    @Override
    public void a(k k2, Random random, e e2, int n2, int n3, double d2) {
        int n4;
        int n5;
        if (this.E == null || this.F != k2.A()) {
            this.a(k2.A());
        }
        if (this.G == null || this.H == null || this.F != k2.A()) {
            Random random2 = new Random(this.F);
            this.G = new net.minecraft.q.g.b(random2, 4);
            this.H = new net.minecraft.q.g.b(random2, 1);
        }
        this.F = k2.A();
        double d3 = 0.0;
        if (this.J) {
            n5 = (n2 & 0xFFFFFFF0) + (n3 & 0xF);
            n4 = (n3 & 0xFFFFFFF0) + (n2 & 0xF);
            double d4 = Math.min(Math.abs(d2), this.G.a((double)n5 * 0.25, (double)n4 * 0.25));
            if (d4 > 0.0) {
                double d5 = 0.001953125;
                d3 = d4 * d4 * 2.5;
                double d6 = Math.abs(this.H.a((double)n5 * 0.001953125, (double)n4 * 0.001953125));
                double d7 = Math.ceil(d6 * 50.0) + 14.0;
                if (d3 > d7) {
                    d3 = d7;
                }
                d3 += 64.0;
            }
        }
        n5 = n2 & 0xF;
        n4 = n3 & 0xF;
        int n6 = k2.x();
        b b2 = B;
        b b3 = this.v;
        int n7 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl2 = Math.cos(d2 / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl3 = false;
        int n9 = 0;
        for (int i2 = 255; i2 >= 0; --i2) {
            if (e2.a(n4, i2, n5).d() == net.minecraft.g.a.h.a && i2 < (int)d3) {
                e2.a(n4, i2, n5, d);
            }
            if (i2 <= random.nextInt(5)) {
                e2.a(n4, i2, n5, f);
                continue;
            }
            if (n9 >= 15) continue;
            b b4 = e2.a(n4, i2, n5);
            if (b4.d() == net.minecraft.g.a.h.a) {
                n8 = -1;
                continue;
            }
            if (b4.c() != net.minecraft.a.p.b) continue;
            if (n8 == -1) {
                bl3 = false;
                if (n7 <= 0) {
                    b2 = e;
                    b3 = d;
                } else if (i2 >= n6 - 4 && i2 <= n6 + 1) {
                    b2 = B;
                    b3 = this.v;
                }
                if (i2 < n6 && (b2 == null || b2.d() == net.minecraft.g.a.h.a)) {
                    b2 = k;
                }
                n8 = n7 + Math.max(0, i2 - n6);
                if (i2 >= n6 - 1) {
                    if (this.K && i2 > 86 + n7 * 2) {
                        if (bl2) {
                            e2.a(n4, i2, n5, a);
                        } else {
                            e2.a(n4, i2, n5, b);
                        }
                    } else if (i2 > n6 + 3 + n7) {
                        b b5 = i2 >= 64 && i2 <= 127 ? (bl2 ? c : this.a(n2, i2, n3)) : C;
                        e2.a(n4, i2, n5, b5);
                    } else {
                        e2.a(n4, i2, n5, this.u);
                        bl3 = true;
                    }
                } else {
                    e2.a(n4, i2, n5, b3);
                    if (b3.c() == net.minecraft.a.p.cu) {
                        e2.a(n4, i2, n5, C);
                    }
                }
            } else if (n8 > 0) {
                --n8;
                if (bl3) {
                    e2.a(n4, i2, n5, C);
                } else {
                    e2.a(n4, i2, n5, this.a(n2, i2, n3));
                }
            }
            ++n9;
        }
    }

    private void a(long l2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        this.E = new b[64];
        Arrays.fill(this.E, c);
        Random random = new Random(l2);
        this.I = new net.minecraft.q.g.b(random, 1);
        for (n8 = 0; n8 < 64; ++n8) {
            if ((n8 += random.nextInt(5) + 1) >= 64) continue;
            this.E[n8] = C;
        }
        n8 = random.nextInt(4) + 2;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = random.nextInt(3) + 1;
            n5 = random.nextInt(64);
            for (n4 = 0; n5 + n4 < 64 && n4 < n6; ++n4) {
                this.E[n5 + n4] = B.a(bw.a, (Comparable)((Object)cd.e));
            }
        }
        n7 = random.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = random.nextInt(3) + 2;
            n4 = random.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.E[n4 + n3] = B.a(bw.a, (Comparable)((Object)cd.m));
            }
        }
        n6 = random.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = random.nextInt(3) + 1;
            n3 = random.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.E[n3 + n2] = B.a(bw.a, (Comparable)((Object)cd.o));
            }
        }
        n5 = random.nextInt(3) + 3;
        n4 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = 1;
            for (int i2 = 0; (n4 += random.nextInt(16) + 4) + i2 < 64 && i2 < 1; ++i2) {
                this.E[n4 + i2] = B.a(bw.a, (Comparable)((Object)cd.a));
                if (n4 + i2 > 1 && random.nextBoolean()) {
                    this.E[n4 + i2 - 1] = B.a(bw.a, (Comparable)((Object)cd.i));
                }
                if (n4 + i2 >= 63 || !random.nextBoolean()) continue;
                this.E[n4 + i2 + 1] = B.a(bw.a, (Comparable)((Object)cd.i));
            }
        }
    }

    private b a(int n2, int n3, int n4) {
        int n5 = (int)Math.round(this.I.a((double)n2 / 512.0, (double)n2 / 512.0) * 2.0);
        return this.E[(n3 + n5 + 64) % 64];
    }
}

