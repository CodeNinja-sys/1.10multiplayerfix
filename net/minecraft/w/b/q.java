/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ga;
import net.minecraft.i.a;
import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;

public abstract class q
extends bm {
    protected f c;
    protected net.minecraft.u.b.b d = net.minecraft.u.b.b.c;
    protected ga e;
    boolean f;
    float g;
    float h;

    public q(f f2) {
        this.c = f2;
        if (!(f2.N() instanceof a)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    @Override
    public boolean e() {
        if (!this.c.bf) {
            return false;
        }
        a a2 = (a)this.c.N();
        i i2 = a2.j();
        if (i2 != null && !i2.b() && a2.e()) {
            for (int i3 = 0; i3 < Math.min(i2.e() + 2, i2.d()); ++i3) {
                g g2 = i2.a(i3);
                this.d = new net.minecraft.u.b.b(g2.a, g2.b + 1, g2.c);
                if (!(this.c.h(this.d.cy_(), this.c.aV, this.d.l()) <= 2.25)) continue;
                this.e = this.a(this.d);
                if (this.e == null) continue;
                return true;
            }
            this.d = new net.minecraft.u.b.b(this.c).b();
            this.e = this.a(this.d);
            return this.e != null;
        }
        return false;
    }

    @Override
    public boolean a() {
        return !this.f;
    }

    @Override
    public void b() {
        this.f = false;
        this.g = (float)((double)((float)this.d.cy_() + 0.5f) - this.c.aU);
        this.h = (float)((double)((float)this.d.l() + 0.5f) - this.c.aW);
    }

    @Override
    public void d() {
        float f2;
        float f3 = (float)((double)((float)this.d.cy_() + 0.5f) - this.c.aU);
        float f4 = this.g * f3 + this.h * (f2 = (float)((double)((float)this.d.l() + 0.5f) - this.c.aW));
        if (f4 < 0.0f) {
            this.f = true;
        }
    }

    private ga a(net.minecraft.u.b.b b2) {
        b b3 = this.c.aQ.n(b2);
        cn cn2 = b3.c();
        return cn2 instanceof ga && b3.d() == net.minecraft.g.a.h.d ? (ga)cn2 : null;
    }
}

