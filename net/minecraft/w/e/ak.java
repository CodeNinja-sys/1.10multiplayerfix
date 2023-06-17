/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.a.b;
import net.minecraft.w.b.y;
import net.minecraft.w.e.n;
import net.minecraft.w.l;

class ak
extends y {
    final /* synthetic */ n i;

    public ak(n n2) {
        this.i = n2;
        super(n2, b.class, 20, true, true, null);
    }

    @Override
    public boolean e() {
        if (this.i.ba()) {
            return false;
        }
        if (super.e()) {
            for (n n2 : this.i.aQ.a(n.class, this.i.cT().b(8.0, 4.0, 8.0))) {
                if (!n2.ba()) continue;
                return true;
            }
        }
        this.i.c((l)null);
        return false;
    }

    @Override
    protected double f() {
        return super.f() * 0.5;
    }
}

