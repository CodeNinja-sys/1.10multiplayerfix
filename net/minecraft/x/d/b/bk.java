/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bk
implements p {
    private int a;
    private double b;
    private double c;
    private double d;
    private int e;

    public bk() {
    }

    public bk(n n2) {
        this.a = n2.ca();
        this.b = n2.aU;
        this.c = n2.aV;
        this.d = n2.aW;
        if (n2 instanceof net.minecraft.w.g.a) {
            this.e = 1;
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.e = a2.E();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.P();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(this.e);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }
}

