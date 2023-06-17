/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import java.util.Calendar;
import net.minecraft.e.e;
import net.minecraft.g.c.b;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.q;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;

public class aj
extends q {
    private static final g a = net.minecraft.x.a.o.a(aj.class, net.minecraft.x.a.q.a);
    private net.minecraft.u.b.b b;

    public aj(k k2) {
        super(k2);
        this.d(0.5f, 0.9f);
        this.a(true);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(a, (byte)0);
    }

    @Override
    protected float bE() {
        return 0.1f;
    }

    @Override
    protected float bF() {
        return super.bF() * 0.95f;
    }

    @Override
    protected bv j() {
        return this.c() && this.bx.nextInt(4) != 0 ? null : net.minecraft.a.f.w;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.y;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.x;
    }

    @Override
    public boolean bM() {
        return false;
    }

    @Override
    protected void k(n n2) {
    }

    @Override
    protected void bK() {
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(6.0);
    }

    public boolean c() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 1));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.c()) {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
            this.aV = (double)net.minecraft.u.b.n.c(this.aV) + 1.0 - (double)this.bm;
        } else {
            this.aY *= (double)0.6f;
        }
    }

    @Override
    protected void e() {
        super.e();
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
        net.minecraft.u.b.b b3 = b2.b();
        if (this.c()) {
            if (this.aQ.n(b3).o()) {
                if (this.bx.nextInt(200) == 0) {
                    this.am = this.bx.nextInt(360);
                }
                if (this.aQ.b((n)this, 4.0) != null) {
                    this.a(false);
                    this.aQ.a(null, 1025, b2, 0);
                }
            } else {
                this.a(false);
                this.aQ.a(null, 1025, b2, 0);
            }
        } else {
            if (!(this.b == null || this.aQ.c(this.b) && this.b.k() >= 1)) {
                this.b = null;
            }
            if (this.b == null || this.bx.nextInt(30) == 0 || this.b.e((double)((int)this.aU), (double)((int)this.aV), (double)((int)this.aW)) < 4.0) {
                this.b = new net.minecraft.u.b.b((int)this.aU + this.bx.nextInt(7) - this.bx.nextInt(7), (int)this.aV + this.bx.nextInt(6) - 2, (int)this.aW + this.bx.nextInt(7) - this.bx.nextInt(7));
            }
            double d2 = (double)this.b.cy_() + 0.5 - this.aU;
            double d3 = (double)this.b.k() + 0.1 - this.aV;
            double d4 = (double)this.b.l() + 0.5 - this.aW;
            this.aX += (Math.signum(d2) * 0.5 - this.aX) * (double)0.1f;
            this.aY += (Math.signum(d3) * (double)0.7f - this.aY) * (double)0.1f;
            this.aZ += (Math.signum(d4) * 0.5 - this.aZ) * (double)0.1f;
            float f2 = (float)(net.minecraft.u.b.n.b(this.aZ, this.aX) * 57.29577951308232) - 90.0f;
            float f3 = net.minecraft.u.b.n.g(f2 - this.ba);
            this.aC = 0.5f;
            this.ba += f3;
            if (this.bx.nextInt(100) == 0 && this.aQ.n(b3).o()) {
                this.a(true);
            }
        }
    }

    @Override
    protected boolean au() {
        return false;
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, b b2, net.minecraft.u.b.b b3) {
    }

    @Override
    public boolean cK() {
        return true;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (!this.aQ.C && this.c()) {
            this.a(false);
        }
        return super.a(n2, f2);
    }

    public static void a(a a2) {
        f.a(a2, "Bat");
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.bE.b(a, e2.f("BatFlags"));
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("BatFlags", (Byte)this.bE.a(a));
    }

    @Override
    public boolean aq() {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.aU, this.cT().b, this.aW);
        if (b2.k() >= this.aQ.x()) {
            return false;
        }
        int n2 = this.aQ.j(b2);
        int n3 = 4;
        if (this.a(this.aQ.P())) {
            n3 = 7;
        } else if (this.bx.nextBoolean()) {
            return false;
        }
        return n2 > this.bx.nextInt(n3) ? false : super.aq();
    }

    private boolean a(Calendar calendar) {
        return calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3;
    }

    @Override
    public float ce_() {
        return this.bm / 2.0f;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.ad;
    }
}

