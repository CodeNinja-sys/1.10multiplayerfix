/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.Set;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.bu;
import net.minecraft.x.p;

public class aa
implements p {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private Set f;
    private int g;

    public aa() {
    }

    public aa(double d2, double d3, double d4, float f2, float f3, Set set, int n2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = f3;
        this.f = set;
        this.g = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.P();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.O();
        this.e = a2.O();
        this.f = bu.a(a2.F());
        this.g = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
        a2.B(bu.a(this.f));
        a2.d(this.g);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public Set g() {
        return this.f;
    }
}

