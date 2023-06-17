/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.q.g.a.am;
import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;

public class f
extends k {
    private i b;
    private s c;

    public f(a a2) {
        super(a2);
    }

    @Override
    public j g() {
        return j.c;
    }

    @Override
    public void e() {
        this.b = null;
        this.c = null;
    }

    @Override
    public void b() {
        double d2;
        double d3 = d2 = this.c == null ? 0.0 : this.c.c(this.a.aU, this.a.aV, this.a.aW);
        if (d2 < 100.0 || d2 > 22500.0 || this.a.bf || this.a.bg) {
            this.j();
        }
    }

    @Override
    public s f() {
        return this.c;
    }

    private void j() {
        if (this.b == null || this.b.b()) {
            int n2;
            Object object;
            int n3 = this.a.c();
            net.minecraft.u.b.b b2 = this.a.aQ.p(am.a);
            b b3 = this.a.aQ.a(b2, 128.0, 128.0);
            if (b3 != null) {
                object = new s(b3.aU, 0.0, b3.aW).a();
                n2 = this.a.l(-((s)object).b * 40.0, 105.0, -((s)object).d * 40.0);
            } else {
                n2 = this.a.l(40.0, b2.k(), 0.0);
            }
            object = new g(b2.cy_(), b2.k(), b2.l());
            this.b = this.a.a(n3, n2, (g)object);
            if (this.b != null) {
                this.b.a();
            }
        }
        this.k();
        if (this.b != null && this.b.b()) {
            this.a.p().a(j.d);
        }
    }

    private void k() {
        if (this.b != null && !this.b.b()) {
            double d2;
            s s2 = this.b.f();
            this.b.a();
            double d3 = s2.b;
            double d4 = s2.d;
            while (!((d2 = s2.c + (double)(this.a.bd().nextFloat() * 20.0f)) >= s2.c)) {
            }
            this.c = new s(d3, d2, d4);
        }
    }
}

