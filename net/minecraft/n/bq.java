/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.e.q;
import net.minecraft.m.cu;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.o.j;
import net.minecraft.u.b.b;
import net.minecraft.w.l;

public class bq
extends aa {
    @Override
    public String a() {
        return "enchant";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.enchant.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        q q2;
        j j2;
        if (arrstring.length < 2) {
            throw new ac("commands.enchant.usage", new Object[0]);
        }
        l l2 = (l)bq.a(a2, az2, arrstring[0], l.class);
        az2.a(br.d, 0);
        try {
            j2 = j.c(bq.a(arrstring[1], 0));
        }
        catch (v v2) {
            j2 = j.a(arrstring[1]);
        }
        if (j2 == null) {
            throw new v("commands.enchant.notFound", j.b(j2));
        }
        int n2 = 1;
        cu cu2 = l2.bC();
        if (cu2 == null) {
            throw new o("commands.enchant.noItem", new Object[0]);
        }
        if (!j2.a(cu2)) {
            throw new o("commands.enchant.cantEnchant", new Object[0]);
        }
        if (arrstring.length >= 3) {
            n2 = bq.a(arrstring[2], j2.d(), j2.a());
        }
        if (cu2.n() && (q2 = cu2.p()) != null) {
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                j j3;
                short s2 = q2.b(i2).g("id");
                if (j.c(s2) == null || j2.a(j3 = j.c(s2))) continue;
                throw new o("commands.enchant.cantCombine", j2.d(n2), j3.d(q2.b(i2).g("lvl")));
            }
        }
        cu2.a(j2, n2);
        bq.a(az2, (t)this, "commands.enchant.success", new Object[0]);
        az2.a(br.d, 1);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bq.a(arrstring, a2.T()) : (arrstring.length == 2 ? bq.a(arrstring, j.b.c()) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

