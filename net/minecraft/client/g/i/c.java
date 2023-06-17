/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.t;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.bp;
import net.minecraft.w.n;

public class c
extends aa {
    protected final cg a;
    private final t b;

    public c(f f2, cg cg2, t t2) {
        super(f2);
        this.a = cg2;
        this.b = t2;
    }

    @Override
    public void a(n n2, double d2, double d3, double d4, float f2, float f3) {
        bd.D();
        bd.c((float)d2, (float)d3, (float)d4);
        bd.A();
        bd.b(-this.c.e, 0.0f, 1.0f, 0.0f);
        bd.b((float)(this.c.g.as == 2 ? -1 : 1) * this.c.f, 1.0f, 0.0f, 0.0f);
        bd.b(180.0f, 0.0f, 1.0f, 0.0f);
        this.a(net.minecraft.client.g.a.f.b);
        if (this.f) {
            bd.g();
            bd.e(this.c(n2));
        }
        this.b.a(this.b(n2), ao.h);
        if (this.f) {
            bd.m();
            bd.h();
        }
        bd.B();
        bd.E();
        super.a(n2, d2, d3, d4, f2, f3);
    }

    public cu b(n n2) {
        return new cu(this.a);
    }

    @Override
    protected bp a(n n2) {
        return net.minecraft.client.g.a.f.b;
    }
}

