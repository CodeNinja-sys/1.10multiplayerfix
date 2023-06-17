/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class n
implements p {
    private int a;
    private k b;
    private cu c;

    public n() {
    }

    public n(int n2, k k2, cu cu2) {
        this.a = n2;
        this.b = k2;
        this.c = cu2 == null ? null : cu2.j();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = (k)a2.a(k.class);
        this.c = a2.i();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.a(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public cu a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public k c() {
        return this.b;
    }
}

