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
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.k;

public class bm
extends aa {
    @Override
    public String a() {
        return "blockdata";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.blockdata.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        e e2;
        if (arrstring.length < 4) {
            throw new ac("commands.blockdata.usage", new Object[0]);
        }
        az2.a(br.b, 0);
        net.minecraft.u.b.b b2 = bm.a(az2, arrstring, 0, false);
        k k2 = az2.aE();
        if (!k2.d(b2)) {
            throw new o("commands.blockdata.outOfWorld", new Object[0]);
        }
        b b3 = k2.n(b2);
        ap ap2 = k2.q(b2);
        if (ap2 == null) {
            throw new o("commands.blockdata.notValid", new Object[0]);
        }
        e e3 = ap2.a(new e());
        e e4 = e3.g();
        try {
            e2 = n.a(bm.a(az2, arrstring, 3).c());
        }
        catch (i i2) {
            throw new o("commands.blockdata.tagError", i2.getMessage());
        }
        e3.a(e2);
        e3.a("x", b2.cy_());
        e3.a("y", b2.k());
        e3.a("z", b2.l());
        if (e3.equals(e4)) {
            throw new o("commands.blockdata.failed", e3.toString());
        }
        ap2.b(e3);
        ap2.C();
        k2.a(b2, b3, b3, 3);
        az2.a(br.b, 1);
        bm.a(az2, (t)this, "commands.blockdata.success", e3.toString());
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? bm.a(arrstring, 0, b2) : Collections.emptyList();
    }
}

