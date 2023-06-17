/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.q;
import net.minecraft.f.ar;
import net.minecraft.g.cn;
import net.minecraft.h.aq;
import net.minecraft.h.av;
import net.minecraft.h.c;
import net.minecraft.h.h;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.ac;
import net.minecraft.m.bd;
import net.minecraft.m.ca;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.a.b.e;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.b.n;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class aa
extends ar
implements c,
aw {
    private static final int[] a = new int[1];
    private static final int[] b = new int[]{2, 1};
    private static final int[] c = new int[]{1};
    private cu[] d = new cu[3];
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;

    @Override
    public int e() {
        return this.d.length;
    }

    @Override
    public cu a(int n2) {
        return this.d[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        return v.a(this.d, n2, n3);
    }

    @Override
    public cu b(int n2) {
        return v.a(this.d, n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        boolean bl2 = cu2 != null && cu2.a(this.d[n2]) && cu.a(cu2, this.d[n2]);
        this.d[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
        if (n2 == 0 && !bl2) {
            this.h = this.a(cu2);
            this.g = 0;
            this.C();
        }
    }

    @Override
    public String X() {
        return this.bO_() ? this.i : "container.furnace";
    }

    @Override
    public boolean bO_() {
        return this.i != null && !this.i.isEmpty();
    }

    public void a(String string) {
        this.i = string;
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (net.minecraft.u.a.e)new e("Furnace", new String[]{"Items"}));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        q q2 = e2.c("Items", 10);
        this.d = new cu[this.e()];
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            net.minecraft.e.e e3 = q2.b(i2);
            byte by2 = e3.f("Slot");
            if (by2 < 0 || by2 >= this.d.length) continue;
            this.d[by2] = cu.a(e3);
        }
        this.e = e2.g("BurnTime");
        this.g = e2.g("CookTime");
        this.h = e2.g("CookTimeTotal");
        this.f = aa.b(this.d[1]);
        if (e2.b("CustomName", 8)) {
            this.i = e2.l("CustomName");
        }
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("BurnTime", (short)this.e);
        e2.a("CookTime", (short)this.g);
        e2.a("CookTimeTotal", (short)this.h);
        q q2 = new q();
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2] == null) continue;
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            e3.a("Slot", (byte)i2);
            this.d[i2].b(e3);
            q2.a(e3);
        }
        e2.a("Items", q2);
        if (this.bO_()) {
            e2.a("CustomName", this.i);
        }
        return e2;
    }

    @Override
    public int g() {
        return 64;
    }

    public boolean k() {
        return this.e > 0;
    }

    public static boolean a(y y2) {
        return y2.c(0) > 0;
    }

    @Override
    public void a() {
        boolean bl2 = this.k();
        boolean bl3 = false;
        if (this.k()) {
            --this.e;
        }
        if (!this.k.C) {
            if (this.k() || this.d[1] != null && this.d[0] != null) {
                if (!this.k() && this.o()) {
                    this.f = this.e = aa.b(this.d[1]);
                    if (this.k()) {
                        bl3 = true;
                        if (this.d[1] != null) {
                            --this.d[1].b;
                            if (this.d[1].b == 0) {
                                cg cg2 = this.d[1].a().p();
                                cu cu2 = this.d[1] = cg2 != null ? new cu(cg2) : null;
                            }
                        }
                    }
                }
                if (this.k() && this.o()) {
                    ++this.g;
                    if (this.g == this.h) {
                        this.g = 0;
                        this.h = this.a(this.d[0]);
                        this.n();
                        bl3 = true;
                    }
                } else {
                    this.g = 0;
                }
            } else if (!this.k() && this.g > 0) {
                this.g = net.minecraft.u.b.n.a(this.g - 2, 0, this.h);
            }
            if (bl2 != this.k()) {
                bl3 = true;
                net.minecraft.g.e.a(this.k(), this.k, this.l);
            }
        }
        if (bl3) {
            this.C();
        }
    }

    public int a(cu cu2) {
        return 200;
    }

    private boolean o() {
        if (this.d[0] == null) {
            return false;
        }
        cu cu2 = net.minecraft.m.a.w.a().a(this.d[0]);
        return cu2 == null ? false : (this.d[2] == null ? true : (!this.d[2].a(cu2) ? false : (this.d[2].b < this.g() && this.d[2].b < this.d[2].b() ? true : this.d[2].b < cu2.b())));
    }

    public void n() {
        if (this.o()) {
            cu cu2 = net.minecraft.m.a.w.a().a(this.d[0]);
            if (this.d[2] == null) {
                this.d[2] = cu2.j();
            } else if (this.d[2].a() == cu2.a()) {
                ++this.d[2].b;
            }
            if (this.d[0].a() == cg.a(p.v) && this.d[0].h() == 1 && this.d[1] != null && this.d[1].a() == w.ay) {
                this.d[1] = new cu(w.az);
            }
            --this.d[0].b;
            if (this.d[0].b <= 0) {
                this.d[0] = null;
            }
        }
    }

    public static int b(cu cu2) {
        if (cu2 == null) {
            return 0;
        }
        cg cg2 = cu2.a();
        if (cg2 instanceof net.minecraft.m.ar && cn.a(cg2) != p.a) {
            cn cn2 = cn.a(cg2);
            if (cn2 == p.bM) {
                return 150;
            }
            if (cn2.v().d() == net.minecraft.g.a.h.d) {
                return 300;
            }
            if (cn2 == p.cA) {
                return 16000;
            }
        }
        return cg2 instanceof bd && "WOOD".equals(((bd)cg2).g()) ? 200 : (cg2 instanceof ca && "WOOD".equals(((ca)cg2).g()) ? 200 : (cg2 instanceof ac && "WOOD".equals(((ac)cg2).d()) ? 200 : (cg2 == w.A ? 100 : (cg2 == w.j ? 1600 : (cg2 == w.aA ? 20000 : (cg2 == cg.a(p.g) ? 100 : (cg2 == w.bC ? 2400 : 0)))))));
    }

    public static boolean c(cu cu2) {
        return aa.b(cu2) > 0;
    }

    @Override
    public boolean a_(b b2) {
        return this.k.q(this.l) != this ? false : b2.h((double)this.l.cy_() + 0.5, (double)this.l.k() + 0.5, (double)this.l.l() + 0.5) <= 64.0;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        if (n2 == 2) {
            return false;
        }
        if (n2 != 1) {
            return true;
        }
        cu cu3 = this.d[1];
        return aa.c(cu2) || av.b(cu2) && (cu3 == null || cu3.a() != w.ay);
    }

    @Override
    public int[] a(ad ad2) {
        return ad2 == ad.a ? b : (ad2 == ad.b ? a : c);
    }

    @Override
    public boolean a(int n2, cu cu2, ad ad2) {
        return this.b(n2, cu2);
    }

    @Override
    public boolean b(int n2, cu cu2, ad ad2) {
        cg cg2;
        return ad2 != ad.a || n2 != 1 || (cg2 = cu2.a()) == w.az || cg2 == w.ay;
    }

    @Override
    public String h() {
        return "minecraft:furnace";
    }

    @Override
    public aq a(a a2, b b2) {
        return new h(a2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.e;
            }
            case 1: {
                return this.f;
            }
            case 2: {
                return this.g;
            }
            case 3: {
                return this.h;
            }
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.e = n3;
                break;
            }
            case 1: {
                this.f = n3;
                break;
            }
            case 2: {
                this.g = n3;
                break;
            }
            case 3: {
                this.h = n3;
            }
        }
    }

    @Override
    public int i() {
        return 4;
    }

    @Override
    public void j() {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = null;
        }
    }
}

