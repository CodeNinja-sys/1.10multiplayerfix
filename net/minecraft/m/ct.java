/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.y;
import net.minecraft.h.r;
import net.minecraft.m.bv;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bw;
import net.minecraft.u.d.n;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.bb;

public class ct
extends cg {
    public ct() {
        this.d(1);
    }

    public static boolean b(e e2) {
        if (!bv.b(e2)) {
            return false;
        }
        if (!e2.b("title", 8)) {
            return false;
        }
        String string = e2.l("title");
        return string != null && string.length() <= 32 ? e2.b("author", 8) : false;
    }

    public static int h(cu cu2) {
        return cu2.o().h("generation");
    }

    @Override
    public String a(cu cu2) {
        e e2;
        String string;
        if (cu2.n() && !bw.b(string = (e2 = cu2.o()).l("title"))) {
            return string;
        }
        return super.a(cu2);
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        if (cu2.n()) {
            e e2 = cu2.o();
            String string = e2.l("author");
            if (!bw.b(string)) {
                list.add((Object)((Object)o.h) + net.minecraft.u.d.b.a.a("book.byAuthor", string));
            }
            list.add((Object)((Object)o.h) + net.minecraft.u.d.b.a.a("book.generation." + e2.h("generation")));
        }
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        if (!k2.C) {
            this.a(cu2, b2);
        }
        b2.a(cu2, ah2);
        b2.a(net.minecraft.r.o.b(this));
        return new a(ab.a, cu2);
    }

    private void a(cu cu2, b b2) {
        e e2;
        if (cu2 != null && cu2.o() != null && !(e2 = cu2.o()).p("resolved")) {
            e2.a("resolved", true);
            if (ct.b(e2)) {
                q q2 = e2.c("pages", 8);
                for (int i2 = 0; i2 < q2.e(); ++i2) {
                    net.minecraft.u.d.a a2;
                    String string = q2.g(i2);
                    try {
                        a2 = net.minecraft.u.d.b.b(string);
                        a2 = n.a(b2, a2, b2);
                    }
                    catch (Exception exception) {
                        a2 = new net.minecraft.u.d.k(string);
                    }
                    q2.a(i2, new y(net.minecraft.u.d.b.a(a2)));
                }
                e2.a("pages", q2);
                if (b2 instanceof g && b2.bC() == cu2) {
                    r r2 = b2.s.a(b2.q, b2.q.d);
                    ((g)b2).a.a(new bb(0, r2.c, cu2));
                }
            }
        }
    }

    @Override
    public boolean e(cu cu2) {
        return true;
    }
}

