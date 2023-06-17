/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.a;
import net.minecraft.w.b.y;
import net.minecraft.w.e.aq;
import net.minecraft.w.e.as;
import net.minecraft.w.l;

class j
extends y {
    public j(as as2) {
        super(as2, l.class, 10, true, false, new aq());
    }

    @Override
    public boolean e() {
        return this.c.aA() == null ? false : super.e();
    }

    @Override
    protected a a(double d2) {
        ad ad2 = ((as)this.c).p();
        return ad2.l() == ae.a ? this.c.cT().b(4.0, d2, d2) : (ad2.l() == ae.c ? this.c.cT().b(d2, d2, 4.0) : this.c.cT().b(d2, 4.0, d2));
    }
}

