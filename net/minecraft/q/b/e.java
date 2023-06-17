/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.c;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class e
extends c {
    public e(ab ab2) {
        super(ab2);
        this.w.A = 2;
        this.w.C = 2;
        this.w.D = 5;
    }

    @Override
    public void a(k k2, Random random, net.minecraft.q.f.e e2, int n2, int n3, double d2) {
        this.u = net.minecraft.a.p.c.v();
        this.v = net.minecraft.a.p.d.v();
        if (d2 > 1.75) {
            this.u = net.minecraft.a.p.b.v();
            this.v = net.minecraft.a.p.b.v();
        } else if (d2 > -0.5) {
            this.u = net.minecraft.a.p.d.v().a(eg.a, (Comparable)((Object)ic.b));
        }
        this.b(k2, random, e2, n2, n3, d2);
    }

    @Override
    public void a(k k2, Random random, b b2) {
        this.w.a(k2, random, this, b2);
    }
}

