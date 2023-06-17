/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.q;
import net.minecraft.w.f;

public class a
extends q {
    boolean a;
    int b;

    public a(f f2, boolean bl2) {
        super(f2);
        this.c = f2;
        this.a = bl2;
    }

    @Override
    public boolean a() {
        return this.a && this.b > 0 && super.a();
    }

    @Override
    public void b() {
        this.b = 20;
        this.e.a(this.c.aQ, this.d, true);
    }

    @Override
    public void c() {
        if (this.a) {
            this.e.a(this.c.aQ, this.d, false);
        }
    }

    @Override
    public void d() {
        --this.b;
        super.d();
    }
}

