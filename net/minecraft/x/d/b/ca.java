/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ca
implements p {
    private int a;
    private b b;
    private int c;

    public ca() {
    }

    public ca(int n2, b b2, int n3) {
        this.a = n2;
        this.b = b2;
        this.c = n3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.c();
        this.c = a2.F();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.B(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

