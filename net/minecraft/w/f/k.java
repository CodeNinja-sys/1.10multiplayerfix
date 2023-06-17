/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.f.am;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.u.b.p;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.c.c;
import net.minecraft.w.e.q;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class k
extends c {
    private l d;

    public k(net.minecraft.q.k k2) {
        super(k2);
    }

    public k(net.minecraft.q.k k2, l l2) {
        super(k2, l2);
        this.d = l2;
    }

    public k(net.minecraft.q.k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        net.minecraft.w.c.c.a(a2, "ThrownEnderpearl");
    }

    @Override
    protected void a(o o2) {
        net.minecraft.u.b.b b2;
        Object object;
        l l2 = this.c();
        if (o2.d != null) {
            if (o2.d == this.d) {
                return;
            }
            o2.d.a(net.minecraft.u.n.a((n)this, (n)l2), 0.0f);
        }
        if (o2.a == p.b && (object = this.aQ.q(b2 = o2.a())) instanceof am) {
            am am2 = (am)object;
            if (l2 != null) {
                am2.a(l2);
                this.aa();
                return;
            }
            am2.a(this);
            return;
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            this.aQ.a(aj.y, this.aU, this.aV + this.bx.nextDouble() * 2.0, this.aW, this.bx.nextGaussian(), 0.0, this.bx.nextGaussian(), new int[0]);
        }
        if (!this.aQ.C) {
            if (l2 instanceof g) {
                g g2 = (g)l2;
                if (g2.a.b().e() && g2.aQ == this.aQ && !g2.ae()) {
                    if (this.bx.nextFloat() < 0.05f && this.aQ.G().b("doMobSpawning")) {
                        object = new q(this.aQ);
                        ((q)object).a(true);
                        ((n)object).b(l2.aU, l2.aV, l2.aW, l2.ba, l2.bb);
                        this.aQ.a((n)object);
                    }
                    if (l2.cz()) {
                        l2.o();
                    }
                    l2.d(this.aU, this.aV, this.aW);
                    l2.bq = 0.0f;
                    l2.a(net.minecraft.u.n.j, 5.0f);
                }
            } else if (l2 != null) {
                l2.d(this.aU, this.aV, this.aW);
                l2.bq = 0.0f;
            }
            this.aa();
        }
    }

    @Override
    public void cE_() {
        l l2 = this.c();
        if (l2 != null && l2 instanceof b && !l2.br()) {
            this.aa();
        } else {
            super.cE_();
        }
    }
}

