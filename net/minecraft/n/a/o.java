/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import com.c.a.e;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class o
extends aa {
    @Override
    public String a() {
        return "whitelist";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.whitelist.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length < 1) {
            throw new ac("commands.whitelist.usage", new Object[0]);
        }
        if ("on".equals(arrstring[0])) {
            a2.av().b(true);
            o.a(az2, (t)this, "commands.whitelist.enabled", new Object[0]);
        } else if ("off".equals(arrstring[0])) {
            a2.av().b(false);
            o.a(az2, (t)this, "commands.whitelist.disabled", new Object[0]);
        } else if ("list".equals(arrstring[0])) {
            az2.a(new l("commands.whitelist.list", a2.av().l().length, a2.av().r().length));
            Object[] arrobject = a2.av().l();
            az2.a(new k(o.a(arrobject)));
        } else if ("add".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ac("commands.whitelist.add.usage", new Object[0]);
            }
            e e2 = a2.aO().a(arrstring[1]);
            if (e2 == null) {
                throw new net.minecraft.n.o("commands.whitelist.add.failed", arrstring[1]);
            }
            a2.av().f(e2);
            o.a(az2, (t)this, "commands.whitelist.add.success", arrstring[1]);
        } else if ("remove".equals(arrstring[0])) {
            if (arrstring.length < 2) {
                throw new ac("commands.whitelist.remove.usage", new Object[0]);
            }
            e e3 = a2.av().k().a(arrstring[1]);
            if (e3 == null) {
                throw new net.minecraft.n.o("commands.whitelist.remove.failed", arrstring[1]);
            }
            a2.av().g(e3);
            o.a(az2, (t)this, "commands.whitelist.remove.success", arrstring[1]);
        } else if ("reload".equals(arrstring[0])) {
            a2.av().o();
            o.a(az2, (t)this, "commands.whitelist.reloaded", new Object[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        if (arrstring.length == 1) {
            return o.a(arrstring, "on", "off", "list", "add", "remove", "reload");
        }
        if (arrstring.length == 2) {
            if ("remove".equals(arrstring[0])) {
                return o.a(arrstring, a2.av().l());
            }
            if ("add".equals(arrstring[0])) {
                return o.a(arrstring, a2.aO().a());
            }
        }
        return Collections.emptyList();
    }
}

