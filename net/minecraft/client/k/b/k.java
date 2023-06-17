/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import com.a.a.d.ov;
import java.util.List;
import java.util.Map;
import net.minecraft.a.w;
import net.minecraft.client.b.a;
import net.minecraft.client.f.u;
import net.minecraft.client.g.af;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.a.j;
import net.minecraft.client.k.b.e;
import net.minecraft.client.k.b.g;
import net.minecraft.client.k.b.q;
import net.minecraft.client.k.b.v;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import net.minecraft.h.ae;
import net.minecraft.h.aq;
import net.minecraft.h.r;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class k
extends af {
    private static final bp a = new bp("textures/gui/container/creative_inventory/tabs.png");
    private static final net.minecraft.h.e j = new net.minecraft.h.e("tmp", true, 45);
    private static int k = net.minecraft.v.d.b.b();
    private float l;
    private boolean m;
    private boolean v;
    private dn w;
    private List x;
    private r C;
    private boolean D;
    private g E;

    public k(b b2) {
        super(new e(b2));
        b2.s = this.e;
        this.t = true;
        this.d = 136;
        this.c = 195;
    }

    @Override
    public void bY_() {
        if (!this.n.d.h()) {
            this.n.a(new q(this.n.j));
        }
    }

    @Override
    protected void a(r r2, int n2, int n3, ae ae2) {
        this.D = true;
        boolean bl2 = ae2 == ae.b;
        ae ae3 = ae2 = n2 == -999 && ae2 == ae.a ? ae.e : ae2;
        if (r2 == null && k != net.minecraft.v.d.m.b() && ae2 != ae.f) {
            net.minecraft.w.a.a a2 = this.n.j.q;
            if (a2.l() != null) {
                if (n3 == 0) {
                    this.n.j.a(a2.l(), true);
                    this.n.d.a(a2.l());
                    a2.e(null);
                }
                if (n3 == 1) {
                    cu cu2 = a2.l().a(1);
                    this.n.j.a(cu2, true);
                    this.n.d.a(cu2);
                    if (a2.l().b == 0) {
                        a2.e(null);
                    }
                }
            }
        } else if (r2 == this.C && bl2) {
            for (int i2 = 0; i2 < this.n.j.r.c().size(); ++i2) {
                this.n.d.a(null, i2);
            }
        } else if (k == net.minecraft.v.d.m.b()) {
            if (r2 == this.C) {
                this.n.j.q.e(null);
            } else if (ae2 == ae.e && r2 != null && r2.c()) {
                cu cu3 = r2.a(n3 == 0 ? 1 : r2.b().b());
                this.n.j.a(cu3, true);
                this.n.d.a(cu3);
            } else if (ae2 == ae.e && this.n.j.q.l() != null) {
                this.n.j.a(this.n.j.q.l(), true);
                this.n.d.a(this.n.j.q.l());
                this.n.j.q.e(null);
            } else {
                this.n.j.r.a(r2 == null ? n2 : net.minecraft.client.k.b.v.a((v)((v)r2)).c, n3, ae2, (b)this.n.j);
                this.n.j.r.a();
            }
        } else if (ae2 != ae.f && r2.b == j) {
            net.minecraft.w.a.a a3 = this.n.j.q;
            cu cu4 = a3.l();
            cu cu5 = r2.b();
            if (ae2 == ae.c) {
                if (cu5 != null && n3 >= 0 && n3 < 9) {
                    cu cu6 = cu5.j();
                    cu6.b = cu6.b();
                    this.n.j.q.a(n3, cu6);
                    this.n.j.r.a();
                }
                return;
            }
            if (ae2 == ae.d) {
                if (a3.l() == null && r2.c()) {
                    cu cu7 = r2.b().j();
                    cu7.b = cu7.b();
                    a3.e(cu7);
                }
                return;
            }
            if (ae2 == ae.e) {
                if (cu5 != null) {
                    cu cu8 = cu5.j();
                    cu8.b = n3 == 0 ? 1 : cu8.b();
                    this.n.j.a(cu8, true);
                    this.n.d.a(cu8);
                }
                return;
            }
            if (cu4 != null && cu5 != null && cu4.a(cu5) && cu.a(cu4, cu5)) {
                if (n3 == 0) {
                    if (bl2) {
                        cu4.b = cu4.b();
                    } else if (cu4.b < cu4.b()) {
                        ++cu4.b;
                    }
                } else if (cu4.b <= 1) {
                    a3.e(null);
                } else {
                    --cu4.b;
                }
            } else if (cu5 != null && cu4 == null) {
                a3.e(cu.c(cu5));
                cu4 = a3.l();
                if (bl2) {
                    cu4.b = cu4.b();
                }
            } else {
                a3.e(null);
            }
        } else {
            this.e.a(r2 == null ? n2 : r2.c, n3, ae2, (b)this.n.j);
            if (aq.d(n3) == 2) {
                for (int i3 = 0; i3 < 9; ++i3) {
                    this.n.d.a(this.e.b(45 + i3).b(), 36 + i3);
                }
            } else if (r2 != null) {
                cu cu9 = this.e.b(r2.c).b();
                this.n.d.a(cu9, r2.c - this.e.e.size() + 9 + 36);
            }
        }
    }

    @Override
    protected void b() {
        int n2 = this.f;
        super.b();
        if (this.w != null && this.f != n2) {
            this.w.a = this.f + 82;
        }
    }

    @Override
    public void ct_() {
        if (this.n.d.h()) {
            super.ct_();
            this.r.clear();
            org.lwjgl.a.g.a(true);
            this.w = new dn(0, this.u, this.f + 82, this.g + 6, 89, this.u.a);
            this.w.f(15);
            this.w.a(false);
            this.w.e(false);
            this.w.g(0xFFFFFF);
            int n2 = k;
            k = -1;
            this.b(net.minecraft.v.d.a[n2]);
            this.E = new g(this.n);
            this.n.j.r.a(this.E);
        } else {
            this.n.a(new q(this.n.j));
        }
    }

    @Override
    public void cs_() {
        super.cs_();
        if (this.n.j != null && this.n.j.q != null) {
            this.n.j.r.b(this.E);
        }
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(char c2, int n2) {
        if (k != net.minecraft.v.d.g.b()) {
            if (net.minecraft.client.b.a.a(this.n.w.af)) {
                this.b(net.minecraft.v.d.g);
            } else {
                super.a(c2, n2);
            }
        } else {
            if (this.D) {
                this.D = false;
                this.w.a("");
            }
            if (!this.a(n2)) {
                if (this.w.a(c2, n2)) {
                    this.h();
                } else {
                    super.a(c2, n2);
                }
            }
        }
    }

    private void h() {
        Object object2;
        e e2 = (e)this.e;
        e2.a.clear();
        for (Object object2 : cg.e) {
            if (object2 == null || ((cg)object2).a() == null) continue;
            ((cg)object2).a((cg)object2, null, e2.a);
        }
        for (Object object2 : net.minecraft.o.j.b) {
            if (object2 == null || ((net.minecraft.o.j)object2).c == null) continue;
            net.minecraft.a.w.cn.a((net.minecraft.o.j)object2, e2.a);
        }
        object2 = e2.a.iterator();
        String string = this.w.b().toLowerCase();
        while (object2.hasNext()) {
            cu cu2 = (cu)object2.next();
            boolean bl2 = false;
            for (String string2 : cu2.a(this.n.j, this.n.w.y)) {
                if (!net.minecraft.u.d.o.a(string2).toLowerCase().contains(string)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            object2.remove();
        }
        this.l = 0.0f;
        e2.a(0.0f);
    }

    @Override
    protected void b(int n2, int n3) {
        d d2 = net.minecraft.v.d.a[k];
        if (d2.h()) {
            bd.k();
            this.u.a(net.minecraft.client.f.u.a(d2.d(), new Object[0]), 8, 6, 0x404040);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.f;
            int n6 = n3 - this.g;
            d[] arrd = net.minecraft.v.d.a;
            int n7 = net.minecraft.v.d.a.length;
            for (int i2 = 0; i2 < n7; ++i2) {
                d d2 = arrd[i2];
                if (!this.a(d2, n5, n6)) continue;
                return;
            }
        }
        super.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.f;
            int n6 = n3 - this.g;
            d[] arrd = net.minecraft.v.d.a;
            int n7 = net.minecraft.v.d.a.length;
            for (int i2 = 0; i2 < n7; ++i2) {
                d d2 = arrd[i2];
                if (!this.a(d2, n5, n6)) continue;
                this.b(d2);
                return;
            }
        }
        super.b(n2, n3, n4);
    }

    private boolean i() {
        return k != net.minecraft.v.d.m.b() && net.minecraft.v.d.a[k].j() && ((e)this.e).b();
    }

    private void b(d d2) {
        int n2 = k;
        k = d2.b();
        e e2 = (e)this.e;
        this.h.clear();
        e2.a.clear();
        d2.a(e2.a);
        if (d2 == net.minecraft.v.d.m) {
            aq aq2 = this.n.j.r;
            if (this.x == null) {
                this.x = e2.e;
            }
            e2.e = ov.a();
            for (int i2 = 0; i2 < aq2.e.size(); ++i2) {
                int n3;
                int n4;
                int n5;
                v v2 = new v(this, (r)aq2.e.get(i2), i2);
                e2.e.add(v2);
                if (i2 >= 5 && i2 < 9) {
                    n5 = i2 - 5;
                    n4 = n5 / 2;
                    n3 = n5 % 2;
                    v2.d = 54 + n4 * 54;
                    v2.e = 6 + n3 * 27;
                    continue;
                }
                if (i2 >= 0 && i2 < 5) {
                    v2.d = -2000;
                    v2.e = -2000;
                    continue;
                }
                if (i2 == 45) {
                    v2.d = 35;
                    v2.e = 20;
                    continue;
                }
                if (i2 >= aq2.e.size()) continue;
                n5 = i2 - 9;
                n4 = n5 % 9;
                n3 = n5 / 9;
                v2.d = 9 + n4 * 18;
                v2.e = i2 >= 36 ? 112 : 54 + n3 * 18;
            }
            this.C = new r(j, 0, 173, 112);
            e2.e.add(this.C);
        } else if (n2 == net.minecraft.v.d.m.b()) {
            e2.e = this.x;
            this.x = null;
        }
        if (this.w != null) {
            if (d2 == net.minecraft.v.d.g) {
                this.w.e(true);
                this.w.d(false);
                this.w.b(true);
                this.w.a("");
                this.h();
            } else {
                this.w.e(false);
                this.w.d(true);
                this.w.b(false);
            }
        }
        this.l = 0.0f;
        e2.a(0.0f);
    }

    @Override
    public void cp_() {
        super.cp_();
        int n2 = org.lwjgl.a.j.o();
        if (n2 != 0 && this.i()) {
            int n3 = (((e)this.e).a.size() + 9 - 1) / 9 - 5;
            if (n2 > 0) {
                n2 = 1;
            }
            if (n2 < 0) {
                n2 = -1;
            }
            this.l = (float)((double)this.l - (double)n2 / (double)n3);
            this.l = net.minecraft.u.b.n.a(this.l, 0.0f, 1.0f);
            ((e)this.e).a(this.l);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        boolean bl2 = org.lwjgl.a.j.a(0);
        int n4 = this.f;
        int n5 = this.g;
        int n6 = n4 + 175;
        int n7 = n5 + 18;
        int n8 = n6 + 14;
        int n9 = n7 + 112;
        if (!this.v && bl2 && n2 >= n6 && n3 >= n7 && n2 < n8 && n3 < n9) {
            this.m = this.i();
        }
        if (!bl2) {
            this.m = false;
        }
        this.v = bl2;
        if (this.m) {
            this.l = ((float)(n3 - n7) - 7.5f) / ((float)(n9 - n7) - 15.0f);
            this.l = net.minecraft.u.b.n.a(this.l, 0.0f, 1.0f);
            ((e)this.e).a(this.l);
        }
        super.a(n2, n3, f2);
        d[] arrd = net.minecraft.v.d.a;
        int n10 = net.minecraft.v.d.a.length;
        for (int i2 = 0; i2 < n10; ++i2) {
            d d2 = arrd[i2];
            if (this.b(d2, n2, n3)) break;
        }
        if (this.C != null && k == net.minecraft.v.d.m.b() && this.a(this.C.d, this.C.e, 16, 16, n2, n3)) {
            this.a(net.minecraft.client.f.u.a("inventory.binSlot", new Object[0]), n2, n3);
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.f();
    }

    @Override
    protected void a(cu cu2, int n2, int n3) {
        if (k == net.minecraft.v.d.g.b()) {
            Map map;
            List list = cu2.a(this.n.j, this.n.w.y);
            d d2 = cu2.a().a();
            if (d2 == null && cu2.a() == net.minecraft.a.w.cn && (map = net.minecraft.o.f.a(cu2)).size() == 1) {
                net.minecraft.o.j j2 = (net.minecraft.o.j)map.keySet().iterator().next();
                d[] arrd = net.minecraft.v.d.a;
                int n4 = net.minecraft.v.d.a.length;
                for (int i2 = 0; i2 < n4; ++i2) {
                    d d3 = arrd[i2];
                    if (!d3.a(j2.c)) continue;
                    d2 = d3;
                    break;
                }
            }
            if (d2 != null) {
                list.add(1, (Object)((Object)net.minecraft.u.d.o.r) + (Object)((Object)net.minecraft.u.d.o.j) + net.minecraft.client.f.u.a(d2.d(), new Object[0]));
            }
            for (int i3 = 0; i3 < list.size(); ++i3) {
                if (i3 == 0) {
                    list.set(i3, (Object)((Object)cu2.u().e) + (String)list.get(i3));
                    continue;
                }
                list.set(i3, (Object)((Object)net.minecraft.u.d.o.h) + (String)list.get(i3));
            }
            this.a(list, n2, n3);
        } else {
            super.a(cu2, n2, n3);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        am.c();
        d d2 = net.minecraft.v.d.a[k];
        d[] arrd = net.minecraft.v.d.a;
        int n5 = net.minecraft.v.d.a.length;
        for (n4 = 0; n4 < n5; ++n4) {
            d d3 = arrd[n4];
            this.n.N().a(a);
            if (d3.b() == k) continue;
            this.a(d3);
        }
        this.n.N().a(new bp("textures/gui/container/creative_inventory/tab_" + d2.g()));
        this.a_(this.f, this.g, 0, 0, this.c, this.d);
        this.w.g();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n6 = this.f + 175;
        n4 = this.g + 18;
        n5 = n4 + 112;
        this.n.N().a(a);
        if (d2.j()) {
            this.a_(n6, n4 + (int)((float)(n5 - n4 - 17) * this.l), 232 + (this.i() ? 0 : 12), 0, 12, 15);
        }
        this.a(d2);
        if (d2 == net.minecraft.v.d.m) {
            net.minecraft.client.k.b.q.a(this.f + 88, this.g + 45, 20, this.f + 88 - n2, this.g + 45 - 30 - n3, this.n.j);
        }
    }

    protected boolean a(d d2, int n2, int n3) {
        int n4 = d2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.c - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = d2.m() ? (n6 -= 32) : (n6 += this.d);
        return n2 >= n5 && n2 <= n5 + 28 && n3 >= n6 && n3 <= n6 + 32;
    }

    protected boolean b(d d2, int n2, int n3) {
        int n4 = d2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.c - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = d2.m() ? (n6 -= 32) : (n6 += this.d);
        if (this.a(n5 + 3, n6 + 3, 23, 27, n2, n3)) {
            this.a(net.minecraft.client.f.u.a(d2.d(), new Object[0]), n2, n3);
            return true;
        }
        return false;
    }

    protected void a(d d2) {
        boolean bl2 = d2.b() == k;
        boolean bl3 = d2.m();
        int n2 = d2.l();
        int n3 = n2 * 28;
        int n4 = 0;
        int n5 = this.f + 28 * n2;
        int n6 = this.g;
        int n7 = 32;
        if (bl2) {
            n4 += 32;
        }
        if (n2 == 5) {
            n5 = this.f + this.c - 28;
        } else if (n2 > 0) {
            n5 += n2;
        }
        if (bl3) {
            n6 -= 28;
        } else {
            n4 += 64;
            n6 += this.d - 4;
        }
        bd.f();
        this.a_(n5, n6, n3, n4, 28, 32);
        this.B = 100.0f;
        this.o.a = 100.0f;
        n6 = n6 + 8 + (bl3 ? 1 : -1);
        bd.e();
        bd.A();
        cu cu2 = d2.e();
        this.o.b(cu2, n5 += 6, n6);
        this.o.a(this.u, cu2, n5, n6);
        bd.f();
        this.o.a = 0.0f;
        this.B = 0.0f;
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0) {
            this.n.a(new net.minecraft.client.k.a.g(this, this.n.j.y()));
        }
        if (ch2.j == 1) {
            this.n.a(new j(this, this.n.j.y()));
        }
    }

    public int f() {
        return k;
    }

    static /* synthetic */ net.minecraft.h.e g() {
        return j;
    }
}

