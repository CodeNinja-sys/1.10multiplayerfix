/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import com.c.a.e;
import net.minecraft.a.p;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.f.f;
import net.minecraft.g.en;
import net.minecraft.g.hs;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.u.bw;

class ac
extends b {
    private boolean a = true;

    ac() {
    }

    @Override
    protected cu a(g g2, cu cu2) {
        k k2 = g2.a();
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        net.minecraft.u.b.b b2 = g2.e().a(ad2);
        hs hs2 = p.ce;
        if (k2.c(b2) && hs2.b(k2, b2, cu2)) {
            if (!k2.C) {
                k2.a(b2, hs2.v().a(hs.a, (Comparable)((Object)ad.b)), 3);
                ap ap2 = k2.q(b2);
                if (ap2 instanceof f) {
                    if (cu2.h() == 3) {
                        e e2 = null;
                        if (cu2.n()) {
                            String string;
                            net.minecraft.e.e e3 = cu2.o();
                            if (e3.b("SkullOwner", 10)) {
                                e2 = u.a(e3.o("SkullOwner"));
                            } else if (e3.b("SkullOwner", 8) && !bw.b(string = e3.l("SkullOwner"))) {
                                e2 = new e(null, string);
                            }
                        }
                        ((f)ap2).a(e2);
                    } else {
                        ((f)ap2).a(cu2.h());
                    }
                    ((f)ap2).b(ad2.e().c() * 4);
                    p.ce.a(k2, b2, (f)ap2);
                }
                --cu2.b;
            }
        } else if (dn.a(g2, cu2) == null) {
            this.a = false;
        }
        return cu2;
    }

    @Override
    protected void a(g g2) {
        if (this.a) {
            g2.a().b(1000, g2.e(), 0);
        } else {
            g2.a().b(1001, g2.e(), 0);
        }
    }
}

