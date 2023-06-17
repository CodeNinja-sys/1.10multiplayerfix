/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.cn;
import net.minecraft.m.cb;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.w.a.b;

public class bk
extends cb {
    private final cn b;
    private final cn c;

    public bk(int n2, float f2, cn cn2, cn cn3) {
        super(n2, f2, false);
        this.b = cn2;
        this.c = cn3;
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (ad2 == ad.b && b2.a(b3.a(ad2), ad2, cu2) && k2.n(b3).c() == this.c && k2.c(b3.b())) {
            k2.a(b3.b(), this.b.v(), 11);
            --cu2.b;
            return ab.a;
        }
        return ab.c;
    }
}

