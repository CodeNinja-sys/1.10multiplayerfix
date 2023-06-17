/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Random;
import net.minecraft.q.f.e;
import net.minecraft.q.g.c.dt;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.m;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.bq;

public class bw
extends j {
    private boolean c;

    public bw() {
    }

    public bw(k k2, m m2, Random random, int n2, int n3) {
        super(n2, n3);
        this.a(k2, m2, random, n2, n3);
    }

    private void a(k k2, m m2, Random random, int n2, int n3) {
        bq bq2 = bq.values()[random.nextInt(bq.values().length)];
        e e2 = new e();
        m2.a(n2, n3, e2);
        int n4 = 5;
        int n5 = 5;
        if (bq2 == bq.b) {
            n4 = -5;
        } else if (bq2 == bq.c) {
            n4 = -5;
            n5 = -5;
        } else if (bq2 == bq.d) {
            n5 = -5;
        }
        int n6 = e2.a(7, 7);
        int n7 = e2.a(7, 7 + n5);
        int n8 = e2.a(7 + n4, 7);
        int n9 = e2.a(7 + n4, 7 + n5);
        int n10 = Math.min(Math.min(n6, n7), Math.min(n8, n9));
        if (n10 < 60) {
            this.c = false;
        } else {
            b b2 = new b(n2 * 16 + 8, n10, n3 * 16 + 8);
            dt.a(b2, bq2, this.a, random);
            this.c();
            this.c = true;
        }
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
    }
}

