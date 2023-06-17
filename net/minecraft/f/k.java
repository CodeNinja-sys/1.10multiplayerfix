/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.List;
import net.minecraft.e.q;
import net.minecraft.f.al;
import net.minecraft.f.i;
import net.minecraft.f.u;
import net.minecraft.g.cn;
import net.minecraft.g.ib;
import net.minecraft.g.l;
import net.minecraft.h.aq;
import net.minecraft.h.c;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.a.b.e;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.u.b.n;
import net.minecraft.u.r;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;
import net.minecraft.w.f.ae;

public class k
extends i
implements al,
aw {
    private cu[] c = new cu[5];
    private String d;
    private int e = -1;

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (net.minecraft.u.a.e)new e("Hopper", new String[]{"Items"}));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.c = new cu[this.e()];
        if (e2.b("CustomName", 8)) {
            this.d = e2.l("CustomName");
        }
        this.e = e2.h("TransferCooldown");
        if (!this.c(e2)) {
            q q2 = e2.c("Items", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e3 = q2.b(i2);
                byte by2 = e3.f("Slot");
                if (by2 < 0 || by2 >= this.c.length) continue;
                this.c[by2] = cu.a(e3);
            }
        }
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        if (!this.d(e2)) {
            q q2 = new q();
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                if (this.c[i2] == null) continue;
                net.minecraft.e.e e3 = new net.minecraft.e.e();
                e3.a("Slot", (byte)i2);
                this.c[i2].b(e3);
                q2.a(e3);
            }
            e2.a("Items", q2);
        }
        e2.a("TransferCooldown", this.e);
        if (this.bO_()) {
            e2.a("CustomName", this.d);
        }
        return e2;
    }

    @Override
    public int e() {
        return this.c.length;
    }

    @Override
    public cu a(int n2) {
        this.a((b)null);
        return this.c[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        this.a((b)null);
        return v.a(this.c, n2, n3);
    }

    @Override
    public cu b(int n2) {
        this.a((b)null);
        return v.a(this.c, n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        this.a((b)null);
        this.c[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
    }

    @Override
    public String X() {
        return this.bO_() ? this.d : "container.hopper";
    }

    @Override
    public boolean bO_() {
        return this.d != null && !this.d.isEmpty();
    }

    public void a(String string) {
        this.d = string;
    }

    @Override
    public int g() {
        return 64;
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
        return true;
    }

    @Override
    public void a() {
        if (this.k != null && !this.k.C) {
            --this.e;
            if (!this.o()) {
                this.d(0);
                this.f();
            }
        }
    }

    public boolean f() {
        if (this.k != null && !this.k.C) {
            if (!this.o() && net.minecraft.g.l.c(this.bL_())) {
                boolean bl2 = false;
                if (!this.s()) {
                    bl2 = this.u();
                }
                if (!this.t()) {
                    boolean bl3 = bl2 = net.minecraft.f.k.a(this) || bl2;
                }
                if (bl2) {
                    this.d(8);
                    this.C();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean s() {
        cu[] arrcu = this.c;
        int n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu cu2 = arrcu[i2];
            if (cu2 == null) continue;
            return false;
        }
        return true;
    }

    private boolean t() {
        cu[] arrcu = this.c;
        int n2 = this.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu cu2 = arrcu[i2];
            if (cu2 != null && cu2.b == cu2.b()) continue;
            return false;
        }
        return true;
    }

    private boolean u() {
        y y2 = this.v();
        if (y2 == null) {
            return false;
        }
        ad ad2 = net.minecraft.g.l.b(this.bL_()).e();
        if (this.a(y2, ad2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.e(); ++i2) {
            if (this.a(i2) == null) continue;
            cu cu2 = this.a(i2).j();
            cu cu3 = net.minecraft.f.k.a(y2, this.a(i2, 1), ad2);
            if (cu3 == null || cu3.b == 0) {
                y2.C();
                return true;
            }
            this.a(i2, cu2);
        }
        return false;
    }

    private boolean a(y y2, ad ad2) {
        if (y2 instanceof c) {
            int[] arrn;
            c c2 = (c)y2;
            int[] arrn2 = arrn = c2.a(ad2);
            int n2 = arrn.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = arrn2[i2];
                cu cu2 = c2.a(n3);
                if (cu2 != null && cu2.b == cu2.b()) continue;
                return false;
            }
        } else {
            int n4 = y2.e();
            for (int i3 = 0; i3 < n4; ++i3) {
                cu cu3 = y2.a(i3);
                if (cu3 != null && cu3.b == cu3.b()) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean b(y y2, ad ad2) {
        if (y2 instanceof c) {
            int[] arrn;
            c c2 = (c)y2;
            int[] arrn2 = arrn = c2.a(ad2);
            int n2 = arrn.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = arrn2[i2];
                if (c2.a(n3) == null) continue;
                return false;
            }
        } else {
            int n4 = y2.e();
            for (int i3 = 0; i3 < n4; ++i3) {
                if (y2.a(i3) == null) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean a(al al2) {
        y y2 = net.minecraft.f.k.b(al2);
        if (y2 != null) {
            ad ad2 = ad.a;
            if (net.minecraft.f.k.b(y2, ad2)) {
                return false;
            }
            if (y2 instanceof c) {
                int[] arrn;
                c c2 = (c)y2;
                int[] arrn2 = arrn = c2.a(ad2);
                int n2 = arrn.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n3 = arrn2[i2];
                    if (!net.minecraft.f.k.a(al2, y2, n3, ad2)) continue;
                    return true;
                }
            } else {
                int n4 = y2.e();
                for (int i3 = 0; i3 < n4; ++i3) {
                    if (!net.minecraft.f.k.a(al2, y2, i3, ad2)) continue;
                    return true;
                }
            }
        } else {
            for (ae ae2 : net.minecraft.f.k.a(al2.cD_(), al2.k(), al2.m(), al2.n())) {
                if (!net.minecraft.f.k.a(al2, ae2)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean a(al al2, y y2, int n2, ad ad2) {
        cu cu2 = y2.a(n2);
        if (cu2 != null && net.minecraft.f.k.b(y2, cu2, n2, ad2)) {
            cu cu3 = cu2.j();
            cu cu4 = net.minecraft.f.k.a(al2, y2.a(n2, 1), null);
            if (cu4 == null || cu4.b == 0) {
                y2.C();
                return true;
            }
            y2.a(n2, cu3);
        }
        return false;
    }

    public static boolean a(y y2, ae ae2) {
        boolean bl2 = false;
        if (ae2 == null) {
            return false;
        }
        cu cu2 = ae2.c().j();
        cu cu3 = net.minecraft.f.k.a(y2, cu2, null);
        if (cu3 != null && cu3.b != 0) {
            ae2.a(cu3);
        } else {
            bl2 = true;
            ae2.aa();
        }
        return bl2;
    }

    public static cu a(y y2, cu cu2, ad ad2) {
        if (y2 instanceof c && ad2 != null) {
            c c2 = (c)y2;
            int[] arrn = c2.a(ad2);
            for (int i2 = 0; i2 < arrn.length && cu2 != null && cu2.b > 0; ++i2) {
                cu2 = net.minecraft.f.k.c(y2, cu2, arrn[i2], ad2);
            }
        } else {
            int n2 = y2.e();
            for (int i3 = 0; i3 < n2 && cu2 != null && cu2.b > 0; ++i3) {
                cu2 = net.minecraft.f.k.c(y2, cu2, i3, ad2);
            }
        }
        if (cu2 != null && cu2.b == 0) {
            cu2 = null;
        }
        return cu2;
    }

    private static boolean a(y y2, cu cu2, int n2, ad ad2) {
        return !y2.b(n2, cu2) ? false : !(y2 instanceof c) || ((c)y2).a(n2, cu2, ad2);
    }

    private static boolean b(y y2, cu cu2, int n2, ad ad2) {
        return !(y2 instanceof c) || ((c)y2).b(n2, cu2, ad2);
    }

    private static cu c(y y2, cu cu2, int n2, ad ad2) {
        cu cu3 = y2.a(n2);
        if (net.minecraft.f.k.a(y2, cu2, n2, ad2)) {
            boolean bl2 = false;
            if (cu3 == null) {
                y2.a(n2, cu2);
                cu2 = null;
                bl2 = true;
            } else if (net.minecraft.f.k.a(cu3, cu2)) {
                int n3 = cu2.b() - cu3.b;
                int n4 = Math.min(cu2.b, n3);
                cu2.b -= n4;
                cu3.b += n4;
                boolean bl3 = bl2 = n4 > 0;
            }
            if (bl2) {
                if (y2 instanceof k) {
                    k k2 = (k)y2;
                    if (k2.p()) {
                        k2.d(8);
                    }
                    y2.C();
                }
                y2.C();
            }
        }
        return cu2;
    }

    private y v() {
        ad ad2 = net.minecraft.g.l.b(this.bL_());
        return net.minecraft.f.k.b(this.cD_(), this.k() + (double)ad2.h(), this.m() + (double)ad2.i(), this.n() + (double)ad2.j());
    }

    public static y b(al al2) {
        return net.minecraft.f.k.b(al2.cD_(), al2.k(), al2.m() + 1.0, al2.n());
    }

    public static List a(net.minecraft.q.k k2, double d2, double d3, double d4) {
        return k2.a(ae.class, new net.minecraft.u.b.a(d2 - 0.5, d3, d4 - 0.5, d2 + 0.5, d3 + 1.5, d4 + 0.5), r.a);
    }

    public static y b(net.minecraft.q.k k2, double d2, double d3, double d4) {
        Object object;
        int n2;
        int n3;
        y y2 = null;
        int n4 = net.minecraft.u.b.n.c(d2);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n4, n3 = net.minecraft.u.b.n.c(d3), n2 = net.minecraft.u.b.n.c(d4));
        cn cn2 = k2.n(b2).c();
        if (cn2.n() && (object = k2.q(b2)) instanceof y && (y2 = (y)object) instanceof u && cn2 instanceof ib) {
            y2 = ((ib)cn2).a(k2, b2, true);
        }
        if (y2 == null && !(object = k2.a((net.minecraft.w.n)null, new net.minecraft.u.b.a(d2 - 0.5, d3 - 0.5, d4 - 0.5, d2 + 0.5, d3 + 0.5, d4 + 0.5), r.c)).isEmpty()) {
            y2 = (y)object.get(k2.p.nextInt(object.size()));
        }
        return y2;
    }

    private static boolean a(cu cu2, cu cu3) {
        return cu2.a() != cu3.a() ? false : (cu2.h() != cu3.h() ? false : (cu2.b > cu2.b() ? false : cu.a(cu2, cu3)));
    }

    @Override
    public double k() {
        return (double)this.l.cy_() + 0.5;
    }

    @Override
    public double m() {
        return (double)this.l.k() + 0.5;
    }

    @Override
    public double n() {
        return (double)this.l.l() + 0.5;
    }

    public void d(int n2) {
        this.e = n2;
    }

    public boolean o() {
        return this.e > 0;
    }

    public boolean p() {
        return this.e <= 1;
    }

    @Override
    public String h() {
        return "minecraft:hopper";
    }

    @Override
    public aq a(a a2, b b2) {
        this.a(b2);
        return new net.minecraft.h.al(a2, this, b2);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        this.a((b)null);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = null;
        }
    }
}

