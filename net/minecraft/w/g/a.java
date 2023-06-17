/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.g;

import java.util.List;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.q.k;
import net.minecraft.q.l;
import net.minecraft.u.bu;
import net.minecraft.w.g.b;
import net.minecraft.w.n;

public class a
extends b {
    private int b;
    public long a;
    private int c;
    private final boolean d;

    public a(k k2, double d2, double d3, double d4, boolean bl2) {
        super(k2);
        this.b(d2, d3, d4, 0.0f, 0.0f);
        this.b = 2;
        this.a = this.bx.nextLong();
        this.c = this.bx.nextInt(3) + 1;
        this.d = bl2;
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
        if (!bl2 && !k2.C && k2.G().b("doFireTick") && (k2.R() == l.c || k2.R() == l.d) && k2.a(b2, 10)) {
            if (k2.n(b2).d() == h.a && p.ab.a_(k2, b2)) {
                k2.b(b2, p.ab.v());
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                net.minecraft.u.b.b b3 = b2.a(this.bx.nextInt(3) - 1, this.bx.nextInt(3) - 1, this.bx.nextInt(3) - 1);
                if (k2.n(b3).d() != h.a || !p.ab.a_(k2, b3)) continue;
                k2.b(b3, p.ab.v());
            }
        }
    }

    @Override
    public bu S() {
        return net.minecraft.u.bu.d;
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.b == 2) {
            this.aQ.a(null, this.aU, this.aV, this.aW, f.dn, net.minecraft.u.bu.d, 10000.0f, 0.8f + this.bx.nextFloat() * 0.2f);
            this.aQ.a(null, this.aU, this.aV, this.aW, f.dm, net.minecraft.u.bu.d, 2.0f, 0.5f + this.bx.nextFloat() * 0.2f);
        }
        --this.b;
        if (this.b < 0) {
            if (this.c == 0) {
                this.aa();
            } else if (this.b < -this.bx.nextInt(10)) {
                --this.c;
                this.b = 1;
                if (!this.d && !this.aQ.C) {
                    this.a = this.bx.nextLong();
                    net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this);
                    if (this.aQ.G().b("doFireTick") && this.aQ.a(b2, 10) && this.aQ.n(b2).d() == h.a && p.ab.a_(this.aQ, b2)) {
                        this.aQ.b(b2, p.ab.v());
                    }
                }
            }
        }
        if (this.b >= 0) {
            if (this.aQ.C) {
                this.aQ.e(2);
            } else if (!this.d) {
                double d2 = 3.0;
                List list = this.aQ.b((n)this, new net.minecraft.u.b.a(this.aU - 3.0, this.aV - 3.0, this.aW - 3.0, this.aU + 3.0, this.aV + 6.0 + 3.0, this.aW + 3.0));
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    n n2 = (n)list.get(i2);
                    n2.a(this);
                }
            }
        }
    }

    @Override
    protected void cb_() {
    }

    @Override
    protected void b(e e2) {
    }

    @Override
    protected void a(e e2) {
    }
}

