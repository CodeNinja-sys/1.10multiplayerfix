/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.x.d.b.j;

public class g
extends ap {
    private cg a;
    private int b;

    public g() {
    }

    public g(cg cg2, int n2) {
        this.a = cg2;
        this.b = n2;
    }

    public static void a(a a2) {
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        bp bp2 = (bp)cg.e.b(this.a);
        e2.a("Item", bp2 == null ? "" : bp2.toString());
        e2.a("Data", this.b);
        return e2;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = e2.b("Item", 8) ? cg.c(e2.l("Item")) : cg.c(e2.h("Item"));
        this.b = e2.h("Data");
    }

    @Override
    public j bJ_() {
        return new j(this.l, 5, this.d());
    }

    @Override
    public e d() {
        return this.a(new e());
    }

    public void a(cg cg2, int n2) {
        this.a = cg2;
        this.b = n2;
    }

    public cu a() {
        return this.a == null ? null : new cu(this.a, 1, this.b);
    }

    public cg b() {
        return this.a;
    }

    public int e() {
        return this.b;
    }
}

