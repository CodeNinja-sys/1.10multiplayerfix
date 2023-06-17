/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.a.g;
import org.lwjgl.a.j;

public class ans
extends r {
    private static final bpx i = new bpx("textures/gui/container/creative_inventory/tabs.png");
    private static final al j = new al("tmp", true, 45);
    private static int k = zm.b.b();
    private float l;
    private boolean m;
    private boolean r;
    private cld s;
    private List t;
    private ux C;
    private boolean D;
    private cov E;

    public ans(bdl bdl2) {
        super(new acd(bdl2));
        bdl2.p = this.d;
        this.A = true;
        this.c = 136;
        this.b = 195;
    }

    @Override
    public void d() {
        if (!this.u.c.h()) {
            this.u.a(new nv(this.u.h));
        }
    }

    @Override
    protected void a(ux ux2, int n2, int n3, aao aao2) {
        this.D = true;
        boolean bl2 = aao2 == aao.b;
        aao aao3 = aao2 = n2 == -999 && aao2 == aao.a ? aao.e : aao2;
        if (ux2 != null || k == zm.m.b() || aao2 == aao.f) {
            if (ux2 == this.C && bl2) {
                for (int i2 = 0; i2 < this.u.h.o.c().size(); ++i2) {
                    this.u.c.a(null, i2);
                }
            } else if (k == zm.m.b()) {
                if (ux2 == this.C) {
                    this.u.h.n.e(null);
                } else if (aao2 == aao.e && ux2 != null && ux2.b()) {
                    bhl bhl2 = ux2.a(n3 == 0 ? 1 : ux2.a().b());
                    this.u.h.a(bhl2, true);
                    this.u.c.a(bhl2);
                } else if (aao2 == aao.e && this.u.h.n.n() != null) {
                    this.u.h.a(this.u.h.n.n(), true);
                    this.u.c.a(this.u.h.n.n());
                    this.u.h.n.e(null);
                } else {
                    this.u.h.o.a(ux2 == null ? n2 : ec.a((ec)((ec)ux2)).d, n3, aao2, (bdl)this.u.h);
                    this.u.h.o.a();
                }
            } else if (aao2 != aao.f && ux2.c == j) {
                cps cps2 = this.u.h.n;
                bhl bhl3 = cps2.n();
                bhl bhl4 = ux2.a();
                if (aao2 == aao.c) {
                    if (bhl4 != null && n3 >= 0 && n3 < 9) {
                        bhl bhl5 = bhl4.j();
                        bhl5.b = bhl5.b();
                        this.u.h.n.a(n3, bhl5);
                        this.u.h.o.a();
                    }
                    return;
                }
                if (aao2 == aao.d) {
                    if (cps2.n() == null && ux2.b()) {
                        bhl bhl6 = ux2.a().j();
                        bhl6.b = bhl6.b();
                        cps2.e(bhl6);
                    }
                    return;
                }
                if (aao2 == aao.e) {
                    if (bhl4 != null) {
                        bhl bhl7 = bhl4.j();
                        bhl7.b = n3 == 0 ? 1 : bhl7.b();
                        this.u.h.a(bhl7, true);
                        this.u.c.a(bhl7);
                    }
                    return;
                }
                if (bhl3 != null && bhl4 != null && bhl3.a(bhl4) && bhl.a(bhl3, bhl4)) {
                    if (n3 == 0) {
                        if (bl2) {
                            bhl3.b = bhl3.b();
                        } else if (bhl3.b < bhl3.b()) {
                            ++bhl3.b;
                        }
                    } else if (bhl3.b <= 1) {
                        cps2.e(null);
                    } else {
                        --bhl3.b;
                    }
                } else if (bhl4 == null || bhl3 != null) {
                    cps2.e(null);
                } else {
                    cps2.e(bhl.c(bhl4));
                    bhl3 = cps2.n();
                    if (bl2) {
                        bhl3.b = bhl3.b();
                    }
                }
            } else {
                this.d.a(ux2 == null ? n2 : ux2.d, n3, aao2, (bdl)this.u.h);
                if (apq.c(n3) == 2) {
                    for (int i3 = 0; i3 < 9; ++i3) {
                        this.u.c.a(this.d.a(45 + i3).a(), 36 + i3);
                    }
                } else if (ux2 != null) {
                    bhl bhl8 = this.d.a(ux2.d).a();
                    this.u.c.a(bhl8, ux2.d - this.d.g.size() + 9 + 36);
                }
            }
        } else {
            cps cps3 = this.u.h.n;
            if (cps3.n() != null) {
                if (n3 == 0) {
                    this.u.h.a(cps3.n(), true);
                    this.u.c.a(cps3.n());
                    cps3.e(null);
                }
                if (n3 == 1) {
                    bhl bhl9 = cps3.n().a(1);
                    this.u.h.a(bhl9, true);
                    this.u.c.a(bhl9);
                    if (cps3.n().b == 0) {
                        cps3.e(null);
                    }
                }
            }
        }
    }

    @Override
    protected void b() {
        int n2 = this.e;
        super.b();
        if (this.s != null && this.e != n2) {
            this.s.a = this.e + 82;
        }
    }

    @Override
    public void cH_() {
        if (this.u.c.h()) {
            super.cH_();
            this.y.clear();
            org.lwjgl.a.g.a(true);
            this.s = new cld(0, this.B, this.e + 82, this.f + 6, 89, this.B.a);
            this.s.f(15);
            this.s.a(false);
            this.s.e(false);
            this.s.g(0xFFFFFF);
            int n2 = k;
            k = -1;
            this.b(zm.a[n2]);
            this.E = new cov(this.u);
            this.u.h.o.b(this.E);
        } else {
            this.u.a(new nv(this.u.h));
        }
    }

    @Override
    public void aG_() {
        super.aG_();
        if (this.u.h != null && this.u.h.n != null) {
            this.u.h.o.c(this.E);
        }
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(char c2, int n2) {
        if (k != zm.g.b()) {
            if (cmx.a(this.u.u.af)) {
                this.b(zm.g);
            } else {
                super.a(c2, n2);
            }
            return;
        }
        if (this.D) {
            this.D = false;
            this.s.a("");
        }
        if (this.a(n2)) {
            return;
        }
        if (this.s.a(c2, n2)) {
            this.h();
        } else {
            super.a(c2, n2);
        }
    }

    private void h() {
        Object object2;
        acd acd2 = (acd)this.d;
        acd2.a.clear();
        for (Object object2 : azg.g) {
            if (object2 == null || ((azg)object2).b() == null) continue;
            ((azg)object2).a((azg)object2, null, acd2.a);
        }
        for (Object object2 : dad.b) {
            if (object2 == null || ((dad)object2).c == null) continue;
            hp.cn.a((dad)object2, acd2.a);
        }
        Iterator iterator = acd2.a.iterator();
        object2 = this.s.b().toLowerCase();
        while (iterator.hasNext()) {
            bhl bhl2 = (bhl)iterator.next();
            boolean bl2 = false;
            for (String string : bhl2.a(this.u.h, this.u.u.y)) {
                if (!aug.a(string).toLowerCase().contains((CharSequence)object2)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            iterator.remove();
        }
        this.l = 0.0f;
        acd2.a(0.0f);
    }

    @Override
    protected void a(int n2, int n3) {
        zm zm2 = zm.a[k];
        if (zm2.h()) {
            cja.k();
            this.B.a(bf.a(zm2.d(), new Object[0]), 8, 6, 0x404040);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.e;
            int n6 = n3 - this.f;
            for (zm zm2 : zm.a) {
                if (!this.a(zm2, n5, n6)) continue;
                return;
            }
        }
        super.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.e;
            int n6 = n3 - this.f;
            for (zm zm2 : zm.a) {
                if (!this.a(zm2, n5, n6)) continue;
                this.b(zm2);
                return;
            }
        }
        super.b(n2, n3, n4);
    }

    private boolean i() {
        return k != zm.m.b() && zm.a[k].j() && ((acd)this.d).b();
    }

    private void b(zm zm2) {
        int n2 = k;
        k = zm2.b();
        acd acd2 = (acd)this.d;
        this.g.clear();
        acd2.a.clear();
        zm2.a(acd2.a);
        if (zm2 == zm.m) {
            apq apq2 = this.u.h.o;
            if (this.t == null) {
                this.t = acd2.g;
            }
            acd2.g = ov.a();
            for (int i2 = 0; i2 < apq2.g.size(); ++i2) {
                int n3;
                int n4;
                int n5;
                ec ec2 = new ec(this, (ux)apq2.g.get(i2), i2);
                acd2.g.add(ec2);
                if (i2 >= 5 && i2 < 9) {
                    n5 = i2 - 5;
                    n4 = n5 / 2;
                    n3 = n5 % 2;
                    ec2.e = 54 + n4 * 54;
                    ec2.f = 6 + n3 * 27;
                    continue;
                }
                if (i2 >= 0 && i2 < 5) {
                    ec2.e = -2000;
                    ec2.f = -2000;
                    continue;
                }
                if (i2 == 45) {
                    ec2.e = 35;
                    ec2.f = 20;
                    continue;
                }
                if (i2 >= apq2.g.size()) continue;
                n5 = i2 - 9;
                n4 = n5 % 9;
                n3 = n5 / 9;
                ec2.e = 9 + n4 * 18;
                ec2.f = i2 >= 36 ? 112 : 54 + n3 * 18;
            }
            this.C = new ux(j, 0, 173, 112);
            acd2.g.add(this.C);
        } else if (n2 == zm.m.b()) {
            acd2.g = this.t;
            this.t = null;
        }
        if (this.s != null) {
            if (zm2 == zm.g) {
                this.s.e(true);
                this.s.d(false);
                this.s.b(true);
                this.s.a("");
                this.h();
            } else {
                this.s.e(false);
                this.s.d(true);
                this.s.b(false);
            }
        }
        this.l = 0.0f;
        acd2.a(0.0f);
    }

    @Override
    public void p_() {
        super.p_();
        int n2 = org.lwjgl.a.j.o();
        if (n2 != 0 && this.i()) {
            int n3 = (((acd)this.d).a.size() + 9 - 1) / 9 - 5;
            if (n2 > 0) {
                n2 = 1;
            }
            if (n2 < 0) {
                n2 = -1;
            }
            this.l = (float)((double)this.l - (double)n2 / (double)n3);
            this.l = cmk.a(this.l, 0.0f, 1.0f);
            ((acd)this.d).a(this.l);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        boolean bl2 = org.lwjgl.a.j.a(0);
        int n4 = this.e;
        int n5 = this.f;
        int n6 = n4 + 175;
        int n7 = n5 + 18;
        int n8 = n6 + 14;
        int n9 = n7 + 112;
        if (!this.r && bl2 && n2 >= n6 && n3 >= n7 && n2 < n8 && n3 < n9) {
            this.m = this.i();
        }
        if (!bl2) {
            this.m = false;
        }
        this.r = bl2;
        if (this.m) {
            this.l = ((float)(n3 - n7) - 7.5f) / ((float)(n9 - n7) - 15.0f);
            this.l = cmk.a(this.l, 0.0f, 1.0f);
            ((acd)this.d).a(this.l);
        }
        super.a(n2, n3, f2);
        for (zm zm2 : zm.a) {
            if (this.b(zm2, n2, n3)) break;
        }
        if (this.C != null && k == zm.m.b() && this.a(this.C.e, this.C.f, 16, 16, n2, n3)) {
            this.a(bf.a("inventory.binSlot", new Object[0]), n2, n3);
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.f();
    }

    @Override
    protected void a(bhl bhl2, int n2, int n3) {
        if (k == zm.g.b()) {
            Map map;
            List list = bhl2.a(this.u.h, this.u.u.y);
            zm zm2 = bhl2.a().b();
            if (zm2 == null && bhl2.a() == hp.cn && (map = acz.a(bhl2)).size() == 1) {
                dad dad2 = (dad)map.keySet().iterator().next();
                for (zm zm3 : zm.a) {
                    if (!zm3.a(dad2.c)) continue;
                    zm2 = zm3;
                    break;
                }
            }
            if (zm2 != null) {
                list.add(1, "" + (Object)((Object)aug.r) + (Object)((Object)aug.j) + bf.a(zm2.d(), new Object[0]));
            }
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (i2 == 0) {
                    list.set(i2, (Object)((Object)bhl2.u().e) + (String)list.get(i2));
                    continue;
                }
                list.set(i2, (Object)((Object)aug.h) + (String)list.get(i2));
            }
            this.a(list, n2, n3);
        } else {
            super.a(bhl2, n2, n3);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        bjr.c();
        zm zm2 = zm.a[k];
        for (zm zm3 : zm.a) {
            this.u.P().a(i);
            if (zm3.b() == k) continue;
            this.a(zm3);
        }
        this.u.P().a(new bpx("textures/gui/container/creative_inventory/tab_" + zm2.g()));
        this.c(this.e, this.f, 0, 0, this.b, this.c);
        this.s.g();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = this.e + 175;
        int n5 = this.f + 18;
        int n6 = n5 + 112;
        this.u.P().a(i);
        if (zm2.j()) {
            this.c(n4, n5 + (int)((float)(n6 - n5 - 17) * this.l), 232 + (this.i() ? 0 : 12), 0, 12, 15);
        }
        this.a(zm2);
        if (zm2 == zm.m) {
            nv.a(this.e + 88, this.f + 45, 20, this.e + 88 - n2, this.f + 45 - 30 - n3, this.u.h);
        }
    }

    protected boolean a(zm zm2, int n2, int n3) {
        int n4 = zm2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.b - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = zm2.m() ? (n6 -= 32) : (n6 += this.c);
        return n2 >= n5 && n2 <= n5 + 28 && n3 >= n6 && n3 <= n6 + 32;
    }

    protected boolean b(zm zm2, int n2, int n3) {
        int n4 = zm2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.b - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = zm2.m() ? (n6 -= 32) : (n6 += this.c);
        if (this.a(n5 + 3, n6 + 3, 23, 27, n2, n3)) {
            this.a(bf.a(zm2.d(), new Object[0]), n2, n3);
            return true;
        }
        return false;
    }

    protected void a(zm zm2) {
        boolean bl2 = zm2.b() == k;
        boolean bl3 = zm2.m();
        int n2 = zm2.l();
        int n3 = n2 * 28;
        int n4 = 0;
        int n5 = this.e + 28 * n2;
        int n6 = this.f;
        int n7 = 32;
        if (bl2) {
            n4 += 32;
        }
        if (n2 == 5) {
            n5 = this.e + this.b - 28;
        } else if (n2 > 0) {
            n5 += n2;
        }
        if (bl3) {
            n6 -= 28;
        } else {
            n4 += 64;
            n6 += this.c - 4;
        }
        cja.f();
        this.c(n5, n6, n3, n4, 28, 32);
        this.q = 100.0f;
        this.v.a = 100.0f;
        int n8 = bl3 ? 1 : -1;
        cja.e();
        cja.A();
        bhl bhl2 = zm2.e();
        this.v.b(bhl2, n5 += 6, n6 += 8 + n8);
        this.v.a(this.B, bhl2, n5, n6);
        cja.f();
        this.v.a = 0.0f;
        this.q = 0.0f;
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0) {
            this.u.a(new aeg(this, this.u.h.E()));
        }
        if (cwv2.j == 1) {
            this.u.a(new bjs(this, this.u.h.E()));
        }
    }

    public int f() {
        return k;
    }

    static /* synthetic */ al g() {
        return j;
    }
}

