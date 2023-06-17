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
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;

public class an
extends aa {
    @Override
    public String a() {
        return "xp";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.xp.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        g g2;
        int n2;
        boolean bl2;
        boolean bl3;
        if (arrstring.length <= 0) {
            throw new ac("commands.xp.usage", new Object[0]);
        }
        String string = arrstring[0];
        boolean bl4 = bl3 = string.endsWith("l") || string.endsWith("L");
        if (bl3 && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        boolean bl5 = bl2 = (n2 = an.a(string)) < 0;
        if (bl2) {
            n2 *= -1;
        }
        g g3 = g2 = arrstring.length > 1 ? an.a(a2, az2, arrstring[1]) : an.b(az2);
        if (bl3) {
            az2.a(br.e, g2.K);
            if (bl2) {
                ((b)g2).g(-n2);
                an.a(az2, (t)this, "commands.xp.success.negative.levels", n2, g2.X());
            } else {
                ((b)g2).g(n2);
                an.a(az2, (t)this, "commands.xp.success.levels", n2, g2.X());
            }
        } else {
            az2.a(br.e, g2.L);
            if (bl2) {
                throw new o("commands.xp.failure.widthdrawXp", new Object[0]);
            }
            g2.e(n2);
            an.a(az2, (t)this, "commands.xp.success", n2, g2.X());
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 2 ? an.a(arrstring, a2.T()) : Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 1;
    }
}

