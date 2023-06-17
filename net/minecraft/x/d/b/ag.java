/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ag
implements p {
    private int a;
    private double b;
    private double c;
    private double d;
    private byte e;
    private byte f;
    private boolean g;

    public ag() {
    }

    public ag(n n2) {
        this.a = n2.ca();
        this.b = n2.aU;
        this.c = n2.aV;
        this.d = n2.aW;
        this.e = (byte)(n2.ba * 256.0f / 360.0f);
        this.f = (byte)(n2.bb * 256.0f / 360.0f);
        this.g = n2.be;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.P();
        this.e = a2.E();
        this.f = a2.E();
        this.g = a2.D();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.B(this.e);
        a2.B(this.f);
        a2.a(this.g);
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

    public byte e() {
        return this.e;
    }

    public byte f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}

