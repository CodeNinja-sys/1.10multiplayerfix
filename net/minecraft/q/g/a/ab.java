/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.f.u;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class ab
extends aj {
    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        b b3 = k2.n(b2);
        while ((b3.d() == h.a || b3.d() == h.j) && b2.k() > 1) {
            b2 = b2.c();
            b3 = k2.n(b2);
        }
        if (b2.k() < 1) {
            return false;
        }
        b2 = b2.b();
        for (int i2 = 0; i2 < 4; ++i2) {
            net.minecraft.u.b.b b4 = b2.a(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
            if (!k2.c(b4) || !k2.n(b4.c()).t()) continue;
            k2.a(b4, p.ae.v(), 2);
            ap ap2 = k2.q(b4);
            if (ap2 instanceof u) {
                ((u)ap2).a(j.b, random.nextLong());
            }
            net.minecraft.u.b.b b5 = b4.g();
            net.minecraft.u.b.b b6 = b4.f();
            net.minecraft.u.b.b b7 = b4.d();
            net.minecraft.u.b.b b8 = b4.e();
            if (k2.c(b6) && k2.n(b6.c()).t()) {
                k2.a(b6, p.aa.v(), 2);
            }
            if (k2.c(b5) && k2.n(b5.c()).t()) {
                k2.a(b5, p.aa.v(), 2);
            }
            if (k2.c(b7) && k2.n(b7.c()).t()) {
                k2.a(b7, p.aa.v(), 2);
            }
            if (k2.c(b8) && k2.n(b8.c()).t()) {
                k2.a(b8, p.aa.v(), 2);
            }
            return true;
        }
        return false;
    }
}

