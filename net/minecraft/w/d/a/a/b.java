/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.i.i;
import net.minecraft.q.g.a.am;
import net.minecraft.u.b.s;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.j;
import net.minecraft.w.d.a.a.k;

public class b
extends k {
    private boolean b;
    private i c;
    private s d;

    public b(a a2) {
        super(a2);
    }

    @Override
    public void b() {
        if (this.b) {
            this.b = false;
            this.j();
        } else {
            net.minecraft.u.b.b b2 = this.a.aQ.p(am.a);
            double d2 = this.a.d(b2);
            if (d2 > 100.0) {
                this.a.p().a(j.a);
            }
        }
    }

    @Override
    public void e() {
        this.b = true;
        this.c = null;
        this.d = null;
    }

    private void j() {
        int n2 = this.a.c();
        s s2 = this.a.p(1.0f);
        int n3 = this.a.l(-s2.b * 40.0, 105.0, -s2.d * 40.0);
        if (this.a.q() != null && this.a.q().c() >= 0) {
            if ((n3 %= 12) < 0) {
                n3 += 12;
            }
        } else {
            n3 -= 12;
            n3 &= 7;
            n3 += 12;
        }
        this.c = this.a.a(n2, n3, null);
        if (this.c != null) {
            this.c.a();
            this.k();
        }
    }

    private void k() {
        double d2;
        s s2 = this.c.f();
        this.c.a();
        while (!((d2 = s2.c + (double)(this.a.bd().nextFloat() * 20.0f)) >= s2.c)) {
        }
        this.d = new s(s2.b, d2, s2.d);
    }

    @Override
    public s f() {
        return this.d;
    }

    @Override
    public j g() {
        return j.e;
    }
}

