/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import java.util.Random;
import net.minecraft.a.aa;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.o.ae;
import net.minecraft.o.f;
import net.minecraft.o.j;
import net.minecraft.o.q;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class x
extends j {
    public x(q q2, k ... arrk) {
        super(q2, ae.e, arrk);
        this.b("thorns");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(cu cu2) {
        return cu2.a() instanceof dn ? true : super.a(cu2);
    }

    @Override
    public void b(l l2, n n2, int n3) {
        Random random = l2.bd();
        cu cu2 = f.b(aa.h, l2);
        if (x.a(n3, random)) {
            if (n2 != null) {
                n2.a(net.minecraft.u.n.a((n)l2), (float)x.b(n3, random));
            }
            if (cu2 != null) {
                cu2.a(3, l2);
            }
        } else if (cu2 != null) {
            cu2.a(1, l2);
        }
    }

    public static boolean a(int n2, Random random) {
        return n2 <= 0 ? false : random.nextFloat() < 0.15f * (float)n2;
    }

    public static int b(int n2, Random random) {
        return n2 > 10 ? n2 - 10 : 1 + random.nextInt(4);
    }
}

