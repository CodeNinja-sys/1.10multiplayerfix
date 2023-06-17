/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.w;
import net.minecraft.m.bn;
import net.minecraft.u.ah;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.ay;
import net.minecraft.w.l;

public class bk
extends bm {
    private final ay a;
    private final double b;
    private int c;
    private final float d;
    private int e = -1;
    private int f;
    private boolean g;
    private boolean h;
    private int i = -1;

    public bk(ay ay2, double d2, int n2, float f2) {
        this.a = ay2;
        this.b = d2;
        this.c = n2;
        this.d = f2 * f2;
        this.b(3);
    }

    public void a(int n2) {
        this.c = n2;
    }

    @Override
    public boolean e() {
        return this.a.W() == null ? false : this.f();
    }

    protected boolean f() {
        return this.a.bC() != null && this.a.bC().a() == w.f;
    }

    @Override
    public boolean a() {
        return (this.e() || !this.a.N().l()) && this.f();
    }

    @Override
    public void b() {
        super.b();
        this.a.a(true);
    }

    @Override
    public void c() {
        super.c();
        this.a.a(false);
        this.f = 0;
        this.e = -1;
        this.a.C();
    }

    @Override
    public void d() {
        l l2 = this.a.W();
        if (l2 != null) {
            boolean bl2;
            double d2 = this.a.h(l2.aU, l2.cT().b, l2.aW);
            boolean bl3 = this.a.V().a(l2);
            boolean bl4 = bl2 = this.f > 0;
            if (bl3 != bl2) {
                this.f = 0;
            }
            this.f = bl3 ? ++this.f : --this.f;
            if (d2 <= (double)this.d && this.f >= 20) {
                this.a.N().m();
                ++this.i;
            } else {
                this.a.N().a(l2, this.b);
                this.i = -1;
            }
            if (this.i >= 20) {
                if ((double)this.a.bd().nextFloat() < 0.3) {
                    boolean bl5 = this.g = !this.g;
                }
                if ((double)this.a.bd().nextFloat() < 0.3) {
                    this.h = !this.h;
                }
                this.i = 0;
            }
            if (this.i > -1) {
                if (d2 > (double)(this.d * 0.75f)) {
                    this.h = false;
                } else if (d2 < (double)(this.d * 0.25f)) {
                    this.h = true;
                }
                this.a.L().a(this.h ? -0.5f : 0.5f, this.g ? 0.5f : -0.5f);
                this.a.a(l2, 30.0f, 30.0f);
            } else {
                this.a.I().a(l2, 30.0f, 30.0f);
            }
            if (this.a.B()) {
                int n2;
                if (!bl3 && this.f < -60) {
                    this.a.C();
                } else if (bl3 && (n2 = this.a.bT()) >= 20) {
                    this.a.C();
                    this.a.a(l2, bn.b(n2));
                    this.e = this.c;
                }
            } else if (--this.e <= 0 && this.f >= -60) {
                this.a.b(ah.a);
            }
        }
    }
}

