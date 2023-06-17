/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.u.b.b;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.g;
import net.minecraft.u.n;

public class i {
    private final List a = ov.a();
    private final net.minecraft.w.l b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;

    public i(net.minecraft.w.l l2) {
        this.b = l2;
    }

    public void a() {
        this.h();
        if (this.b.bq()) {
            cn cn2 = this.b.aQ.n(new b(this.b.aU, this.b.cT().b, this.b.aW)).c();
            if (cn2 == p.au) {
                this.h = "ladder";
            } else if (cn2 == p.bn) {
                this.h = "vines";
            }
        } else if (this.b.cm()) {
            this.h = "water";
        }
    }

    public void a(n n2, float f2, float f3) {
        this.e();
        this.a();
        g g2 = new g(n2, this.b.by, f2, f3, this.h, this.b.bq);
        this.a.add(g2);
        this.c = this.b.by;
        this.g = true;
        if (g2.c() && !this.f && this.b.br()) {
            this.f = true;
            this.e = this.d = this.b.by;
            this.b.ch_();
        }
    }

    public a b() {
        a a2;
        if (this.a.isEmpty()) {
            return new l("death.attack.generic", this.b.aK());
        }
        g g2 = this.g();
        g g3 = (g)this.a.get(this.a.size() - 1);
        a a3 = g3.e();
        net.minecraft.w.n n2 = g3.a().j();
        if (g2 != null && g3.a() == n.j) {
            a a4 = g2.e();
            if (g2.a() != n.j && g2.a() != n.l) {
                if (!(a4 == null || a3 != null && a4.equals(a3))) {
                    cu cu2;
                    net.minecraft.w.n n3 = g2.a().j();
                    cu cu3 = cu2 = n3 instanceof net.minecraft.w.l ? ((net.minecraft.w.l)n3).bC() : null;
                    a2 = cu2 != null && cu2.s() ? new l("death.fell.assist.item", this.b.aK(), a4, cu2.B()) : new l("death.fell.assist", this.b.aK(), a4);
                } else if (a3 != null) {
                    cu cu4;
                    cu cu5 = cu4 = n2 instanceof net.minecraft.w.l ? ((net.minecraft.w.l)n2).bC() : null;
                    a2 = cu4 != null && cu4.s() ? new l("death.fell.finish.item", this.b.aK(), a3, cu4.B()) : new l("death.fell.finish", this.b.aK(), a3);
                } else {
                    a2 = new l("death.fell.killer", this.b.aK());
                }
            } else {
                a2 = new l("death.fell.accident." + this.a(g2), this.b.aK());
            }
        } else {
            a2 = g3.a().c(this.b);
        }
        return a2;
    }

    public net.minecraft.w.l c() {
        net.minecraft.w.l l2 = null;
        net.minecraft.w.a.b b2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (g g2 : this.a) {
            if (g2.a().j() instanceof net.minecraft.w.a.b && (b2 == null || g2.b() > f3)) {
                f3 = g2.b();
                b2 = (net.minecraft.w.a.b)g2.a().j();
            }
            if (!(g2.a().j() instanceof net.minecraft.w.l) || l2 != null && !(g2.b() > f2)) continue;
            f2 = g2.b();
            l2 = (net.minecraft.w.l)g2.a().j();
        }
        if (b2 != null && f3 >= f2 / 3.0f) {
            return b2;
        }
        return l2;
    }

    private g g() {
        g g2 = null;
        g g3 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            g g4;
            g g5 = (g)this.a.get(i2);
            g g6 = g4 = i2 > 0 ? (g)this.a.get(i2 - 1) : null;
            if ((g5.a() == n.j || g5.a() == n.l) && g5.f() > 0.0f && (g2 == null || g5.f() > f3)) {
                g2 = i2 > 0 ? g4 : g5;
                f3 = g5.f();
            }
            if (g5.d() == null || g3 != null && !(g5.b() > f2)) continue;
            g3 = g5;
            f2 = g5.b();
        }
        if (f3 > 5.0f && g2 != null) {
            return g2;
        }
        if (f2 > 5.0f && g3 != null) {
            return g3;
        }
        return null;
    }

    private String a(g g2) {
        return g2.d() == null ? "generic" : g2.d();
    }

    public int d() {
        return this.f ? this.b.by - this.d : this.e - this.d;
    }

    private void h() {
        this.h = null;
    }

    public void e() {
        int n2;
        int n3 = n2 = this.f ? 300 : 100;
        if (this.g && (!this.b.br() || this.b.by - this.c > n2)) {
            boolean bl2 = this.f;
            this.g = false;
            this.f = false;
            this.e = this.b.by;
            if (bl2) {
                this.b.ci_();
            }
            this.a.clear();
        }
    }

    public net.minecraft.w.l f() {
        return this.b;
    }
}

