/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.m.cu;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.p;
import net.minecraft.w.n;

public class q
extends p {
    private final n u;

    public q(String string, n n2, n n3) {
        super(string, n2);
        this.u = n3;
    }

    @Override
    public n i() {
        return this.t;
    }

    @Override
    public n j() {
        return this.u;
    }

    @Override
    public a c(net.minecraft.w.l l2) {
        a a2 = this.u == null ? this.t.aK() : this.u.aK();
        cu cu2 = this.u instanceof net.minecraft.w.l ? ((net.minecraft.w.l)this.u).bC() : null;
        String string = "death.attack." + this.s;
        String string2 = String.valueOf(string) + ".item";
        return cu2 != null && cu2.s() && net.minecraft.u.d.b.a.c(string2) ? new l(string2, l2.aK(), a2, cu2.B()) : new l(string, l2.aK(), a2);
    }
}

