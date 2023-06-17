/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import net.minecraft.c.a;
import net.minecraft.n.aa;
import net.minecraft.n.az;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.v;

public class h
extends aa {
    @Override
    public String a() {
        return "save-on";
    }

    @Override
    public String a(az az2) {
        return "commands.save-on.usage";
    }

    @Override
    public void a(a a2, az az2, String[] arrstring) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < a2.d.length; ++i2) {
            if (a2.d[i2] == null) continue;
            v v2 = a2.d[i2];
            if (!v2.a) continue;
            v2.a = false;
            bl2 = true;
        }
        if (!bl2) {
            throw new o("commands.save-on.alreadyOn", new Object[0]);
        }
        h.a(az2, (t)this, "commands.save.enabled", new Object[0]);
    }
}

