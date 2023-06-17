/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.c.a;
import net.minecraft.c.b.c;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.ag;
import net.minecraft.n.az;
import net.minecraft.n.t;
import net.minecraft.u.b.b;
import net.minecraft.w.a.g;

public class z
extends aa {
    public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public String a() {
        return "ban-ip";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(a a2, az az2) {
        return a2.av().i().a() && super.a(a2, az2);
    }

    @Override
    public String a(az az2) {
        return "commands.banip.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length >= 1 && arrstring[0].length() > 1) {
            net.minecraft.u.d.a a3 = arrstring.length >= 2 ? z.a(az2, arrstring, 1) : null;
            Matcher matcher = a.matcher(arrstring[0]);
            if (matcher.matches()) {
                this.a(a2, az2, arrstring[0], a3 == null ? null : a3.c());
            } else {
                g g2 = a2.av().a(arrstring[0]);
                if (g2 == null) {
                    throw new ag("commands.banip.invalid", new Object[0]);
                }
                this.a(a2, az2, g2.z(), a3 == null ? null : a3.c());
            }
        } else {
            throw new ac("commands.banip.usage", new Object[0]);
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? z.a(arrstring, a2.T()) : Collections.emptyList();
    }

    protected void a(a a2, az az2, String string, String string2) {
        c c2 = new c(string, null, az2.X(), null, string2);
        a2.av().i().a(c2);
        List list = a2.av().b(string);
        Object[] arrobject = new String[list.size()];
        int n2 = 0;
        for (g g2 : list) {
            g2.a.a("You have been IP banned.");
            arrobject[n2++] = g2.X();
        }
        if (list.isEmpty()) {
            z.a(az2, (t)this, "commands.banip.success", string);
        } else {
            z.a(az2, (t)this, "commands.banip.success.players", string, z.a(arrobject));
        }
    }
}

