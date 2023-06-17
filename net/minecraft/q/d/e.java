/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.d;

import java.util.List;
import java.util.Random;
import net.minecraft.q.b.h;
import net.minecraft.q.d.b;
import net.minecraft.q.d.d;
import net.minecraft.q.g.a.a;
import net.minecraft.q.g.a.p;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.w.f.ad;

class e
extends d {
    @Override
    public void a(v v2, b b2, List list, int n2, net.minecraft.u.b.b b3) {
        boolean bl2;
        int n3 = 40;
        boolean bl3 = n2 % 40 == 0;
        boolean bl4 = bl2 = n2 % 40 == 39;
        if (bl3 || bl2) {
            int n4 = n2 / 40;
            a[] arra = h.a(v2);
            if (n4 < arra.length) {
                a a2 = arra[n4];
                if (bl3) {
                    for (ad ad2 : list) {
                        ad2.a(new net.minecraft.u.b.b(a2.a(), a2.d() + 1, a2.b()));
                    }
                } else {
                    Object object2;
                    int n5 = 10;
                    for (Object object2 : net.minecraft.u.b.b.b(new net.minecraft.u.b.b(a2.a() - 10, a2.d() - 10, a2.b() - 10), new net.minecraft.u.b.b(a2.a() + 10, a2.d() + 10, a2.b() + 10))) {
                        v2.f((net.minecraft.u.b.b)object2);
                    }
                    v2.a(null, (float)a2.a() + 0.5f, (double)a2.d(), (double)((float)a2.b() + 0.5f), 5.0f, true);
                    object2 = new p();
                    ((p)object2).a(a2);
                    ((p)object2).a(true);
                    ((p)object2).a(new net.minecraft.u.b.b(0, 128, 0));
                    ((p)object2).a((k)v2, new Random(), new net.minecraft.u.b.b(a2.a(), 45, a2.b()));
                }
            } else if (bl3) {
                b2.a(d);
            }
        }
    }
}

