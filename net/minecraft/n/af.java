/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.n;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.w.a.b;

public class af
extends aa {
    @Override
    public String a() {
        return "entitydata";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.entitydata.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        e e2;
        if (arrstring.length < 2) {
            throw new ac("commands.entitydata.usage", new Object[0]);
        }
        net.minecraft.w.n n2 = af.b(a2, az2, arrstring[0]);
        if (n2 instanceof b) {
            throw new o("commands.entitydata.noPlayers", n2.aK());
        }
        e e3 = af.a(n2);
        e e4 = e3.g();
        try {
            e2 = n.a(af.a(az2, arrstring, 1).c());
        }
        catch (i i2) {
            throw new o("commands.entitydata.tagError", i2.getMessage());
        }
        UUID uUID = n2.cM();
        e3.a(e2);
        n2.a(uUID);
        if (e3.equals(e4)) {
            throw new o("commands.entitydata.failed", e3.toString());
        }
        n2.f(e3);
        af.a(az2, (t)this, "commands.entitydata.success", e3.toString());
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 0;
    }
}

