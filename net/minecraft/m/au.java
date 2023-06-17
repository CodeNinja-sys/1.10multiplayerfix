/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.gz;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dd;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bv;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class au
extends cg {
    private static final Map a = sz.c();
    private final bv b;
    private final String c;

    protected au(String string, bv bv2) {
        this.c = "item.record." + string + ".desc";
        this.b = bv2;
        this.i = 1;
        this.a(d.f);
        a.put(this.b, this);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        b b4 = k2.n(b3);
        if (b4.c() == p.aN && !((Boolean)b4.a(gz.a)).booleanValue()) {
            if (!k2.C) {
                ((gz)p.aN).a(k2, b3, b4, cu2);
                k2.a(null, 1010, b3, cg.a(this));
                --cu2.b;
                b2.a(o.Z);
            }
            return ab.a;
        }
        return ab.b;
    }

    @Override
    public void a(cu cu2, net.minecraft.w.a.b b2, List list, boolean bl2) {
        list.add(this.e());
    }

    public String e() {
        return net.minecraft.u.d.b.a.a(this.c);
    }

    @Override
    public dd f(cu cu2) {
        return dd.c;
    }

    public static au a(bv bv2) {
        return (au)a.get(bv2);
    }

    public bv f() {
        return this.b;
    }
}

