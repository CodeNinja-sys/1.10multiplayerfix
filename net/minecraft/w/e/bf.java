/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.a.c;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.av;
import net.minecraft.w.e.e;

class bf
extends bm {
    private final av a;
    private float b;
    private int c;

    public bf(av av2) {
        this.a = av2;
        this.b(2);
    }

    @Override
    public boolean e() {
        return this.a.W() == null && (this.a.be || this.a.cm() || this.a.cq() || this.a.b(net.minecraft.a.c.y));
    }

    @Override
    public void d() {
        if (--this.c <= 0) {
            this.c = 40 + this.a.bd().nextInt(60);
            this.b = this.a.bd().nextInt(360);
        }
        ((e)this.a.L()).a(this.b, false);
    }
}

