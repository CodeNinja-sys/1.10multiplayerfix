/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.ar;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.y;
import net.minecraft.w.c.r;
import net.minecraft.w.d;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.x;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.m;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class bb
extends x
implements m {
    private static final g a = net.minecraft.x.a.o.a(bb.class, net.minecraft.x.a.q.a);

    public bb(k k2) {
        super(k2);
        this.d(0.7f, 1.9f);
    }

    public static void a(a a2) {
        f.a(a2, "SnowMan");
    }

    @Override
    protected void cA_() {
        this.o.a(1, new ar(this, 1.25, 20, 10.0f));
        this.o.a(2, new az(this, 1.0));
        this.o.a(3, new ap(this, b.class, 6.0f));
        this.o.a(4, new bh(this));
        this.p.a(1, new y(this, f.class, 10, true, false, net.minecraft.w.e.aw.by_));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(4.0);
        this.a(d.d).a(0.2f);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
    }

    @Override
    public void n() {
        super.n();
        if (!this.aQ.C) {
            int n2 = net.minecraft.u.b.n.c(this.aU);
            int n3 = net.minecraft.u.b.n.c(this.aV);
            int n4 = net.minecraft.u.b.n.c(this.aW);
            if (this.cl()) {
                this.a(net.minecraft.u.n.g, 1.0f);
            }
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, 0, n4);
            net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(n2, n3, n4);
            if (this.aQ.a(b2).c(b3) > 1.0f) {
                this.a(net.minecraft.u.n.c, 1.0f);
            }
            if (!this.aQ.G().b("mobGriefing")) {
                return;
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                n2 = net.minecraft.u.b.n.c(this.aU + (double)((float)(i2 % 2 * 2 - 1) * 0.25f));
                net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(n2, n3 = net.minecraft.u.b.n.c(this.aV), n4 = net.minecraft.u.b.n.c(this.aW + (double)((float)(i2 / 2 % 2 * 2 - 1) * 0.25f)));
                if (this.aQ.n(b4).d() != h.a) continue;
                net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(n2, 0, n4);
                if (!(this.aQ.a(b5).c(b4) < 0.8f) || !net.minecraft.a.p.aH.a_(this.aQ, b4)) continue;
                this.aQ.b(b4, net.minecraft.a.p.aH.v());
            }
        }
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.A;
    }

    @Override
    public void a(l l2, float f2) {
        r r2 = new r(this.aQ, this);
        double d2 = l2.aV + (double)l2.ce_() - (double)1.1f;
        double d3 = l2.aU - this.aU;
        double d4 = d2 - r2.aV;
        double d5 = l2.aW - this.aW;
        float f3 = net.minecraft.u.b.n.a(d3 * d3 + d5 * d5) * 0.2f;
        r2.c(d3, d4 + (double)f3, d5, 1.6f, 12.0f);
        this.a(net.minecraft.a.f.fW, 1.0f, 1.0f / (this.bd().nextFloat() * 0.4f + 0.8f));
        this.aQ.a(r2);
    }

    @Override
    public float ce_() {
        return 1.7f;
    }

    @Override
    protected boolean a(b b2, ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == w.bl && !this.c() && !this.aQ.C) {
            this.a(true);
            cu2.a(1, (l)b2);
        }
        return super.a(b2, ah2, cu2);
    }

    public boolean c() {
        return ((Byte)this.bE.a(a) & 0x10) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 0x10));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.fT;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.fV;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.fU;
    }
}

