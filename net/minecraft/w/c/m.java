/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.a.w;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.w.c.c;
import net.minecraft.w.h.ah;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class m
extends c {
    public m(k k2) {
        super(k2);
    }

    public m(k k2, l l2) {
        super(k2, l2);
    }

    public m(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        net.minecraft.w.c.c.a(a2, "ThrownEgg");
    }

    @Override
    protected void a(o o2) {
        if (o2.d != null) {
            o2.d.a(net.minecraft.u.n.a((n)this, (n)this.c()), 0.0f);
        }
        if (!this.aQ.C && this.bx.nextInt(8) == 0) {
            int n2 = 1;
            if (this.bx.nextInt(32) == 0) {
                n2 = 4;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                ah ah2 = new ah(this.aQ);
                ah2.e(-24000);
                ah2.b(this.aU, this.aV, this.aW, this.ba, 0.0f);
                this.aQ.a(ah2);
            }
        }
        double d2 = 0.08;
        for (int i3 = 0; i3 < 8; ++i3) {
            this.aQ.a(aj.K, this.aU, this.aV, this.aW, ((double)this.bx.nextFloat() - 0.5) * 0.08, ((double)this.bx.nextFloat() - 0.5) * 0.08, ((double)this.bx.nextFloat() - 0.5) * 0.08, cg.a(w.aW));
        }
        if (!this.aQ.C) {
            this.aa();
        }
    }
}

