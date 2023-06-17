/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.bm;
import net.minecraft.w.d;
import net.minecraft.w.e.g;
import net.minecraft.w.l;
import net.minecraft.w.n;

class at
extends bm {
    private final g a;
    private int b;

    public at(g g2) {
        this.a = g2;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        return l2 != null && l2.br();
    }

    @Override
    public boolean a() {
        return super.a() && (this.a.q() || this.a.n(this.a.W()) > 9.0);
    }

    @Override
    public void b() {
        this.b = -10;
        this.a.N().m();
        this.a.I().a(this.a.W(), 90.0f, 90.0f);
        this.a.bO = true;
    }

    @Override
    public void c() {
        g.a(this.a, 0);
        this.a.c((l)null);
        g.a(this.a).f();
    }

    @Override
    public void d() {
        l l2 = this.a.W();
        this.a.N().m();
        this.a.I().a(l2, 90.0f, 90.0f);
        if (!this.a.l(l2)) {
            this.a.c((l)null);
        } else {
            ++this.b;
            if (this.b == 0) {
                g.a(this.a, this.a.W().ca());
                this.a.aQ.a((n)this.a, (byte)21);
            } else if (this.b >= this.a.p()) {
                float f2 = 1.0f;
                if (this.a.aQ.R() == net.minecraft.q.l.d) {
                    f2 += 2.0f;
                }
                if (this.a.q()) {
                    f2 += 2.0f;
                }
                l2.a(net.minecraft.u.n.b(this.a, this.a), f2);
                l2.a(net.minecraft.u.n.a(this.a), (float)this.a.a(d.e).f());
                this.a.c((l)null);
            }
            super.d();
        }
    }
}

