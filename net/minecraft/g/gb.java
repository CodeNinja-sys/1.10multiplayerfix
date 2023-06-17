/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.ak;
import net.minecraft.g.b.b;
import net.minecraft.g.b.e;
import net.minecraft.g.c.i;
import net.minecraft.g.cj;
import net.minecraft.g.fh;
import net.minecraft.g.fo;
import net.minecraft.g.ft;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public abstract class gb
extends ft {
    protected e a;

    protected gb() {
        this.z(this.O.b().a(this.h(), (Comparable)((Object)(this.g() == ak.b ? fh.b : fh.a))));
    }

    @Override
    public int k(net.minecraft.g.c.b b2) {
        return ((fh)((Object)b2.a(this.h()))).c();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (fh fh2 : fh.a(this.g())) {
            list.add(new cu(cg2, 1, fh2.c()));
        }
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        return this.v().a(this.h(), (Comparable)((Object)fh.a(this.g(), n2)));
    }

    public abstract ak g();

    public b h() {
        if (this.a == null) {
            this.a = e.a("type", fh.class, new cj(this));
        }
        return this.a;
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        return ((fh)((Object)b2.a(this.h()))).c();
    }

    @Override
    protected i a() {
        return new i(this, this.h());
    }

    @Override
    public fo bS_() {
        return fo.b;
    }
}

