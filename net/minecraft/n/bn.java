/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.k;
import net.minecraft.q.v;
import net.minecraft.u.aj;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.a.g;

public class bn
extends aa {
    @Override
    public String a() {
        return "particle";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.particle.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 8) {
            throw new ac("commands.particle.usage", new Object[0]);
        }
        boolean bl2 = false;
        aj aj2 = aj.a(arrstring[0]);
        if (aj2 == null) {
            throw new o("commands.particle.notFound", arrstring[0]);
        }
        String string = arrstring[0];
        s s2 = az2.aD();
        double d2 = (float)bn.b(s2.b, arrstring[1], true);
        double d3 = (float)bn.b(s2.c, arrstring[2], true);
        double d4 = (float)bn.b(s2.d, arrstring[3], true);
        double d5 = (float)bn.c(arrstring[4]);
        double d6 = (float)bn.c(arrstring[5]);
        double d7 = (float)bn.c(arrstring[6]);
        double d8 = (float)bn.c(arrstring[7]);
        int n2 = 0;
        if (arrstring.length > 8) {
            n2 = bn.a(arrstring[8], 0);
        }
        boolean bl3 = false;
        if (arrstring.length > 9 && "force".equals(arrstring[9])) {
            bl3 = true;
        }
        g g2 = arrstring.length > 10 ? bn.a(a2, az2, arrstring[10]) : null;
        int[] arrn = new int[aj2.d()];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            if (arrstring.length <= 11 + i2) continue;
            try {
                arrn[i2] = Integer.parseInt(arrstring[11 + i2]);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw new o("commands.particle.invalidParam", arrstring[11 + i2]);
            }
        }
        k k2 = az2.aE();
        if (k2 instanceof v) {
            v v2 = (v)k2;
            if (g2 == null) {
                v2.a(aj2, bl3, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
            } else {
                v2.a(g2, aj2, bl3, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
            }
            bn.a(az2, (t)this, "commands.particle.success", string, Math.max(n2, 1));
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bn.a(arrstring, aj.a()) : (arrstring.length > 1 && arrstring.length <= 4 ? bn.a(arrstring, 1, b2) : (arrstring.length == 10 ? bn.a(arrstring, "normal", "force") : (arrstring.length == 11 ? bn.a(arrstring, a2.T()) : Collections.emptyList())));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 10;
    }
}

