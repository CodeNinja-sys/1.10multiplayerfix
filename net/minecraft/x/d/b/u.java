/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.m.cg;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class u
implements p {
    private cg a;
    private int b;

    public u() {
    }

    public u(cg cg2, int n2) {
        this.a = cg2;
        this.b = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = cg.c(a2.e());
        this.b = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(cg.a(this.a));
        a2.d(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public cg a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

