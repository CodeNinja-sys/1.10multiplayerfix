/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.a.p;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.b.b;
import net.minecraft.u.b.o;
import net.minecraft.w.c.q;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class d
extends q {
    public d(k k2) {
        super(k2);
        this.d(0.3125f, 0.3125f);
    }

    public d(k k2, l l2, double d2, double d3, double d4) {
        super(k2, l2, d2, d3, d4);
        this.d(0.3125f, 0.3125f);
    }

    public d(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.d(0.3125f, 0.3125f);
    }

    public static void a(a a2) {
        q.a(a2, "SmallFireball");
    }

    @Override
    protected void a(o o2) {
        if (!this.aQ.C) {
            if (o2.d != null) {
                boolean bl2;
                if (!o2.d.ck() && (bl2 = o2.d.a(net.minecraft.u.n.a(this, (n)this.b), 5.0f))) {
                    this.a(this.b, o2.d);
                    o2.d.k(5);
                }
            } else {
                b b2;
                boolean bl3 = true;
                if (this.b != null && this.b instanceof f) {
                    bl3 = this.aQ.G().b("mobGriefing");
                }
                if (bl3 && this.aQ.c(b2 = o2.a().a(o2.b))) {
                    this.aQ.b(b2, p.ab.v());
                }
            }
            this.aa();
        }
    }

    @Override
    public boolean cg_() {
        return false;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return false;
    }
}

