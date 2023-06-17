/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.u;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.r.d;
import net.minecraft.r.f;
import net.minecraft.r.j;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.l;
import net.minecraft.x.d.a.ah;
import net.minecraft.x.d.a.x;

public class g
extends cc
implements u {
    private static final int v = net.minecraft.r.j.a * 24 - 112;
    private static final int w = net.minecraft.r.j.b * 24 - 112;
    private static final int x = net.minecraft.r.j.c * 24 - 77;
    private static final int C = net.minecraft.r.j.d * 24 - 77;
    private static final bp D = new bp("textures/gui/achievement/achievement_background.png");
    protected cc b;
    protected int c = 256;
    protected int d = 202;
    protected int e;
    protected int f;
    protected float g = 1.0f;
    protected double h;
    protected double i;
    protected double j;
    protected double k;
    protected double l;
    protected double m;
    private int E;
    private final f F;
    private boolean G = true;

    public g(cc cc2, f f2) {
        this.b = cc2;
        this.F = f2;
        int n2 = 141;
        int n3 = 141;
        this.h = this.l = (double)(net.minecraft.r.j.f.a * 24 - 70 - 12);
        this.j = this.l;
        this.i = this.m = (double)(net.minecraft.r.j.f.b * 24 - 70);
        this.k = this.m;
    }

    @Override
    public void ct_() {
        this.n.v().a(new x(ah.b));
        this.r.clear();
        this.r.add(new cp(1, this.p / 2 + 24, this.q / 2 + 74, 80, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (!this.G && ch2.j == 1) {
            this.n.a(this.b);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == this.n.w.Z.j()) {
            this.n.a((cc)null);
            this.n.o();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.G) {
            this.m();
            this.a(this.u, net.minecraft.client.f.u.a("multiplayer.downloadingStats", new Object[0]), this.p / 2, this.q / 2, 0xFFFFFF);
            this.a(this.u, a[(int)(net.minecraft.client.r.I() / 150L % (long)a.length)], this.p / 2, this.q / 2 + this.u.a * 2, 0xFFFFFF);
        } else {
            int n4;
            if (org.lwjgl.a.j.a(0)) {
                n4 = (this.p - this.c) / 2;
                int n5 = (this.q - this.d) / 2;
                int n6 = n4 + 8;
                int n7 = n5 + 17;
                if ((this.E == 0 || this.E == 1) && n2 >= n6 && n2 < n6 + 224 && n3 >= n7 && n3 < n7 + 155) {
                    if (this.E == 0) {
                        this.E = 1;
                    } else {
                        this.j -= (double)((float)(n2 - this.e) * this.g);
                        this.k -= (double)((float)(n3 - this.f) * this.g);
                        this.h = this.j;
                        this.i = this.k;
                        this.l = this.j;
                        this.m = this.k;
                    }
                    this.e = n2;
                    this.f = n3;
                }
            } else {
                this.E = 0;
            }
            n4 = org.lwjgl.a.j.u();
            float f3 = this.g;
            if (n4 < 0) {
                this.g += 0.25f;
            } else if (n4 > 0) {
                this.g -= 0.25f;
            }
            this.g = net.minecraft.u.b.n.a(this.g, 1.0f, 2.0f);
            if (this.g != f3) {
                float f4 = f3 * (float)this.c;
                float f5 = f3 * (float)this.d;
                float f6 = this.g * (float)this.c;
                float f7 = this.g * (float)this.d;
                this.j -= (double)((f6 - f4) * 0.5f);
                this.k -= (double)((f7 - f5) * 0.5f);
                this.h = this.j;
                this.i = this.k;
                this.l = this.j;
                this.m = this.k;
            }
            if (this.l < (double)v) {
                this.l = v;
            }
            if (this.m < (double)w) {
                this.m = w;
            }
            if (this.l >= (double)x) {
                this.l = x - 1;
            }
            if (this.m >= (double)C) {
                this.m = C - 1;
            }
            this.m();
            this.b(n2, n3, f2);
            bd.f();
            bd.i();
            this.f();
            bd.e();
            bd.j();
        }
    }

    @Override
    public void d() {
        if (this.G) {
            this.G = false;
        }
    }

    @Override
    public void bY_() {
        if (!this.G) {
            this.h = this.j;
            this.i = this.k;
            double d2 = this.l - this.j;
            double d3 = this.m - this.k;
            if (d2 * d2 + d3 * d3 < 4.0) {
                this.j += d2;
                this.k += d3;
            } else {
                this.j += d2 * 0.85;
                this.k += d3 * 0.85;
            }
        }
    }

    protected void f() {
        int n2 = (this.p - this.c) / 2;
        int n3 = (this.q - this.d) / 2;
        this.u.a(net.minecraft.client.f.u.a("gui.achievements", new Object[0]), n2 + 15, n3 + 5, 0x404040);
    }

    protected void b(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        float f3;
        int n10 = net.minecraft.u.b.n.c(this.h + (this.j - this.h) * (double)f2);
        int n11 = net.minecraft.u.b.n.c(this.i + (this.k - this.i) * (double)f2);
        if (n10 < v) {
            n10 = v;
        }
        if (n11 < w) {
            n11 = w;
        }
        if (n10 >= x) {
            n10 = x - 1;
        }
        if (n11 >= C) {
            n11 = C - 1;
        }
        int n12 = (this.p - this.c) / 2;
        int n13 = (this.q - this.d) / 2;
        int n14 = n12 + 16;
        int n15 = n13 + 17;
        this.B = 0.0f;
        bd.c(518);
        bd.D();
        bd.c((float)n14, (float)n15, -200.0f);
        bd.b(1.0f / this.g, 1.0f / this.g, 0.0f);
        bd.v();
        bd.f();
        bd.A();
        bd.g();
        int n16 = n10 + 288 >> 4;
        int n17 = n11 + 288 >> 4;
        int n18 = (n10 + 288) % 16;
        int n19 = (n11 + 288) % 16;
        int n20 = 4;
        int n21 = 8;
        int n22 = 10;
        int n23 = 22;
        int n24 = 37;
        Random random = new Random();
        float f4 = 16.0f / this.g;
        float f5 = 16.0f / this.g;
        int n25 = 0;
        while ((float)n25 * f4 - (float)n19 < 155.0f) {
            f3 = 0.6f - (float)(n17 + n25) / 25.0f * 0.3f;
            bd.c(f3, f3, f3, 1.0f);
            n9 = 0;
            while ((float)n9 * f5 - (float)n18 < 224.0f) {
                random.setSeed(this.n.K().b().hashCode() + n16 + n9 + (n17 + n25) * 16);
                n8 = random.nextInt(1 + n17 + n25) + (n17 + n25) / 2;
                net.minecraft.client.g.a.d d2 = this.a(net.minecraft.a.p.m);
                if (n8 <= 37 && n17 + n25 != 35) {
                    if (n8 == 22) {
                        d2 = random.nextInt(2) == 0 ? this.a(net.minecraft.a.p.ag) : this.a(net.minecraft.a.p.aC);
                    } else if (n8 == 10) {
                        d2 = this.a(net.minecraft.a.p.p);
                    } else if (n8 == 8) {
                        d2 = this.a(net.minecraft.a.p.q);
                    } else if (n8 > 4) {
                        d2 = this.a(net.minecraft.a.p.b);
                    } else if (n8 > 0) {
                        d2 = this.a(net.minecraft.a.p.d);
                    }
                } else {
                    cn cn2 = net.minecraft.a.p.h;
                    d2 = this.a(cn2);
                }
                this.n.N().a(net.minecraft.client.g.a.f.b);
                this.a(n9 * 16 - n18, n25 * 16 - n19, d2, 16, 16);
                ++n9;
            }
            ++n25;
        }
        bd.j();
        bd.c(515);
        this.n.N().a(D);
        for (n25 = 0; n25 < net.minecraft.r.j.e.size(); ++n25) {
            d d3 = (d)net.minecraft.r.j.e.get(n25);
            if (d3.c == null) continue;
            n9 = d3.a * 24 - n10 + 11;
            n8 = d3.b * 24 - n11 + 11;
            int n26 = d3.c.a * 24 - n10 + 11;
            int n27 = d3.c.b * 24 - n11 + 11;
            n7 = this.F.a(d3) ? 1 : 0;
            n6 = this.F.b(d3);
            n5 = this.F.c(d3);
            if (n5 > 4) continue;
            n4 = -16777216;
            if (n7 != 0) {
                n4 = -6250336;
            } else if (n6 != 0) {
                n4 = -16711936;
            }
            this.a(n9, n26, n8, n4);
            this.b(n26, n8, n27, n4);
            if (n9 > n26) {
                this.a_(n9 - 11 - 7, n8 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n9 < n26) {
                this.a_(n9 + 11, n8 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n8 > n27) {
                this.a_(n9 - 5, n8 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n8 >= n27) continue;
            this.a_(n9 - 5, n8 + 11, 96, 241, 11, 7);
        }
        d d4 = null;
        f3 = (float)(n2 - n14) * this.g;
        float f6 = (float)(n3 - n15) * this.g;
        am.c();
        bd.f();
        bd.A();
        bd.g();
        for (n8 = 0; n8 < net.minecraft.r.j.e.size(); ++n8) {
            float f7;
            d d5 = (d)net.minecraft.r.j.e.get(n8);
            int n28 = d5.a * 24 - n10;
            n7 = d5.b * 24 - n11;
            if (n28 < -24 || n7 < -24 || !((float)n28 <= 224.0f * this.g) || !((float)n7 <= 155.0f * this.g)) continue;
            n6 = this.F.c(d5);
            if (this.F.a(d5)) {
                f7 = 0.75f;
                bd.c(0.75f, 0.75f, 0.75f, 1.0f);
            } else if (this.F.b(d5)) {
                f7 = 1.0f;
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            } else if (n6 < 3) {
                f7 = 0.3f;
                bd.c(0.3f, 0.3f, 0.3f, 1.0f);
            } else if (n6 == 3) {
                f7 = 0.2f;
                bd.c(0.2f, 0.2f, 0.2f, 1.0f);
            } else {
                if (n6 != 4) continue;
                f7 = 0.1f;
                bd.c(0.1f, 0.1f, 0.1f, 1.0f);
            }
            this.n.N().a(D);
            if (d5.g()) {
                this.a_(n28 - 2, n7 - 2, 26, 202, 26, 26);
            } else {
                this.a_(n28 - 2, n7 - 2, 0, 202, 26, 26);
            }
            if (!this.F.b(d5)) {
                f7 = 0.1f;
                bd.c(0.1f, 0.1f, 0.1f, 1.0f);
                this.o.a(false);
            }
            bd.e();
            bd.p();
            this.o.b(d5.d, n28 + 3, n7 + 3);
            bd.a(ad.l, bc.j);
            bd.f();
            if (!this.F.b(d5)) {
                this.o.a(true);
            }
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (!(f3 >= (float)n28) || !(f3 <= (float)(n28 + 22)) || !(f6 >= (float)n7) || !(f6 <= (float)(n7 + 22))) continue;
            d4 = d5;
        }
        bd.i();
        bd.l();
        bd.E();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(D);
        this.a_(n12, n13, 0, 0, this.c, this.d);
        this.B = 0.0f;
        bd.c(515);
        bd.i();
        bd.v();
        super.a(n2, n3, f2);
        if (d4 != null) {
            String string = d4.e().c();
            String string2 = d4.f();
            int n29 = n2 + 12;
            n7 = n3 - 4;
            n6 = this.F.c(d4);
            if (this.F.b(d4)) {
                n5 = Math.max(this.u.a(string), 120);
                n4 = this.u.b(string2, n5);
                if (this.F.a(d4)) {
                    n4 += 12;
                }
                this.b(n29 - 3, n7 - 3, n29 + n5 + 3, n7 + n4 + 3 + 12, -1073741824, -1073741824);
                this.u.a(string2, n29, n7 + 12, n5, -6250336);
                if (this.F.a(d4)) {
                    this.u.a(net.minecraft.client.f.u.a("achievement.taken", new Object[0]), (float)n29, (float)(n7 + n4 + 4), -7302913);
                }
            } else if (n6 == 3) {
                string = net.minecraft.client.f.u.a("achievement.unknown", new Object[0]);
                n5 = Math.max(this.u.a(string), 120);
                String string3 = new l("achievement.requires", d4.c.e()).c();
                int n30 = this.u.b(string3, n5);
                this.b(n29 - 3, n7 - 3, n29 + n5 + 3, n7 + n30 + 12 + 3, -1073741824, -1073741824);
                this.u.a(string3, n29, n7 + 12, n5, -9416624);
            } else if (n6 < 3) {
                n5 = Math.max(this.u.a(string), 120);
                String string4 = new l("achievement.requires", d4.c.e()).c();
                int n31 = this.u.b(string4, n5);
                this.b(n29 - 3, n7 - 3, n29 + n5 + 3, n7 + n31 + 12 + 3, -1073741824, -1073741824);
                this.u.a(string4, n29, n7 + 12, n5, -9416624);
            } else {
                string = null;
            }
            if (string != null) {
                this.u.a(string, (float)n29, (float)n7, this.F.b(d4) ? (d4.g() ? -128 : -1) : (d4.g() ? -8355776 : -8355712));
            }
        }
        bd.j();
        bd.e();
        am.a();
    }

    private net.minecraft.client.g.a.d a(cn cn2) {
        return net.minecraft.client.r.z().aa().a().a(cn2.v());
    }

    @Override
    public boolean cq_() {
        return !this.G;
    }
}

