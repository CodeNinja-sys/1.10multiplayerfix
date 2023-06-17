/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.n;
import net.minecraft.u.ad;

public class q
extends cn {
    private final boolean a;

    protected q(h h2, boolean bl2) {
        this(h2, bl2, h2.p());
    }

    protected q(h h2, boolean bl2, e e2) {
        super(h2, e2);
        this.a = bl2;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        b b4 = n2.n(b3.a(ad2));
        cn cn2 = b4.c();
        if (this == p.w || this == p.cG) {
            if (b2 != b4) {
                return true;
            }
            if (cn2 == this) {
                return false;
            }
        }
        return !this.a && cn2 == this ? false : super.a(b2, n2, b3, ad2);
    }
}

