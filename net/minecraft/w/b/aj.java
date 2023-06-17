/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.b.g;
import net.minecraft.b.h;
import net.minecraft.i.a;
import net.minecraft.u.b.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class aj
extends bm {
    private final t a;
    private h b;

    public aj(t t2) {
        this.a = t2;
        if (!(t2.N() instanceof a)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }

    @Override
    public boolean e() {
        if (this.a.aQ.n()) {
            return false;
        }
        b b2 = new b(this.a);
        g g2 = this.a.aQ.U().a(b2, 16);
        if (g2 == null) {
            return false;
        }
        this.b = g2.b(b2);
        return this.b == null ? false : (double)this.b.b(b2) < 2.25;
    }

    @Override
    public boolean a() {
        return this.a.aQ.n() ? false : !this.b.i() && this.b.c(new b(this.a));
    }

    @Override
    public void b() {
        ((a)this.a.N()).a(false);
        ((a)this.a.N()).b(false);
    }

    @Override
    public void c() {
        ((a)this.a.N()).a(true);
        ((a)this.a.N()).b(true);
        this.b = null;
    }

    @Override
    public void d() {
        this.b.b();
    }
}

