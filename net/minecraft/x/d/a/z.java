/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.a.l;

public class z
extends l {
    public z() {
        this.g = true;
        this.h = true;
    }

    public z(double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = f3;
        this.f = bl2;
        this.h = true;
        this.g = true;
    }

    @Override
    public void a(a a2) {
        this.a = a2.P();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.O();
        this.e = a2.O();
        super.a(a2);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
        super.b(a2);
    }
}

