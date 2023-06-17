/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.aj;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class av
implements p {
    private aj a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private int[] k;

    public av() {
    }

    public av(aj aj2, boolean bl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int ... arrn) {
        this.a = aj2;
        this.j = bl2;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = n2;
        this.k = arrn;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = aj.a(a2.K());
        if (this.a == null) {
            this.a = aj.J;
        }
        this.j = a2.D();
        this.b = a2.O();
        this.c = a2.O();
        this.d = a2.O();
        this.e = a2.O();
        this.f = a2.O();
        this.g = a2.O();
        this.h = a2.O();
        this.i = a2.K();
        int n2 = this.a.d();
        this.k = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.k[i2] = a2.e();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a.c());
        a2.a(this.j);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
        a2.a(this.f);
        a2.a(this.g);
        a2.a(this.h);
        a2.E(this.i);
        int n2 = this.a.d();
        for (int i2 = 0; i2 < n2; ++i2) {
            a2.d(this.k[i2]);
        }
    }

    public aj a() {
        return this.a;
    }

    public boolean b() {
        return this.j;
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public float f() {
        return this.e;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.g;
    }

    public float i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public int[] k() {
        return this.k;
    }

    public void a(a a2) {
        a2.a(this);
    }
}

