/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.en;
import net.minecraft.m.ao;
import net.minecraft.m.av;
import net.minecraft.m.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dm;
import net.minecraft.m.dn;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class e
extends cg {
    public e() {
        this.i = 1;
        this.a(d.j);
        this.e(336);
        this.a(new bp("blocking"), new dm(this));
        en.c.a(this, dn.b);
    }

    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        return super.a(cu2, b2, k2, b3, ah2, ad2, f2, f3, f4);
    }

    @Override
    public String a(cu cu2) {
        if (cu2.a("BlockEntityTag", false) != null) {
            String string = "item.shield.";
            cd cd2 = ao.h(cu2);
            string = String.valueOf(string) + cd2.d() + ".name";
            return net.minecraft.u.d.b.a.a(string);
        }
        return net.minecraft.u.d.b.a.a("item.shield.name");
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        ao.a(cu2, list);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        cu cu2 = new cu(cg2, 1, 0);
        list.add(cu2);
    }

    @Override
    public d a() {
        return d.j;
    }

    @Override
    public av b(cu cu2) {
        return av.d;
    }

    @Override
    public int c(cu cu2) {
        return 72000;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        b2.b(ah2);
        return new a(ab.a, cu2);
    }

    @Override
    public boolean a(cu cu2, cu cu3) {
        return cu3.a() == cg.a(p.f) ? true : super.a(cu2, cu3);
    }
}

