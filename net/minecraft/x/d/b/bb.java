/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.m.cu;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bb
implements p {
    private int a;
    private int b;
    private cu c;

    public bb() {
    }

    public bb(int n2, int n3, cu cu2) {
        this.a = n2;
        this.b = n3;
        this.c = cu2 == null ? null : cu2.j();
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.E();
        this.b = a2.G();
        this.c = a2.i();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.C(this.b);
        a2.a(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public cu c() {
        return this.c;
    }
}

