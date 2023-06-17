/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.m.cu;
import net.minecraft.u.b.s;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.n;
import net.minecraft.w.a.b;

public class p
extends n {
    protected net.minecraft.w.n t;
    private boolean u;

    public p(String string, net.minecraft.w.n n2) {
        super(string);
        this.t = n2;
    }

    public p w() {
        this.u = true;
        return this;
    }

    public boolean x() {
        return this.u;
    }

    @Override
    public net.minecraft.w.n j() {
        return this.t;
    }

    @Override
    public a c(net.minecraft.w.l l2) {
        cu cu2 = this.t instanceof net.minecraft.w.l ? ((net.minecraft.w.l)this.t).bC() : null;
        String string = "death.attack." + this.s;
        String string2 = String.valueOf(string) + ".item";
        return cu2 != null && cu2.s() && net.minecraft.u.d.b.a.c(string2) ? new l(string2, l2.aK(), this.t.aK(), cu2.B()) : new l(string, l2.aK(), this.t.aK());
    }

    @Override
    public boolean r() {
        return this.t != null && this.t instanceof net.minecraft.w.l && !(this.t instanceof b);
    }

    @Override
    public s v() {
        return new s(this.t.aU, this.t.aV, this.t.aW);
    }
}

