/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.b.g;
import net.minecraft.w.b.s;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bj;
import net.minecraft.w.l;

public class ai
extends s {
    bj a;
    l b;

    public ai(bj bj2) {
        super(bj2, false, true);
        this.a = bj2;
        this.b(1);
    }

    @Override
    public boolean e() {
        g g2 = this.a.c();
        if (g2 == null) {
            return false;
        }
        this.b = g2.b(this.a);
        if (this.b instanceof bi) {
            return false;
        }
        if (this.a(this.b, false)) {
            return true;
        }
        if (this.c.bd().nextInt(20) == 0) {
            this.b = g2.c(this.a);
            return this.a(this.b, false);
        }
        return false;
    }

    @Override
    public void b() {
        this.a.c(this.b);
        super.b();
    }
}

