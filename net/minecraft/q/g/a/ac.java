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

public class ac
extends aj {
    private final cn a;

    public ac(cn cn2) {
        this.a = cn2;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        if (k2.n(b2.b()).c() != p.b) {
            return false;
        }
        if (k2.n(b2.c()).c() != p.b) {
            return false;
        }
        b b3 = k2.n(b2);
        if (b3.d() != h.a && b3.c() != p.b) {
            return false;
        }
        int n2 = 0;
        if (k2.n(b2.f()).c() == p.b) {
            ++n2;
        }
        if (k2.n(b2.g()).c() == p.b) {
            ++n2;
        }
        if (k2.n(b2.d()).c() == p.b) {
            ++n2;
        }
        if (k2.n(b2.e()).c() == p.b) {
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
        if (n2 == 3 && n3 == 1) {
            b b4 = this.a.v();
            k2.a(b2, b4, 2);
            k2.a(b2, b4, random);
        }
        return true;
    }
}

