/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.f;
import net.minecraft.w.b.bm;
import net.minecraft.w.c.j;
import net.minecraft.w.e.as;
import net.minecraft.w.l;

class z
extends bm {
    private int b;
    final /* synthetic */ as a;

    public z(as as2) {
        this.a = as2;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        return l2 != null && l2.br() ? this.a.aQ.R() != net.minecraft.q.l.a : false;
    }

    @Override
    public void b() {
        this.b = 20;
        this.a.b(100);
    }

    @Override
    public void c() {
        this.a.b(0);
    }

    @Override
    public void d() {
        if (this.a.aQ.R() != net.minecraft.q.l.a) {
            --this.b;
            l l2 = this.a.W();
            this.a.I().a(l2, 180.0f, 180.0f);
            double d2 = this.a.n(l2);
            if (d2 < 400.0) {
                if (this.b <= 0) {
                    this.b = 20 + as.a(this.a).nextInt(10) * 20 / 2;
                    j j2 = new j(this.a.aQ, this.a, l2, this.a.p().l());
                    this.a.aQ.a(j2);
                    this.a.a(f.fn, 2.0f, (as.a(this.a).nextFloat() - as.a(this.a).nextFloat()) * 0.2f + 1.0f);
                }
            } else {
                this.a.c((l)null);
            }
            super.d();
        }
    }
}

