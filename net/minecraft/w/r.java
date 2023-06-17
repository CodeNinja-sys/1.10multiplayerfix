/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.f;

public abstract class r
extends f {
    public r(k k2) {
        super(k2);
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, b b2, net.minecraft.u.b.b b3) {
    }

    @Override
    public void b(float f2, float f3) {
        if (this.cm()) {
            this.a(f2, f3, 0.02f, true);
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= (double)0.8f;
            this.aY *= (double)0.8f;
            this.aZ *= (double)0.8f;
        } else if (this.cq()) {
            this.a(f2, f3, 0.02f, true);
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= 0.5;
            this.aY *= 0.5;
            this.aZ *= 0.5;
        } else {
            float f4 = 0.91f;
            if (this.be) {
                f4 = this.aQ.n((net.minecraft.u.b.b)new net.minecraft.u.b.b((int)net.minecraft.u.b.n.c((double)this.aU), (int)(net.minecraft.u.b.n.c((double)this.cT().b) - 1), (int)net.minecraft.u.b.n.c((double)this.aW))).c().N * 0.91f;
            }
            float f5 = 0.16277136f / (f4 * f4 * f4);
            this.a(f2, f3, this.be ? 0.1f * f5 : 0.02f, true);
            f4 = 0.91f;
            if (this.be) {
                f4 = this.aQ.n((net.minecraft.u.b.b)new net.minecraft.u.b.b((int)net.minecraft.u.b.n.c((double)this.aU), (int)(net.minecraft.u.b.n.c((double)this.cT().b) - 1), (int)net.minecraft.u.b.n.c((double)this.aW))).c().N * 0.91f;
            }
            this.b(this.aX, this.aY, this.aZ);
            this.aX *= (double)f4;
            this.aY *= (double)f4;
            this.aZ *= (double)f4;
        }
        this.ac = this.ad;
        double d2 = this.aU - this.aR;
        double d3 = this.aW - this.aT;
        float f6 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3) * 4.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.ad += (f6 - this.ad) * 0.4f;
        this.ae += this.ad;
    }

    @Override
    public boolean bq() {
        return false;
    }
}

