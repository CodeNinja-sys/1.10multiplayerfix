/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.g.c.b;
import net.minecraft.i.a;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.ai;
import net.minecraft.w.l;

public class g
extends bm {
    private final ai d;
    private l e;
    k a;
    private final double f;
    private final j g;
    private int h;
    float b;
    float c;
    private float i;

    public g(ai ai2, double d2, float f2, float f3) {
        this.d = ai2;
        this.a = ai2.aQ;
        this.f = d2;
        this.g = ai2.N();
        this.c = f2;
        this.b = f3;
        this.b(3);
        if (!(ai2.N() instanceof a)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    @Override
    public boolean e() {
        l l2 = this.d.do();
        if (l2 == null) {
            return false;
        }
        if (l2 instanceof net.minecraft.w.a.b && ((net.minecraft.w.a.b)l2).a()) {
            return false;
        }
        if (this.d.E()) {
            return false;
        }
        if (this.d.n(l2) < (double)(this.c * this.c)) {
            return false;
        }
        this.e = l2;
        return true;
    }

    @Override
    public boolean a() {
        return !this.g.l() && this.d.n(this.e) > (double)(this.b * this.b) && !this.d.E();
    }

    @Override
    public void b() {
        this.h = 0;
        this.i = this.d.a(net.minecraft.i.h.g);
        this.d.a(net.minecraft.i.h.g, 0.0f);
    }

    @Override
    public void c() {
        this.e = null;
        this.g.m();
        this.d.a(net.minecraft.i.h.g, this.i);
    }

    private boolean a(net.minecraft.u.b.b b2) {
        b b3 = this.a.n(b2);
        return b3.d() == net.minecraft.g.a.h.a ? true : !b3.k();
    }

    @Override
    public void d() {
        this.d.I().a(this.e, 10.0f, (float)this.d.ao());
        if (!this.d.E() && --this.h <= 0) {
            this.h = 10;
            if (!this.g.a(this.e, this.f) && !this.d.aO() && this.d.n(this.e) >= 144.0) {
                int n2 = n.c(this.e.aU) - 2;
                int n3 = n.c(this.e.aW) - 2;
                int n4 = n.c(this.e.cT().b);
                for (int i2 = 0; i2 <= 4; ++i2) {
                    for (int i3 = 0; i3 <= 4; ++i3) {
                        if (i2 >= 1 && i3 >= 1 && i2 <= 3 && i3 <= 3 || !this.a.n(new net.minecraft.u.b.b(n2 + i2, n4 - 1, n3 + i3)).t() || !this.a(new net.minecraft.u.b.b(n2 + i2, n4, n3 + i3)) || !this.a(new net.minecraft.u.b.b(n2 + i2, n4 + 1, n3 + i3))) continue;
                        this.d.b((float)(n2 + i2) + 0.5f, n4, (float)(n3 + i3) + 0.5f, this.d.ba, this.d.bb);
                        this.g.m();
                        return;
                    }
                }
            }
        }
    }
}

