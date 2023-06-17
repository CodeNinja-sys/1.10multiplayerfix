/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.i.a;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.av;
import net.minecraft.w.e.e;

class bd
extends bm {
    private final av a;

    public bd(av av2) {
        this.a = av2;
        this.b(5);
        ((a)av2.N()).c(true);
    }

    @Override
    public boolean e() {
        return this.a.cm() || this.a.cq();
    }

    @Override
    public void d() {
        if (this.a.bd().nextFloat() < 0.8f) {
            this.a.M().a();
        }
        ((e)this.a.L()).a(1.2);
    }
}

