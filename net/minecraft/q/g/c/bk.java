/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.bw;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.m;

public class bk
extends at {
    private final int a = 20;
    private final int b = 11;
    private final m d;

    public bk(m m2) {
        this.d = m2;
    }

    @Override
    public String a() {
        return "EndCity";
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= 19;
        }
        if (n3 < 0) {
            n3 -= 19;
        }
        int n6 = n2 / 20;
        int n7 = n3 / 20;
        Random random = this.g.b(n6, n7, 10387313);
        n6 *= 20;
        n7 *= 20;
        return n4 == (n6 += (random.nextInt(9) + random.nextInt(9)) / 2) && n5 == (n7 += (random.nextInt(9) + random.nextInt(9)) / 2) && this.d.c(n4, n5);
    }

    @Override
    protected j b(int n2, int n3) {
        return new bw(this.g, this.d, this.f, n2, n3);
    }
}

