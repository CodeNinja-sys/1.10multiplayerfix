/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class n
extends aa {
    @Override
    public String a() {
        return "list";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(az az2) {
        return "commands.players.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        int n2 = a2.R();
        az2.a(new l("commands.players.list", n2, a2.S()));
        az2.a(new k(a2.av().a(arrstring.length > 0 && "uuids".equalsIgnoreCase(arrstring[0]))));
        az2.a(br.e, n2);
    }
}

