/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import com.c.a.e;
import net.minecraft.a.w;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.c;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.r;
import net.minecraft.e.u;
import net.minecraft.f.f;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.u.ad;
import net.minecraft.u.bw;
import net.minecraft.w.e.d;
import net.minecraft.w.h.ak;
import net.minecraft.w.l;

public class z
implements s {
    private final net.minecraft.client.j.w a;

    public z(net.minecraft.client.j.w w2) {
        this.a = w2;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cu cu2 = l2.a(k.f);
        if (cu2 != null && cu2.a() != null) {
            float f9;
            boolean bl2;
            cg cg2 = cu2.a();
            r r2 = r.z();
            bd.D();
            if (l2.G()) {
                bd.c(0.0f, 0.2f, 0.0f);
            }
            boolean bl3 = bl2 = l2 instanceof ak || l2 instanceof d && ((d)l2).s();
            if (l2.ba() && !(l2 instanceof ak)) {
                f9 = 2.0f;
                float f10 = 1.4f;
                bd.c(0.0f, 0.5f * f8, 0.0f);
                bd.b(0.7f, 0.7f, 0.7f);
                bd.c(0.0f, 16.0f * f8, 0.0f);
            }
            this.a.c(0.0625f);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (cg2 == w.ch) {
                f9 = 1.1875f;
                bd.b(1.1875f, -1.1875f, -1.1875f);
                if (bl2) {
                    bd.c(0.0f, 0.0625f, 0.0f);
                }
                e e2 = null;
                if (cu2.n()) {
                    String string;
                    net.minecraft.e.e e3 = cu2.o();
                    if (e3.b("SkullOwner", 10)) {
                        e2 = u.a(e3.o("SkullOwner"));
                    } else if (e3.b("SkullOwner", 8) && !bw.b(string = e3.l("SkullOwner"))) {
                        e2 = f.b(new e(null, string));
                        e3.a("SkullOwner", u.a(new net.minecraft.e.e(), e2));
                    }
                }
                c.a.a(-0.5f, 0.0f, -0.5f, ad.b, 180.0f, cu2.h(), e2, -1, f2);
            } else if (!(cg2 instanceof dn) || ((dn)cg2).e() != k.f) {
                f9 = 0.625f;
                bd.c(0.0f, -0.25f, 0.0f);
                bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                bd.b(0.625f, -0.625f, -0.625f);
                if (bl2) {
                    bd.c(0.0f, 0.1875f, 0.0f);
                }
                r2.ad().a(l2, cu2, ao.f);
            }
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

