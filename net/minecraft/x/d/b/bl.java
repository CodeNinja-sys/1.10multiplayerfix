/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.UUID;
import net.minecraft.u.b.b;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bl
implements p {
    private int a;
    private UUID b;
    private double c;
    private double d;
    private double e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public bl() {
    }

    public bl(n n2, int n3) {
        this(n2, n3, 0);
    }

    public bl(n n2, int n3, int n4) {
        this.a = n2.ca();
        this.b = n2.cM();
        this.c = n2.aU;
        this.d = n2.aV;
        this.e = n2.aW;
        this.i = net.minecraft.u.b.n.d(n2.bb * 256.0f / 360.0f);
        this.j = net.minecraft.u.b.n.d(n2.ba * 256.0f / 360.0f);
        this.k = n3;
        this.l = n4;
        double d2 = 3.9;
        this.f = (int)(net.minecraft.u.b.n.a(n2.aX, -3.9, 3.9) * 8000.0);
        this.g = (int)(net.minecraft.u.b.n.a(n2.aY, -3.9, 3.9) * 8000.0);
        this.h = (int)(net.minecraft.u.b.n.a(n2.aZ, -3.9, 3.9) * 8000.0);
    }

    public bl(n n2, int n3, int n4, b b2) {
        this(n2, n3, n4);
        this.c = b2.cy_();
        this.d = b2.k();
        this.e = b2.l();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.g();
        this.k = a2.E();
        this.c = a2.P();
        this.d = a2.P();
        this.e = a2.P();
        this.i = a2.E();
        this.j = a2.E();
        this.l = a2.K();
        this.f = a2.G();
        this.g = a2.G();
        this.h = a2.G();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.B(this.k);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
        a2.B(this.i);
        a2.B(this.j);
        a2.E(this.l);
        a2.C(this.f);
        a2.C(this.g);
        a2.C(this.h);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public UUID b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public void c(int n2) {
        this.h = n2;
    }

    public void d(int n2) {
        this.l = n2;
    }
}

