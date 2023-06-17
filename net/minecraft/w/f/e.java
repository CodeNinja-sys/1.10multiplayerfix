/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.aa;
import net.minecraft.g.a.h;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.q.k;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

public class e
extends n {
    public int a;
    public int b;
    public int c;
    private int d = 5;
    private int e;
    private b f;
    private int g;

    public e(k k2, double d2, double d3, double d4, int n2) {
        super(k2);
        this.d(0.5f, 0.5f);
        this.e(d2, d3, d4);
        this.ba = (float)(Math.random() * 360.0);
        this.aX = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.aY = (float)(Math.random() * 0.2) * 2.0f;
        this.aZ = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.e = n2;
    }

    @Override
    protected boolean au() {
        return false;
    }

    public e(k k2) {
        super(k2);
        this.d(0.25f, 0.25f);
    }

    @Override
    protected void cb_() {
    }

    @Override
    public int m(float f2) {
        float f3 = 0.5f;
        f3 = net.minecraft.u.b.n.a(f3, 0.0f, 1.0f);
        int n2 = super.m(f2);
        int n3 = n2 & 0xFF;
        int n4 = n2 >> 16 & 0xFF;
        if ((n3 += (int)(f3 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n3 | n4 << 16;
    }

    @Override
    public void cE_() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        super.cE_();
        if (this.c > 0) {
            --this.c;
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (!this.ci()) {
            this.aY -= (double)0.03f;
        }
        if (this.aQ.n(new net.minecraft.u.b.b(this)).d() == h.i) {
            this.aY = 0.2f;
            this.aX = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
            this.aZ = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
            this.a(net.minecraft.a.f.bB, 0.4f, 2.0f + this.bx.nextFloat() * 0.4f);
        }
        this.a(this.aU, (this.cT().b + this.cT().e) / 2.0, this.aW);
        double d7 = 8.0;
        if (this.g < this.a - 20 + this.ca() % 100) {
            if (this.f == null || this.f.n(this) > 64.0) {
                this.f = this.aQ.a((n)this, 8.0);
            }
            this.g = this.a;
        }
        if (this.f != null && this.f.a()) {
            this.f = null;
        }
        if (this.f != null && (d6 = 1.0 - (d5 = Math.sqrt((d4 = (this.f.aU - this.aU) / 8.0) * d4 + (d3 = (this.f.aV + (double)this.f.ce_() / 2.0 - this.aV) / 8.0) * d3 + (d2 = (this.f.aW - this.aW) / 8.0) * d2))) > 0.0) {
            d6 *= d6;
            this.aX += d4 / d5 * d6 * 0.1;
            this.aY += d3 / d5 * d6 * 0.1;
            this.aZ += d2 / d5 * d6 * 0.1;
        }
        this.b(this.aX, this.aY, this.aZ);
        float f2 = 0.98f;
        if (this.be) {
            f2 = this.aQ.n((net.minecraft.u.b.b)new net.minecraft.u.b.b((int)net.minecraft.u.b.n.c((double)this.aU), (int)(net.minecraft.u.b.n.c((double)this.cT().b) - 1), (int)net.minecraft.u.b.n.c((double)this.aW))).c().N * 0.98f;
        }
        this.aX *= (double)f2;
        this.aY *= (double)0.98f;
        this.aZ *= (double)f2;
        if (this.be) {
            this.aY *= (double)-0.9f;
        }
        ++this.a;
        ++this.b;
        if (this.b >= 6000) {
            this.aa();
        }
    }

    @Override
    public boolean cn() {
        return this.aQ.a(this.cT(), h.h, (n)this);
    }

    @Override
    protected void l(int n2) {
        this.a(net.minecraft.u.n.a, (float)n2);
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        this.bN();
        this.d = (int)((float)this.d - f2);
        if (this.d <= 0) {
            this.aa();
        }
        return false;
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        e2.a("Health", (short)this.d);
        e2.a("Age", (short)this.b);
        e2.a("Value", (short)this.e);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        this.d = e2.g("Health");
        this.b = e2.g("Age");
        this.e = e2.g("Value");
    }

    @Override
    public void d(b b2) {
        if (!this.aQ.C && this.c == 0 && b2.x == 0) {
            b2.x = 2;
            this.aQ.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.bk, net.minecraft.u.bu.h, 0.1f, 0.5f * ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.8f));
            b2.b(this, 1);
            cu cu2 = net.minecraft.o.f.b(aa.A, b2);
            if (cu2 != null && cu2.f()) {
                int n2 = Math.min(this.d(this.e), cu2.g());
                this.e -= this.c(n2);
                cu2.b(cu2.g() - n2);
            }
            if (this.e > 0) {
                b2.e(this.e);
            }
            this.aa();
        }
    }

    private int c(int n2) {
        return n2 / 2;
    }

    private int d(int n2) {
        return n2 * 2;
    }

    public int a() {
        return this.e;
    }

    public int c() {
        return this.e >= 2477 ? 10 : (this.e >= 1237 ? 9 : (this.e >= 617 ? 8 : (this.e >= 307 ? 7 : (this.e >= 149 ? 6 : (this.e >= 73 ? 5 : (this.e >= 37 ? 4 : (this.e >= 17 ? 3 : (this.e >= 7 ? 2 : (this.e >= 3 ? 1 : 0)))))))));
    }

    public static int b(int n2) {
        return n2 >= 2477 ? 2477 : (n2 >= 1237 ? 1237 : (n2 >= 617 ? 617 : (n2 >= 307 ? 307 : (n2 >= 149 ? 149 : (n2 >= 73 ? 73 : (n2 >= 37 ? 37 : (n2 >= 17 ? 17 : (n2 >= 7 ? 7 : (n2 >= 3 ? 3 : 1)))))))));
    }

    @Override
    public boolean cG() {
        return false;
    }
}

