/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import net.minecraft.e.e;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class b {
    private cu a;
    private cu b;
    private cu c;
    private int d;
    private int e;
    private boolean f;

    public b(e e2) {
        this.a(e2);
    }

    public b(cu cu2, cu cu3, cu cu4) {
        this(cu2, cu3, cu4, 0, 7);
    }

    public b(cu cu2, cu cu3, cu cu4, int n2, int n3) {
        this.a = cu2;
        this.b = cu3;
        this.c = cu4;
        this.d = n2;
        this.e = n3;
        this.f = true;
    }

    public b(cu cu2, cu cu3) {
        this(cu2, null, cu3);
    }

    public b(cu cu2, cg cg2) {
        this(cu2, new cu(cg2));
    }

    public cu a() {
        return this.a;
    }

    public cu b() {
        return this.b;
    }

    public boolean c() {
        return this.b != null;
    }

    public cu d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public void g() {
        ++this.d;
    }

    public void a(int n2) {
        this.e += n2;
    }

    public boolean h() {
        return this.d >= this.e;
    }

    public void i() {
        this.d = this.e;
    }

    public boolean j() {
        return this.f;
    }

    public void a(e e2) {
        e e3 = e2.o("buy");
        this.a = cu.a(e3);
        e e4 = e2.o("sell");
        this.c = cu.a(e4);
        if (e2.b("buyB", 10)) {
            this.b = cu.a(e2.o("buyB"));
        }
        if (e2.b("uses", 99)) {
            this.d = e2.h("uses");
        }
        this.e = e2.b("maxUses", 99) ? e2.h("maxUses") : 7;
        this.f = e2.b("rewardExp", 1) ? e2.p("rewardExp") : true;
    }

    public e k() {
        e e2 = new e();
        e2.a("buy", this.a.b(new e()));
        e2.a("sell", this.c.b(new e()));
        if (this.b != null) {
            e2.a("buyB", this.b.b(new e()));
        }
        e2.a("uses", this.d);
        e2.a("maxUses", this.e);
        e2.a("rewardExp", this.f);
        return e2;
    }
}

