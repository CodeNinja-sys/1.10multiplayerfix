/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.b.b;
import net.minecraft.u.b.o;
import net.minecraft.w.c.c;
import net.minecraft.w.f.e;
import net.minecraft.w.l;

public class p
extends c {
    public p(k k2) {
        super(k2);
    }

    public p(k k2, l l2) {
        super(k2, l2);
    }

    public p(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        net.minecraft.w.c.c.a(a2, "ThrowableExpBottle");
    }

    @Override
    protected float a() {
        return 0.07f;
    }

    @Override
    protected void a(o o2) {
        if (!this.aQ.C) {
            int n2;
            this.aQ.b(2002, new b(this), 0);
            for (int i2 = 3 + this.aQ.p.nextInt(5) + this.aQ.p.nextInt(5); i2 > 0; i2 -= n2) {
                n2 = e.b(i2);
                this.aQ.a(new e(this.aQ, this.aU, this.aV, this.aW, n2));
            }
            this.aa();
        }
    }
}

