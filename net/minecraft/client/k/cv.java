/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.r;
import net.minecraft.u.b.n;

public class cv {
    private final double a;
    private final double b;
    private int c;
    private int d;
    private int e;

    public cv(r r2) {
        this.c = r2.e;
        this.d = r2.f;
        this.e = 1;
        boolean bl2 = r2.e();
        int n2 = r2.w.aC;
        if (n2 == 0) {
            n2 = 1000;
        }
        while (this.e < n2 && this.c / (this.e + 1) >= 320 && this.d / (this.e + 1) >= 240) {
            ++this.e;
        }
        if (bl2 && this.e % 2 != 0 && this.e != 1) {
            --this.e;
        }
        this.a = (double)this.c / (double)this.e;
        this.b = (double)this.d / (double)this.e;
        this.c = n.f(this.a);
        this.d = n.f(this.b);
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public double c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public int e() {
        return this.e;
    }
}

