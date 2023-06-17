/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.at;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.w.a.g;
import net.minecraft.w.l;
import net.minecraft.x.d.b.bu;

public class a
extends aa {
    @Override
    public String a() {
        return "tp";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.tp.usage";
    }

    @Override
    public void a(net.minecraft.c.a a2, az az2, String[] arrstring) {
        net.minecraft.w.n n2;
        if (arrstring.length < 1) {
            throw new ac("commands.tp.usage", new Object[0]);
        }
        int n3 = 0;
        if (arrstring.length != 2 && arrstring.length != 4 && arrstring.length != 6) {
            n2 = a.b(az2);
        } else {
            n2 = a.b(a2, az2, arrstring[0]);
            n3 = 1;
        }
        if (arrstring.length != 1 && arrstring.length != 2) {
            if (arrstring.length < n3 + 3) {
                throw new ac("commands.tp.usage", new Object[0]);
            }
            if (n2.aQ != null) {
                int n4 = 4096;
                int n5 = n3 + 1;
                at at2 = a.a(n2.aU, arrstring[n3], true);
                at at3 = a.a(n2.aV, arrstring[n5++], -4096, 4096, false);
                at at4 = a.a(n2.aW, arrstring[n5++], true);
                at at5 = a.a(n2.ba, arrstring.length > n5 ? arrstring[n5++] : "~", false);
                at at6 = a.a(n2.bb, arrstring.length > n5 ? arrstring[n5] : "~", false);
                a.a(n2, at2, at3, at4, at5, at6);
                a.a(az2, (t)this, "commands.tp.success.coordinates", n2.X(), at2.a(), at3.a(), at4.a());
            }
        } else {
            net.minecraft.w.n n6 = a.b(a2, az2, arrstring[arrstring.length - 1]);
            if (n6.aQ != n2.aQ) {
                throw new o("commands.tp.notSameDimension", new Object[0]);
            }
            n2.o();
            if (n2 instanceof g) {
                ((g)n2).a.a(n6.aU, n6.aV, n6.aW, n6.ba, n6.bb);
            } else {
                n2.b(n6.aU, n6.aV, n6.aW, n6.ba, n6.bb);
            }
            a.a(az2, (t)this, "commands.tp.success", n2.X(), n6.X());
        }
    }

    private static void a(net.minecraft.w.n n2, at at2, at at3, at at4, at at5, at at6) {
        if (n2 instanceof g) {
            EnumSet<bu> enumSet = EnumSet.noneOf(bu.class);
            if (at2.c()) {
                enumSet.add(bu.a);
            }
            if (at3.c()) {
                enumSet.add(bu.b);
            }
            if (at4.c()) {
                enumSet.add(bu.c);
            }
            if (at6.c()) {
                enumSet.add(bu.e);
            }
            if (at5.c()) {
                enumSet.add(bu.d);
            }
            float f2 = (float)at5.b();
            if (!at5.c()) {
                f2 = n.g(f2);
            }
            float f3 = (float)at6.b();
            if (!at6.c()) {
                f3 = n.g(f3);
            }
            n2.o();
            ((g)n2).a.a(at2.b(), at3.b(), at4.b(), f2, f3, enumSet);
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
    public List a(net.minecraft.c.a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length != 1 && arrstring.length != 2 ? Collections.emptyList() : a.a(arrstring, a2.T());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

