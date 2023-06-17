/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.e.e;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.b.o;
import net.minecraft.w.c.q;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class g
extends q {
    public int a = 1;

    public g(k k2) {
        super(k2);
    }

    public g(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
    }

    public g(k k2, l l2, double d2, double d3, double d4) {
        super(k2, l2, d2, d3, d4);
    }

    @Override
    protected void a(o o2) {
        if (!this.aQ.C) {
            if (o2.d != null) {
                o2.d.a(net.minecraft.u.n.a(this, (n)this.b), 6.0f);
                this.a(this.b, o2.d);
            }
            boolean bl2 = this.aQ.G().b("mobGriefing");
            this.aQ.a(null, this.aU, this.aV, this.aW, (float)this.a, bl2, bl2);
            this.aa();
        }
    }

    public static void a(a a2) {
        q.a(a2, "Fireball");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        e2.a("ExplosionPower", this.a);
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.b("ExplosionPower", 99)) {
            this.a = e2.h("ExplosionPower");
        }
    }
}

