/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.aj;
import net.minecraft.q.k;

public class an
extends aj {
    private final cn a;
    private final boolean b;

    public an(cn cn2, boolean bl2) {
        this.a = cn2;
        this.b = bl2;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        if (k2.n(b2.b()).c() != p.aV) {
            return false;
        }
        if (k2.n(b2).d() != h.a && k2.n(b2).c() != p.aV) {
            return false;
        }
        int n2 = 0;
        if (k2.n(b2.f()).c() == p.aV) {
            ++n2;
        }
        if (k2.n(b2.g()).c() == p.aV) {
            ++n2;
        }
        if (k2.n(b2.d()).c() == p.aV) {
            ++n2;
        }
        if (k2.n(b2.e()).c() == p.aV) {
            ++n2;
        }
        if (k2.n(b2.c()).c() == p.aV) {
            ++n2;
        }
        int n3 = 0;
        if (k2.c(b2.f())) {
            ++n3;
        }
        if (k2.c(b2.g())) {
            ++n3;
        }
        if (k2.c(b2.d())) {
            ++n3;
        }
        if (k2.c(b2.e())) {
            ++n3;
        }
        if (k2.c(b2.c())) {
            ++n3;
        }
        if (!this.b && n2 == 4 && n3 == 1 || n2 == 5) {
            b b3 = this.a.v();
            k2.a(b2, b3, 2);
            k2.a(b2, b3, random);
        }
        return true;
    }
}

