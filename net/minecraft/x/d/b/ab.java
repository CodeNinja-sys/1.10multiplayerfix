/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.f.e;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ab
implements p {
    private int a;
    private double b;
    private double c;
    private double d;
    private int e;

    public ab() {
    }

    public ab(e e2) {
        this.a = e2.ca();
        this.b = e2.aU;
        this.c = e2.aV;
        this.d = e2.aW;
        this.e = e2.a();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.P();
        this.e = a2.G();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.C(this.e);
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

