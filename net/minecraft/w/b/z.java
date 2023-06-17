/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.g.av;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.dv;
import net.minecraft.q.k;
import net.minecraft.w.b.bo;

public class z
extends bo {
    private final net.minecraft.w.h.u c;

    public z(net.minecraft.w.h.u u2, double d2) {
        super(u2, d2, 8);
        this.c = u2;
    }

    @Override
    public boolean e() {
        return this.c.z() && !this.c.E() && super.e();
    }

    @Override
    public boolean a() {
        return super.a();
    }

    @Override
    public void b() {
        super.b();
        this.c.dp().a(false);
    }

    @Override
    public void c() {
        super.c();
        this.c.t(false);
    }

    @Override
    public void d() {
        super.d();
        this.c.dp().a(false);
        if (!this.f()) {
            this.c.t(false);
        } else if (!this.c.E()) {
            this.c.t(true);
        }
    }

    @Override
    protected boolean a(k k2, net.minecraft.u.b.b b2) {
        if (!k2.c(b2.b())) {
            return false;
        }
        b b3 = k2.n(b2);
        cn cn2 = b3.c();
        if (cn2 == p.ae) {
            ap ap2 = k2.q(b2);
            if (ap2 instanceof u && ((u)ap2).j < 1) {
                return true;
            }
        } else {
            if (cn2 == p.am) {
                return true;
            }
            if (cn2 == p.C && b3.a(av.a) != dv.a) {
                return true;
            }
        }
        return false;
    }
}

