/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.aa;
import net.minecraft.h.k;
import net.minecraft.o.ab;
import net.minecraft.o.ae;
import net.minecraft.o.f;
import net.minecraft.o.j;
import net.minecraft.o.q;
import net.minecraft.u.b.n;
import net.minecraft.w.l;

public class z
extends j {
    public final ab a;

    public z(q q2, ab ab2, k ... arrk) {
        super(q2, ae.b, arrk);
        this.a = ab2;
        if (ab2 == ab.c) {
            this.c = ae.c;
        }
    }

    @Override
    public int a(int n2) {
        return this.a.b() + (n2 - 1) * this.a.c();
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + this.a.c();
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public int a(int n2, net.minecraft.u.n n3) {
        return n3.g() ? 0 : (this.a == ab.a ? n2 : (this.a == ab.b && n3.o() ? n2 * 2 : (this.a == ab.c && n3 == net.minecraft.u.n.j ? n2 * 3 : (this.a == ab.d && n3.c() ? n2 * 2 : (this.a == ab.e && n3.a() ? n2 * 2 : 0)))));
    }

    @Override
    public String b() {
        return "enchantment.protect." + this.a.a();
    }

    @Override
    public boolean a(j j2) {
        if (j2 instanceof z) {
            z z2 = (z)j2;
            return this.a == z2.a ? false : this.a == ab.c || z2.a == ab.c;
        }
        return super.a(j2);
    }

    public static int a(l l2, int n2) {
        int n3 = f.a(aa.b, l2);
        if (n3 > 0) {
            n2 -= n.d((float)n2 * (float)n3 * 0.15f);
        }
        return n2;
    }

    public static double a(l l2, double d2) {
        int n2 = f.a(aa.d, l2);
        if (n2 > 0) {
            d2 -= (double)n.c(d2 * (double)((float)n2 * 0.15f));
        }
        return d2;
    }
}

