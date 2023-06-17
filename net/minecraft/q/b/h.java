/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import com.a.a.c.an;
import com.a.a.c.f;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import net.minecraft.q.b.ah;
import net.minecraft.q.b.q;
import net.minecraft.q.b.t;
import net.minecraft.q.g.a.a;
import net.minecraft.q.g.a.p;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class h
extends t {
    private static final an a = com.a.a.c.f.a().a(5L, TimeUnit.MINUTES).a(new ah(null));
    private final p N = new p();

    @Override
    protected void a(q q2, k k2, Random random) {
        a[] arra;
        this.a(k2, random);
        a[] arra2 = arra = net.minecraft.q.b.h.a(k2);
        int n2 = arra.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = arra2[i2];
            if (!a2.a(this.c)) continue;
            this.N.a(a2);
            this.N.a(k2, random, new b(a2.a(), 45, a2.b()));
        }
    }

    public static a[] a(k k2) {
        Random random = new Random(k2.A());
        long l2 = random.nextLong() & 0xFFFFL;
        return (a[])a.c(l2);
    }
}

