/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.a;
import net.minecraft.x.d.b.bh;

public class bp
extends bh {
    public bp() {
    }

    public bp(int n2, long l2, long l3, long l4, boolean bl2) {
        super(n2);
        this.b = (int)l2;
        this.c = (int)l3;
        this.d = (int)l4;
        this.g = bl2;
    }

    @Override
    public void a(a a2) {
        super.a(a2);
        this.b = a2.G();
        this.c = a2.G();
        this.d = a2.G();
        this.g = a2.D();
    }

    @Override
    public void b(a a2) {
        super.b(a2);
        a2.C(this.b);
        a2.C(this.c);
        a2.C(this.d);
        a2.a(this.g);
    }
}

