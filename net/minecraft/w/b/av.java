/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.i.a;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;

public class av
extends bm {
    private final f a;

    public av(f f2) {
        this.a = f2;
        this.b(4);
        ((a)f2.N()).c(true);
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
    }
}

