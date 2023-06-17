/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.i.i;
import net.minecraft.q.g.a.am;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.h;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;
import net.minecraft.w.f.ad;

public class l
extends k {
    private i b;
    private s c;
    private boolean d;

    public l(a a2) {
        super(a2);
    }

    @Override
    public j g() {
        return j.a;
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
    public void e() {
        this.b = null;
        this.c = null;
    }

    @Override
    public s f() {
        return this.c;
    }

    private void j() {
        int n2;
        if (this.b != null && this.b.b()) {
            net.minecraft.u.b.b b2 = this.a.aQ.p(new net.minecraft.u.b.b(am.a));
            int n3 = n2 = this.a.q() == null ? 0 : this.a.q().c();
            if (this.a.bd().nextInt(n2 + 3) == 0) {
                this.a.p().a(j.c);
                return;
            }
            double d2 = 64.0;
            b b3 = this.a.aQ.a(b2, d2, d2);
            if (b3 != null) {
                d2 = b3.d(b2) / 512.0;
            }
            if (b3 != null && (this.a.bd().nextInt(n.a((int)d2) + 2) == 0 || this.a.bd().nextInt(n2 + 2) == 0)) {
                this.a(b3);
                return;
            }
        }
        if (this.b == null || this.b.b()) {
            int n4;
            n2 = n4 = this.a.c();
            if (this.a.bd().nextInt(8) == 0) {
                this.d = !this.d;
                n2 = n4 + 6;
            }
            n2 = this.d ? ++n2 : --n2;
            if (this.a.q() != null && this.a.q().c() >= 0) {
                if ((n2 %= 12) < 0) {
                    n2 += 12;
                }
            } else {
                n2 -= 12;
                n2 &= 7;
                n2 += 12;
            }
            this.b = this.a.a(n4, n2, null);
            if (this.b != null) {
                this.b.a();
            }
        }
        this.k();
    }

    private void a(b b2) {
        this.a.p().a(j.b);
        ((h)this.a.p().b(j.b)).a(b2);
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

    @Override
    public void a(ad ad2, net.minecraft.u.b.b b2, net.minecraft.u.n n2, b b3) {
        if (b3 != null) {
            this.a(b3);
        }
    }
}

