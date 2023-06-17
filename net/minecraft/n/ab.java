/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.j.f;
import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class ab
extends aa {
    @Override
    public String a() {
        return "trigger";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(az az2) {
        return "commands.trigger.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        Object object;
        g g2;
        if (arrstring.length < 3) {
            throw new ac("commands.trigger.usage", new Object[0]);
        }
        if (az2 instanceof g) {
            g2 = (g)az2;
        } else {
            object = az2.aF();
            if (!(object instanceof g)) {
                throw new o("commands.trigger.invalidPlayer", new Object[0]);
            }
            g2 = (g)object;
        }
        object = a2.a(0).Q();
        j j2 = ((r)object).b(arrstring[0]);
        if (j2 != null && j2.c() == f.c) {
            int n2 = ab.a(arrstring[2]);
            if (!((r)object).b(g2.X(), j2)) {
                throw new o("commands.trigger.invalidObjective", arrstring[0]);
            }
            p p2 = ((r)object).c(g2.X(), j2);
            if (p2.f()) {
                throw new o("commands.trigger.disabled", arrstring[0]);
            }
            if ("set".equals(arrstring[1])) {
                p2.c(n2);
            } else {
                if (!"add".equals(arrstring[1])) {
                    throw new o("commands.trigger.invalidMode", arrstring[1]);
                }
                p2.a(n2);
            }
            p2.a(true);
            if (g2.c.c()) {
                ab.a(az2, (t)this, "commands.trigger.success", arrstring[0], arrstring[1], arrstring[2]);
            }
        } else {
            throw new o("commands.trigger.invalidObjective", arrstring[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        if (arrstring.length == 1) {
            r r2 = a2.a(0).Q();
            ArrayList arrayList = ov.a();
            for (j j2 : r2.b()) {
                if (j2.c() != f.c) continue;
                arrayList.add(j2.b());
            }
            return ab.a(arrstring, arrayList.toArray(new String[arrayList.size()]));
        }
        return arrstring.length == 2 ? ab.a(arrstring, "add", "set") : Collections.emptyList();
    }
}

