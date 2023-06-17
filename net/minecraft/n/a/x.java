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
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class x
extends aa {
    @Override
    public String a() {
        return "ban";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public String a(az az2) {
        return "commands.ban.usage";
    }

    @Override
    public boolean a(a a2, az az2) {
        return a2.av().h().a() && super.a(a2, az2);
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring[0].length() > 0) {
            e e2 = a2.aO().a(arrstring[0]);
            if (e2 == null) {
                throw new o("commands.ban.failed", arrstring[0]);
            }
            String string = null;
            if (arrstring.length >= 2) {
                string = x.a(az2, arrstring, 1).c();
            }
            net.minecraft.c.b.x x2 = new net.minecraft.c.b.x(e2, null, az2.X(), null, string);
            a2.av().h().a(x2);
            g g2 = a2.av().a(arrstring[0]);
            if (g2 != null) {
                g2.a.a("You are banned from this server.");
            }
        } else {
            throw new ac("commands.ban.usage", new Object[0]);
        }
        x.a(az2, (t)this, "commands.ban.success", arrstring[0]);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length >= 1 ? x.a(arrstring, a2.T()) : Collections.emptyList();
    }
}

