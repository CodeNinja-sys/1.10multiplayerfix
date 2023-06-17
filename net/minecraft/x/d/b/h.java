/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class h
implements p {
    private int a;
    private int b;
    private int c;
    private int d;

    public h() {
    }

    public h(n n2) {
        this(n2.ca(), n2.aX, n2.aY, n2.aZ);
    }

    public h(int n2, double d2, double d3, double d4) {
        this.a = n2;
        double d5 = 3.9;
        if (d2 < -3.9) {
            d2 = -3.9;
        }
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d2 > 3.9) {
            d2 = 3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        this.b = (int)(d2 * 8000.0);
        this.c = (int)(d3 * 8000.0);
        this.d = (int)(d4 * 8000.0);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.G();
        this.c = a2.G();
        this.d = a2.G();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.C(this.b);
        a2.C(this.c);
        a2.C(this.d);
    }

    public void a(a a2) {
        a2.a(this);
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

    public int d() {
        return this.d;
    }
}

