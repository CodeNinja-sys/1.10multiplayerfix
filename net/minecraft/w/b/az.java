/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class az
extends bm {
    private final t a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private int f;
    private boolean g;

    public az(t t2, double d2) {
        this(t2, d2, 120);
    }

    public az(t t2, double d2, int n2) {
        this.a = t2;
        this.e = d2;
        this.f = n2;
        this.b(1);
    }

    @Override
    public boolean e() {
        s s2;
        if (!this.g) {
            if (this.a.bi() >= 100) {
                return false;
            }
            if (this.a.bd().nextInt(this.f) != 0) {
                return false;
            }
        }
        if ((s2 = af.a(this.a, 10, 7)) == null) {
            return false;
        }
        this.b = s2.b;
        this.c = s2.c;
        this.d = s2.d;
        this.g = false;
        return true;
    }

    @Override
    public boolean a() {
        return !this.a.N().l();
    }

    @Override
    public void b() {
        this.a.N().a(this.b, this.c, this.d, this.e);
    }

    public void f() {
        this.g = true;
    }

    public void a(int n2) {
        this.f = n2;
    }
}

