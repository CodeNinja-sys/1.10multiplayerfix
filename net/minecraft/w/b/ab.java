/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.List;
import net.minecraft.u.b.s;
import net.minecraft.w.ah;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.ak;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class ab
extends bm {
    private final ak a;
    private l b;
    private final double c;
    private int d;

    public ab(ak ak2, double d2) {
        this.a = ak2;
        this.c = d2;
        this.b(1);
    }

    @Override
    public boolean e() {
        Object object2;
        if (this.a.dn() >= 0) {
            return false;
        }
        if (this.a.bd().nextInt(400) != 0) {
            return false;
        }
        List list = this.a.aQ.a(ak.class, this.a.cT().b(6.0, 3.0, 6.0));
        double d2 = Double.MAX_VALUE;
        for (Object object2 : list) {
            double d3;
            if (object2 == this.a || ((ak)object2).r() || ((ah)object2).dn() >= 0 || !((d3 = ((n)object2).n(this.a)) <= d2)) continue;
            d2 = d3;
            this.b = object2;
        }
        return this.b != null || (object2 = af.a(this.a, 16, 3)) != null;
    }

    @Override
    public boolean a() {
        return this.d > 0;
    }

    @Override
    public void b() {
        if (this.b != null) {
            this.a.c(true);
        }
        this.d = 1000;
    }

    @Override
    public void c() {
        this.a.c(false);
        this.b = null;
    }

    @Override
    public void d() {
        --this.d;
        if (this.b != null) {
            if (this.a.n(this.b) > 4.0) {
                this.a.N().a(this.b, this.c);
            }
        } else if (this.a.N().l()) {
            s s2 = af.a(this.a, 16, 3);
            if (s2 == null) {
                return;
            }
            this.a.N().a(s2.b, s2.c, s2.d, this.c);
        }
    }
}

