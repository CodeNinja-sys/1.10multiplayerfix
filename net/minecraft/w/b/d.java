/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.aa;

public class d
extends aa {
    private final net.minecraft.w.e.d h;
    private int i;

    public d(net.minecraft.w.e.d d2, double d3, boolean bl2) {
        super(d2, d3, bl2);
        this.h = d2;
    }

    @Override
    public void b() {
        super.b();
        this.i = 0;
    }

    @Override
    public void c() {
        super.c();
        this.h.a(false);
    }

    @Override
    public void d() {
        super.d();
        ++this.i;
        if (this.i >= 5 && this.c < 10) {
            this.h.a(true);
        } else {
            this.h.a(false);
        }
    }
}

