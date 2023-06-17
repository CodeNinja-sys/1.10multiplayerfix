/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.a;
import net.minecraft.x.d.b.bh;

public class by
extends bh {
    public by() {
        this.h = true;
    }

    public by(int n2, long l2, long l3, long l4, byte by2, byte by3, boolean bl2) {
        super(n2);
        this.b = (int)l2;
        this.c = (int)l3;
        this.d = (int)l4;
        this.e = by2;
        this.f = by3;
        this.g = bl2;
        this.h = true;
    }

    @Override
    public void a(a a2) {
        super.a(a2);
        this.b = a2.G();
        this.c = a2.G();
        this.d = a2.G();
        this.e = a2.E();
        this.f = a2.E();
        this.g = a2.D();
    }

    @Override
    public void b(a a2) {
        super.b(a2);
        a2.C(this.b);
        a2.C(this.c);
        a2.C(this.d);
        a2.B(this.e);
        a2.B(this.f);
        a2.a(this.g);
    }
}

