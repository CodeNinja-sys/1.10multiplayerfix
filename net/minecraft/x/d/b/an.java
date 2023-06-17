/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class an
implements p {
    private int a;
    private int b;
    private int c;

    public an() {
    }

    public an(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.F();
        this.b = a2.G();
        this.c = a2.G();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.C(this.b);
        a2.C(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

