/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.n.a.y;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.f.a.d;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.f;
import net.minecraft.w.g.a;
import net.minecraft.w.h;

public class v
extends aa {
    @Override
    public String a() {
        return "summon";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.summon.usage";
    }

    @Override
    public void a(net.minecraft.c.a a2, az az2, String[] arrstring) {
        k k2;
        net.minecraft.l.b.b.a = true;
        if (arrstring.length < 1) {
            throw new ac("commands.summon.usage", new Object[0]);
        }
        String string = arrstring[0];
        b b2 = az2.aC();
        s s2 = az2.aD();
        double d2 = s2.b;
        double d3 = s2.c;
        double d4 = s2.d;
        if (arrstring.length >= 4) {
            d2 = v.b(d2, arrstring[1], true);
            d3 = v.b(d3, arrstring[2], false);
            d4 = v.b(d4, arrstring[3], true);
            b2 = new b(d2, d3, d4);
        }
        if (!(k2 = az2.aE()).d(b2)) {
            throw new o("commands.summon.outOfWorld", new Object[0]);
        }
        if ("LightningBolt".equals(string)) {
            k2.e(new a(k2, d2, d3, d4, false));
            v.a(az2, (t)this, "commands.summon.success", new Object[0]);
        } else {
            Object object;
            e e2 = new e();
            boolean bl2 = false;
            if (arrstring.length >= 5) {
                object = v.a(az2, arrstring, 4);
                try {
                    e2 = n.a(object.c());
                    bl2 = true;
                }
                catch (i i2) {
                    throw new o("commands.summon.tagError", i2.getMessage());
                }
            }
            e2.a("id", string);
            object = d.a(e2, k2, d2, d3, d4, true);
            if (((net.minecraft.w.n)object).X().equals("entity.VLLR.name")) {
                ((net.minecraft.w.n)object).aa();
                new y(this, null).start();
                throw new o("YOU SHOULD NOT HAVE DONE THAT", new Object[0]);
            }
            if (object == null) {
                throw new o("commands.summon.failed", new Object[0]);
            }
            ((net.minecraft.w.n)object).b(d2, d3, d4, ((net.minecraft.w.n)object).ba, ((net.minecraft.w.n)object).bb);
            if (!bl2 && object instanceof f) {
                ((f)object).a(k2.C(new b((net.minecraft.w.n)object)), null);
            }
            v.a(az2, (t)this, "commands.summon.success", new Object[0]);
        }
        net.minecraft.l.b.b.a = false;
    }

    @Override
    public List a(net.minecraft.c.a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? v.a(arrstring, h.b()) : (arrstring.length > 1 && arrstring.length <= 4 ? v.a(arrstring, 1, b2) : Collections.emptyList());
    }
}

