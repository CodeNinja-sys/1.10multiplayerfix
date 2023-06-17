/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.f.ap;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.p;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.ad;

public abstract class a
extends cn
implements p {
    protected a(h h2) {
        this(h2, h2.p());
    }

    protected a(h h2, e e2) {
        super(h2, e2);
        this.I = true;
    }

    protected boolean a(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return k2.n(b2.a(ad2)).d() == h.A;
    }

    protected boolean a(k k2, net.minecraft.u.b.b b2) {
        return this.a(k2, b2, ad.c) || this.a(k2, b2, ad.d) || this.a(k2, b2, ad.e) || this.a(k2, b2, ad.f);
    }

    @Override
    public ac a(b b2) {
        return ac.a;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        super.a(k2, b2, b3);
        k2.r(b2);
    }

    @Override
    public boolean a(b b2, k k2, net.minecraft.u.b.b b3, int n2, int n3) {
        super.a(b2, k2, b3, n2, n3);
        ap ap2 = k2.q(b3);
        return ap2 == null ? false : ap2.c(n2, n3);
    }
}

