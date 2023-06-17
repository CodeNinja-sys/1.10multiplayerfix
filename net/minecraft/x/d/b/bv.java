/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.a;
import net.minecraft.x.d.b.bh;

public class bv
extends bh {
    public bv() {
        this.h = true;
    }

    public bv(int n2, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.e = by2;
        this.f = by3;
        this.h = true;
        this.g = bl2;
    }

    @Override
    public void a(a a2) {
        super.a(a2);
        this.e = a2.E();
        this.f = a2.E();
        this.g = a2.D();
    }

    @Override
    public void b(a a2) {
        super.b(a2);
        a2.B(this.e);
        a2.B(this.f);
        a2.a(this.g);
    }
}

