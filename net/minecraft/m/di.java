/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f.l;
import net.minecraft.w.f.q;
import net.minecraft.w.j;

public class di
extends cg {
    private final Class a;

    public di(Class class_) {
        this.a = class_;
        this.a(d.c);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        net.minecraft.u.b.b b4 = b3.a(ad2);
        if (ad2 != ad.a && ad2 != ad.b && b2.a(b4, ad2, cu2)) {
            j j2 = this.a(k2, b4, ad2);
            if (j2 != null && j2.c()) {
                if (!k2.C) {
                    j2.i();
                    k2.a(j2);
                }
                --cu2.b;
            }
            return ab.a;
        }
        return ab.c;
    }

    private j a(k k2, net.minecraft.u.b.b b2, ad ad2) {
        return this.a == q.class ? new q(k2, b2, ad2) : (this.a == l.class ? new l(k2, b2, ad2) : null);
    }
}

