/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.u.b.b;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class j
extends aa {
    @Override
    public String a() {
        return "banlist";
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(a a2, az az2) {
        return (a2.av().i().a() || a2.av().h().a()) && super.a(a2, az2);
    }

    @Override
    public String a(az az2) {
        return "commands.banlist.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        if (arrstring.length >= 1 && "ips".equalsIgnoreCase(arrstring[0])) {
            az2.a(new l("commands.banlist.ips", a2.av().i().b().length));
            az2.a(new k(j.a(a2.av().i().b())));
        } else {
            az2.a(new l("commands.banlist.players", a2.av().h().b().length));
            az2.a(new k(j.a(a2.av().h().b())));
        }
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, b b2) {
        return arrstring.length == 1 ? j.a(arrstring, "players", "ips") : Collections.emptyList();
    }
}

