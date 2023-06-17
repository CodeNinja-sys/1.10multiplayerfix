/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.h.a;
import net.minecraft.w.n;

public abstract class y
extends ah
implements a {
    protected cn a = net.minecraft.a.p.c;
    private int b;
    private b c;

    public y(k k2) {
        super(k2);
    }

    @Override
    protected void e() {
        if (this.dn() != 0) {
            this.b = 0;
        }
        super.e();
    }

    @Override
    public void n() {
        super.n();
        if (this.dn() != 0) {
            this.b = 0;
        }
        if (this.b > 0) {
            --this.b;
            if (this.b % 10 == 0) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(net.minecraft.u.aj.I, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        }
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        this.b = 0;
        return super.a(n2, f2);
    }

    @Override
    public float a(net.minecraft.u.b.b b2) {
        return this.aQ.n(b2.c()).c() == net.minecraft.a.p.c ? 10.0f : this.aQ.m(b2) - 0.5f;
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("InLove", this.b);
    }

    @Override
    public double Y() {
        return 0.29;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.b = e2.h("InLove");
    }

    @Override
    public boolean aq() {
        int n2;
        int n3;
        int n4 = net.minecraft.u.b.n.c(this.aU);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n4, n3 = net.minecraft.u.b.n.c(this.cT().b), n2 = net.minecraft.u.b.n.c(this.aW));
        return this.aQ.n(b2.c()).c() == this.a && this.aQ.i(b2) > 8 && super.aq();
    }

    @Override
    public int ac() {
        return 120;
    }

    @Override
    protected boolean i() {
        return false;
    }

    @Override
    protected int b_(b b2) {
        return 1 + this.aQ.p.nextInt(3);
    }

    public boolean a(cu cu2) {
        return cu2 == null ? false : cu2.a() == net.minecraft.a.w.Q;
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null) {
            if (this.a(cu2) && this.dn() == 0 && this.b <= 0) {
                this.a(b2, cu2);
                this.a(b2);
                return true;
            }
            if (this.ba() && this.a(cu2)) {
                this.a(b2, cu2);
                this.b((int)((float)(-this.dn() / 20) * 0.1f), true);
                return true;
            }
        }
        return super.a(b2, ah2, cu2);
    }

    protected void a(b b2, cu cu2) {
        if (!b2.J.d) {
            --cu2.b;
        }
    }

    public void a(b b2) {
        this.b = 600;
        this.c = b2;
        this.aQ.a((n)this, (byte)18);
    }

    public b v() {
        return this.c;
    }

    public boolean w() {
        return this.b > 0;
    }

    public void y() {
        this.b = 0;
    }

    public boolean a(y y2) {
        return y2 == this ? false : (y2.getClass() != this.getClass() ? false : this.w() && y2.w());
    }

    @Override
    public void a(byte by2) {
        if (by2 == 18) {
            for (int i2 = 0; i2 < 7; ++i2) {
                double d2 = this.bx.nextGaussian() * 0.02;
                double d3 = this.bx.nextGaussian() * 0.02;
                double d4 = this.bx.nextGaussian() * 0.02;
                this.aQ.a(net.minecraft.u.aj.I, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }
}

