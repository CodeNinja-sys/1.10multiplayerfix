/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.aj;
import net.minecraft.u.bz;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class ef
extends cn {
    public static final c a = c.b("wet");

    protected ef() {
        super(h.m);
        this.z(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(d.b);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + ".dry.name");
    }

    @Override
    public int k(b b2) {
        return (Boolean)b2.a(a) != false ? 1 : 0;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        this.e(k2, b2, b3);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        this.e(k2, b3, b2);
        super.a(b2, k2, b3, cn2);
    }

    protected void e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!((Boolean)b3.a(a)).booleanValue() && this.c(k2, b2)) {
            k2.a(b2, b3.a(a, Boolean.valueOf(true)), 2);
            k2.b(2001, b2, cn.c(p.j));
        }
    }

    private boolean c(k k2, net.minecraft.u.b.b b2) {
        LinkedList linkedList = ov.b();
        ArrayList arrayList = ov.a();
        linkedList.add(new bz(b2, 0));
        int n2 = 0;
        while (!linkedList.isEmpty()) {
            Object object = (bz)linkedList.poll();
            net.minecraft.u.b.b b3 = (net.minecraft.u.b.b)((bz)object).a();
            int n3 = (Integer)((bz)object).b();
            for (ad ad2 : ad.values()) {
                net.minecraft.u.b.b b4 = b3.a(ad2);
                if (k2.n(b4).d() != h.h) continue;
                k2.a(b4, p.a.v(), 2);
                arrayList.add(b4);
                ++n2;
                if (n3 >= 6) continue;
                linkedList.add(new bz(b4, n3 + 1));
            }
            if (n2 > 64) break;
        }
        for (Object object : arrayList) {
            k2.b((net.minecraft.u.b.b)object, p.a);
        }
        return n2 > 0;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, 0));
        list.add(new cu(cg2, 1, 1));
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Boolean.valueOf((n2 & 1) == 1));
    }

    @Override
    public int b(b b2) {
        return (Boolean)b2.a(a) != false ? 1 : 0;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        ad ad2;
        if (((Boolean)b2.a(a)).booleanValue() && (ad2 = ad.a(random)) != ad.b && !k2.n(b3.a(ad2)).t()) {
            double d2 = b3.cy_();
            double d3 = b3.k();
            double d4 = b3.l();
            if (ad2 == ad.a) {
                d3 -= 0.05;
                d2 += random.nextDouble();
                d4 += random.nextDouble();
            } else {
                d3 += random.nextDouble() * 0.8;
                if (ad2.l() == ae.a) {
                    d4 += random.nextDouble();
                    d2 = ad2 == ad.f ? (d2 += 1.0) : (d2 += 0.05);
                } else {
                    d2 += random.nextDouble();
                    d4 = ad2 == ad.d ? (d4 += 1.0) : (d4 += 0.05);
                }
            }
            k2.a(aj.s, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
        }
    }
}

