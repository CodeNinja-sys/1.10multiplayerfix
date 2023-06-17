/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.m.cg;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;
import net.minecraft.w.a.g;

public class bk
extends aa {
    @Override
    public String a() {
        return "clear";
    }

    @Override
    public String a(az az2) {
        return "commands.clear.usage";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        g g2 = arrstring.length == 0 ? bk.b(az2) : bk.a(a2, az2, arrstring[0]);
        cg cg2 = arrstring.length >= 2 ? bk.b(az2, arrstring[1]) : null;
        int n2 = arrstring.length >= 3 ? bk.a(arrstring[2], -1) : -1;
        int n3 = arrstring.length >= 4 ? bk.a(arrstring[3], -1) : -1;
        e e2 = null;
        if (arrstring.length >= 5) {
            try {
                e2 = n.a(bk.b(arrstring, 4));
            }
            catch (i i2) {
                throw new o("commands.clear.tagError", i2.getMessage());
            }
        }
        if (arrstring.length >= 2 && cg2 == null) {
            throw new o("commands.clear.failure", g2.X());
        }
        int n4 = g2.q.a(cg2, n2, n3, e2);
        g2.r.a();
        if (!g2.J.d) {
            g2.p();
        }
        az2.a(br.d, n4);
        if (n4 == 0) {
            throw new o("commands.clear.failure", g2.X());
        }
        if (n3 == 0) {
            az2.a(new l("commands.clear.testing", g2.X(), n4));
        } else {
            bk.a(az2, (t)this, "commands.clear.success", g2.X(), n4);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? bk.a(arrstring, a2.T()) : (arrstring.length == 2 ? bk.a(arrstring, cg.e.c()) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

