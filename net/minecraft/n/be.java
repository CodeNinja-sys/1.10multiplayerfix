/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.List;
import net.minecraft.a.f;
import net.minecraft.c.a;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.f.ae;

public class be
extends aa {
    @Override
    public String a() {
        return "give";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.give.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        boolean bl2;
        if (arrstring.length < 2) {
            throw new ac("commands.give.usage", new Object[0]);
        }
        g g2 = be.a(a2, az2, arrstring[0]);
        cg cg2 = be.b(az2, arrstring[1]);
        int n2 = arrstring.length >= 3 ? be.a(arrstring[2], 1, 64) : 1;
        int n3 = arrstring.length >= 4 ? be.a(arrstring[3]) : 0;
        cu cu2 = new cu(cg2, n2, n3);
        if (arrstring.length >= 5) {
            String string = be.a(az2, arrstring, 4).c();
            try {
                cu2.d(n.a(string));
            }
            catch (i i2) {
                throw new o("commands.give.tagError", i2.getMessage());
            }
        }
        if (bl2 = g2.q.c(cu2)) {
            g2.aQ.a(null, g2.aU, g2.aV, g2.aW, f.da, bu.h, 0.2f, ((g2.bd().nextFloat() - g2.bd().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            g2.r.a();
        }
        if (bl2 && cu2.b <= 0) {
            cu2.b = 1;
            az2.a(br.d, n2);
            ae ae2 = g2.a(cu2, false);
            if (ae2 != null) {
                ae2.s();
            }
        } else {
            az2.a(br.d, n2 - cu2.b);
            ae ae3 = g2.a(cu2, false);
            if (ae3 != null) {
                ae3.n();
                ae3.a(g2.X());
            }
        }
        be.a(az2, (t)this, "commands.give.success", cu2.B(), n2, g2.X());
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? be.a(arrstring, a2.T()) : (arrstring.length == 2 ? be.a(arrstring, cg.e.c()) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }

    public static void a(b b2, cg cg2, int n2) {
        int n3 = n2;
        int n4 = 0;
        cu cu2 = new cu(cg2, n3, n4);
        boolean bl2 = b2.q.c(cu2);
        if (bl2) {
            b2.aQ.a(null, b2.aU, b2.aV, b2.aW, f.da, bu.h, 0.2f, ((b2.bd().nextFloat() - b2.bd().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            b2.r.a();
        }
        if (bl2 && cu2.b <= 0) {
            cu2.b = 1;
            ae ae2 = b2.a(cu2, false);
            if (ae2 != null) {
                ae2.s();
            }
        } else {
            ae ae3 = b2.a(cu2, false);
            if (ae3 != null) {
                ae3.n();
                ae3.a(b2.X());
            }
        }
    }

    public static void a(b b2, cn cn2, int n2) {
        int n3 = n2;
        int n4 = 0;
        cu cu2 = new cu(cn2, n3, n4);
        boolean bl2 = b2.q.c(cu2);
        if (bl2) {
            b2.aQ.a(null, b2.aU, b2.aV, b2.aW, f.da, bu.h, 0.2f, ((b2.bd().nextFloat() - b2.bd().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            b2.r.a();
        }
        if (bl2 && cu2.b <= 0) {
            cu2.b = 1;
            ae ae2 = b2.a(cu2, false);
            if (ae2 != null) {
                ae2.s();
            }
        } else {
            ae ae3 = b2.a(cu2, false);
            if (ae3 != null) {
                ae3.n();
                ae3.a(b2.X());
            }
        }
    }
}

