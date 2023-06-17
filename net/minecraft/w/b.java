/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.b.d;
import net.minecraft.h.ad;
import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.w.aj;

public class b
implements aj {
    private final ad a;
    private final net.minecraft.w.a.b b;
    private d c;
    private final a d;

    public b(net.minecraft.w.a.b b2, a a2) {
        this.b = b2;
        this.d = a2;
        this.a = new ad(b2, this);
    }

    @Override
    public net.minecraft.w.a.b s() {
        return this.b;
    }

    @Override
    public void a(net.minecraft.w.a.b b2) {
    }

    @Override
    public d b(net.minecraft.w.a.b b2) {
        return this.c;
    }

    @Override
    public void a(d d2) {
        this.c = d2;
    }

    @Override
    public void a(net.minecraft.b.b b2) {
        b2.g();
    }

    @Override
    public void a(cu cu2) {
    }

    @Override
    public a aK() {
        return this.d != null ? this.d : new l("entity.Villager.name", new Object[0]);
    }
}

