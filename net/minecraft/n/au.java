/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.f.ad;
import net.minecraft.f.h;
import net.minecraft.j.j;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ap;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.n;

public class au
extends aa {
    @Override
    public String a() {
        return "stats";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.stats.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        ap ap2;
        Object object;
        Object object2;
        br br2;
        int n2;
        boolean bl2;
        if (arrstring.length < 1) {
            throw new ac("commands.stats.usage", new Object[0]);
        }
        if ("entity".equals(arrstring[0])) {
            bl2 = false;
        } else {
            if (!"block".equals(arrstring[0])) {
                throw new ac("commands.stats.usage", new Object[0]);
            }
            bl2 = true;
        }
        if (bl2) {
            if (arrstring.length < 5) {
                throw new ac("commands.stats.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (arrstring.length < 3) {
                throw new ac("commands.stats.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        String string = arrstring[n2++];
        if ("set".equals(string)) {
            if (arrstring.length < n2 + 3) {
                if (n2 == 5) {
                    throw new ac("commands.stats.block.set.usage", new Object[0]);
                }
                throw new ac("commands.stats.entity.set.usage", new Object[0]);
            }
        } else {
            if (!"clear".equals(string)) {
                throw new ac("commands.stats.usage", new Object[0]);
            }
            if (arrstring.length < n2 + 1) {
                if (n2 == 5) {
                    throw new ac("commands.stats.block.clear.usage", new Object[0]);
                }
                throw new ac("commands.stats.entity.clear.usage", new Object[0]);
            }
        }
        if ((br2 = br.a(arrstring[n2++])) == null) {
            throw new o("commands.stats.failed", new Object[0]);
        }
        k k2 = az2.aE();
        if (bl2) {
            object2 = au.a(az2, arrstring, 1, false);
            object = k2.q((b)object2);
            if (object == null) {
                throw new o("commands.stats.noCompatibleBlock", ((net.minecraft.u.b.t)object2).cy_(), ((net.minecraft.u.b.t)object2).k(), ((net.minecraft.u.b.t)object2).l());
            }
            if (object instanceof h) {
                ap2 = ((h)object).e();
            } else {
                if (!(object instanceof ad)) {
                    throw new o("commands.stats.noCompatibleBlock", ((net.minecraft.u.b.t)object2).cy_(), ((net.minecraft.u.b.t)object2).k(), ((net.minecraft.u.b.t)object2).l());
                }
                ap2 = ((ad)object).h();
            }
        } else {
            object2 = au.b(a2, az2, arrstring[1]);
            ap2 = ((n)object2).cW();
        }
        if ("set".equals(string)) {
            object2 = arrstring[n2++];
            object = arrstring[n2];
            if (((String)object2).isEmpty() || ((String)object).isEmpty()) {
                throw new o("commands.stats.failed", new Object[0]);
            }
            ap.a(ap2, br2, (String)object2, (String)object);
            au.a(az2, (t)this, "commands.stats.success", br2.b(), object, object2);
        } else if ("clear".equals(string)) {
            ap.a(ap2, br2, null, null);
            au.a(az2, (t)this, "commands.stats.cleared", br2.b());
        }
        if (bl2) {
            object2 = au.a(az2, arrstring, 1, false);
            object = k2.q((b)object2);
            ((net.minecraft.f.ap)object).C();
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? au.a(arrstring, "entity", "block") : (arrstring.length == 2 && "entity".equals(arrstring[0]) ? au.a(arrstring, a2.T()) : (arrstring.length >= 2 && arrstring.length <= 4 && "block".equals(arrstring[0]) ? au.a(arrstring, 1, b2) : (!(arrstring.length == 3 && "entity".equals(arrstring[0]) || arrstring.length == 5 && "block".equals(arrstring[0])) ? (!(arrstring.length == 4 && "entity".equals(arrstring[0]) || arrstring.length == 6 && "block".equals(arrstring[0])) ? (!(arrstring.length == 6 && "entity".equals(arrstring[0]) || arrstring.length == 8 && "block".equals(arrstring[0])) ? Collections.emptyList() : au.a(arrstring, this.a(a2))) : au.a(arrstring, br.c())) : au.a(arrstring, "set", "clear"))));
    }

    protected List a(a a2) {
        Collection collection = a2.a(0).Q().b();
        ArrayList arrayList = ov.a();
        for (j j2 : collection) {
            if (j2.c().a()) continue;
            arrayList.add(j2.b());
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return arrstring.length > 0 && "entity".equals(arrstring[0]) && n2 == 1;
    }
}

