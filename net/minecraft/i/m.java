/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.a;
import net.minecraft.i.i;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class m
extends a {
    private b g;

    public m(f f2, k k2) {
        super(f2, k2);
    }

    @Override
    public i a(b b2) {
        this.g = b2;
        return super.a(b2);
    }

    @Override
    public i a(n n2) {
        this.g = new b(n2);
        return super.a(n2);
    }

    @Override
    public boolean a(n n2, double d2) {
        i i2 = this.a(n2);
        if (i2 != null) {
            return this.a(i2, d2);
        }
        this.g = new b(n2);
        this.d = d2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void k() {
        block4: {
            block5: {
                if (!this.l()) {
                    super.k();
                    return;
                }
                if (this.g == null) return;
                double d2 = this.a.bl * this.a.bl;
                if (!(this.a.d(this.g) >= d2)) break block4;
                if (this.a.aV <= (double)this.g.k()) break block5;
                b b2 = new b(this.g.cy_(), net.minecraft.u.b.n.c(this.a.aV), this.g.l());
                if (!(this.a.d(b2) >= d2)) break block4;
            }
            this.a.L().a(this.g.cy_(), this.g.k(), this.g.l(), this.d);
            return;
        }
        this.g = null;
    }
}

