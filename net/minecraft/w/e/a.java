/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.q.l;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.w.a.b;
import net.minecraft.w.b.y;
import net.minecraft.w.e.as;
import net.minecraft.w.t;

class a
extends y {
    final /* synthetic */ as i;

    public a(as as2, as as3) {
        this.i = as2;
        super((t)as3, b.class, true);
    }

    @Override
    public boolean e() {
        return this.i.aQ.R() == l.a ? false : super.e();
    }

    @Override
    protected net.minecraft.u.b.a a(double d2) {
        ad ad2 = ((as)this.c).p();
        return ad2.l() == ae.a ? this.c.cT().b(4.0, d2, d2) : (ad2.l() == ae.c ? this.c.cT().b(d2, d2, 4.0) : this.c.cT().b(d2, 4.0, d2));
    }
}

