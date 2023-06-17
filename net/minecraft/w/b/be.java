/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.Random;
import net.minecraft.h.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class be
extends bm {
    private final t a;
    private double b;
    private double c;
    private double d;
    private final double e;
    private final net.minecraft.q.k f;

    public be(t t2, double d2) {
        this.a = t2;
        this.e = d2;
        this.f = t2.aQ;
        this.b(1);
    }

    @Override
    public boolean e() {
        if (!this.f.n()) {
            return false;
        }
        if (!this.a.cy()) {
            return false;
        }
        if (!this.f.g(new b(this.a.aU, this.a.cT().b, this.a.aW))) {
            return false;
        }
        if (this.a.a(k.f) != null) {
            return false;
        }
        s s2 = this.f();
        if (s2 == null) {
            return false;
        }
        this.b = s2.b;
        this.c = s2.c;
        this.d = s2.d;
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

    private s f() {
        Random random = this.a.bd();
        b b2 = new b(this.a.aU, this.a.cT().b, this.a.aW);
        for (int i2 = 0; i2 < 10; ++i2) {
            b b3 = b2.a(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (this.f.g(b3) || !(this.a.a(b3) < 0.0f)) continue;
            return new s(b3.cy_(), b3.k(), b3.l());
        }
        return null;
    }
}

