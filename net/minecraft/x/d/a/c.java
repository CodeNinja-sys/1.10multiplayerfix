/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.a.l;

public class c
extends l {
    public c() {
        this.g = true;
    }

    public c(double d2, double d3, double d4, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.f = bl2;
        this.g = true;
    }

    @Override
    public void a(a a2) {
        this.a = a2.P();
        this.b = a2.P();
        this.c = a2.P();
        super.a(a2);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
        a2.a(this.c);
        super.b(a2);
    }
}

