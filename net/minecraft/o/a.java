/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.c;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.m.n;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;
import net.minecraft.w.l;

public class a
extends j {
    private static final String[] e = new String[]{"all", "undead", "arthropods"};
    private static final int[] f = new int[]{1, 5, 5};
    private static final int[] g = new int[]{11, 8, 8};
    private static final int[] h = new int[]{20, 20, 20};
    public final int a;

    public a(q q2, int n2, k ... arrk) {
        super(q2, ae.g, arrk);
        this.a = n2;
    }

    @Override
    public int a(int n2) {
        return f[this.a] + (n2 - 1) * g[this.a];
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + h[this.a];
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public float a(int n2, net.minecraft.w.ae ae2) {
        return this.a == 0 ? 1.0f + (float)Math.max(0, n2 - 1) * 0.5f : (this.a == 1 && ae2 == net.minecraft.w.ae.b ? (float)n2 * 2.5f : (this.a == 2 && ae2 == net.minecraft.w.ae.c ? (float)n2 * 2.5f : 0.0f));
    }

    @Override
    public String b() {
        return "enchantment.damage." + e[this.a];
    }

    @Override
    public boolean a(j j2) {
        return !(j2 instanceof a);
    }

    @Override
    public boolean a(cu cu2) {
        return cu2.a() instanceof n ? true : super.a(cu2);
    }

    @Override
    public void a(l l2, net.minecraft.w.n n2, int n3) {
        if (n2 instanceof l) {
            l l3 = (l)n2;
            if (this.a == 2 && l3.bB() == net.minecraft.w.ae.c) {
                int n4 = 20 + l2.bd().nextInt(10 * n3);
                l3.c(new net.minecraft.d.j(net.minecraft.a.c.b, n4, 3));
            }
        }
    }
}

