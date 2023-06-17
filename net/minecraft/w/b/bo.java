/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public abstract class bo
extends bm {
    private final t c;
    private final double d;
    protected int a;
    private int e;
    private int f;
    protected b b = net.minecraft.u.b.b.c;
    private boolean g;
    private final int h;

    public bo(t t2, double d2, int n2) {
        this.c = t2;
        this.d = d2;
        this.h = n2;
        this.b(5);
    }

    @Override
    public boolean e() {
        if (this.a > 0) {
            --this.a;
            return false;
        }
        this.a = 200 + this.c.bd().nextInt(200);
        return this.g();
    }

    @Override
    public boolean a() {
        return this.e >= -this.f && this.e <= 1200 && this.a(this.c.aQ, this.b);
    }

    @Override
    public void b() {
        this.c.N().a((double)this.b.cy_() + 0.5, this.b.k() + 1, (double)this.b.l() + 0.5, this.d);
        this.e = 0;
        this.f = this.c.bd().nextInt(this.c.bd().nextInt(1200) + 1200) + 1200;
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
        if (this.c.d(this.b.b()) > 1.0) {
            this.g = false;
            ++this.e;
            if (this.e % 40 == 0) {
                this.c.N().a((double)this.b.cy_() + 0.5, this.b.k() + 1, (double)this.b.l() + 0.5, this.d);
            }
        } else {
            this.g = true;
            --this.e;
        }
    }

    protected boolean f() {
        return this.g;
    }

    private boolean g() {
        int n2 = this.h;
        boolean bl2 = true;
        b b2 = new b(this.c);
        int n3 = 0;
        while (n3 <= 1) {
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = 0;
                while (n4 <= i2) {
                    int n5 = n4 < i2 && n4 > -i2 ? i2 : 0;
                    while (n5 <= i2) {
                        b b3 = b2.a(n4, n3 - 1, n5);
                        if (this.c.f(b3) && this.a(this.c.aQ, b3)) {
                            this.b = b3;
                            return true;
                        }
                        int n6 = n5 = n5 > 0 ? -n5 : 1 - n5;
                    }
                    int n7 = n4 = n4 > 0 ? -n4 : 1 - n4;
                }
            }
            int n8 = n3 = n3 > 0 ? -n3 : 1 - n3;
        }
        return false;
    }

    protected abstract boolean a(k var1, b var2);
}

