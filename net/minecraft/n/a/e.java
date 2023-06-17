/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;

public class e
extends aa {
    @Override
    public String a() {
        return "pardon";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.unban.usage";
    }

    @Override
    public boolean a(a a2, az az2) {
        return a2.av().h().a() && super.a(a2, az2);
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        com.c.a.e e2;
        if (arrstring.length == 1 && arrstring[0].length() > 0) {
            e2 = a2.av().h().a(arrstring[0]);
            if (e2 == null) {
                throw new o("commands.unban.failed", arrstring[0]);
            }
        } else {
            throw new ac("commands.unban.usage", new Object[0]);
        }
        a2.av().h().b((Object)e2);
        e.a(az2, (t)this, "commands.unban.success", arrstring[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? e.a(arrstring, a2.av().h().b()) : Collections.emptyList();
    }
}

