/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import java.util.Random;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class n
extends j {
    protected n(q q2, k ... arrk) {
        super(q2, ae.j, arrk);
        this.b("durability");
    }

    @Override
    public int a(int n2) {
        return 5 + (n2 - 1) * 8;
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
        return cu2.d() ? true : super.a(cu2);
    }

    public static boolean a(cu cu2, int n2, Random random) {
        return cu2.a() instanceof dn && random.nextFloat() < 0.6f ? false : random.nextInt(n2 + 1) > 0;
    }
}

