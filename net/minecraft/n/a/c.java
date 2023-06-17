/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.q.k;

public class c
extends aa {
    @Override
    public String a() {
        return "testforblock";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.testforblock.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        int n2;
        cn cn2;
        Object object;
        k k2;
        if (arrstring.length < 4) {
            throw new ac("commands.testforblock.usage", new Object[0]);
        }
        az2.a(br.b, 0);
        net.minecraft.u.b.b b2 = c.a(az2, arrstring, 0, false);
        cn cn3 = cn.a(arrstring[3]);
        if (cn3 == null) {
            throw new v("commands.setblock.notFound", arrstring[3]);
        }
        int n3 = -1;
        if (arrstring.length >= 5) {
            n3 = c.a(arrstring[4], -1, 15);
        }
        if (!(k2 = az2.aE()).d(b2)) {
            throw new o("commands.testforblock.outOfWorld", new Object[0]);
        }
        e e2 = new e();
        boolean bl2 = false;
        if (arrstring.length >= 6 && cn3.n()) {
            object = c.a(az2, arrstring, 5).c();
            try {
                e2 = n.a((String)object);
                bl2 = true;
            }
            catch (i i2) {
                throw new o("commands.setblock.tagError", i2.getMessage());
            }
        }
        if ((cn2 = (object = k2.n(b2)).c()) != cn3) {
            throw new o("commands.testforblock.failed.tile", b2.cy_(), b2.k(), b2.l(), cn2.bV_(), cn3.bV_());
        }
        if (n3 > -1 && (n2 = object.c().b((b)object)) != n3) {
            throw new o("commands.testforblock.failed.data", b2.cy_(), b2.k(), b2.l(), n2, n3);
        }
        if (bl2) {
            ap ap2 = k2.q(b2);
            if (ap2 == null) {
                throw new o("commands.testforblock.failed.tileEntity", b2.cy_(), b2.k(), b2.l());
            }
            e e3 = ap2.a(new e());
            if (!u.a(e2, e3, true)) {
                throw new o("commands.testforblock.failed.nbt", b2.cy_(), b2.k(), b2.l());
            }
        }
        az2.a(br.b, 1);
        c.a(az2, (t)this, "commands.testforblock.success", b2.cy_(), b2.k(), b2.l());
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? c.a(arrstring, 0, b2) : (arrstring.length == 4 ? c.a(arrstring, cn.v.c()) : Collections.emptyList());
    }
}

