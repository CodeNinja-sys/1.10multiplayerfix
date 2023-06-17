/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ae;
import net.minecraft.n.az;
import net.minecraft.n.l;
import net.minecraft.n.o;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class ah
extends aa {
    @Override
    public String a() {
        return "execute";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.execute.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        Object object;
        if (arrstring.length < 5) {
            throw new ac("commands.execute.usage", new Object[0]);
        }
        n n2 = ah.a(a2, az2, arrstring[0], n.class);
        double d2 = ah.b(n2.aU, arrstring[1], false);
        double d3 = ah.b(n2.aV, arrstring[2], false);
        double d4 = ah.b(n2.aW, arrstring[3], false);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d2, d3, d4);
        int n3 = 4;
        if ("detect".equals(arrstring[4]) && arrstring.length > 10) {
            object = n2.aE();
            double d5 = ah.b(d2, arrstring[5], false);
            double d6 = ah.b(d3, arrstring[6], false);
            double d7 = ah.b(d4, arrstring[7], false);
            cn cn2 = ah.c(az2, arrstring[8]);
            int n4 = ah.a(arrstring[9], -1, 15);
            net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(d5, d6, d7);
            if (!((k)object).d(b3)) {
                throw new o("commands.execute.failed", "detect", n2.X());
            }
            b b4 = ((k)object).n(b3);
            if (b4.c() != cn2 || n4 >= 0 && b4.c().b(b4) != n4) {
                throw new o("commands.execute.failed", "detect", n2.X());
            }
            n3 = 10;
        }
        object = ah.b(arrstring, n3);
        l l2 = new l(this, n2, az2, b2, d2, d3, d4, a2);
        ae ae2 = a2.Y();
        try {
            int n5 = ae2.a(l2, (String)object);
            if (n5 < 1) {
                throw new o("commands.execute.allInvocationsFailed", object);
            }
        }
        catch (Throwable throwable) {
            throw new o("commands.execute.failed", object, n2.X());
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? ah.a(arrstring, a2.T()) : (arrstring.length > 1 && arrstring.length <= 4 ? ah.a(arrstring, 1, b2) : (arrstring.length > 5 && arrstring.length <= 8 && "detect".equals(arrstring[4]) ? ah.a(arrstring, 5, b2) : (arrstring.length == 9 && "detect".equals(arrstring[4]) ? ah.a(arrstring, cn.v.c()) : Collections.emptyList())));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

