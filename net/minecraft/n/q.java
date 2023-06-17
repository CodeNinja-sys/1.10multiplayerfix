/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.d.c;
import net.minecraft.d.j;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;

public class q
extends aa {
    @Override
    public String a() {
        return "effect";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.effect.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ac("commands.effect.usage", new Object[0]);
        }
        net.minecraft.w.l l2 = (net.minecraft.w.l)q.a(a2, az2, arrstring[0], net.minecraft.w.l.class);
        if ("clear".equals(arrstring[1])) {
            if (l2.bm().isEmpty()) {
                throw new o("commands.effect.failure.notActive.all", l2.X());
            }
            l2.bl();
            q.a(az2, (t)this, "commands.effect.success.removed.all", l2.X());
        } else {
            c c2;
            try {
                c2 = c.a(q.a(arrstring[1], 1));
            }
            catch (v v2) {
                c2 = c.a(arrstring[1]);
            }
            if (c2 == null) {
                throw new v("commands.effect.notFound", arrstring[1]);
            }
            int n2 = 600;
            int n3 = 30;
            int n4 = 0;
            if (arrstring.length >= 3) {
                n3 = q.a(arrstring[2], 0, 1000000);
                n2 = c2.a() ? n3 : n3 * 20;
            } else if (c2.a()) {
                n2 = 1;
            }
            if (arrstring.length >= 4) {
                n4 = q.a(arrstring[3], 0, 255);
            }
            boolean bl2 = true;
            if (arrstring.length >= 5 && "true".equalsIgnoreCase(arrstring[4])) {
                bl2 = false;
            }
            if (n3 > 0) {
                j j2 = new j(c2, n2, n4, false, bl2);
                l2.c(j2);
                q.a(az2, (t)this, "commands.effect.success", new l(j2.f(), new Object[0]), c.a(c2), n4, l2.X(), n3);
            } else if (l2.b(c2)) {
                l2.d(c2);
                q.a(az2, (t)this, "commands.effect.success.removed", new l(c2.b(), new Object[0]), l2.X());
            } else {
                throw new o("commands.effect.failure.notActive", new l(c2.b(), new Object[0]), l2.X());
            }
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? q.a(arrstring, a2.T()) : (arrstring.length == 2 ? q.a(arrstring, c.a.c()) : (arrstring.length == 5 ? q.a(arrstring, "true", "false") : Collections.emptyList()));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

