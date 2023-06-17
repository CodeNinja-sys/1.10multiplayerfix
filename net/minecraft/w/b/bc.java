/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.List;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.y;

public class bc
extends bm {
    y a;
    y b;
    double c;
    private int d;

    public bc(y y2, double d2) {
        this.a = y2;
        this.c = d2;
    }

    @Override
    public boolean e() {
        if (this.a.dn() >= 0) {
            return false;
        }
        List list = this.a.aQ.a(this.a.getClass(), this.a.cT().b(8.0, 4.0, 8.0));
        y y2 = null;
        double d2 = Double.MAX_VALUE;
        for (y y3 : list) {
            double d3;
            if (y3.dn() < 0 || !((d3 = this.a.n(y3)) <= d2)) continue;
            d2 = d3;
            y2 = y3;
        }
        if (y2 == null) {
            return false;
        }
        if (d2 < 9.0) {
            return false;
        }
        this.b = y2;
        return true;
    }

    @Override
    public boolean a() {
        if (this.a.dn() >= 0) {
            return false;
        }
        if (!this.b.br()) {
            return false;
        }
        double d2 = this.a.n(this.b);
        return d2 >= 9.0 && d2 <= 256.0;
    }

    @Override
    public void b() {
        this.d = 0;
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public void d() {
        if (--this.d <= 0) {
            this.d = 10;
            this.a.N().a(this.b, this.c);
        }
    }
}

