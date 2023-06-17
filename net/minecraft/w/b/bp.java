/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.h.k;
import net.minecraft.i.a;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class bp
extends bm {
    private final t a;

    public bp(t t2) {
        this.a = t2;
    }

    @Override
    public boolean e() {
        return this.a.aQ.n() && this.a.a(k.f) == null;
    }

    @Override
    public void b() {
        ((a)this.a.N()).d(true);
    }

    @Override
    public void c() {
        ((a)this.a.N()).d(false);
    }
}

