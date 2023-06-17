/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import java.util.List;
import net.minecraft.a.c;
import net.minecraft.d.j;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.b;
import net.minecraft.u.n;
import net.minecraft.w.a;
import net.minecraft.w.c.q;
import net.minecraft.w.l;

public class o
extends q {
    public o(k k2) {
        super(k2);
        this.d(0.3125f, 0.3125f);
    }

    public o(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.d(0.3125f, 0.3125f);
    }

    public o(k k2, l l2, double d2, double d3, double d4) {
        super(k2, l2, d2, d3, d4);
        this.d(0.3125f, 0.3125f);
    }

    public static void a(net.minecraft.u.a.a a2) {
        q.a(a2, "DragonFireball");
    }

    @Override
    protected void a(net.minecraft.u.b.o o2) {
        if (!this.aQ.C) {
            List list = this.aQ.a(l.class, this.cT().b(4.0, 2.0, 4.0));
            a a2 = new a(this.aQ, this.aU, this.aV, this.aW);
            a2.a(this.b);
            a2.a(aj.Q);
            a2.a(3.0f);
            a2.d(2400);
            a2.c((7.0f - a2.a()) / (float)a2.i());
            a2.a(new j(net.minecraft.a.c.g, 1, 1));
            if (!list.isEmpty()) {
                for (l l2 : list) {
                    double d2 = this.n(l2);
                    if (!(d2 < 16.0)) continue;
                    a2.e(l2.aU, l2.aV, l2.aW);
                    break;
                }
            }
            this.aQ.b(2006, new b(this.aU, this.aV, this.aW), 0);
            this.aQ.a(a2);
            this.aa();
        }
    }

    @Override
    public boolean cg_() {
        return false;
    }

    @Override
    public boolean a(n n2, float f2) {
        return false;
    }

    @Override
    protected aj cz_() {
        return aj.Q;
    }

    @Override
    protected boolean f() {
        return false;
    }
}

