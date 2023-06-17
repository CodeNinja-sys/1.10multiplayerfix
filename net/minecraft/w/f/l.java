/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.b.cg;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.m.bf;
import net.minecraft.m.cu;
import net.minecraft.q.a.y;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.a.b.d;
import net.minecraft.u.a.c;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.w.a.b;
import net.minecraft.w.j;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class l
extends j {
    private static final g c = o.a(l.class, q.f);
    private static final g d = o.a(l.class, q.b);
    private float e = 1.0f;

    public l(k k2) {
        super(k2);
    }

    public l(k k2, net.minecraft.u.b.b b2, ad ad2) {
        super(k2, b2);
        this.a(ad2);
    }

    @Override
    protected void cb_() {
        this.cc().a(c, cg.f());
        this.cc().a(d, 0);
    }

    @Override
    public float cu() {
        return 0.0f;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (!n2.c() && this.p() != null) {
            if (!this.aQ.C) {
                this.b(n2.j(), false);
                this.a(f.cX, 1.0f, 1.0f);
                this.a((cu)null);
            }
            return true;
        }
        return super.a(n2, f2);
    }

    @Override
    public int f() {
        return 12;
    }

    @Override
    public int g() {
        return 12;
    }

    @Override
    public boolean a(double d2) {
        double d3 = 16.0;
        return d2 < (d3 = d3 * 64.0 * l.cO()) * d3;
    }

    @Override
    public void b(n n2) {
        this.a(f.cV, 1.0f, 1.0f);
        this.b(n2, true);
    }

    @Override
    public void i() {
        this.a(f.cW, 1.0f, 1.0f);
    }

    public void b(n n2, boolean bl2) {
        if (this.aQ.G().b("doEntityDrops")) {
            cu cu2 = this.p();
            if (n2 instanceof b) {
                b b2 = (b)n2;
                if (b2.J.d) {
                    this.b(cu2);
                    return;
                }
            }
            if (bl2) {
                this.a(new cu(w.bZ), 0.0f);
            }
            if (cu2 != null && this.bx.nextFloat() < this.e) {
                cu2 = cu2.j();
                this.b(cu2);
                this.a(cu2, 0.0f);
            }
        }
    }

    private void b(cu cu2) {
        if (cu2 != null) {
            if (cu2.a() == w.bk) {
                y y2 = ((bf)cu2.a()).a(cu2, this.aQ);
                y2.h.remove("frame-" + this.ca());
            }
            cu2.a((l)null);
        }
    }

    public cu p() {
        return (cu)((cg)this.cc().a(c)).d();
    }

    public void a(cu cu2) {
        this.a(cu2, true);
    }

    private void a(cu cu2, boolean bl2) {
        if (cu2 != null) {
            cu2 = cu2.j();
            cu2.b = 1;
            cu2.a(this);
        }
        this.cc().b(c, cg.c(cu2));
        this.cc().b(c);
        if (cu2 != null) {
            this.a(f.cU, 1.0f, 1.0f);
        }
        if (bl2 && this.a != null) {
            this.aQ.f(this.a, p.a);
        }
    }

    @Override
    public void a(g g2) {
        cu cu2;
        if (g2.equals(c) && (cu2 = this.p()) != null && cu2.z() != this) {
            cu2.a(this);
        }
    }

    public int q() {
        return (Integer)this.cc().a(d);
    }

    public void b(int n2) {
        this.b(n2, true);
    }

    private void b(int n2, boolean bl2) {
        this.cc().b(d, n2 % 8);
        if (bl2 && this.a != null) {
            this.aQ.f(this.a, p.a);
        }
    }

    public static void a(a a2) {
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new d("ItemFrame", new String[]{"Item"}));
    }

    @Override
    public void a(e e2) {
        if (this.p() != null) {
            e2.a("Item", this.p().b(new e()));
            e2.a("ItemRotation", (byte)this.q());
            e2.a("ItemDropChance", this.e);
        }
        super.a(e2);
    }

    @Override
    public void b(e e2) {
        e e3 = e2.o("Item");
        if (e3 != null && !e3.c()) {
            this.a(cu.a(e3), false);
            this.b(e2.f("ItemRotation"), false);
            if (e2.b("ItemDropChance", 99)) {
                this.e = e2.j("ItemDropChance");
            }
        }
        super.b(e2);
    }

    @Override
    public boolean a(b b2, cu cu2, ah ah2) {
        if (this.p() == null) {
            if (cu2 != null && !this.aQ.C) {
                this.a(cu2);
                if (!b2.J.d) {
                    --cu2.b;
                }
            }
        } else if (!this.aQ.C) {
            this.a(f.cY, 1.0f, 1.0f);
            this.b(this.q() + 1);
        }
        return true;
    }

    public int r() {
        return this.p() == null ? 0 : this.q() % 8 + 1;
    }
}

