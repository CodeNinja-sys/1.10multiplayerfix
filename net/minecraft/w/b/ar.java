/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.m;

public class ar
extends bm {
    private final f a;
    private final m b;
    private l c;
    private int d = -1;
    private final double e;
    private int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;

    public ar(m m2, double d2, int n2, float f2) {
        this(m2, d2, n2, n2, f2);
    }

    public ar(m m2, double d2, int n2, int n3, float f2) {
        if (!(m2 instanceof l)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.b = m2;
        this.a = (f)((Object)m2);
        this.e = d2;
        this.g = n2;
        this.h = n3;
        this.i = f2;
        this.j = f2 * f2;
        this.b(3);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        if (l2 == null) {
            return false;
        }
        this.c = l2;
        return true;
    }

    @Override
    public boolean a() {
        return this.e() || !this.a.N().l();
    }

    @Override
    public void c() {
        this.c = null;
        this.f = 0;
        this.d = -1;
    }

    @Override
    public void d() {
        double d2 = this.a.h(this.c.aU, this.c.cT().b, this.c.aW);
        boolean bl2 = this.a.V().a(this.c);
        this.f = bl2 ? ++this.f : 0;
        if (d2 <= (double)this.j && this.f >= 20) {
            this.a.N().m();
        } else {
            this.a.N().a(this.c, this.e);
        }
        this.a.I().a(this.c, 30.0f, 30.0f);
        if (--this.d == 0) {
            if (d2 > (double)this.j || !bl2) {
                return;
            }
            float f2 = n.a(d2) / this.i;
            float f3 = n.a(f2, 0.1f, 1.0f);
            this.b.a(this.c, f3);
            this.d = n.d(f2 * (float)(this.h - this.g) + (float)this.g);
        } else if (this.d < 0) {
            float f4 = n.a(d2) / this.i;
            this.d = n.d(f4 * (float)(this.h - this.g) + (float)this.g);
        }
    }
}

