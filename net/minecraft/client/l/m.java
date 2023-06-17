/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import net.minecraft.c.a;
import net.minecraft.c.c.c;
import net.minecraft.x.ak;

public class m
implements net.minecraft.x.b.a {
    private final a a;
    private final ak b;

    public m(a a2, ak ak2) {
        this.a = a2;
        this.b = ak2;
    }

    @Override
    public void a(net.minecraft.x.b.a.a a2) {
        this.b.a(a2.a());
        this.b.a(new c(this.a, this.b));
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
    }
}

