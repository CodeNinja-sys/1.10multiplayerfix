/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.q;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class af
extends q {
    public af() {
        super(h.B, false, e.c);
        this.a(d.c);
        this.N = 0.8f;
    }

    @Override
    public c bR_() {
        return c.d;
    }

    @Override
    public void a(k k2, b b2, n n2, float f2) {
        if (n2.G()) {
            super.a(k2, b2, n2, f2);
        } else {
            n2.c(f2, 0.0f);
        }
    }

    @Override
    public void a(k k2, n n2) {
        if (n2.G()) {
            super.a(k2, n2);
        } else if (n2.aY < 0.0) {
            n2.aY = -n2.aY;
            if (!(n2 instanceof l)) {
                n2.aY *= 0.8;
            }
        }
    }

    @Override
    public void a(k k2, b b2, n n2) {
        if (Math.abs(n2.aY) < 0.1 && !n2.G()) {
            double d2 = 0.4 + Math.abs(n2.aY) * 0.2;
            n2.aX *= d2;
            n2.aZ *= d2;
        }
        super.a(k2, b2, n2);
    }
}

