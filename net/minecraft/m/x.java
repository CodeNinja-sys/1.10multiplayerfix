/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.c.a.e;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.f.f;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.hs;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class x
extends cg {
    private static final String[] a = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};

    public x() {
        this.a(d.c);
        this.e(0);
        this.a(true);
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (ad2 == ad.a) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        boolean bl2 = cn2.b(k2, b3);
        if (!bl2) {
            if (!k2.n(b3).d().a()) {
                return ab.c;
            }
            b3 = b3.a(ad2);
        }
        if (b2.a(b3, ad2, cu2) && p.ce.a_(k2, b3)) {
            ap ap2;
            if (k2.C) {
                return ab.a;
            }
            k2.a(b3, p.ce.v().a(hs.a, (Comparable)((Object)ad2)), 11);
            int n2 = 0;
            if (ad2 == ad.b) {
                n2 = n.c((double)(b2.ba * 16.0f / 360.0f) + 0.5) & 0xF;
            }
            if ((ap2 = k2.q(b3)) instanceof f) {
                f f5 = (f)ap2;
                if (cu2.h() == 3) {
                    e e2 = null;
                    if (cu2.n()) {
                        net.minecraft.e.e e3 = cu2.o();
                        if (e3.b("SkullOwner", 10)) {
                            e2 = u.a(e3.o("SkullOwner"));
                        } else if (e3.b("SkullOwner", 8) && !e3.l("SkullOwner").isEmpty()) {
                            e2 = new e(null, e3.l("SkullOwner"));
                        }
                    }
                    f5.a(e2);
                } else {
                    f5.a(cu2.h());
                }
                f5.b(n2);
                p.ce.a(k2, b3, f5);
            }
            --cu2.b;
            return ab.a;
        }
        return ab.c;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            list.add(new cu(cg2, 1, i2));
        }
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String d(cu cu2) {
        int n2 = cu2.h();
        if (n2 < 0 || n2 >= a.length) {
            n2 = 0;
        }
        return String.valueOf(super.cw_()) + "." + a[n2];
    }

    @Override
    public String a(cu cu2) {
        if (cu2.h() == 3 && cu2.n()) {
            net.minecraft.e.e e2;
            if (cu2.o().b("SkullOwner", 8)) {
                return net.minecraft.u.d.b.a.a("item.skull.player.name", cu2.o().l("SkullOwner"));
            }
            if (cu2.o().b("SkullOwner", 10) && (e2 = cu2.o().o("SkullOwner")).b("Name", 8)) {
                return net.minecraft.u.d.b.a.a("item.skull.player.name", e2.l("Name"));
            }
        }
        return super.a(cu2);
    }

    @Override
    public boolean a(net.minecraft.e.e e2) {
        super.a(e2);
        if (e2.b("SkullOwner", 8) && !e2.l("SkullOwner").isEmpty()) {
            e e3 = new e(null, e2.l("SkullOwner"));
            e3 = net.minecraft.f.f.b(e3);
            e2.a("SkullOwner", u.a(new net.minecraft.e.e(), e3));
            return true;
        }
        return false;
    }
}

