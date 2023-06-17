/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.ac;
import net.minecraft.n.at;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.a.g;
import net.minecraft.w.l;
import net.minecraft.x.d.b.bu;

public class aa
extends net.minecraft.n.aa {
    @Override
    public String a() {
        return "teleport";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.teleport.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 4) {
            throw new ac("commands.teleport.usage", new Object[0]);
        }
        net.minecraft.w.n n2 = aa.b(a2, az2, arrstring[0]);
        if (n2.aQ != null) {
            int n3 = 4096;
            s s2 = az2.aD();
            int n4 = 1;
            at at2 = aa.a(s2.b, arrstring[n4++], true);
            at at3 = aa.a(s2.c, arrstring[n4++], -4096, 4096, false);
            at at4 = aa.a(s2.d, arrstring[n4++], true);
            net.minecraft.w.n n5 = az2.aF() == null ? n2 : az2.aF();
            at at5 = aa.a(arrstring.length > n4 ? (double)n5.ba : (double)n2.ba, arrstring.length > n4 ? arrstring[n4] : "~", false);
            at at6 = aa.a(arrstring.length > ++n4 ? (double)n5.bb : (double)n2.bb, arrstring.length > n4 ? arrstring[n4] : "~", false);
            aa.a(n2, at2, at3, at4, at5, at6);
            aa.a(az2, (t)this, "commands.teleport.success.coordinates", n2.X(), at2.a(), at3.a(), at4.a());
        }
    }

    private static void a(net.minecraft.w.n n2, at at2, at at3, at at4, at at5, at at6) {
        if (n2 instanceof g) {
            EnumSet<bu> enumSet = EnumSet.noneOf(bu.class);
            float f2 = (float)at5.b();
            if (at5.c()) {
                enumSet.add(bu.d);
            } else {
                f2 = n.g(f2);
            }
            float f3 = (float)at6.b();
            if (at6.c()) {
                enumSet.add(bu.e);
            } else {
                f3 = n.g(f3);
            }
            n2.o();
            ((g)n2).a.a(at2.a(), at3.a(), at4.a(), f2, f3, enumSet);
            n2.k(f2);
        } else {
            float f4 = (float)n.g(at5.a());
            float f5 = (float)n.g(at6.a());
            f5 = n.a(f5, -90.0f, 90.0f);
            n2.b(at2.a(), at3.a(), at4.a(), f4, f5);
            n2.k(f4);
        }
        if (!(n2 instanceof l) || !((l)n2).bW()) {
            n2.aY = 0.0;
            n2.be = true;
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? aa.a(arrstring, a2.T()) : (arrstring.length > 1 && arrstring.length <= 4 ? aa.a(arrstring, 1, b2) : Collections.emptyList());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

