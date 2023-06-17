/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.w;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ah;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.e;
import net.minecraft.w.n;

public class b
extends bm {
    private final e a;
    private net.minecraft.w.a.b b;
    private final k c;
    private final float d;
    private int e;

    public b(e e2, float f2) {
        this.a = e2;
        this.c = e2.aQ;
        this.d = f2;
        this.b(2);
    }

    @Override
    public boolean e() {
        this.b = this.c.a((n)this.a, (double)this.d);
        return this.b == null ? false : this.a(this.b);
    }

    @Override
    public boolean a() {
        return !this.b.br() ? false : (this.a.n(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b));
    }

    @Override
    public void b() {
        this.a.d(true);
        this.e = 40 + this.a.bd().nextInt(40);
    }

    @Override
    public void c() {
        this.a.d(false);
        this.b = null;
    }

    @Override
    public void d() {
        this.a.I().a(this.b.aU, this.b.aV + (double)this.b.ce_(), this.b.aW, 10.0f, this.a.ao());
        --this.e;
    }

    private boolean a(net.minecraft.w.a.b b2) {
        for (ah ah2 : ah.values()) {
            cu cu2 = b2.c(ah2);
            if (cu2 == null) continue;
            if (this.a.z() && cu2.a() == w.be) {
                return true;
            }
            if (!this.a.a(cu2)) continue;
            return true;
        }
        return false;
    }
}

