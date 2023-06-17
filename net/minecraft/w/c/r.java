/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.o;
import net.minecraft.w.c.c;
import net.minecraft.w.e.aa;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class r
extends c {
    public r(k k2) {
        super(k2);
    }

    public r(k k2, l l2) {
        super(k2, l2);
    }

    public r(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        net.minecraft.w.c.c.a(a2, "Snowball");
    }

    @Override
    protected void a(o o2) {
        int n2;
        if (o2.d != null) {
            n2 = 0;
            if (o2.d instanceof aa) {
                n2 = 3;
            }
            o2.d.a(net.minecraft.u.n.a((n)this, (n)this.c()), (float)n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.aQ.a(aj.F, this.aU, this.aV, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
        if (!this.aQ.C) {
            this.aa();
        }
    }
}

