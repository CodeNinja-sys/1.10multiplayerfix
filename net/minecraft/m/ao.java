/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.f.ap;
import net.minecraft.f.l;
import net.minecraft.f.w;
import net.minecraft.g.c.b;
import net.minecraft.g.gt;
import net.minecraft.m.ar;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class ao
extends ar {
    public ao() {
        super(p.cK);
        this.i = 16;
        this.a(d.c);
        this.a(true);
        this.e(0);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        boolean bl2 = b4.c().b(k2, b3);
        if (!(ad2 == ad.a || !b4.d().a() && !bl2 || bl2 && ad2 != ad.b)) {
            if (b2.a(b3 = b3.a(ad2), ad2, cu2) && p.cK.a_(k2, b3)) {
                if (k2.C) {
                    return ab.a;
                }
                net.minecraft.u.b.b b5 = b3 = bl2 ? b3.c() : b3;
                if (ad2 == ad.b) {
                    int n2 = n.c((double)((b2.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
                    k2.a(b3, p.cK.v().a(gt.a, Integer.valueOf(n2)), 3);
                } else {
                    k2.a(b3, p.cL.v().a(net.minecraft.g.cg.a, (Comparable)((Object)ad2)), 3);
                }
                --cu2.b;
                ap ap2 = k2.q(b3);
                if (ap2 instanceof w) {
                    ((w)ap2).a(cu2);
                }
                return ab.a;
            }
            return ab.c;
        }
        return ab.c;
    }

    @Override
    public String a(cu cu2) {
        String string = "item.banner.";
        cd cd2 = ao.h(cu2);
        string = String.valueOf(string) + cd2.d() + ".name";
        return net.minecraft.u.d.b.a.a(string);
    }

    public static void a(cu cu2, List list) {
        e e2 = cu2.a("BlockEntityTag", false);
        if (e2 != null && e2.e("Patterns")) {
            q q2 = e2.c("Patterns", 10);
            for (int i2 = 0; i2 < q2.e() && i2 < 6; ++i2) {
                e e3 = q2.b(i2);
                cd cd2 = cd.a(e3.h("Color"));
                l l2 = l.a(e3.l("Pattern"));
                if (l2 == null) continue;
                list.add(net.minecraft.u.d.b.a.a("item.banner." + l2.a() + "." + cd2.d()));
            }
        }
    }

    @Override
    public void a(cu cu2, net.minecraft.w.a.b b2, List list, boolean bl2) {
        ao.a(cu2, list);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (cd cd2 : cd.values()) {
            e e2 = new e();
            w.a(e2, cd2.c(), null);
            e e3 = new e();
            e3.a("BlockEntityTag", e2);
            cu cu2 = new cu(cg2, 1, cd2.c());
            cu2.d(e3);
            list.add(cu2);
        }
    }

    @Override
    public d a() {
        return d.c;
    }

    public static cd h(cu cu2) {
        e e2 = cu2.a("BlockEntityTag", false);
        cd cd2 = e2 != null && e2.e("Base") ? cd.a(e2.h("Base")) : cd.a(cu2.h());
        return cd2;
    }
}

