/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bm;
import net.minecraft.client.g.c.c;
import net.minecraft.client.g.c.d;
import net.minecraft.client.j.al;
import net.minecraft.client.r;
import net.minecraft.f.ak;
import net.minecraft.f.f;
import net.minecraft.f.u;
import net.minecraft.g.aq;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.u.ad;

public class e {
    public static e a = new e();
    private final u b = new u(aq.a);
    private final u c = new u(aq.b);
    private final ak d = new ak();
    private final net.minecraft.f.w e = new net.minecraft.f.w();
    private final f f = new f();
    private final al g = new al();

    public void a(cu cu2) {
        if (cu2.a() == w.cO) {
            this.e.a(cu2);
            net.minecraft.client.g.c.d.a.a(this.e, 0.0, 0.0, 0.0, 0.0f);
        } else if (cu2.a() == w.cQ) {
            if (cu2.a("BlockEntityTag", false) != null) {
                this.e.a(cu2);
                r.z().N().a(bm.b.a(this.e.j(), this.e.g(), this.e.i()));
            } else {
                r.z().N().a(bm.c);
            }
            bd.D();
            bd.b(1.0f, -1.0f, -1.0f);
            this.g.a();
            bd.E();
        } else if (cu2.a() == w.ch) {
            com.c.a.e e2 = null;
            if (cu2.n()) {
                net.minecraft.e.e e3 = cu2.o();
                if (e3.b("SkullOwner", 10)) {
                    e2 = net.minecraft.e.u.a(e3.o("SkullOwner"));
                } else if (e3.b("SkullOwner", 8) && !e3.l("SkullOwner").isEmpty()) {
                    com.c.a.e e4 = new com.c.a.e(null, e3.l("SkullOwner"));
                    e2 = net.minecraft.f.f.b(e4);
                    e3.q("SkullOwner");
                    e3.a("SkullOwner", net.minecraft.e.u.a(new net.minecraft.e.e(), e2));
                }
            }
            if (net.minecraft.client.g.c.c.a != null) {
                bd.D();
                bd.q();
                net.minecraft.client.g.c.c.a.a(0.0f, 0.0f, 0.0f, ad.b, 0.0f, cu2.h(), e2, -1, 0.0f);
                bd.p();
                bd.E();
            }
        } else {
            cn cn2 = cn.a(cu2.a());
            if (cn2 == p.bQ) {
                net.minecraft.client.g.c.d.a.a(this.d, 0.0, 0.0, 0.0, 0.0f);
            } else if (cn2 == p.cg) {
                net.minecraft.client.g.c.d.a.a(this.c, 0.0, 0.0, 0.0, 0.0f);
            } else {
                net.minecraft.client.g.c.d.a.a(this.b, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
}

