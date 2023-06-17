/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.s;
import net.minecraft.w.h.ai;
import net.minecraft.w.l;

public class aq
extends s {
    ai a;
    l b;
    private int g;

    public aq(ai ai2) {
        super(ai2, false);
        this.a = ai2;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (!this.a.z()) {
            return false;
        }
        l l2 = this.a.do();
        if (l2 == null) {
            return false;
        }
        this.b = l2.bg();
        int n2 = l2.bh();
        return n2 != this.g && this.a(this.b, false) && this.a.a(this.b, l2);
    }

    @Override
    public void b() {
        this.c.c(this.b);
        l l2 = this.a.do();
        if (l2 != null) {
            this.g = l2.bh();
        }
        super.b();
    }
}

