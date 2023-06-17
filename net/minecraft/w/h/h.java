/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ex;
import net.minecraft.q.k;
import net.minecraft.w.b.bo;
import net.minecraft.w.h.am;

class h
extends bo {
    private final am c;
    private boolean d;
    private boolean e;

    public h(am am2) {
        super(am2, 0.7f, 16);
        this.c = am2;
    }

    @Override
    public boolean e() {
        if (this.a <= 0) {
            if (!this.c.aQ.G().b("mobGriefing")) {
                return false;
            }
            this.e = false;
            this.d = am.a(this.c);
            this.d = true;
        }
        return super.e();
    }

    @Override
    public boolean a() {
        return this.e && super.a();
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
        this.c.I().a((double)this.b.cy_() + 0.5, this.b.k() + 1, (double)this.b.l() + 0.5, 10.0f, this.c.ao());
        if (this.f()) {
            k k2 = this.c.aQ;
            net.minecraft.u.b.b b2 = this.b.b();
            b b3 = k2.n(b2);
            cn cn2 = b3.c();
            if (this.e && cn2 instanceof ex) {
                Integer n2 = (Integer)b3.a(ex.a);
                if (n2 == 0) {
                    k2.a(b2, p.a.v(), 2);
                    k2.b(b2, true);
                } else {
                    k2.a(b2, b3.a(ex.a, Integer.valueOf(n2 - 1)), 2);
                    k2.b(2001, b2, cn.p(b3));
                }
                this.c.s();
            }
            this.e = false;
            this.a = 10;
        }
    }

    @Override
    protected boolean a(k k2, net.minecraft.u.b.b b2) {
        b b3;
        cn cn2 = k2.n(b2).c();
        if (cn2 == p.ak && this.d && !this.e && (cn2 = (b3 = k2.n(b2 = b2.b())).c()) instanceof ex && ((ex)cn2).m(b3)) {
            this.e = true;
            return true;
        }
        return false;
    }
}

