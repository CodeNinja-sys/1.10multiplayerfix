/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.List;
import java.util.UUID;
import net.minecraft.w.h;
import net.minecraft.w.l;
import net.minecraft.x.a.o;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ap
implements p {
    private int a;
    private UUID b;
    private int c;
    private double d;
    private double e;
    private double f;
    private int g;
    private int h;
    private int i;
    private byte j;
    private byte k;
    private byte l;
    private o m;
    private List n;

    public ap() {
    }

    public ap(l l2) {
        this.a = l2.ca();
        this.b = l2.cM();
        this.c = (byte)net.minecraft.w.h.a(l2);
        this.d = l2.aU;
        this.e = l2.aV;
        this.f = l2.aW;
        this.j = (byte)(l2.ba * 256.0f / 360.0f);
        this.k = (byte)(l2.bb * 256.0f / 360.0f);
        this.l = (byte)(l2.am * 256.0f / 360.0f);
        double d2 = 3.9;
        double d3 = l2.aX;
        double d4 = l2.aY;
        double d5 = l2.aZ;
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d5 < -3.9) {
            d5 = -3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        if (d5 > 3.9) {
            d5 = 3.9;
        }
        this.g = (int)(d3 * 8000.0);
        this.h = (int)(d4 * 8000.0);
        this.i = (int)(d5 * 8000.0);
        this.m = l2.cc();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.g();
        this.c = a2.E() & 0xFF;
        this.d = a2.P();
        this.e = a2.P();
        this.f = a2.P();
        this.j = a2.E();
        this.k = a2.E();
        this.l = a2.E();
        this.g = a2.G();
        this.h = a2.G();
        this.i = a2.G();
        this.n = o.b(a2);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.B(this.c & 0xFF);
        a2.a(this.d);
        a2.a(this.e);
        a2.a(this.f);
        a2.B(this.j);
        a2.B(this.k);
        a2.B(this.l);
        a2.C(this.g);
        a2.C(this.h);
        a2.C(this.i);
        this.m.a(a2);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public List a() {
        if (this.n == null) {
            this.n = this.m.c();
        }
        return this.n;
    }

    public int b() {
        return this.a;
    }

    public UUID c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }

    public double g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public byte k() {
        return this.j;
    }

    public byte l() {
        return this.k;
    }

    public byte m() {
        return this.l;
    }
}

