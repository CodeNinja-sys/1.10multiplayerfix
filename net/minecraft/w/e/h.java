/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.aa;
import net.minecraft.w.e.c;
import net.minecraft.w.l;

class h
extends aa {
    public h(c c2) {
        super(c2, 1.0, true);
    }

    @Override
    public boolean a() {
        float f2 = this.b.n(1.0f);
        if (f2 >= 0.5f && this.b.bd().nextInt(100) == 0) {
            this.b.c((l)null);
            return false;
        }
        return super.a();
    }

    @Override
    protected double a(l l2) {
        return 4.0f + l2.bl;
    }
}

