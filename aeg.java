/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.lwjgl.a.j;

public class aeg
extends cjn
implements acn {
    private static final int r = bpa.a * 24 - 112;
    private static final int s = bpa.b * 24 - 112;
    private static final int t = bpa.c * 24 - 77;
    private static final int C = bpa.d * 24 - 77;
    private static final bpx D = new bpx("textures/gui/achievement/achievement_background.png");
    protected cjn b;
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
    private final cwj F;
    private boolean G = true;

    public aeg(cjn cjn2, cwj cwj2) {
        this.b = cjn2;
        this.F = cwj2;
        int n2 = 141;
        int n3 = 141;
        this.h = this.l = (double)(bpa.f.a * 24 - 70 - 12);
        this.j = this.l;
        this.i = this.m = (double)(bpa.f.b * 24 - 70);
        this.k = this.m;
    }

    @Override
    public void cH_() {
        this.u.x().a(new daq(cpl.b));
        this.y.clear();
        this.y.add(new bcy(1, this.w / 2 + 24, this.x / 2 + 74, 80, 20, bf.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (this.G) {
            return;
        }
        if (cwv2.j == 1) {
            this.u.a(this.b);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == this.u.u.Z.j()) {
            this.u.a((cjn)null);
            this.u.q();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.G) {
            this.aH_();
            this.a(this.B, bf.a("multiplayer.downloadingStats", new Object[0]), this.w / 2, this.x / 2, 0xFFFFFF);
            this.a(this.B, a[(int)(bxy.K() / 150L % (long)a.length)], this.w / 2, this.x / 2 + this.B.a * 2, 0xFFFFFF);
        } else {
            int n4;
            if (org.lwjgl.a.j.a(0)) {
                n4 = (this.w - this.c) / 2;
                int n5 = (this.x - this.d) / 2;
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
            this.g = cmk.a(this.g, 1.0f, 2.0f);
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
            if (this.l < (double)r) {
                this.l = r;
            }
            if (this.m < (double)s) {
                this.m = s;
            }
            if (this.l >= (double)t) {
                this.l = t - 1;
            }
            if (this.m >= (double)C) {
                this.m = C - 1;
            }
            this.aH_();
            this.b(n2, n3, f2);
            cja.f();
            cja.i();
            this.f();
            cja.e();
            cja.j();
        }
    }

    @Override
    public void c() {
        if (this.G) {
            this.G = false;
        }
    }

    @Override
    public void d() {
        if (this.G) {
            return;
        }
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

    protected void f() {
        int n2 = (this.w - this.c) / 2;
        int n3 = (this.x - this.d) / 2;
        this.B.a(bf.a("gui.achievements", new Object[0]), n2 + 15, n3 + 5, 0x404040);
    }

    protected void b(int n2, int n3, float f2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = cmk.c(this.h + (this.j - this.h) * (double)f2);
        int n10 = cmk.c(this.i + (this.k - this.i) * (double)f2);
        if (n9 < r) {
            n9 = r;
        }
        if (n10 < s) {
            n10 = s;
        }
        if (n9 >= t) {
            n9 = t - 1;
        }
        if (n10 >= C) {
            n10 = C - 1;
        }
        int n11 = (this.w - this.c) / 2;
        int n12 = (this.x - this.d) / 2;
        int n13 = n11 + 16;
        int n14 = n12 + 17;
        this.q = 0.0f;
        cja.c(518);
        cja.D();
        cja.c((float)n13, (float)n14, -200.0f);
        cja.b(1.0f / this.g, 1.0f / this.g, 0.0f);
        cja.v();
        cja.f();
        cja.A();
        cja.g();
        int n15 = n9 + 288 >> 4;
        int n16 = n10 + 288 >> 4;
        int n17 = (n9 + 288) % 16;
        int n18 = (n10 + 288) % 16;
        int n19 = 4;
        int n20 = 8;
        int n21 = 10;
        int n22 = 22;
        int n23 = 37;
        Random random = new Random();
        float f3 = 16.0f / this.g;
        float f4 = 16.0f / this.g;
        int n24 = 0;
        while ((float)n24 * f3 - (float)n18 < 155.0f) {
            float f5 = 0.6f - (float)(n16 + n24) / 25.0f * 0.3f;
            cja.c(f5, f5, f5, 1.0f);
            n8 = 0;
            while ((float)n8 * f4 - (float)n17 < 224.0f) {
                random.setSeed(this.u.M().b().hashCode() + n15 + n8 + (n16 + n24) * 16);
                n7 = random.nextInt(1 + n16 + n24) + (n16 + n24) / 2;
                ars ars2 = this.a(blg.m);
                if (n7 > 37 || n16 + n24 == 35) {
                    bfa bfa2 = blg.h;
                    ars2 = this.a(bfa2);
                } else if (n7 == 22) {
                    ars2 = random.nextInt(2) == 0 ? this.a(blg.ag) : this.a(blg.aC);
                } else if (n7 == 10) {
                    ars2 = this.a(blg.p);
                } else if (n7 == 8) {
                    ars2 = this.a(blg.q);
                } else if (n7 > 4) {
                    ars2 = this.a(blg.b);
                } else if (n7 > 0) {
                    ars2 = this.a(blg.d);
                }
                this.u.P().a(dam.g);
                this.a(n8 * 16 - n17, n24 * 16 - n18, ars2, 16, 16);
                ++n8;
            }
            ++n24;
        }
        cja.j();
        cja.c(515);
        this.u.P().a(D);
        for (n24 = 0; n24 < bpa.e.size(); ++n24) {
            box box2 = (box)bpa.e.get(n24);
            if (box2.c == null) continue;
            n8 = box2.a * 24 - n9 + 11;
            n7 = box2.b * 24 - n10 + 11;
            int n25 = box2.c.a * 24 - n9 + 11;
            int n26 = box2.c.b * 24 - n10 + 11;
            n6 = this.F.a(box2) ? 1 : 0;
            n5 = this.F.b(box2);
            int n27 = this.F.c(box2);
            if (n27 > 4) continue;
            n4 = -16777216;
            if (n6 != 0) {
                n4 = -6250336;
            } else if (n5 != 0) {
                n4 = -16711936;
            }
            this.a(n8, n25, n7, n4);
            this.b(n25, n7, n26, n4);
            if (n8 > n25) {
                this.c(n8 - 11 - 7, n7 - 5, 114, 234, 7, 11);
                continue;
            }
            if (n8 < n25) {
                this.c(n8 + 11, n7 - 5, 107, 234, 7, 11);
                continue;
            }
            if (n7 > n26) {
                this.c(n8 - 5, n7 - 11 - 7, 96, 234, 11, 7);
                continue;
            }
            if (n7 >= n26) continue;
            this.c(n8 - 5, n7 + 11, 96, 241, 11, 7);
        }
        box box3 = null;
        float f6 = (float)(n2 - n13) * this.g;
        float f7 = (float)(n3 - n14) * this.g;
        bjr.c();
        cja.f();
        cja.A();
        cja.g();
        for (n7 = 0; n7 < bpa.e.size(); ++n7) {
            float f8;
            box box4 = (box)bpa.e.get(n7);
            int n28 = box4.a * 24 - n9;
            n6 = box4.b * 24 - n10;
            if (n28 < -24 || n6 < -24 || !((float)n28 <= 224.0f * this.g) || !((float)n6 <= 155.0f * this.g)) continue;
            n5 = this.F.c(box4);
            if (this.F.a(box4)) {
                f8 = 0.75f;
                cja.c(0.75f, 0.75f, 0.75f, 1.0f);
            } else if (this.F.b(box4)) {
                f8 = 1.0f;
                cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            } else if (n5 < 3) {
                f8 = 0.3f;
                cja.c(0.3f, 0.3f, 0.3f, 1.0f);
            } else if (n5 == 3) {
                f8 = 0.2f;
                cja.c(0.2f, 0.2f, 0.2f, 1.0f);
            } else {
                if (n5 != 4) continue;
                f8 = 0.1f;
                cja.c(0.1f, 0.1f, 0.1f, 1.0f);
            }
            this.u.P().a(D);
            if (box4.h()) {
                this.c(n28 - 2, n6 - 2, 26, 202, 26, 26);
            } else {
                this.c(n28 - 2, n6 - 2, 0, 202, 26, 26);
            }
            if (!this.F.b(box4)) {
                f8 = 0.1f;
                cja.c(0.1f, 0.1f, 0.1f, 1.0f);
                this.v.a(false);
            }
            cja.e();
            cja.p();
            this.v.b(box4.d, n28 + 3, n6 + 3);
            cja.a(bjt.l, afi.j);
            cja.f();
            if (!this.F.b(box4)) {
                this.v.a(true);
            }
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (!(f6 >= (float)n28) || !(f6 <= (float)(n28 + 22)) || !(f7 >= (float)n6) || !(f7 <= (float)(n6 + 22))) continue;
            box3 = box4;
        }
        cja.i();
        cja.l();
        cja.E();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(D);
        this.c(n11, n12, 0, 0, this.c, this.d);
        this.q = 0.0f;
        cja.c(515);
        cja.i();
        cja.v();
        super.a(n2, n3, f2);
        if (box3 != null) {
            String string = box3.f().i();
            String string2 = box3.g();
            int n29 = n2 + 12;
            n6 = n3 - 4;
            n5 = this.F.c(box3);
            if (this.F.b(box3)) {
                int n30 = Math.max(this.B.a(string), 120);
                n4 = this.B.b(string2, n30);
                if (this.F.a(box3)) {
                    n4 += 12;
                }
                this.b(n29 - 3, n6 - 3, n29 + n30 + 3, n6 + n4 + 3 + 12, -1073741824, -1073741824);
                this.B.a(string2, n29, n6 + 12, n30, -6250336);
                if (this.F.a(box3)) {
                    this.B.a(bf.a("achievement.taken", new Object[0]), (float)n29, (float)(n6 + n4 + 4), -7302913);
                }
            } else if (n5 == 3) {
                string = bf.a("achievement.unknown", new Object[0]);
                int n31 = Math.max(this.B.a(string), 120);
                String string3 = new du("achievement.requires", box3.c.f()).i();
                int n32 = this.B.b(string3, n31);
                this.b(n29 - 3, n6 - 3, n29 + n31 + 3, n6 + n32 + 12 + 3, -1073741824, -1073741824);
                this.B.a(string3, n29, n6 + 12, n31, -9416624);
            } else if (n5 < 3) {
                int n33 = Math.max(this.B.a(string), 120);
                String string4 = new du("achievement.requires", box3.c.f()).i();
                int n34 = this.B.b(string4, n33);
                this.b(n29 - 3, n6 - 3, n29 + n33 + 3, n6 + n34 + 12 + 3, -1073741824, -1073741824);
                this.B.a(string4, n29, n6 + 12, n33, -9416624);
            } else {
                string = null;
            }
            if (string != null) {
                this.B.a(string, (float)n29, (float)n6, this.F.b(box3) ? (box3.h() ? -128 : -1) : (box3.h() ? -8355776 : -8355712));
            }
        }
        cja.j();
        cja.e();
        bjr.a();
    }

    private ars a(bfa bfa2) {
        return bxy.B().ac().a().a(bfa2.s());
    }

    @Override
    public boolean q_() {
        return !this.G;
    }
}

