/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.w;
import net.minecraft.m.cu;
import net.minecraft.q.au;
import net.minecraft.u.a.a;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;

public abstract class k
extends t
implements aw {
    public k(net.minecraft.q.k k2) {
        super(k2);
        this.k = 5;
    }

    public static void c(a a2) {
        f.a(a2, "Monster");
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.f;
    }

    @Override
    public void n() {
        this.bz();
        float f2 = this.n(1.0f);
        if (f2 > 0.5f) {
            this.as += 2;
        }
        super.n();
    }

    @Override
    public void cE_() {
        super.cE_();
        if (!this.aQ.C && this.aQ.R() == net.minecraft.q.l.a) {
            this.aa();
        }
    }

    @Override
    protected bv P() {
        return net.minecraft.a.f.cH;
    }

    @Override
    protected bv Q() {
        return net.minecraft.a.f.cG;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return this.b(n2) ? false : super.a(n2, f2);
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.cE;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.cD;
    }

    @Override
    protected bv d(int n2) {
        return n2 > 4 ? net.minecraft.a.f.cC : net.minecraft.a.f.cF;
    }

    @Override
    public boolean j(n n2) {
        boolean bl2;
        float f2 = (float)this.a(d.e).f();
        int n3 = 0;
        if (n2 instanceof l) {
            f2 += net.minecraft.o.f.a(this.bC(), ((l)n2).bB());
            n3 += net.minecraft.o.f.a(this);
        }
        if (bl2 = n2.a(net.minecraft.u.n.a(this), f2)) {
            int n4;
            if (n3 > 0 && n2 instanceof l) {
                ((l)n2).a(this, (float)n3 * 0.5f, (double)net.minecraft.u.b.n.a(this.ba * ((float)Math.PI / 180)), (double)(-net.minecraft.u.b.n.b(this.ba * ((float)Math.PI / 180))));
                this.aX *= 0.6;
                this.aZ *= 0.6;
            }
            if ((n4 = net.minecraft.o.f.b(this)) > 0) {
                n2.k(n4 * 4);
            }
            if (n2 instanceof b) {
                cu cu2;
                b b2 = (b)n2;
                cu cu3 = this.bC();
                cu cu4 = cu2 = b2.B() ? b2.bR() : null;
                if (cu3 != null && cu2 != null && cu3.a() instanceof net.minecraft.m.n && cu2.a() == w.cQ) {
                    float f3 = 0.25f + (float)net.minecraft.o.f.e(this) * 0.05f;
                    if (this.bx.nextFloat() < f3) {
                        b2.aL().a(w.cQ, 100);
                        this.aQ.a((n)b2, (byte)30);
                    }
                }
            }
            this.a(this, n2);
        }
        return bl2;
    }

    @Override
    public float a(net.minecraft.u.b.b b2) {
        return 0.5f - this.aQ.m(b2);
    }

    protected boolean cB_() {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.aU, this.cT().b, this.aW);
        if (this.aQ.b(net.minecraft.q.au.a, b2) > this.bx.nextInt(32)) {
            return false;
        }
        int n2 = this.aQ.j(b2);
        if (this.aQ.I()) {
            int n3 = this.aQ.S();
            this.aQ.d(10);
            n2 = this.aQ.j(b2);
            this.aQ.d(n3);
        }
        return n2 <= this.bx.nextInt(8);
    }

    @Override
    public boolean aq() {
        return this.aQ.R() != net.minecraft.q.l.a && this.cB_() && super.aq();
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.bA().b(d.e);
    }

    @Override
    protected boolean bc() {
        return true;
    }
}

