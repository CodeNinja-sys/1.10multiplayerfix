/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.sz;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.h.y;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.w.a.b;

public class k
extends aa {
    private static final Map a;

    static {
        int n2;
        a = sz.c();
        for (n2 = 0; n2 < 54; ++n2) {
            a.put("slot.container." + n2, n2);
        }
        for (n2 = 0; n2 < 9; ++n2) {
            a.put("slot.hotbar." + n2, n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put("slot.inventory." + n2, 9 + n2);
        }
        for (n2 = 0; n2 < 27; ++n2) {
            a.put("slot.enderchest." + n2, 200 + n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            a.put("slot.villager." + n2, 300 + n2);
        }
        for (n2 = 0; n2 < 15; ++n2) {
            a.put("slot.horse." + n2, 500 + n2);
        }
        a.put("slot.weapon", 98);
        a.put("slot.weapon.mainhand", 98);
        a.put("slot.weapon.offhand", 99);
        a.put("slot.armor.head", 100 + net.minecraft.h.k.f.b());
        a.put("slot.armor.chest", 100 + net.minecraft.h.k.e.b());
        a.put("slot.armor.legs", 100 + net.minecraft.h.k.d.b());
        a.put("slot.armor.feet", 100 + net.minecraft.h.k.c.b());
        a.put("slot.horse.saddle", 400);
        a.put("slot.horse.armor", 401);
        a.put("slot.horse.chest", 499);
    }

    @Override
    public String a() {
        return "replaceitem";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.replaceitem.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        Object object;
        cg cg2;
        int n2;
        boolean bl2;
        if (arrstring.length < 1) {
            throw new ac("commands.replaceitem.usage", new Object[0]);
        }
        if ("entity".equals(arrstring[0])) {
            bl2 = false;
        } else {
            if (!"block".equals(arrstring[0])) {
                throw new ac("commands.replaceitem.usage", new Object[0]);
            }
            bl2 = true;
        }
        if (bl2) {
            if (arrstring.length < 6) {
                throw new ac("commands.replaceitem.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (arrstring.length < 4) {
                throw new ac("commands.replaceitem.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        String string = arrstring[n2];
        int n3 = this.e(arrstring[n2++]);
        try {
            cg2 = k.b(az2, arrstring[n2]);
        }
        catch (v v2) {
            if (cn.a(arrstring[n2]) != p.a) {
                throw v2;
            }
            cg2 = null;
        }
        int n4 = arrstring.length > ++n2 ? k.a(arrstring[n2++], 1, 64) : 1;
        int n5 = arrstring.length > n2 ? k.a(arrstring[n2++]) : 0;
        cu cu2 = new cu(cg2, n4, n5);
        if (arrstring.length > n2) {
            object = k.a(az2, arrstring, n2).c();
            try {
                cu2.d(n.a((String)object));
            }
            catch (i i2) {
                throw new o("commands.replaceitem.tagError", i2.getMessage());
            }
        }
        if (cu2.a() == null) {
            cu2 = null;
        }
        if (bl2) {
            az2.a(br.d, 0);
            object = k.a(az2, arrstring, 1, false);
            net.minecraft.q.k k2 = az2.aE();
            ap ap2 = k2.q((net.minecraft.u.b.b)object);
            if (ap2 == null || !(ap2 instanceof y)) {
                throw new o("commands.replaceitem.noContainer", ((net.minecraft.u.b.t)object).cy_(), ((net.minecraft.u.b.t)object).k(), ((net.minecraft.u.b.t)object).l());
            }
            y y2 = (y)((Object)ap2);
            if (n3 >= 0 && n3 < y2.e()) {
                y2.a(n3, cu2);
            }
        } else {
            object = k.b(a2, az2, arrstring[1]);
            az2.a(br.d, 0);
            if (object instanceof b) {
                ((b)object).r.a();
            }
            if (!((net.minecraft.w.n)object).a_(n3, cu2)) {
                throw new o("commands.replaceitem.failed", string, n4, cu2 == null ? "Air" : cu2.B());
            }
            if (object instanceof b) {
                ((b)object).r.a();
            }
        }
        az2.a(br.d, n4);
        k.a(az2, (t)this, "commands.replaceitem.success", string, n4, cu2 == null ? "Air" : cu2.B());
    }

    private int e(String string) {
        if (!a.containsKey(string)) {
            throw new o("commands.generic.parameter.invalid", string);
        }
        return (Integer)a.get(string);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length == 1 ? k.a(arrstring, "entity", "block") : (arrstring.length == 2 && "entity".equals(arrstring[0]) ? k.a(arrstring, a2.T()) : (arrstring.length >= 2 && arrstring.length <= 4 && "block".equals(arrstring[0]) ? k.a(arrstring, 1, b2) : (!(arrstring.length == 3 && "entity".equals(arrstring[0]) || arrstring.length == 5 && "block".equals(arrstring[0])) ? (!(arrstring.length == 4 && "entity".equals(arrstring[0]) || arrstring.length == 6 && "block".equals(arrstring[0])) ? Collections.emptyList() : k.a(arrstring, cg.e.c())) : k.a(arrstring, a.keySet()))));
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return arrstring.length > 0 && "entity".equals(arrstring[0]) && n2 == 1;
    }
}

