/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.w;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.o.f;
import net.minecraft.q.z;
import net.minecraft.u.b.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.ay;
import net.minecraft.w.g.a;
import net.minecraft.w.h.al;
import net.minecraft.w.h.p;

public class an
extends bm {
    private final al a;

    public an(al al2) {
        this.a = al2;
    }

    @Override
    public boolean e() {
        return this.a.aQ.a(this.a.aU, this.a.aV, this.a.aW, 10.0);
    }

    @Override
    public void d() {
        z z2 = this.a.aQ.C(new b(this.a));
        this.a.y(false);
        this.a.a(p.e);
        this.a.a(true);
        this.a.e(0);
        this.a.aQ.e(new a(this.a.aQ, this.a.aU, this.a.aV, this.a.aW, true));
        ay ay2 = this.a(z2, this.a);
        ay2.r(this.a);
        for (int i2 = 0; i2 < 3; ++i2) {
            al al2 = this.a(z2);
            ay ay3 = this.a(z2, al2);
            ay3.r(al2);
            al2.a_(this.a.bd().nextGaussian() * 0.5, 0.0, this.a.bd().nextGaussian() * 0.5);
        }
    }

    private al a(z z2) {
        al al2 = new al(this.a.aQ);
        al2.a(z2, null);
        al2.e(this.a.aU, this.a.aV, this.a.aW);
        al2.bB = 60;
        al2.aJ();
        al2.a(p.e);
        al2.a(true);
        al2.e(0);
        al2.aQ.a(al2);
        return al2;
    }

    private ay a(z z2, al al2) {
        ay ay2 = new ay(al2.aQ);
        ay2.a(z2, null);
        ay2.e(al2.aU, al2.aV, al2.aW);
        ay2.bB = 60;
        ay2.aJ();
        if (ay2.a(k.f) == null) {
            ay2.a(k.f, new cu(w.aa));
        }
        f.a(ay2.bd(), ay2.bC(), (int)(5.0f + z2.c() * (float)ay2.bd().nextInt(18)), false);
        f.a(ay2.bd(), ay2.a(k.f), (int)(5.0f + z2.c() * (float)ay2.bd().nextInt(18)), false);
        ay2.aQ.a(ay2);
        return ay2;
    }
}

