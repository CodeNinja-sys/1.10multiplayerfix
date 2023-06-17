/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.m.cu;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class r
implements p {
    private int a;
    private cu b;

    public r() {
    }

    public r(int n2, cu cu2) {
        this.a = n2;
        this.b = cu2 != null ? cu2.j() : null;
    }

    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(a a2) {
        this.a = a2.G();
        this.b = a2.i();
    }

    @Override
    public void b(a a2) {
        a2.C(this.a);
        a2.a(this.b);
    }

    public int a() {
        return this.a;
    }

    public cu b() {
        return this.b;
    }
}

