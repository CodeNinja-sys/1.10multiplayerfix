/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.u.bp;
import net.minecraft.w.n;

public class x
extends aa {
    public x(f f2) {
        super(f2);
    }

    @Override
    public void a(n n2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        x.a(n2.cT(), d2 - n2.br, d3 - n2.bs, d4 - n2.bt);
        bd.E();
        super.a(n2, d2, d3, d4, f2, f3);
    }

    @Override
    protected bp a(n n2) {
        return null;
    }
}

