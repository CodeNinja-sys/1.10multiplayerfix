/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.a.b;
import net.minecraft.w.h;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public abstract class ah
extends t {
    private static final g a = net.minecraft.x.a.o.a(ah.class, net.minecraft.x.a.q.h);
    protected int u;
    protected int v;
    protected int w;
    private float b = -1.0f;
    private float c;

    public ah(k k2) {
        super(k2);
    }

    public abstract ah b(ah var1);

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.bT) {
            ah ah3;
            Class class_;
            if (!this.aQ.C && (class_ = h.a(h.a(dk.h(cu2)))) != null && this.getClass() == class_ && (ah3 = this.b(this)) != null) {
                ah3.e(-24000);
                ah3.b(this.aU, this.aV, this.aW, 0.0f, 0.0f);
                this.aQ.a(ah3);
                if (cu2.s()) {
                    ah3.g(cu2.q());
                }
                if (!b2.J.d) {
                    --cu2.b;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, false);
    }

    public int dn() {
        return this.aQ.C ? (((Boolean)this.bE.a(a)).booleanValue() ? -1 : 1) : this.u;
    }

    public void b(int n2, boolean bl2) {
        int n3;
        int n4 = n3 = this.dn();
        if ((n3 += n2 * 20) > 0) {
            n3 = 0;
            if (n4 < 0) {
                this.cG_();
            }
        }
        int n5 = n3 - n4;
        this.e(n3);
        if (bl2) {
            this.v += n5;
            if (this.w == 0) {
                this.w = 40;
            }
        }
        if (this.dn() == 0) {
            this.e(this.v);
        }
    }

    public void c(int n2) {
        this.b(n2, false);
    }

    public void e(int n2) {
        this.bE.b(a, n2 < 0);
        this.u = n2;
        this.s(this.ba());
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("Age", this.dn());
        e2.a("ForcedAge", this.v);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.e(e2.h("Age"));
        this.v = e2.h("ForcedAge");
    }

    @Override
    public void a(g g2) {
        if (a.equals(g2)) {
            this.s(this.ba());
        }
        super.a(g2);
    }

    @Override
    public void n() {
        super.n();
        if (this.aQ.C) {
            if (this.w > 0) {
                if (this.w % 4 == 0) {
                    this.aQ.a(net.minecraft.u.aj.v, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.w;
            }
        } else {
            int n2 = this.dn();
            if (n2 < 0) {
                this.e(++n2);
                if (n2 == 0) {
                    this.cG_();
                }
            } else if (n2 > 0) {
                this.e(--n2);
            }
        }
    }

    protected void cG_() {
    }

    @Override
    public boolean ba() {
        return this.dn() < 0;
    }

    public void s(boolean bl2) {
        this.r(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void d(float f2, float f3) {
        boolean bl2 = this.b > 0.0f;
        this.b = f2;
        this.c = f3;
        if (!bl2) {
            this.r(1.0f);
        }
    }

    protected final void r(float f2) {
        super.d(this.b * f2, this.c * f2);
    }
}

