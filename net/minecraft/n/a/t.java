/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.h.y;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.q.k;

public class t
extends aa {
    @Override
    public String a() {
        return "setblock";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.setblock.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        ap ap2;
        b b2;
        Object object;
        k k2;
        if (arrstring.length < 4) {
            throw new ac("commands.setblock.usage", new Object[0]);
        }
        az2.a(br.b, 0);
        net.minecraft.u.b.b b3 = t.a(az2, arrstring, 0, false);
        cn cn2 = aa.c(az2, arrstring[3]);
        int n2 = 0;
        if (arrstring.length >= 5) {
            n2 = t.a(arrstring[4], 0, 15);
        }
        if (!(k2 = az2.aE()).d(b3)) {
            throw new o("commands.setblock.outOfWorld", new Object[0]);
        }
        e e2 = new e();
        boolean bl2 = false;
        if (arrstring.length >= 7 && cn2.n()) {
            object = t.a(az2, arrstring, 6).c();
            try {
                e2 = n.a((String)object);
                bl2 = true;
            }
            catch (i i2) {
                throw new o("commands.setblock.tagError", i2.getMessage());
            }
        }
        if (arrstring.length >= 6) {
            if ("destroy".equals(arrstring[5])) {
                k2.b(b3, true);
                if (cn2 == p.a) {
                    t.a(az2, (net.minecraft.n.t)this, "commands.setblock.success", new Object[0]);
                    return;
                }
            } else if ("keep".equals(arrstring[5]) && !k2.c(b3)) {
                throw new o("commands.setblock.noChange", new Object[0]);
            }
        }
        if ((object = k2.q(b3)) != null) {
            if (object instanceof y) {
                ((y)object).j();
            }
            k2.a(b3, p.a.v(), cn2 == p.a ? 2 : 4);
        }
        if (!k2.a(b3, b2 = cn2.a(n2), 2)) {
            throw new o("commands.setblock.noChange", new Object[0]);
        }
        if (bl2 && (ap2 = k2.q(b3)) != null) {
            e2.a("x", b3.cy_());
            e2.a("y", b3.k());
            e2.a("z", b3.l());
            ap2.b(e2);
        }
        k2.a(b3, b2.c());
        az2.a(br.b, 1);
        t.a(az2, (net.minecraft.n.t)this, "commands.setblock.success", new Object[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? t.a(arrstring, 0, b2) : (arrstring.length == 4 ? t.a(arrstring, cn.v.c()) : (arrstring.length == 6 ? t.a(arrstring, "replace", "destroy", "keep") : Collections.emptyList()));
    }
}

